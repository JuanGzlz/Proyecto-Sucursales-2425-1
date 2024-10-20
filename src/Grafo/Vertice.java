/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author Admin
 */
public class Vertice {
    private ListaAdyacencia Adyacencia;
    private String[] nombre;
    private boolean Covered;
    private boolean Sucursal;
    private Vertice pNext;

    public Vertice(String nombre[]) {
        this.Adyacencia = new ListaAdyacencia();
        this.nombre = nombre;
        this.Covered = false;
        this.Sucursal = false;
        this.pNext = null;
    }

    public String[] getNombre() {
        return nombre;
    }

    public boolean isCovered() {
        return Covered;
    }

    public void setCovered(boolean Covered) {
        this.Covered = Covered;
    }

    public boolean isSucursal() {
        return Sucursal;
    }

    public void setSucursal(boolean Sucursal) {
        this.Sucursal = Sucursal;
    }

    public Vertice getpNext() {
        return pNext;
    }

    public void setpNext(Vertice pNext) {
        this.pNext = pNext;
    }

    public ListaAdyacencia getAdyacencia() {
        return Adyacencia;
    }   
   
}
