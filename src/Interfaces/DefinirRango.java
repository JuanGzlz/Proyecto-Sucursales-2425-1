/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Grafo.Grafo;
import javax.swing.JOptionPane;
/**
 * Clase interfaz DefinirRango
 * @author Macorre21
 * @version 1.0
 */
public class DefinirRango extends javax.swing.JFrame {

    /**
     * Constructor de la clase DefinirRango
     * @param g variable interna de tipo Grafo
     */
    private Grafo g;
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 210, 240, 90));

        guardar.setBackground(new java.awt.Color(255, 204, 153));
        guardar.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 30)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 24)); // NOI18N
        jLabel2.setText("Escribe el rango en el área blanca, luego  ");
        jPanel1.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 24)); // NOI18N
        jLabel3.setText("presiona el botón guardar");
        jPanel1.add(jLabel3);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 490, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/istockphoto-1297178665-612x612.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param evt
     * Al presionar el botón se llama a la función de la Clase InterfazFunciones "VolverMenu" para salir de esta ventana al Menú.
     */
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
       InterfazFunciones.VolverMenu();
    }//GEN-LAST:event_volverActionPerformed

    /**
     * @param evt
     * Ésta función comprueba que haya un grafo al cual definirle un rango "T", si hay uno se le asigna el valorT, 
     * se utiliza InterfazFunciones "setT()" con parámetro T para poder guardar la T más reciente en el programa 
     * y usarla en el resto de interfaces.
     * Una vez guardado el rango se borra del TextArea.
     */
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        this.g = InterfazFunciones.getGrafo();
        try{
        if (g != null) {  
            int T = Integer.parseInt(valorT.getText()); 
            InterfazFunciones.setT(T); 
            JOptionPane.showMessageDialog(null, "Su rango ha sido definido exitosamente, corra el DFS o BFS para que sea visible.");
            this.valorT.setText("");
        }else {
            JOptionPane.showMessageDialog(null, "No hay ningún archivo al cual definir rango, cargue uno...");
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "No colocaste un número válido...");
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea valorT;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
