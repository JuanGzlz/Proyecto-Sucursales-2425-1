/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;
import Grafo.Arista;
import Grafo.BusquedaBFS;
import Grafo.Grafo;
import Grafo.Vertice;
import javax.swing.JOptionPane;

/**
 * Clase Funcionalidades
 * Posee todos los métodos y funciones para llevar a cabo el funcionamiento del sistema respecto a las sucursales y su cobertura
 * @author Juan González
 * @version 1.0
 */

public class Funcionalidades {
    /**
     * Función que selecciona una parada para colocar una sucursal en esta
     * Modifica a true el atributo Sucursal de la parada y a verde su color en el grafo
     * Resetea la cobertura para verificar que la sucursal está bien implementada aplicando el BFS y así mostrar en el grafo el rango de la misma
     * @param grafo el grafo con las paradas obtenidas en el JSON
     * @param parada la variable de tipo vértice sobre la cual se colocará la sucursal
     * @param T variable de tipo entero definida por el rango que ingresó el usuario
     */
    
    
    public void seleccionarSucursal(Grafo grafo, Vertice parada, int T){
        String num1 = "";
        for(int i = 0; i < parada.getNombre().length; i++){
            num1 = num1 + parada.getNombre()[i] + " ";
        }
        num1 = num1.trim();
        if(parada != null){
            if(parada.isSucursal()){
                JOptionPane.showMessageDialog(null,
                    ("La estación " + num1 + "ya posee una sucursal..."),
                            "", JOptionPane.INFORMATION_MESSAGE);
            }else{
                parada.setSucursal(true);
                grafo.colorVertice(parada, "green");
            }
        }else{
            JOptionPane.showMessageDialog(null,
               ("La estación " + num1 + "no existe..."),
                        "", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    
    /**
     * Función que selecciona una parada para eliminar la sucursal que esta posee
     * Modifica a false el atributo Sucursal de la parada y a rojo su color en el grafo
     * Resetea la cobertura para también actualizar las paradas que estaban dentro del rango de la sucursal eliminada como no cubiertas
     * Aplica un BFS completo para obtener la nueva cobertura total
     * @param grafo el grafo con las paradas obtenidas en el JSON
     * @param nombre variable de tipo String que representa el nombre del vértice con la parada que se desea eliminar
     * @param T variable de tipo entero definida por el rango que ingresó el usuario
     */
     
    public void quitarSucursal(Grafo grafo, String nombre, int T){
        Vertice parada = grafo.getListaParadas().buscarVertice(nombre);
        if(parada != null){
        if(!parada.isSucursal()){
            JOptionPane.showMessageDialog(null,
               ("La estación " + nombre + "no posee una sucursal..."),
                        "", JOptionPane.INFORMATION_MESSAGE);
        }else{
            parada.setSucursal(false);
            grafo.colorVertice(parada, "red");
            JOptionPane.showMessageDialog(null, "Sucursal eliminada con éxito");
        }
        }else{
            JOptionPane.showMessageDialog(null,
               ("La estación " + nombre + "no existe..."),
                        "", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    
    /**
     * Función que revisa el sistema de paradas e indica la primera más óptima a la cual se le debería colocar una sucursal
     * Resetea la cobertura para luego dentro de un bucle y por cada parada revisar con un BFS en cuánto cambiaría la cobertura si esta fuera una sucursal
     * Con un valor max, se sabrá cual es la parada con mayor rango de eficiencia en el sistema
     * @param grafo el grafo con las paradas obtenidas en el JSON
     * @param T variable de tipo entero definida por el rango que ingresó el usuario
     * @return variable de tipo Vertice que representa la parada más óptima que debería tener sucursal
     */
    
    public Vertice sugerirSucursal(Grafo grafo, int T){
        grafo.resetCobertura();
        Vertice parada = grafo.getListaParadas().getpFirst();
        int max = 0;
        BusquedaBFS completo = new BusquedaBFS();
        Vertice optimo = null;
        while (parada != null){
            completo.CompleteBFS(grafo, T);
            int n1 = grafo.verCubiertos();
            completo.BusquedaBFS_Unico(grafo, T, parada);
            int n2 = grafo.verCubiertos();
            int N = n2 - n1;
            if (N > max){
                max = N;
                optimo = parada;
            }
            grafo.resetCobertura();
            parada = parada.getpNext();
        }
        return optimo;
    }
    
    /**
     * Función que revisa la posibilidad de agregar una nueva línea entre dos paradas
     * Esta indica si las paradas son adyacentes o no, de manera que no se pueda agregar una nueva línea si ya están conectadas ya que no mejora la cobertura total
     * @param grafo el grafo con las paradas obtenidas en el JSON
     * @param newInicio variable de tipo String que indica el punto A de donde inicia la nueva conexión
     * @param newFinal variable de tipo String que indica el punto B de donde termina la nueva conexión
     * @return variable de tipo boolean que retorna true si ya están conectadas de manera adyacente y false de lo contrario
     */
    
    public boolean posibleAgregar(Grafo grafo, String newInicio, String newFinal){
        Vertice aux1 = grafo.busquedaInicial(newInicio);
        Vertice aux2 = grafo.busquedaInicial(newFinal);
        Arista A = aux1.getAdyacencia().getpFirst();
        while (A != null){
            if (A.getDir() == aux2){
                return true;
            }
            A = A.getpNext();
        }
        return false;
    }
    
    /**
     * Método que permite agregar una nueva línea entre dos paradas, utilizando el método crearConexion ya creado en la clase Grafo
     * @param grafo el grafo con las paradas obtenidas en el JSON
     * @param newInicio variable de tipo String que indica el punto A de donde inicia la nueva conexión
     * @param newFinal variable de tipo String que indica el punto B de donde termina la nueva conexión
     */
    
    public void agregarLinea(Grafo grafo, String newInicio, String newFinal){
        grafo.crearConexion(newInicio, newFinal);
    }
    
    /**
     * Función que revisa la cobertura total de las sucursales en el grafo e indica si el sistema cubre todas las paradas o no
     * Con que haya una parada que no esté cubierta, se retornará false para indicar que el sistema no posee una cobertura total
     * @param grafo el grafo con las paradas obtenidas en el JSON
     * @return variable de tipo boolean con el valor booleano según el sistema cubra todas las paradas
     */
    
    public boolean coberturaTotal(Grafo grafo){
        Vertice parada = grafo.getListaParadas().getpFirst();
        while (parada != null){
            if (parada.isCovered() == false){
                return false;
            }
            parada = parada.getpNext();
        }
        return true;
    }
    
}
