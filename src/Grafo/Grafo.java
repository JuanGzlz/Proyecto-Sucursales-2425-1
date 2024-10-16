/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;
import EDD.Lista;
/**
 *
 * @author Admin
 */
public class Grafo {
    private Lista ListaParadas;

    public Grafo() {
        this.ListaParadas = new Lista();
    }

    public Lista getListaParadas() {
        return ListaParadas;
    }

    public void setListaParadas(Lista ListaParadas) {
        this.ListaParadas = ListaParadas;
    }
    
    public Vertice busquedaInicial(String nombre){
        Vertice current = ListaParadas.getpFirst();
        while (current != null){
        if (current.getNombre().equals(nombre)){
            return current;
        }
        else{
            current = current.getpNext();
        } 
    }
        return current;
    }
    
    public void crearVertice (String parada){
        Vertice newVertice = new Vertice(parada);
        ListaParadas.addVertice(newVertice);
    }
    
    public void crearConexion(String inicio, String destino){
        Vertice aux1 = busquedaInicial(inicio);
        Vertice aux2 = busquedaInicial(destino);
        if (aux1 == null || aux2 == null){
            return ;
        } else{
            aux1.getAristas().getAdyacencia().addArista(aux2.getAristas());
            aux2.getAristas().getAdyacencia().addArista(aux1.getAristas());
        }
    }
}
