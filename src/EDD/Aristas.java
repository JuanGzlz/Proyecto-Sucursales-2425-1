/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
/**
 *
 * @author Admin
 */
public class Aristas {
    private String nombre;
    private boolean Covered;
    private boolean Sucursal;
    private Lista Adyacencia;
    private Aristas pNext;

    public Aristas(String nombre) {
        this.nombre = nombre;
        this.Covered = false;
        this.Sucursal = false;
        this.Adyacencia = new Lista();
        this.pNext = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCovered() {
        return Covered;
    }

    public void setCovered(boolean Covered) {
        this.Covered = Covered;
    }

    public Lista getAdyacencia() {
        return Adyacencia;
    }

    public void setAdyacencia(Lista Adyacencia) {
        this.Adyacencia = Adyacencia;
    }

    public Aristas getpNext() {
        return pNext;
    }

    public void setpNext(Aristas pNext) {
        this.pNext = pNext;
    }

    public boolean isSucursal() {
        return Sucursal;
    }

    public void setSucursal(boolean Sucursal) {
        this.Sucursal = Sucursal;
    }
    
    
    
    
}
