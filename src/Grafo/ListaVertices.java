/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 * Clase ListaVertices
 * Estructura de datos de tipo Lista que funciona con Vertices y contiene sus respectivas primitivas
 * @author Juan González
 * @version 1.0
 */

public class ListaVertices {
    /**
     * @param pFirst variable privada de tipo Vertice que apunta al primer vértice de la lista
     * @param pLast variable privada de tipo Vertice que apunta al último vértice de la lista
     * @param size variable privada de tipo entero que indica la cantidad de vértices que posee la ListaVertices
     */
    
    private Vertice pFirst;
    private Vertice pLast;
    private int size;

    /**
     * constructor de la clase ListaVertices
     * automáticamente asigna 0 a size y apunta a pFirst y pLast a null
     */
    
    public ListaVertices() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    /**
     * @return variable interna pFirst
     */
    
    public Vertice getpFirst() {
        return pFirst;
    }

    /**
     * modifica el primer elemento de la clase ListaVertices
     * @param pFirst nueva variable de tipo Vertice
     */
    
    public void setpFirst(Vertice pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return variable interna pLast
     */
    
    public Vertice getpLast() {
        return pLast;
    }

    /**
     * modifica el último elemento de la clase ListaVertices
     * @param pLast nueva variable de tipo Vertice
     */
    
    public void setpLast(Vertice pLast) {
        this.pLast = pLast;
    }

    /**
     * @return variable interna size
     */
    
    public int getSize() {
        return size;
    }

    /**
     * modifica el tamaño de la clase ListaVertices
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
     * Método que agrega el vértice al final de la lista 
     * @param myVertice variable de tipo Vertice que se desea agregar
     */
    
    public void addVertice (Vertice myVertice){
        if (isEmpty()){
            setpFirst(myVertice);
            setpLast(myVertice);
        } else{
            getpLast().setpNext(myVertice);
            pLast = myVertice;
        }
        setSize(getSize()+1);
    }
    
    /**
     * Función que busca un vértice a partir de su nombre recibido por parametro
     * @param nombre variable de tipo String utilizada para comparar con el vértice que se desea buscar
     * @return variable de tipo Vértice en caso de que exista (retorna null de lo contrario)
     */
    
    public Vertice buscarVertice(String nombre){
        Vertice aux = this.getpFirst();
        if(!isEmpty()){
            while(aux!= null){
                String[] names = aux.getNombre();
                for(int i = 0; i < names.length; i++){
                    if(names[i].toLowerCase().equals(nombre.toLowerCase())){
                        return aux;
                }
                }
                aux = aux.getpNext();
            }
        }
        return aux;
    }
}
