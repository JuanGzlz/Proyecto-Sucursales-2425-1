/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Admin
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
}
