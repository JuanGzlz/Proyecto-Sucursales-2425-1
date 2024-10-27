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
 * Incluye toda la decodificación del archivo json para convertir las paradas en Strings y así luego en vértices para la creación del grado
 * @author Juan González
 * @version 1.0
 */

public class JsonDecoder {
    /**
    * @param file variable privada de tipo File que indica el archivo seleccionada en la carpeta de archivos del usuario
    * @param NewBufferedReader variable de tipo BufferedReader que permite leer el json por caracteres, matrices y cadenas de manera eficiente
    * @param text variable de tipo String que representa un texto para realizar pruebas de este decodificador (uso no definido)
    */
    
    private File file;
    private BufferedReader NewBufferedReader;
    private String text;
    
    /**
     * Constructor de la clase JsonDecoder, recibiendo el archivo elegido en JsonChooser como parámetro de entrada
     * Automáticamente asigna la variable file al valor de la entrada
     * Los Readers son asignados a la lectura del propio file que representa el archivo ingresado
     */
    
    public JsonDecoder(File file) throws FileNotFoundException{
        this.file = file;
        FileReader NewFileReader = new FileReader(this.file);
        this.NewBufferedReader = new BufferedReader(NewFileReader);
    }
    
    /**
     * Función que entrega una sola línea de texto del archivo json
     * @return variable de tipo String con una única línea de texto (la respectiva parada del archivo json)
     */
    
    public String Read() throws FileNotFoundException, IOException{
        return this.NewBufferedReader.readLine();
    }
    
    /**
     * Método que devuelve la función Read() al inicio, es decir, la primera línea de texto del archivo
     */
    
    public void Reset() throws FileNotFoundException{
        FileReader NewFileReader = new FileReader(this.file);
        this.NewBufferedReader = new BufferedReader(NewFileReader);
    }
    
    /**
     * Método que lee cada línea del json exactamente una vez
     */
    
    public void ReadAll() throws FileNotFoundException, IOException{
        FileReader NewFileReader = new FileReader(this.file);
        BufferedReader MyBuffer = new BufferedReader(NewFileReader);
        String mystr = MyBuffer.readLine();
        while(mystr != null){
            System.out.println(mystr); //Aquí puede ir el procesamiento
            mystr = MyBuffer.readLine();
        }
    }
    
    /**
     * Función que entrega exactamente el nombre del sistema de metro completo al estar siempre en la segunda línea del archivo json
     * @return variable de tipo String con el nombre de la red de transporte
     */
    
    public String GrafoNombre() throws FileNotFoundException, IOException{
        this.Reset();
        this.Read();
        String Nombre = this.Read();
        Nombre = Nombre.replace("\"", "").replace(":[", "").trim();
        this.Reset();
        return Nombre;
    }
    
    /**
     * Función que gestiona la obtención del grafo mediante dos vueltas...
     * 1era Vuelta: Crea los vértices con el nombre de cada parada, quitando todos los caracteres innecesarios y así obteniendo el grafo en sí
     * 2da Vuelta: Crea las conexiones entre los vértices, revisando diversas condiciones según la parada sea una que conecta con otra línea o si es una parada común y fija
     * @return variable de tipo Grafo que representa el grafo del sistema de transporte en su totalidad y ya estructurado gráficamente
     */
    
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
