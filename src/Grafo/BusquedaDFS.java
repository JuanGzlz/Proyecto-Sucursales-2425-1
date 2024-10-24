/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;
import EDD.Lista;
import EDD.Pila;
import EDD.Nodo;

/**
 * Clase BusquedaDFS
 * Incluye lo referente a la metodología de búsqueda en profundidad (DFS)
 * Esta clase depende de la clase Pila ya que se prefirió trabajar con ella para este tipo de búsqueda
 * @author Juan González
 * @version 1.0
 */

public class BusquedaDFS {
    /**
     * @param Seen variable privada de tipo Lista que 
     */
    
    private Lista Seen;
    
    /**
     * Constructor de la clase BúsquedaDFS, no recibe parámetros de entrada
     * Inicializa una Lista nueva con 0 nodos
     */
    
    public BusquedaDFS(){
        this.Seen = new Lista();
    }
    
    /**
     * Método que 
     * @param pila
     * @param T variable de tipo entero definida por el rango que ingresó el usuario
     */
    
    public void DFS(Pila pila, int T) {
        if (T > 0 && pila.isEmpty() == false){
            Nodo auxNodo = pila.desapilar();
            Vertice auxVertice = auxNodo.getData();
            ListaAdyacencia auxLista = auxVertice.getAdyacencia();
            auxVertice.setCovered(true);
            Arista current = auxLista.getpFirst();
            while (current != null){
                Nodo N = this.Seen.buscarNodo(current.getDir());
                if(N == null){
                pila.apilar(current.getDir());
                DFS(pila, T - 1);
                }
                current = current.getpNext();
            }
        } 
    }
    
    /**
     * Método que 
     * @param grafo el grafo con las paradas obtenidas en el JSON
     * @param T variable de tipo entero definida por el rango que ingresó el usuario
     * @param inicial
     */
    
    public void BusquedaDFS_Unico(Grafo grafo, int T, Vertice inicial){
        if (T > 0){
            Pila pila = new Pila();
            inicial.setCovered(true);
            this.Seen.addNodo(inicial);
            ListaAdyacencia adyacentes = inicial.getAdyacencia();
            Arista A = adyacentes.getpFirst();
            while(A != null){
                pila.apilar(A.getDir());
                this.Seen.addNodo(A.getDir());
                DFS(pila, T);
                A = A.getpNext();
            }
        }
        grafo.colorCovered();
    }
    
    /**
     * Método que 
     * @param grafo el grafo con las paradas obtenidas en el JSON
     * @param T variable de tipo entero definida por el rango que ingresó el usuario
     */
    
    public void CompleteDFS(Grafo grafo, int T){
        Vertice v = grafo.getListaParadas().getpFirst();
        while (v != null){
            if (v.isSucursal() == true){
                BusquedaDFS_Unico(grafo, T, v);
            }
            v = v.getpNext();
        }
    }
        
}
