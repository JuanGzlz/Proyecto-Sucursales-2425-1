/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Grafo.Grafo;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class DefinirRango extends javax.swing.JFrame {

    private Grafo g;

    /**
     * Creates new form DefinirRango
     */
    public DefinirRango() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        valorT = new javax.swing.JTextArea();
        guardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver.setBackground(new java.awt.Color(204, 204, 255));
        volver.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 18)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("< Atras");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        valorT.setColumns(20);
        valorT.setRows(5);
        jScrollPane1.setViewportView(valorT);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, 90));

        guardar.setBackground(new java.awt.Color(255, 204, 102));
        guardar.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 24)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jLabel2.setText("Ingrese su rango de distancia entre sucursales,  recuerde es un entero");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 410, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/istockphoto-1297178665-612x612.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
       InterfazFunciones.VolverMenu();
    }//GEN-LAST:event_volverActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        this.g = InterfazFunciones.getGrafo();
        try{
        if (g != null) {  
            int T = Integer.parseInt(valorT.getText()); 
            InterfazFunciones.setT(T); 
            JOptionPane.showMessageDialog(null, "Su rango a sido definido exitósamente, regrese al menú");
            this.valorT.setText("");
        }else {
            JOptionPane.showMessageDialog(null, "No hay ningún archivo al cual definir rango, cargue uno");
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "No colocaste un número válido");
            this.valorT.setText("");
        }
    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(DefinirRango.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DefinirRango.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DefinirRango.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DefinirRango.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DefinirRango().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea valorT;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
