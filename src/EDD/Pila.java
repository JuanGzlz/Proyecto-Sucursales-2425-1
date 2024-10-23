/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import Grafo.Vertice;

/**
 * Clase Pila
 * Estructura de datos de tipo Pila con sus respectivas primitivas
 * @author JuanGzlz
 * @version 1.0
 */

public class Pila {
    /**
     * @param pCima variable privada que apunta al nodo ubicado en el tope de la pila
     * @param size variable privada que indica la cantidad de elementos
     */
    
    private Nodo pCima;
    private int size;

     /**
     * Constructor de la clase pila, no recibe ninguna entrada
     * asigna automáticamente cero al tamaño de la pila y pFirst apunta a null
     */
    
    public Pila() {
        this.pCima = null;
        this.size = 0;
    }

    /**
     * Funcion que indica si la pila es vacía
     * @return true si la pila es vacía y false si la pila no es vacía
     */
    
    public boolean isEmpty(){
        return pCima == null;
    }
    
    /**
     * Método que apila un nuevo elemento a la lista
     * @param v variable de tipo Vertice que indica el elemento que se desee apilar
     */
    
    public void apilar(Vertice v){
        Nodo NewNodo = new Nodo(v);
        if (this.isEmpty()){
            this.pCima = NewNodo;
        } else{
            NewNodo.setpNext(pCima);
            pCima = NewNodo;
        }
        size++;
    }
    
    /**
     * Método que desapila el último elemento de la pila
     * @return Nodo desapilado
     */
    
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
}
