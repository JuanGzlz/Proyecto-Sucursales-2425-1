/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;
import javax.swing.JOptionPane;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.Viewer;

/**
 * Clase Grafo
 * Incluye todo lo referente a la construcción del grafo
 * @author Juan González
 * @version 1.0
 */

public class Grafo {
    /**
     * @param graph variable privada de tipo Grafo que contiene el sistema de paradas obtenido en el JSON
     * @param Nombre variable privada de 
     * @param ListaParadas variable privada 
     * @param T variable privada de tipo entero que indica el rango de paradas (definido por el usuario) a las cuales alcanza una sucursal
     */
    
    private Graph graph;
    private String Nombre;
    private ListaVertices ListaParadas;
    private int T;

    
    
    public Grafo(String Nombre) {
        this.Nombre = Nombre;
        this.ListaParadas = new ListaVertices();
        this.graph = new MultiGraph("GRAFO: Estaciones de Metro");
        this.T = 0;
        System.setProperty("org.graphstream.ui", "swing");
    }

    /**
     * @return variable interna ListaParadas
     */
    
    public ListaVertices getListaParadas() {
        return ListaParadas;
    }

    
    
    public void setListaParadas(ListaVertices ListaParadas) {
        this.ListaParadas = ListaParadas;
    }

    /**
     * @return variable interna graph
     */
    
    public Graph getGraph() {
        return graph;
    }

    
    
    public void setGraph(Graph graph) {
        this.graph = graph;
    }
    
    /**
     * @return variable interna T
     */
    
    public int getT() {
        return T;
    }

    
    
    public void setT(int T) {
        this.T = T;
    }
    
    /**
     * Función que 
     * @param nombre
     * @return variable de tipo Vertice
     */
    
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
    
    /**
     * Método que 
     * @param parada
     */
    
    public void crearVertice (String[] parada){
        for(int i = 0; i < parada.length; i++){
        if(busquedaInicial(parada[i])==null){
            Vertice newVertice = new Vertice(parada);
            ListaParadas.addVertice(newVertice);
            return ;
        }
        }
    }
    
    /**
     * Método que 
     */
    
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
                this.graph.getNode(num1).setAttribute("ui.style", "fill-color: red; shape: circle; size: 25px;");
            }
            v = v.getpNext();
        }
    }
    
    /**
     * Método que 
     * @param inicio
     * @param destino
     */
    
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
    
    /**
     * Método que 
     */
    
    public void mostrarGrafo() {
        Viewer viewer = graph.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.CLOSE_VIEWER); 
    }
    
    /**
     * Método que 
     * @param v
     * @param color
     */
    
    public void colorVertice(Vertice v, String color) {
        String num1 = "";
        for(int i = 0; i < v.getNombre().length; i++){
            num1 = num1 + v.getNombre()[i] + " ";
        }
        num1 = num1.trim();
        if (graph.getNode(num1) != null) {
            graph.getNode(num1).setAttribute("ui.style", "fill-color: " + color + "; size: 25px; shape: circle;");
        }else{
            JOptionPane.showMessageDialog(null, "En el grafo obtenido no existe este vértice...");
        }
    }
    
    /**
     * Método que 
     */
    
    public void colorCovered(){
        Vertice v = this.ListaParadas.getpFirst();
        while(v != null){
            if(v.isCovered()==true && v.isSucursal()==false){
                colorVertice(v, "yellow");
            }
            v = v.getpNext();
        }
    }
    
    /**
     * Método que 
     */
    
    public void resetCobertura(){
        Vertice v = this.ListaParadas.getpFirst();
        while(v != null){
            v.setCovered(false);
            if (v.isSucursal() == false){
                colorVertice(v, "red");
            }
            v = v.getpNext(); 
    }
    }
    
    /**
     * Función que 
     * @return variable de tipo entero
     */
    
    public int verCubiertos(){
        Vertice v = this.ListaParadas.getpFirst();
        int n = 0;
        while(v != null){
            if (v.isCovered() == true){
                 n = n + 1;
            }
            v = v.getpNext();
            }
        return n;
    }
    
}
