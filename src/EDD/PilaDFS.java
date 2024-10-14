/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Admin
 */
public class PilaDFS {
    private Nodo pCima;
    private int size;

    public PilaDFS() {
        this.pCima = null;
        this.size = 0;
    }

    public Nodo getpCima() {
        return pCima;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return getpCima() == null;
    }
    
    public void apilar(String nombre){
        Nodo NewNodo = new Nodo(nombre);
        if (isEmpty()){
            pCima = NewNodo;
        } else{
            NewNodo.setpNext(pCima);
            pCima = NewNodo;
        }
        size++;
    }
    
    public Nodo desapilar(){
        if (isEmpty()){
            return null;
        } else{
            Nodo NewNodo = pCima;
            pCima.setpNext(pCima.getpNext());
            size --;
            return NewNodo;
        }
    } 
}
