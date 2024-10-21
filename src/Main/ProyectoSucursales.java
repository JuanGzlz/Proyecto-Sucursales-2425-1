/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;


import Interfaces.InterfazFunciones;
import Grafo.Grafo;
import Funciones.JsonChooser;
import Funciones.JsonDecoder;
import Grafo.BusquedaBFS;
import Grafo.BusquedaDFS;
import Grafo.Vertice;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class ProyectoSucursales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        InterfazFunciones.openBienvenida();
        JsonChooser file = new JsonChooser();
        file.chooseFile();
        JsonDecoder json = new JsonDecoder(file.getJson());
        Grafo graph = json.CrearGrafo();
        BusquedaDFS dfs = new BusquedaDFS();
        Vertice v = graph.busquedaInicial("Altamira");
        v.setSucursal(true);
        dfs.BusquedaDFS_Unico(2, v);
        graph.show();
    }
    
}
