/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import Grafo.Vertice;

/**
 * Clase Lista
 * Estructura de datos de tipo Lista que funciona con Nodos y contiene sus respectivas primitivas
 * @author María Correa
 * @version 1.0
 */

public class Lista {
    /**
     * @param pFirst variable privada de tipo Nodo que apunta al primer nodo de la lista
     * @param pLast variable privada de tipo Nodo que apunta al último nodo de la lista
     * @param size variable privada de tipo entero que indica la cantidad de nodos que posee la Lista
     */
    
    private Nodo pFirst;
    private Nodo pLast;
    private int size;

    /**
     * Constructor de la clase Lista
     * automáticamente asigna 0 a size y apunta a pFirst y pLast a null
     */
    
    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    /**
     * @return variable interna pFirst
     */

    public Nodo getpFirst() {
        return pFirst;
    }
    
    /**
     * modifica el primer elemento de la clase Lista
     * @param pFirst nueva variable de tipo Nodo
     */

    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }
    
    /**
     * @return variable interna pLast
     */

    public Nodo getpLast() {
        return pLast;
    }
    
    /**
     * modifica el último elemento de la clase Lista 
     * @param pLast nueva variable de tipo Nodo
     */

    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }
    
    /**
     * @return variable interna size
     */

    public int getSize() {
        return size;
    }
    
    /**
     * modifica el tamaño de la clase Lista
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
     * Método que agrega el nodo al final de la lista 
     * @param v variable de tipo Vertice que se pasa como parámetro para ser el atributo del nuevo nodo a agregar
     */
    
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
    
    /**
     * Función que busca un nodo a partir de su vértice recibido por parametro
     * @param v variable de tipo Vertice utilizada para comparar con el nodo que se desea buscar
     * @return variable de tipo Nodo en caso de que exista (retorna null de lo contrario)
     */
    
    public Nodo buscarNodo(Vertice v){
        Nodo aux = this.getpFirst();
        if(!isEmpty()){
            while(aux!= null){
                if(aux.getData() == v){
                    return aux;
                }
                
                aux = aux.getpNext();
            }
        }
        return aux;
    }
}
