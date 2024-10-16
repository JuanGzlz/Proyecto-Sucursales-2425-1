/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
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
}
