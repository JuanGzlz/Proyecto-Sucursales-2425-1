/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 * Clase ListaAdyacencia
 * Incluye todo lo relacionado a la lista ordenada de aristas que conectan a los vértices
 * @author JuanGzlz
 * @version 1.0
 */

public class ListaAdyacencia {
    /**
     * @param pFirst variable de tipo Arista que apunta a la primera arista de la lista
     * @param pLast variable de tipo Arista que apunta a la ultima arista de la lista
     * @param size variable de tipo entero que indica la cantidad de aristas que posee un vertice
     */
    
    private Arista pFirst;
    private Arista pLast;
    private int size;

    /**
     * constructor de la clase ListaAdyacencia
     * automáticamente asigna 0 a size y apunta a pFirst y pLast a null
     */
    
    public ListaAdyacencia() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    /**
     * @return variable interna pFirst
     */
    
    public Arista getpFirst() {
        return pFirst;
    }

    /**
     * modifica el primer elemento de la clase ListaAdyacencia
     * @param pFirst nueva variable de tipo Arista
     */
    
    public void setpFirst(Arista pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return variable interna pLast
     */
    
    public Arista getpLast() {
        return pLast;
    }

    /**
     * modifica el último elemento de la clase ListaAdyacencia
     * @param pLast nueva variable de tipo Arista
     */
    
    public void setpLast(Arista pLast) {
        this.pLast = pLast;
    }

    /**
     * @return variable interna size
     */
    
    public int getSize() {
        return size;
    }

     /**
     * modifica el tamaño de la clase ListaAdyacencia
     * @param size nueva variable de tipo entero
     */
    
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * Función que indica si la lista es vacía
     * @return true si la lista en vacia, falso en caso contrario
     */
    
    public boolean isEmpty(){
        return getpFirst() == null;
    }
    
    /**
     * Método para agregar una nueva arista a la lista
     * @param myVertice indica el vértice del destino
     */
    
    public void addArista (Vertice myVertice){
        Arista myArista = new Arista(myVertice);
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
