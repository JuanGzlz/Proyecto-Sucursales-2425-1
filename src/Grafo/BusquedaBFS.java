/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;
import EDD.Cola;
import EDD.Lista;
import EDD.Nodo;

/**
 *
 * @author Admin
 */
public class BusquedaBFS {
    
    private Lista Seen;
    
    public BusquedaBFS(){
        Seen = new Lista();
    }
    
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
    
    public void BusquedaBFS_Unico(int T, Vertice inicial) {
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
        
    }
    
    public void CompleteBFS(Grafo grafo, int T){
    
    }
   
}
