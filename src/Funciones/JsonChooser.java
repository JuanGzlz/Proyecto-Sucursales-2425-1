/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Clase JsonChooser
 * Incluye 
 * @author Juan González
 * @version 1.0
 */

public class JsonChooser {
    
    
    private File archivo;
 
    
    
    public JsonChooser(){
        this.archivo = null;
    }
    
    
    
    public File getJson(){
        return this.archivo;
    }
    
    
    
    public void chooseFile(){
        JFileChooser NewFile = new JFileChooser();
        FileNameExtensionFilter NewFilter = new FileNameExtensionFilter("Archivos Json", "json");
        NewFile.setFileFilter(NewFilter);
        NewFile.setAcceptAllFileFilterUsed(false);
        int IsValid = NewFile.showOpenDialog(NewFile);
        if(IsValid == JFileChooser.APPROVE_OPTION){
            this.archivo = NewFile.getSelectedFile();
        }
    }
}
