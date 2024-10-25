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
     * @param graph variable privada de tipo Graph (librería GraphStream) que contiene la representación gráfica del sistema de paradas
     * @param Nombre variable privada de tipo String por si se nombra el grafo de otra manera (uso no definido)
     * @param ListaParadas variable privada de tipo ListaVertices que contendrá todas las paradas cargadas a partir del json
     * @param T variable privada de tipo entero que indica el rango de paradas (definido por el usuario) a las cuales alcanza una sucursal
     */
    
    private Graph graph;
    private String Nombre;
    private ListaVertices ListaParadas;
    private int T;

    /**
     * Constructor de la clase Grafo
     * Automáticamente asigna Nombre a la variable de entrada y 0 a T
     * Inicializa un MultiGraph como nuevo objeto y una ListaVertices con 0 valores para colocar en ella las paradas del json
     * @param Nombre variable de tipo String que será definido según el parámetro de entrada
     */
    
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

    /**
     * Constituye la lista de vértices para la creación del grafo
     * @param ListaParadas variable de tipo ListaVertices que sobreescribe la lista que se tiene
     */
    
    public void setListaParadas(ListaVertices ListaParadas) {
        this.ListaParadas = ListaParadas;
    }

    /**
     * @return variable interna graph
     */
    
    public Graph getGraph() {
        return graph;
    }

    /**
     * Constituye el objeto Graph para la creación del grafo con GraphStream
     * @param graph variable de tipo Graph que establece una nueva estructura del grafo
     */
    
    public void setGraph(Graph graph) {
        this.graph = graph;
    }
    
    /**
     * @return variable interna T
     */
    
    public int getT() {
        return T;
    }

    /**
     * Modifica el número de paradas a las que alcanza una sucursal
     * @param T variable de tipo entero que establece el rango de alcance de una sucursal
     */
    
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
     * Método que crea la estructura gráfica del Grafo con los métodos getNode y addNode, otorgándole a su vez los atributos a los vértices
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
     * Método que crea las conexiones entre los vértices mediante las aristas que permiten trazar su adyacencia
     * Al final se utiliza el método addEdge para crear estas conexiones y mostrarlas gráficamente en GraphStream
     * @param inicio variable de tipo String que representa un punto A de la conexión entre dos vértices
     * @param destino variable de tipo String que representa un punto B de la conexión entre dos vértices
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
     * Método que muestra el grafo creado a partir del json con la librería GraphStream
     */
    
    public void mostrarGrafo() {
        Viewer viewer = graph.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.CLOSE_VIEWER); 
    }
    
    /**
     * Método que cambia el color del vertice de la parada al mostrar el grafo con la librería GraphStream
     * @param v variable de tipo Vertice cuyo color va a ser cambiado para indicar si está cubierto, es una sucursal o ninguna
     * @param color variable de tipo String que indica el color al que será cambiado el vértice
     * Verde: Sucursal; Amarillo: Cubierto; Rojo: No Cubierto
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
     * Método que únicamente es utilizado para cambiar el color de las paradas cubiertas por una sucursal a amarillo
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
     * Método que reinicia la cobertura de las sucursales, manteniendo marcadas solo estas últimas en caso de:
     * Eliminar una sucursal y actualizar las paradas cubiertas
     * Cambiar el rango de cobertura de la sucursal
     * Querer observar la cobertura únicamente de una sucursal específica
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
     * Función que itera todas las paradas del grafo para ir contando cuáles están cubiertas por las sucursales colocadas
     * @return variable de tipo entero que indica la cantidad de paradas cubiertas en todo el sistema de estaciones
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
