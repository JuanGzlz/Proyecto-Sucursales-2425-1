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
     * @param Seen variable privada de tipo Lista que se usará para comparar los nodos y evitar que una parada se agregue dos veces
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
     * Método que utiliza el algoritmo de búsqueda DFS para recorrer las paradas del grafo
     * Implementa una pila y lista, funcionando de manera recursiva para obtener cada vez las paradas visitadas 
     * @param pila variable de tipo Pila con las paradas del grafo
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
     * Método que permite por medio del método DFS revisar la cobertura desde una única sucursal
     * @param grafo el grafo con las paradas obtenidas en el JSON
     * @param T variable de tipo entero definida por el rango que ingresó el usuario
     * @param inicial variable de tipo Vertice que representa la parada tomada como sucursal para iniciar desde ella la búsqueda
     */
    
    public void BusquedaDFS_Unico(Grafo grafo, int T, Vertice inicial){
        if (T > 0){
            Pila pila = new Pila();
            inicial.setCovered(true);
            this.Seen = new Lista();
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
