/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Grafo.Vertice;

/**
 *
 * @author Admin
 */
public class Pila {
    private Nodo pCima;
    private int size;

    public Pila() {
        this.pCima = null;
        this.size = 0;
    }

    
    public boolean isEmpty(){
        return pCima == null;
    }
    
    public void apilar(Vertice nombre){
        Nodo NewNodo = new Nodo(nombre);
        if (this.isEmpty()){
            this.pCima = NewNodo;
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
            pCima = pCima.getpNext();
            size --;
            return NewNodo;
        }
    } 
    
    public void VaciarPila(){
        pCima = null;
        size = 0;
    }
}
