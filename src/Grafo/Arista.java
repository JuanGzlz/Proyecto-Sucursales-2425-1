/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author Admin
 */
public class Arista {
    private ListaAdyacencia Adyacencia;
    private Arista pNext;
    private Vertice dir;


    public Arista(Vertice ver) {
        this.Adyacencia = new ListaAdyacencia();
        this.pNext = null;
        this.dir = ver;

    }

    public ListaAdyacencia getAdyacencia() {
        return Adyacencia;
    }

    public void setAdyacencia(ListaAdyacencia Adyacencia) {
        this.Adyacencia = Adyacencia;
    }

    public Arista getpNext() {
        return pNext;
    }

    public void setpNext(Arista pNext) {
        this.pNext = pNext;
    }

    public Vertice getDir() {
        return dir;
    }
    
    
}
