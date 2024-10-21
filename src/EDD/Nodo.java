/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import Grafo.Vertice;

/**
 *
 * @author Admin
 */
public class Nodo {
    private Nodo pNext;
    private Vertice data;

    public Nodo(Vertice data) {
        this.pNext = null;
        this.data = data;
    }

    public Nodo getpNext() {
        return pNext;
    }

    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }

    public Vertice getData() {
        return data;
    }

    public void setData(Vertice data) {
        this.data = data;
    }
    
}
