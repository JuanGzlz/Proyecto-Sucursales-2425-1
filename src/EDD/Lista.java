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
    private Vertice pFirst;
    private Vertice pLast;
    private int size;

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public Vertice getpFirst() {
        return pFirst;
    }

    public void setpFirst(Vertice pFirst) {
        this.pFirst = pFirst;
    }

    public Vertice getpLast() {
        return pLast;
    }

    public void setpLast(Vertice pLast) {
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
    
    public void addVertice (Vertice myVertice){
        if (isEmpty()){
            setpFirst(myVertice);
            setpLast(myVertice);
        } else{
            getpLast().setpNext(myVertice);
            setpLast(myVertice);
        }
        setSize(getSize()+1);
    }
    
    public void addLast (String nombre){
        Vertice NuevoNodo = new Vertice(nombre);
        if (isEmpty()){
            setpFirst(NuevoNodo);
            setpLast(NuevoNodo);
        } else{
            getpLast().setpNext(NuevoNodo);
            setpLast(NuevoNodo);
        }
        setSize(getSize()+1);
    }
    
    public void eliminate(String nombre){
        if (getpFirst().getNombre().equals(nombre)){
            setpFirst(getpFirst().getpNext());
        }else{
            Vertice aux = getpFirst();
            Vertice prev = getpFirst();
            while (!aux.getNombre().equals(nombre)){
                prev = aux;
                aux = aux.getpNext();
            }
            prev.setpNext(aux.getpNext());
            aux.setpNext(null);
        }
        setSize(getSize()-1);
    }
}
