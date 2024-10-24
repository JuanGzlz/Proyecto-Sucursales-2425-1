/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 * Clase Arista
 * Incluye todo lo referente a la construcción de la arista
 * @author Juan González
 * @version 1.0
 */

public class Arista {
    /**
     * @param Adyacencia variable privada de tipo ListaAdyacencia que indica la lista ordenada de aristas del vértice
     * @param pNext variable privada de tipo Arista que apunta a la siguiente Arista de la lista
     * @param dir variable privada de tipo Vertice que guarda el vértice adyacente
     */
    
    private ListaAdyacencia Adyacencia;
    private Arista pNext;
    private Vertice dir;
    
    /**
     * Constructor de la clase Arista
     * Inicializa una ListaAdyacencia nueva con 0 aristas y asigna automáticamente la variable dir según la entrada y null a pNext
     * @param v variable de tipo Vertice que indica el vértice adyacente que guarda la Arista
     */
    public Arista(Vertice v) {
        this.Adyacencia = new ListaAdyacencia();
        this.pNext = null;
        this.dir = v;
    }

    /**
     * @return variable interna Adyacencia
     */
    
    public ListaAdyacencia getAdyacencia() {
        return Adyacencia;
    }

    /**
     * modifica la Lista de aristas adyacentes al vértice
     * @param Adyacencia variable de tipo ListaAdyacencia que indica la nueva variable que se quiera asignar a Adyacencia
     */
    
    public void setAdyacencia(ListaAdyacencia Adyacencia) {
        this.Adyacencia = Adyacencia;
    }

    /**
     * @return variable interna pNext
     */
    
    public Arista getpNext() {
        return pNext;
    }

    /**
     * modifica la variable interna pNext
     * @param pNext variable de tipo Arista que indica la nueva variable que se quiera asignar a pNext
     */
    
    public void setpNext(Arista pNext) {
        this.pNext = pNext;
    }

    /**
     * @return variable interna dir
     */
    
    public Vertice getDir() {
        return dir;
    }
}
