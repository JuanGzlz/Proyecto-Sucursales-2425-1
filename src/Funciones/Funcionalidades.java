/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;
import Grafo.BusquedaBFS;
import Grafo.Grafo;
import Grafo.Vertice;
import javax.swing.JOptionPane;



public class Funcionalidades {
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
        grafo.resetCobertura();
        BusquedaBFS completo = new BusquedaBFS();
        completo.BusquedaBFS_Unico(grafo, T, parada);
    }
    
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
        }
        }else{
            JOptionPane.showMessageDialog(null,
               ("La estación " + nombre + "no existe..."),
                        "", JOptionPane.INFORMATION_MESSAGE);
        }
        grafo.resetCobertura();
        BusquedaBFS completo = new BusquedaBFS();
        completo.CompleteBFS(grafo, T);
    }
    
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
    
    public void agregarLinea(Grafo grafo, String newInicio, String newFinal){
        grafo.crearConexion(newInicio, newFinal);
    }
    
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
