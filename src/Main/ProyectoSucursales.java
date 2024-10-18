/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import Grafo.Grafo;
/**
 *
 * @author Admin
 */
public class ProyectoSucursales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafo NewGrafo = new Grafo();
        NewGrafo.crearVertice("A");
        NewGrafo.crearVertice("B");
        NewGrafo.crearVertice("C");
        NewGrafo.crearVertice("D");
        NewGrafo.crearVertice("E");
        NewGrafo.crearConexion("A", "B");
        NewGrafo.crearConexion("B", "C");
        NewGrafo.crearConexion("C", "E");
        NewGrafo.crearConexion("E", "A");
        NewGrafo.crearConexion("B", "E");
        NewGrafo.crearConexion("C", "A");
    }
    
}
