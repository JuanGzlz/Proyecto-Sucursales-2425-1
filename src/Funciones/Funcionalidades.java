/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;
import Grafo.Grafo;
import Grafo.Vertice;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Funcionalidades {
     public void seleccionarSucursal(Grafo grafo, String nombre){
        Vertice parada = grafo.getListaParadas().buscarVertice(nombre);
        if(parada != null){
            if(parada.isSucursal()){
                JOptionPane.showMessageDialog(null,
                    ("La estación " + nombre + "ya posee una sucursal..."),
                            "", JOptionPane.INFORMATION_MESSAGE);
            }else{
                parada.setSucursal(true);
                grafo.colorVertice(parada, "green");
            }
        }else{
            JOptionPane.showMessageDialog(null,
               ("La estación " + nombre + "no existe..."),
                        "", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void quitarSucursal(Grafo grafo, String nombre){
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
    }
    
    
}
