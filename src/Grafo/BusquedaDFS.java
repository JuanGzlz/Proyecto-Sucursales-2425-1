/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import EDD.Lista;
import EDD.Pila;
import EDD.Nodo;

/**
 *
 * @author Admin
 */
public class BusquedaDFS {
    
    private Lista Seen;
    
    public BusquedaDFS(){
        this.Seen = new Lista();
    }
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
    public void BusquedaDFS_Unico(int T, Vertice inicial){
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
    }
        
    public void CompleteDFS(Grafo grafo, int T){
        Vertice v = grafo.getListaParadas().getpFirst();
        while (v != null){
            if (v.isSucursal() == true){
                BusquedaDFS_Unico(T, v);
            }
            v = v.getpNext();
        }
    }
        
}
