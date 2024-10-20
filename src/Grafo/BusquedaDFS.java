/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import EDD.Pila;
import EDD.Nodo;

/**
 *
 * @author Admin
 */
public class BusquedaDFS {
    public void BFS(Grafo grafo, Pila pila, int T, int P) {
    if (T > 0 || pila.isEmpty() == false){
        int P_2 = 0;
        for(int i = 0; i < P; i++){
            Nodo auxNodo = pila.desapilar();
            Vertice auxVertice = grafo.busquedaInicial(auxNodo.getData());
            ListaAdyacencia auxLista = auxVertice.getAdyacencia();
            auxVertice.setCovered(true);
            Arista current = auxLista.getpFirst();
            while (current != null){
                P_2++;
                pila.apilar(current.getDir().getNombre()[0]);
                current = current.getpNext();
            }
        }
        BFS(grafo, pila, T-1, P_2); 
    }  
    }
}
