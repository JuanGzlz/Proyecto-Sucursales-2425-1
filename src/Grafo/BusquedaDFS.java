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
     * Constructor de la clase BúsquedaDFS, no recibe parámetros de entrada
     * No posee parámetros ni atributos ya que el DFS varía y reasignar sus atributos rompe con la funcionalidad de la búsqueda
     */
    
    public BusquedaDFS(){
    }
    
    /**
     * Método que utiliza el algoritmo de búsqueda DFS para recorrer las paradas del grafo
     * Implementa una pila y una lista de adyacencia, funcionando de manera recursiva para apilar cada vez las paradas visitadas 
     * @param pila variable de tipo Pila con las paradas del grafo
     * @param T variable de tipo entero definida por el rango que ingresó el usuario
     */
    
    public void DFS(Pila pila, int T) {
        if (T > 0 && pila.isEmpty() == false){
            Nodo auxNodo = pila.peek();
            Vertice auxVertice = auxNodo.getData();
            ListaAdyacencia auxLista = auxVertice.getAdyacencia();
            auxVertice.setCovered(true);
            Arista current = auxLista.getpFirst();
            while (current != null){
                if(pila.Conseguir(current.getDir())==null){
                    pila.apilar(current.getDir());
                    DFS(pila, T - 1);
                }
                current = current.getpNext();
            }
            pila.desapilar();
        }
    }
    
    /**
     * Método que permite por medio del método DFS revisar la cobertura desde una única sucursal
     * @param grafo el grafo con las paradas obtenidas en el JSON
     * @param T variable de tipo entero definida por el rango que ingresó el usuario
     * @param inicial variable de tipo Vertice que representa la parada tomada como sucursal para iniciar desde ella la búsqueda
     */
    
    public void BusquedaDFS_Unico(Grafo grafo, int T, Vertice inicial){
        if (T > 0){
            Pila pila = new Pila();
            inicial.setCovered(true);
            ListaAdyacencia adyacentes = inicial.getAdyacencia();
            Arista A = adyacentes.getpFirst();
            while(A != null){
                pila.apilar(A.getDir());
                DFS(pila, T);
                A = A.getpNext();
            }
        }
        grafo.colorCovered();
    }
    
    /**
     * Método que revisa la cobertura completa de todas la sucursales
     * Por cada vértice aplica la BusquedaDFS_Unico aplicando el algoritmo DFS por cada parada que cumpla con ser sucursal
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
