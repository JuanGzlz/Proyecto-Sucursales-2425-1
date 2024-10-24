/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;
import Grafo.Grafo;
import Grafo.Vertice;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase JsonDecoder
 * Incluye 
 * @author Juan González
 * @version 1.0
 */

public class JsonDecoder {
    
    
    private File file;
    private BufferedReader NewBufferedReader;
    private String text;
    
    
    
    public JsonDecoder(File file) throws FileNotFoundException{
        this.file = file;
        FileReader NewFileReader = new FileReader(this.file);
        this.NewBufferedReader = new BufferedReader(NewFileReader);
    }
    
    
    
    public String Read() throws FileNotFoundException, IOException{ //Da una sola línea
        return this.NewBufferedReader.readLine();
    }
    
    
    
    public void Reset() throws FileNotFoundException{ //Devuelve la función Read() al inicio
        FileReader NewFileReader = new FileReader(this.file);
        this.NewBufferedReader = new BufferedReader(NewFileReader);
    }
    
    
    
    public void ReadAll() throws FileNotFoundException, IOException{ //Te lee cada línea del json exactamente una vez
        FileReader NewFileReader = new FileReader(this.file);
        BufferedReader MyBuffer = new BufferedReader(NewFileReader);
        String mystr = MyBuffer.readLine();
        while(mystr != null){
            System.out.println(mystr); //Aquí puede ir el procesamiento
            mystr = MyBuffer.readLine();
        }
    }
    
    
    
    public String GrafoNombre() throws FileNotFoundException, IOException{
        this.Reset();
        this.Read();
        String Nombre = this.Read();
        Nombre = Nombre.replace("\"", "").replace(":[", "").trim();
        this.Reset();
        return Nombre;
    }
    
    
    
    public Grafo CrearGrafo() throws IOException{
        String N = this.GrafoNombre();
        Grafo graph = new Grafo(N);
        String Iteracion = this.Read();
        while (Iteracion != null){
            if (Iteracion.contains("{") && Iteracion.contains("}")){
                Iteracion = Iteracion.replace("\"", "").replace("{", "").replace("}", "").replace(",", "").trim();
                String[] Valores = Iteracion.split(":");
                Vertice v = graph.busquedaInicial(Valores[0]);
                if(v == null){
                    graph.crearVertice(Valores);
                }
            }else if (Iteracion.contains("{") || Iteracion.contains("]") || Iteracion.contains("[") || Iteracion.contains("}") ){
                Iteracion = this.Read();
                continue;
            } else{
                Iteracion = Iteracion.replace("\"", "").replace(",", "").trim();
                String[] Valor = new String[1];
                Valor[0] = Iteracion;
                graph.crearVertice(Valor);
            }
            
            Iteracion = this.Read();
        }
        
        this.Reset();
        Iteracion = this.Read();
        String Next;
        graph.addGraphstream();
        
        while (Iteracion != null){
            Next = this.Read();
            if (Iteracion.contains("{") && Iteracion.contains("}")){
                if (Next.contains("{") && Next.contains("}")){
                    String Iter = Iteracion.replace("\"", "").replace("{", "").replace("}", "").replace(",", "").trim();
                    String Siguiente = Next.replace("\"", "").replace("{", "").replace("}", "").replace(",", "").trim();
                    String[] Valores_A = Iter.split(":");
                    String[] Valores_B = Siguiente.split(":");
                    graph.crearConexion(Valores_A[0], Valores_B[0]);
                } else if (Next.contains("{") || Next.contains("]") || Next.contains("[") || Next.contains("}") ){
                    Iteracion = Next;
                    continue;
                }else{
                    String Iter = Iteracion.replace("\"", "").replace("{", "").replace("}", "").replace(",", "").trim();
                    String Siguiente = Next.replace("\"", "").replace(",", "").trim();
                    String[] Valores_A = Iter.split(":");
                    String[] Valor_B = new String[1];
                    Valor_B[0] = Siguiente;
                    graph.crearConexion(Valores_A[0], Valor_B[0]);
                }
            }else if (Iteracion.contains("{") || Iteracion.contains("]") || Iteracion.contains("[") || Iteracion.contains("}") ){
                Iteracion = Next;
                continue;
            } else{
                if (Next.contains("{") && Next.contains("}")){
                    String Iter = Iteracion.replace("\"", "").replace(",", "").trim();
                    String Siguiente = Next.replace("\"", "").replace("{", "").replace("}", "").replace(",", "").trim();
                    String[] Valor_A = new String[1];
                    Valor_A[0] = Iter;
                    String[] Valores_B = Siguiente.split(":");
                    graph.crearConexion(Valor_A[0], Valores_B[0]);
                } else if (Next.contains("{") || Next.contains("]") || Next.contains("[") || Next.contains("}") ){
                    Iteracion = Next;
                    continue;
                }else{
                    String Iter = Iteracion.replace("\"", "").replace(",", "").trim();
                    String Siguiente = Next.replace("\"", "").replace(",", "").trim();
                    String[] Valor_A = new String[1];
                    Valor_A[0] = Iter;
                    String[] Valor_B = new String[1];
                    Valor_B[0] = Siguiente;
                    graph.crearConexion(Valor_A[0], Valor_B[0]);
                }
            }
            
            Iteracion = Next;
        }
        return graph;
    }
}
