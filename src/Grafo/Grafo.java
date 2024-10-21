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
    
//    public void quitarConexion(String inicio, String destino){
//         if(!"".equals(inicio) && !"".equals(destino)){
//            Vertice aux1 = busquedaInicial(inicio);
//            Vertice aux2 = busquedaInicial(destino);
//            if(aux1 == null || aux2 == null){
//                JOptionPane.showMessageDialog(null,
//                    "No se encontró alguna de las estaciones en el grafo...",
//                    "", JOptionPane.INFORMATION_MESSAGE);
//            }else{
//                Vertice nodoAdyacente = aux1.getAdyacencia().buscar;
//                if(nodoAdyacente!= null){
//                    Vertice adyacente = aux1.getAdyacencia().buscar;
//                    if(adyacente!= null){
//                        aux1.getAdyacencia().eliminar();
//                        aux2.getAdyacencia().eliminar();
//                        try{
//                            graph.removeEdge(inicio + "-" + destino);
//                        }catch(Exception e){
//                            graph.removeEdge(destino + "-" + inicio);
//                        }
//                    }
//                }
//            }
//         }
//    }
    
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
    
    public void show(){
        Vertice v = this.ListaParadas.getpFirst();
        while(v != null){
            if(v.isCovered()==true){
            for(int i = 0; i < v.getNombre().length; i++){
                System.out.println(v.getNombre()[i]);
            }
            }
            v = v.getpNext();
        }
        
    
                
    }
    public void show_full(){
        Vertice v = this.ListaParadas.getpFirst();
        while(v != null){
            System.out.println(v.getNombre()[0]);
            v = v.getpNext();
        }
    }
    
}
