/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;


import Interfaces.InterfazFunciones;
import Grafo.Grafo;
import Funciones.JsonChooser;
import Funciones.JsonDecoder;
import Grafo.Arista;
import Grafo.BusquedaBFS;
import Grafo.BusquedaDFS;
import Grafo.ListaAdyacencia;
import Grafo.Vertice;
import java.io.FileNotFoundException;
import java.io.IOException;
import Funciones.Funcionalidades;

/**
 *
 * @author Admin
 */
public class ProyectoSucursales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InterfazFunciones.openBienvenida();
//        JsonChooser file = new JsonChooser();
//        file.chooseFile();
//        JsonDecoder json = new JsonDecoder(file.getJson());
//        Grafo graph = json.CrearGrafo();
//        
//        BusquedaBFS bfs = new BusquedaBFS();
//        Vertice v = graph.busquedaInicial("La Paz");
////        Arista a = v.getAdyacencia().getpFirst();
////        while(a != null){
////            System.out.println(a.getDir().getNombre()[0]);
////            a = a.getpNext();
////        }
////        ListaAdyacencia ad = v.getAdyacencia();
////        Arista A = ad.getpFirst();
////        while(A != null){
////            System.out.println(A.getDir().getNombre()[0]);
////            A = A.getpNext();
////        }
//
//        Funcionalidades f = new Funcionalidades();
//        f.seleccionarSucursal(graph, v);
//        bfs.BusquedaBFS_Unico(graph, 1, v);
//        graph.mostrarGrafo();
    }
    
}
