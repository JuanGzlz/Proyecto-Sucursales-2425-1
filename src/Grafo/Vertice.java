/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 * Clase Vertice
 * Incluye todo lo referente a la construcción de un vértice
 * @author Juan González
 * @version 1.0
 */

public class Vertice {
    /**
     * @param Adyacencia variable privada de tipo ListaAdyacencia que indica la lista ordenada de aristas del vértice
     * @param nombre variable privada de un arreglo de Strings que contiene el nombre de la parada y en caso de que mantenga una conexión entre líneas, el nombre de ambas paradas
     * @param Covered variable privada booleana que indica si la parada está dentro del rango T de una sucursal
     * @param Sucursal variable privada booleana que indica si en la estación se encuentra una sucursal
     * @param pNext variable privada de tipo Vertice que apunta a otro Vertice
     */
    
    private ListaAdyacencia Adyacencia;
    private String[] nombre;
    private boolean Covered;
    private boolean Sucursal;
    private Vertice pNext;

    /**
     * Constructor de la clase Vertice
     * Inicializa una ListaAdyacencia nueva con 0 aristas y asigna automáticamente la variable nombre según la entrada, Covered y Sucursal a false, y null a pNext
     * @param nombre[] variable de tipo Vertice que indica el vértice adyacente que guarda la Arista
     */
    public Vertice(String nombre[]) {
        this.Adyacencia = new ListaAdyacencia();
        this.nombre = nombre;
        this.Covered = false;
        this.Sucursal = false;
        this.pNext = null;
    }

    /**
     * @return variable de un arreglo de Strings que contiene el nombre de la parada
     */
    
    public String[] getNombre() {
        return nombre;
    }

    /**
     * Indica si la parada está cubierta por el rango T de una parada que tenga sucursal
     * @return true si la parada está cubierta o false de no estarlo
     */
    
    public boolean isCovered() {
        return Covered;
    }

    /**
     * modifica la variable interna Covered
     * @param Covered variable de tipo boolean con el valor booleano según la parada esté ahora cubierta o no
     */
    
    public void setCovered(boolean Covered) {
        this.Covered = Covered;
    }

    /**
     * Indica si la parada posee una sucursal
     * @return true si en la parada se encuentra una sucursal o false de no haber
     */
    
    public boolean isSucursal() {
        return Sucursal;
    }

    /**
     * modifica la variable interna Sucursal
     * @param Sucursal variable de tipo boolean con el valor booleano según la parada sea ahora una sucursal o no
     */
    
    public void setSucursal(boolean Sucursal) {
        this.Sucursal = Sucursal;
    }

    /**
     * @return variable interna pNext
     */
    
    public Vertice getpNext() {
        return pNext;
    }

    /**
     * modifica la variable interna pNext
     * @param pNext variable de tipo Vertice que indica la nueva variable que se quiera asignar a pNext
     */
    
    public void setpNext(Vertice pNext) {
        this.pNext = pNext;
    }

    /**
     * @return variable interna Adyacencia
     */
    
    public ListaAdyacencia getAdyacencia() {
        return Adyacencia;
    }   
   
}
