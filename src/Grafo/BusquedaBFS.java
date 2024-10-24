/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;
import EDD.Cola;
import EDD.Lista;
import EDD.Nodo;

/**
 * Clase BusquedaBFS
 * Incluye lo referente a la metodología de búsqueda en anchura (BFS)
 * Esta clase depende de la clase Cola ya que se prefirió trabajar con ella para este tipo de búsqueda
 * @author Juan González
 * @version 1.0
 */

public class BusquedaBFS {
    /**
     * @param Seen variable privada de tipo Lista que 
     */
    
    private Lista Seen;
    
    /**
     * Constructor de la clase BúsquedaBFS, no recibe parámetros de entrada
     * Inicializa una Lista nueva con 0 nodos
     */
    
    public BusquedaBFS(){
        this.Seen = new Lista();
    }
    
    /**
     * Método que 
     * @param cola
     * @param T variable de tipo entero definida por el rango que ingresó el usuario
     * @param P
     */
    
    public void BFS(Cola cola, int T, int P) {
    if (T > 0 && cola.isEmpty() == false){
        int P_2 = 0;
        for(int i = 0; i < P; i++){
            Nodo auxNodo = cola.desencolar();
            Vertice auxVertice = auxNodo.getData();
            ListaAdyacencia auxLista = auxVertice.getAdyacencia();
            auxVertice.setCovered(true);
            Arista current = auxLista.getpFirst();
            while (current != null){
                Nodo N = Seen.buscarNodo(current.getDir());
                if(N == null){
                    cola.encolar(current.getDir());
                    Seen.addNodo(current.getDir());
                    P_2++;
                }
                current = current.getpNext();
            }
        }
        BFS(cola, T-1, P_2); 
                
    }
   }
    
    /**
     * Método que 
     * @param grafo el grafo con las paradas obtenidas en el JSON
     * @param T variable de tipo entero definida por el rango que ingresó el usuario
     * @param inicial
     */
    
    public void BusquedaBFS_Unico(Grafo grafo, int T, Vertice inicial) {
        if(T > 0){
        inicial.setCovered(true);
        Cola cola = new Cola();
        this.Seen.addNodo(inicial);
        ListaAdyacencia adyacentes = inicial.getAdyacencia();
        Arista A = adyacentes.getpFirst();
        int P = 0;
        while(A != null){
            cola.encolar(A.getDir());
            P++;
            this.Seen.addNodo(A.getDir());
            A = A.getpNext();
            }
        BFS(cola, T, P);
        }
        grafo.colorCovered();
        
    }
    
    /**
     * Método que 
     * @param grafo el grafo con las paradas obtenidas en el JSON
     * @param T variable de tipo entero definida por el rango que ingresó el usuario
     */
    
    public void CompleteBFS(Grafo grafo, int T){
        Vertice v = grafo.getListaParadas().getpFirst();
        while (v != null){
            if (v.isSucursal() == true){
                BusquedaBFS_Unico(grafo, T, v);
            }
            v = v.getpNext();
        }
    }
   
}
