/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import Grafo.ListaAdyacencia;
import Grafo.Grafo;
import Grafo.Vertice;
//import com.google.gson.Gson;
/**
 *
 * @author Admin
 */
public class LeerJSON {
    private void abrirTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirTXTActionPerformed
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("archivos de json", "json");
        fc.setFileFilter(filter);
        
        
        
        
        
        
//        String[] mystr = new String[100];
//        for(int i = 0; i < mystr.length; i++){
//            crearvertice(mystr[i]);
//        }

    }

//    public static void ReadJsonMetro(Grafo grafo, ListaAdyacencia paradas) {
//        readJson(grafo, paradas);
//    }
//
//    public static ListaAdyacencia readJson(Grafo grafo, ListaAdyacencia paradas) {
//        try {
//            // Abrir un JFileChooser para seleccionar el archivo JSON
//            JFileChooser fc = new JFileChooser();
//            FileNameExtensionFilter filter = new FileNameExtensionFilter("archivos de json", "json");
//            fc.setFileFilter(filter);
//            fc.setDialogTitle("Seleccione el archivo JSON de la red de transporte");
//
//            int userSelection = fc.showOpenDialog(null);
//
//            if (userSelection == JFileChooser.APPROVE_OPTION) {
//                File jsonFile = fc.getSelectedFile();
//
//                // Leer el contenido del archivo JSON
//                BufferedReader in = new BufferedReader(new FileReader(jsonFile));
//                StringBuilder content = new StringBuilder();
//                String inputLine;
//                while ((inputLine = in.readLine()) != null) {
//                    content.append(inputLine.trim()); // Eliminar espacios en blanco al inicio y fin
//                }
//                in.close();
//
//                // Convertir el contenido en una cadena
//                String jsonString = content.toString();
//
//                // Llamar a la función para extraer estaciones
//                parseJsonString(jsonString, paradas, grafo);
//            } else {
//                System.out.println("No se seleccionó ningún archivo.");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return paradas;
//    }
//
//    private static void parseJsonString(String jsonString, ListaAdyacencia paradas, Grafo grafo) {
//        // El formato del JSON es conocido, podemos parsearlo manualmente
//
//        // Buscar el inicio del sistema
//        int sistemaStart = jsonString.indexOf("{");
//        int sistemaEnd = jsonString.lastIndexOf("}");
//
//        if (sistemaStart == -1 || sistemaEnd == -1) {
//            System.out.println("Error en el formato del JSON.");
//            return ;
//        }
//
//        String sistemaContent = jsonString.substring(sistemaStart + 1, sistemaEnd).trim();
//
//        // Obtener el nombre del sistema
//        int sistemaNameEnd = sistemaContent.indexOf(":");
//        if (sistemaNameEnd == -1) {
//            System.out.println("Error en el formato del JSON.");
//            return;
//        }
//
//        String sistemaName = sistemaContent.substring(0, sistemaNameEnd).replace("\"", "").trim();
//        System.out.println("Procesando sistema: " + sistemaName);
//
//        String lineasContent = sistemaContent.substring(sistemaNameEnd + 1).trim();
//
//        // Remover corchetes iniciales y finales
//        if (lineasContent.startsWith("[")) {
//            lineasContent = lineasContent.substring(1);
//        }
//        if (lineasContent.endsWith("]")) {
//            lineasContent = lineasContent.substring(0, lineasContent.length() - 1);
//        }
//
//        // Separar las líneas
//        String[] lineasArray = DividirCadenaTexto(lineasContent, "},");
//        for (int i = 0; i < lineasArray.length; i++) {
//            String lineaItem = lineasArray[i].trim();
//            if (lineaItem.startsWith("{")) {
//                lineaItem = lineaItem.substring(1);
//            }
//            if (!lineaItem.endsWith("}")) {
//                lineaItem = lineaItem + "}"; // Agregar } faltante
//            }
//
//            // Obtener el nombre de la línea
//            int lineaNameEnd = lineaItem.indexOf(":");
//            if (lineaNameEnd == -1) {
//                System.out.println("Error en el formato de la línea.");
//                continue;
//            }
//
//            String lineaName = lineaItem.substring(0, lineaNameEnd).replace("\"", "").trim();
//            System.out.println("Procesando línea: " + lineaName);
//
//            String paradasContent = lineaItem.substring(lineaNameEnd + 1).trim();
//
//            // Remover corchetes iniciales y finales
//            if (paradasContent.startsWith("[")) {
//                paradasContent = paradasContent.substring(1);
//            }
//            if (paradasContent.endsWith("]}")) {
//                paradasContent = paradasContent.substring(0, paradasContent.length() - 2);
//            } else if (paradasContent.endsWith("]")) {
//                paradasContent = paradasContent.substring(0, paradasContent.length() - 1);
//            }
//
//            // Separar las estaciones
//            String[] paradasArray = DividirCadenaTexto(paradasContent, ",");
//
//            int paradaPrevIndex = -1;
//
//            for (int j = 0; j < paradasArray.length; j++) {
//                String paradaItem = paradasArray[j].trim();
//
//                int estacionIndexActual = -1;
//
//                if (paradaItem.startsWith("{") && paradaItem.endsWith("}")) {
//                    // Estación especial (intersección)
//                    paradaItem = paradaItem.substring(1, paradaItem.length() - 1).trim();
//                    String[] estacionPair = paradaItem.split(":");
//                    if (estacionPair.length == 2) {
//                        String nombre1 = estacionPair[0].replace("\"", "").trim();
//                        String nombre2 = estacionPair[1].replace("\"", "").trim();
//                        System.out.println("Procesando estación especial: " + nombre1 + " - " + nombre2);
//
//                        Vertice estacion1 = new Vertice(nombre1, lineaName, sistemaName);
//                        Vertice estacion2 = new Vertice(nombre2, lineaName, sistemaName);
//
//                        int index1 = paradas.indexOf(estacion1);
//                        if (index1 == -1) {
//                            paradas.append(estacion1);
//                            index1 = paradas.len() - 1;
//                        } else {
//                            // Agregar la línea a la estación existente
//                            estaciones.get(index1).agregarLinea(lineaName);
//                        }
//
//                        int index2 = estaciones.indexOf(estacion2);
//                        if (index2 == -1) {
//                            estaciones.append(estacion2);
//                            index2 = estaciones.len() - 1;
//                        } else {
//                            estaciones.get(index2).agregarLinea(lineaName);
//                        }
//
//                        // Conectar las dos estaciones entre sí
//                        grafo.addArco(index1, index2);
//
//                        estacionIndexActual = index1;
//                    } else {
//                        System.out.println("Error en el formato de la estación especial.");
//                    }
//                } else {
//                    // Estación normal
//                    if (paradaItem.startsWith("\"") && paradaItem.endsWith("\"")) {
//                        paradaItem = paradaItem.substring(1, paradaItem.length() - 1);
//                    }
//                    String nombreEstacion = paradaItem.trim();
//                    System.out.println("Procesando estación: " + nombreEstacion);
//
//                    Estacion estacionActual = new Estacion(nombreEstacion, lineaName, sistemaName);
//
//                    int index = estaciones.indexOf(estacionActual);
//                    if (index == -1) {
//                        estaciones.append(estacionActual);
//                        index = estaciones.len() - 1;
//                    } else {
//                        // Agregar la línea a la estación existente
//                        estaciones.get(index).agregarLinea(lineaName);
//                    }
//                    estacionIndexActual = index;
//                }
//
//                // Conectar la estación actual con la anterior en la línea
//                if (paradaPrevIndex != -1 && estacionIndexActual != -1) {
//                    grafo.addArco(paradaPrevIndex, estacionIndexActual);
//                }
//
//                paradaPrevIndex = estacionIndexActual;
//            }
//
//            // No incrementamos lineaIndex, ya que no lo necesitamos para colores
//        }
//    }
//
//
//    private static String[] DividirCadenaTexto(String input, String delimiter) {
//        Lista<String> result = new Lista<>();
//        StringBuilder sb = new StringBuilder();
//        int braceLevel = 0;
//
//        for (int i = 0; i < input.length(); i++) {
//            char c = input.charAt(i);
//            if (c == '{') {
//                braceLevel++;
//            } else if (c == '}') {
//                braceLevel--;
//            }
//
//            if (braceLevel == 0 && input.startsWith(delimiter, i)) {
//                result.append(sb.toString());
//                sb.setLength(0);
//                i += delimiter.length() - 1; // Saltar el delimitador
//            } else {
//                sb.append(c);
//            }
//        }
//
//        if (sb.length() > 0) {
//            result.append(sb.toString());
//        }
//
//        // Convertir Lista a arreglo
//        String[] array = new String[result.len()];
//        for (int i = 0; i < result.len(); i++) {
//            array[i] = result.get(i);
//        }
//
//        return array;
//    }
}
