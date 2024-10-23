/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import Grafo.Vertice;

/**
 * Clase Nodo
 * Creación de un nodo básico en la estructura de datos, incluyendo una referencia al siguiente nodo y un vértice
 * @author JuanGzlz
 * @version 1.0
 */

public class Nodo {
    /**
     * @param pNext variable privada de tipo Nodo que apunta a otro nodo próximo
     * @param data variable privada de tipo Vertice que guarda la información del nodo
     */
    
    private Nodo pNext;
    private Vertice data;

    /**
     * Constructor de la clase Nodo, asigna automáticamente la variable data según la entrada y a pNext le asigna null
     * @param data variable de tipo Vertice que indica la información que se desea guarda en el nodo
     */
    
    public Nodo(Vertice data) {
        this.pNext = null;
        this.data = data;
    }

    /**
     * @return variable interna pNext
     */
    
    public Nodo getpNext() {
        return pNext;
    }

    /**
     * modifica la variable interna pNext
     * @param pNext variable de tipo Nodo que indica la nueva variable que se quiera asignar a pNext
     */
    
    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }

    /**
     * @return variable interna data
     */
    
    public Vertice getData() {
        return data;
    }

    /**
     * modifica la variable interna data
     * @param data variable de tipo Vertice que indica la nueva variable que se quiera asignar a data
     */
    
    public void setData(Vertice data) {
        this.data = data;
    }
    
}
