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
/**
 *
 * @author Admin
 */
public class LeerJSON {
    private void abrirTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirTXTActionPerformed
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("archivos de json", "json");
        fc.setFileFilter(filter);
//        int selection = fc.showOpenDialog(this);
//        
//        if (selection == JFileChooser.APPROVE_OPTION){
//            File fichero = fc.getSelectedFile();
//            
//            try (FileReader fr = new FileReader(fichero)){
//                String cadena = "";
//                int valor = fr.read();
//                while (valor != -1){
//                    cadena += (char) valor;
//                    valor = fr.read();
//                }
//                
//                String txtArreglado = archivotxt.comprobacionTXT(cadena);
//                
//                if("".equals(txtArreglado)){
//                    //JOptionPane.showMessageDialog(null, "Archivo de texto no válido");
//                }else{
//                    this.sopaletras = new SopaLetras(4, 4);
//                    this.sopaletras.armarSopa(txtArreglado);
//                    func.mostrarLetras();
//                    func.colorReset();
//                }
//                
//            }
//            catch (IOException el){}
//        }
    }
}
