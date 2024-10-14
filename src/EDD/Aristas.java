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
    private Lista Adyacencia;

    public Aristas(String nombre, Lista Adyacencia) {
        this.nombre = nombre;
        this.Covered = false;
        this.Adyacencia = Adyacencia;
    }
    
    
    
}
