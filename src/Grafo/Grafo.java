/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author Admin
 */
public class Grafo {
    private int NumVer;
    private Vertice pFirst;
    private Vertice pLast;

    public Grafo() {
        this.NumVer = 0;
        this.pFirst = null;
        this.pLast = null;
    }

    public int getNumVer() {
        return NumVer;
    }

    public void setNumVer(int NumVer) {
        this.NumVer = NumVer;
    }
    
    public Vertice getpFirst() {
        return pFirst;
    }

    public void setpFirst(Vertice pFirst) {
        this.pFirst = pFirst;
    }

    public Vertice getpLast() {
        return pLast;
    }

    public void setpLast(Vertice pLast) {
        this.pLast = pLast;
    }
    
    
    
    public Vertice busquedaInicial(String nombre){
        Vertice current = getpFirst();
        while (current != null){
        if (current.getNombre().equals(nombre)){
            return current;
        }
        else{
            current = current.getpNext();
        } 
    }
        return current;
    }
}
