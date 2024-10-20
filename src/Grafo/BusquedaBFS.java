/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;
import EDD.Cola;
import EDD.Nodo;

/**
 *
 * @author Admin
 */
public class BusquedaBFS {
    public void BFS(Grafo grafo, Cola cola, int T, int P) {
    if (T > 0 || cola.isEmpty() == false){
        int P_2 = 0;
        for(int i = 0; i < P; i++){
            Nodo auxNodo = cola.desencolar();
            Vertice auxVertice = grafo.busquedaInicial(auxNodo.getData());
            Arista auxArista = auxVertice.getAristas();
            ListaAdyacencia auxLista = auxArista.getAdyacencia();
            auxVertice.setCovered(true);
            Arista current = auxLista.getpFirst();
            while (current != null){
                P_2++;
                cola.encolar(current.getDir().getNombre());
                current = current.getpNext();
            }
        }
        BFS(grafo, cola, T-1, P_2); 
        
        
        
        
        
    }else{
        return ;
        
    }
    
    
    
    }
    
    public BusquedaBFS() {
        
    }
    
   
}
