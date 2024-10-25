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
     * @param Seen variable privada de tipo Lista que se usará para comparar los nodos y evitar que una parada se agregue dos veces
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
     * Método que utiliza el algoritmo de búsqueda BFS para recorrer las paradas del grafo
     * Implementa una cola y lista, funcionando de manera recursiva para obtener cada vez las paradas visitadas 
     * @param cola variable de tipo Cola con las paradas del grafo
     * @param T variable de tipo entero definida por el rango que ingresó el usuario
     * @param P variable de tipo entero que indica las paradas en un nivel "T" (rango) de profundidad
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
     * Método que permite por medio del método BFS revisar la cobertura desde una única sucursal
     * @param grafo el grafo con las paradas obtenidas en el JSON
     * @param T variable de tipo entero definida por el rango que ingresó el usuario
     * @param inicial variable de tipo Vertice que representa la parada tomada como sucursal para iniciar desde ella la búsqueda
     */
    
    public void BusquedaBFS_Unico(Grafo grafo, int T, Vertice inicial) {
        if(T > 0){
            inicial.setCovered(true);
            Cola cola = new Cola();
            this.Seen = new Lista();
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
     * Método que revisa la cobertura completa de todas la sucursales
     * Por cada vértice aplica la BusquedaBFS_Unico aplicando el algoritmo BFS por cada parada que cumpla con ser sucursal
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
