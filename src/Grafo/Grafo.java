/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;
import EDD.ListaVertices;
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
    private String Nombre;
    private ListaVertices ListaParadas;
    private int numVer;
    private int T;

    public Grafo(String Nombre) {
        this.Nombre = Nombre;
        this.ListaParadas = new ListaVertices();
        this.graph = new MultiGraph("GRAFO: Estaciones de Metro");
        this.numVer = 0;
        this.T = 0;
        System.setProperty("org.graphstream.ui", "swing");
    }

    public ListaVertices getListaParadas() {
        return ListaParadas;
    }

    public void setListaParadas(ListaVertices ListaParadas) {
        this.ListaParadas = ListaParadas;
    }

    public int getNumVer() {
        return numVer;
    }

    public void setNumVer(int numVer) {
        this.numVer = numVer;
    }

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }
    
    public int getT() {
        return T;
    }

    public void setT(int T) {
        this.T = T;
    }
    
    public Vertice busquedaInicial(String nombre){
        Vertice current = ListaParadas.getpFirst();
        while (current != null){
            String[] names = current.getNombre();
            for(int i = 0; i < names.length; i++){
                if (names[i].equals(nombre)){
                    return current;
                } 
            }
            current = current.getpNext();
    }
        return current;
    }
    
    public void crearVertice (String[] parada){
        Vertice newVertice = new Vertice(parada);
        ListaParadas.addVertice(newVertice);
    }
    
    public void addGraphstream(){
        Vertice v = this.getListaParadas().getpFirst();
        while (v != null){
            String num1 = "";
            for(int i = 0; i < v.getNombre().length; i++){
                num1 = num1 + v.getNombre()[i] + " ";
            }
            num1 = num1.trim();
            if (graph.getNode(num1) == null){
                graph.addNode(num1).setAttribute("ui.label", num1);
                this.graph.getNode(num1).setAttribute("ui.style", "fill-color: red; shape: circle; size: 15px;");
            }
            v = v.getpNext();
        }
    }
    
    public void crearConexion(String inicio, String destino){
        Vertice aux1 = busquedaInicial(inicio);
        Vertice aux2 = busquedaInicial(destino);
        if (aux1 == null || aux2 == null){
            return ;
        } else{
            aux1.getAdyacencia().addArista(aux2);
            aux2.getAdyacencia().addArista(aux1);
            String num1 = "";
            String num2 = "";
            for(int i = 0; i < aux1.getNombre().length; i++){
                num1 = num1 + aux1.getNombre()[i] + " ";
            }
            num1 = num1.trim();
            for(int i = 0; i < aux2.getNombre().length; i++){
                num2 = num2 + aux2.getNombre()[i] + " ";
            }
            num2 = num2.trim();
            
            graph.addEdge(num1 + "-" + num2, num1, num2);
        }
    }
    
    public void mostrarGrafo() {
        Viewer viewer = graph.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.EXIT); 
    }
    
    public void colorVertice(Vertice v, String color) {
        String num1 = "";
        for(int i = 0; i < v.getNombre().length; i++){
            num1 = num1 + v.getNombre()[i] + " ";
        }
        num1 = num1.trim();
        if (graph.getNode(num1) != null) {
            graph.getNode(num1).setAttribute("ui.style", "fill-color: " + color + "; size: 15px; shape: circle;");
        }else{
            JOptionPane.showMessageDialog(null, "En el grafo obtenido no existe este vértice...");
        }
    }
    
    public void colorCovered(){
        Vertice v = this.ListaParadas.getpFirst();
        while(v != null){
            if(v.isCovered()==true && v.isSucursal()==false){
                colorVertice(v, "yellow");
            }
            v = v.getpNext();
        }
    }
    
}
