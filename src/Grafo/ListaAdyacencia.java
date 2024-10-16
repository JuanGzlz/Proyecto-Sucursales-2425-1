/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author Admin
 */
public class ListaAdyacencia {
    private Arista pFirst;
    private Arista pLast;
    private int size;

    public ListaAdyacencia() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public Arista getpFirst() {
        return pFirst;
    }

    public void setpFirst(Arista pFirst) {
        this.pFirst = pFirst;
    }

    public Arista getpLast() {
        return pLast;
    }

    public void setpLast(Arista pLast) {
        this.pLast = pLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return getpFirst() == null;
    }
    
    public void addArista (Arista myArista){
        if (isEmpty()){
            setpFirst(myArista);
            setpLast(myArista);
        } else{
            getpLast().setpNext(myArista);
            setpLast(myArista);
        }
        setSize(getSize()+1);
    }
}
