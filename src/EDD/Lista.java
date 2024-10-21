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
public class Lista {
    private Nodo pFirst;
    private Nodo pLast;
    private int size;

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public Nodo getpFirst() {
        return pFirst;
    }

    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    public Nodo getpLast() {
        return pLast;
    }

    public void setpLast(Nodo pLast) {
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
    
    public void addNodo (Vertice v){
        Nodo NuevoNodo = new Nodo(v);
        if (isEmpty()){
            setpFirst(NuevoNodo);
            setpLast(NuevoNodo);
        } else{
            getpLast().setpNext(NuevoNodo);
            setpLast(NuevoNodo);
        }
        setSize(getSize()+1);
    }
    
    public void addLast (Vertice nombre){
        Nodo NuevoNodo = new Nodo(nombre);
        if (isEmpty()){
            setpFirst(NuevoNodo);
            setpLast(NuevoNodo);
        } else{
            getpLast().setpNext(NuevoNodo);
            setpLast(NuevoNodo);
        }
        setSize(getSize()+1);
    }
    
    
    public Nodo buscarNodo(Vertice nombre){
        Nodo aux = this.getpFirst();
        if(!isEmpty()){
            while(aux!= null){
                if(aux.getData() == nombre){
                    return aux;
                }
                
                aux = aux.getpNext();
            }
        }
        return aux;
    }
}
