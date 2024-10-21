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
public class Cola {
    private Nodo pFirst;
    private Nodo pLast;
    private int size;

    public Cola() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return pFirst == null;
    }
    
    public void encolar(Vertice nombre){
        Nodo NewNodo = new Nodo(nombre);
        if (this.isEmpty()){
            this.pFirst = NewNodo;
            this.pLast = NewNodo;
        } else{
            pLast.setpNext(NewNodo);
            pLast = NewNodo;
        }
        size ++;
    }
    
    public Nodo desencolar (){
        if (isEmpty()){
            return null;
        } else{
            Nodo NewNodo = pFirst;
            pFirst.setpNext(pFirst.getpNext());
            size --;
            return NewNodo;
        }
    }
    
}
