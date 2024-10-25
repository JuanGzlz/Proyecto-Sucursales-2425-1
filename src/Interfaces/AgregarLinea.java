/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Funciones.Funcionalidades;
import Grafo.Grafo; 
import Grafo.Vertice;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
/**
 *
 * @author User
 */
public class AgregarLinea extends javax.swing.JFrame {

    /**
     * Creates new form AgregarLinea
     */
    private Grafo g;
    private String newInicio;
    private String newFinal;
    
    
    public AgregarLinea() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volver = new javax.swing.JButton();
        agregarlinea = new javax.swing.JButton();
        nuevoInicio = new javax.swing.JButton();
        nuevoFinal = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver.setBackground(new java.awt.Color(204, 204, 255));
        volver.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 18)); // NOI18N
        volver.setText("< Atras ");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        agregarlinea.setBackground(new java.awt.Color(255, 204, 102));
        agregarlinea.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 24)); // NOI18N
        agregarlinea.setText("AGREGAR LÍNEA");
        agregarlinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarlineaActionPerformed(evt);
            }
        });
        getContentPane().add(agregarlinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        nuevoInicio.setBackground(new java.awt.Color(204, 204, 255));
        nuevoInicio.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 20)); // NOI18N
        nuevoInicio.setText("INICIO");
        nuevoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoInicioActionPerformed(evt);
            }
        });
        getContentPane().add(nuevoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        nuevoFinal.setBackground(new java.awt.Color(204, 204, 255));
        nuevoFinal.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 20)); // NOI18N
        nuevoFinal.setText("FINAL");
        nuevoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoFinalActionPerformed(evt);
            }
        });
        getContentPane().add(nuevoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 18)); // NOI18N
        jLabel1.setText("Presiona inicio, para elegir la ");
        jPanel1.add(jLabel1);

        jLabel3.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 18)); // NOI18N
        jLabel3.setText("sucursal de origen");
        jPanel1.add(jLabel3);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 270, 70));

        jLabel4.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 18)); // NOI18N
        jLabel4.setText("Presiona final, para elegir la ");
        jPanel2.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 18)); // NOI18N
        jLabel5.setText("sucursal donde termina");
        jPanel2.add(jLabel5);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 250, 70));

        jLabel6.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 18)); // NOI18N
        jLabel6.setText("Ahora dale a este botón para finalizar!");
        jPanel3.add(jLabel6);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 360, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/istockphoto-1297178665-612x612.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        InterfazFunciones.VolverMenu();
    }//GEN-LAST:event_volverActionPerformed

    private void agregarlineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarlineaActionPerformed
        this.g = InterfazFunciones.getGrafo();
        if (g != null) {
            String inicioP = newInicio;
            String finalP = newFinal;
            Funcionalidades f = new Funcionalidades();
            if (inicioP == null || finalP == null){
                JOptionPane.showMessageDialog(rootPane, "Falta por seleccionar uno o ambos de los puntos para la nueva línea...");
            }else{
                if (f.posibleAgregar(g, inicioP, finalP) == false){
                    f.agregarLinea(g, inicioP, finalP);
                    JOptionPane.showMessageDialog(rootPane, "Una nueva línea ha sido añadida con éxito.");
                    g.mostrarGrafo();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Estas paradas ya están conectadas directamente.");
                } 
            }
        }else {
            JOptionPane.showMessageDialog(rootPane, "No ha ingresado ningún archivo Json para leer...");
        }
    }//GEN-LAST:event_agregarlineaActionPerformed

    private void nuevoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoInicioActionPerformed
        int i = 0;
        this.g = InterfazFunciones.getGrafo();
        if (g != null) {
            Vertice v = g.getListaParadas().getpFirst();
            while(v != null){
                for(int j = 0; j < v.getNombre().length; j++){
                    i++;
                }
                v = v.getpNext();
            }
            String[] A = new String[i];
            i = 0;
            v = g.getListaParadas().getpFirst();
            while(v!=null){
                for(int j = 0; j < v.getNombre().length; j++){
                    A[i] = v.getNombre()[j];
                    i++;
                }
                v = v.getpNext();
            }
            String I = (String) JOptionPane.showInputDialog(rootPane, "Seleccione una parada:", "", HEIGHT, null, A, DISPOSE_ON_CLOSE);
            newInicio = I;
        }else {
            JOptionPane.showMessageDialog(rootPane, "No ha ingresado ningún archivo Json para leer...");
        }
    }//GEN-LAST:event_nuevoInicioActionPerformed

    private void nuevoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoFinalActionPerformed
        int i = 0;
        this.g = InterfazFunciones.getGrafo();
        if (g != null) {
            Vertice v = g.getListaParadas().getpFirst();
            while(v!= null){
                for(int j = 0; j < v.getNombre().length; j++){
                    i++;
                }
                v = v.getpNext();
            }
            String[] A = new String[i];
            i = 0;
            v = g.getListaParadas().getpFirst();
            while(v!=null){
                for(int j = 0; j < v.getNombre().length; j++){
                    A[i] = v.getNombre()[j];
                    i++;
                }
                v = v.getpNext();
            }
            String F = (String) JOptionPane.showInputDialog(rootPane, "Seleccione una parada:", "", HEIGHT, null, A, DISPOSE_ON_CLOSE);
            newFinal = F;
        }else {
            JOptionPane.showMessageDialog(rootPane, "No ha ingresado ningún archivo Json para leer...");
        }
    }//GEN-LAST:event_nuevoFinalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarLinea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarLinea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarLinea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarLinea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarLinea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarlinea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton nuevoFinal;
    private javax.swing.JButton nuevoInicio;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    
}
