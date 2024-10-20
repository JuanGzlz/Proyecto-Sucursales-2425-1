/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;
import EDD.Lista;
import javax.swing.JOptionPane;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.Viewer;
/**
 *
 * @author Admin
 */
public class Grafo {
    private Graph graph;
    private Lista ListaParadas;
    private int numVer;

    public Grafo() {
        this.ListaParadas = new Lista();
        this.graph = new MultiGraph("GRAFO: Estaciones de Metro");
        this.numVer = 0;
        System.setProperty("org.graphstream.ui", "swing");
    }

    public Lista getListaParadas() {
        return ListaParadas;
    }

    public void setListaParadas(Lista ListaParadas) {
        this.ListaParadas = ListaParadas;
    }

    public int getNumVer() {
        return numVer;
    }

    public void setNumVer(int numVer) {
        this.numVer = numVer;
    }
    
    
    public Vertice busquedaInicial(String nombre){
        Vertice current = ListaParadas.getpFirst();
        while (current != null){
            String[] names = current.getNombre();
            for(int i = 0; i < names.length; i++){
                if (names[i].equals(nombre)){
                    return current;
                }
            current = current.getpNext(); 
            }
    }
        return current;
    }
    
    public void crearVertice (String[] parada){
        Vertice newVertice = new Vertice(parada);
        ListaParadas.addVertice(newVertice);
    }
    
    public void crearConexion(String inicio, String destino){
        Vertice aux1 = busquedaInicial(inicio);
        Vertice aux2 = busquedaInicial(destino);
        if (aux1 == null || aux2 == null){
            return ;
        } else{
            aux1.getAdyacencia().addArista(aux2);
            aux2.getAdyacencia().addArista(aux1);
        }
    }
    
    public void mostrarGrafo() {
        Viewer viewer = graph.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.EXIT); 
    }
    
    public void colorVertice(Vertice vertice, String color) {
        if (graph.getNode(vertice.getNombre()[0]) != null) {
            graph.getNode(vertice.getNombre()[0]).setAttribute("ui.style", "fill-color: " + color + "; size: 15px; shape: circle;");
        }else{
            JOptionPane.showMessageDialog(null, "En el grafo obtenido no existe " + vertice.getNombre() + "...");
        }
    }
    
    
}
