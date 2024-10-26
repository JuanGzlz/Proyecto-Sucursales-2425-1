/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Grafo.BusquedaDFS;
import Grafo.BusquedaBFS;
import Grafo.Grafo;
import javax.swing.JOptionPane;
import Funciones.Funcionalidades;
import Grafo.Vertice;

/**
 * Clase interfaz CoberturaTotal
 * @author Macorrea21
 * @version 1.0
 */
public class CoberturaTotal extends javax.swing.JFrame {

    /**
     * Constructor de la clase interfaz Cobertura Total
     * @param x variable interna de tipo Grafo
     * @param T variable de tipo Entero que se declara incialmente como "0"
     */
    private Grafo x;
    private int T;
    
    public CoberturaTotal() {
        this.T = 0;
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

        jLabel5 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        coberturatotalDFS = new javax.swing.JButton();
        coberturatotalBFS = new javax.swing.JButton();
        puntoesfecíficoBFS = new javax.swing.JButton();
        puntoespecificoDFS = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver.setBackground(new java.awt.Color(204, 204, 255));
        volver.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 18)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("< Atras ");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        coberturatotalDFS.setBackground(new java.awt.Color(255, 204, 102));
        coberturatotalDFS.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 24)); // NOI18N
        coberturatotalDFS.setText("Cobertura Total");
        coberturatotalDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coberturatotalDFSActionPerformed(evt);
            }
        });
        getContentPane().add(coberturatotalDFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        coberturatotalBFS.setBackground(new java.awt.Color(255, 204, 102));
        coberturatotalBFS.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 24)); // NOI18N
        coberturatotalBFS.setText("Cobertura Total");
        coberturatotalBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coberturatotalBFSActionPerformed(evt);
            }
        });
        getContentPane().add(coberturatotalBFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        puntoesfecíficoBFS.setBackground(new java.awt.Color(255, 204, 153));
        puntoesfecíficoBFS.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 24)); // NOI18N
        puntoesfecíficoBFS.setForeground(new java.awt.Color(255, 255, 255));
        puntoesfecíficoBFS.setText("Punto Específico");
        puntoesfecíficoBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoesfecíficoBFSActionPerformed(evt);
            }
        });
        getContentPane().add(puntoesfecíficoBFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        puntoespecificoDFS.setBackground(new java.awt.Color(255, 204, 153));
        puntoespecificoDFS.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 24)); // NOI18N
        puntoespecificoDFS.setForeground(new java.awt.Color(255, 255, 255));
        puntoespecificoDFS.setText("Punto Específico");
        puntoespecificoDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoespecificoDFSActionPerformed(evt);
            }
        });
        getContentPane().add(puntoespecificoDFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 22)); // NOI18N
        jLabel2.setText("Revisar cobertura por : ");
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 300, 40));

        jLabel4.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 24)); // NOI18N
        jLabel4.setText("DFS");
        jPanel2.add(jLabel4);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 90, 40));

        jLabel3.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 24)); // NOI18N
        jLabel3.setText("BFS ");
        jPanel3.add(jLabel3);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 80, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/istockphoto-1297178665-612x612.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param evt
     * Esta función es mediante un BFS que recorre todos los enlaces desde el punto de origen para hallar el camino más 
     * eficiente, va recorrriendo el grafo por los niveles que se declararon cómo "T".
     * Función que observa la cobertura total en el grafo, esta corre cuando las variables "x" y "T" 
     * son distinta de null y mayor que 0, seguidamente el programa recorre el grafo para sugerir una sucursal,
     * para finalmente mostrar un grafo con la cobertura total.
     */
    
    private void coberturatotalBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coberturatotalBFSActionPerformed
        this.T = InterfazFunciones.getT();
        this.x = InterfazFunciones.getGrafo();
        if (T > 0 && x != null){
            x.resetCobertura();
            Funcionalidades f = new Funcionalidades();
            Vertice v = f.sugerirSucursal(x, T);
            if (v != null){
                JOptionPane.showMessageDialog(rootPane, "SUGERENCIA: Coloque una sucursal en \"" + v.getNombre()[0] + "\"");
            } else{
                JOptionPane.showMessageDialog(rootPane, "¡El sistema ya cubre toda la ciudad!");
            }
            BusquedaBFS buscar = new BusquedaBFS();
            buscar.CompleteBFS(x, T);
            x.mostrarGrafo();
        }else {
            if (T <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Tu rango es inválido o no lo has definido...");
            }
            if (x == null) {
                JOptionPane.showMessageDialog(rootPane, "No ha ingresado ningún grafo...");
            }
        }          
    }//GEN-LAST:event_coberturatotalBFSActionPerformed

      /**
     * @param evt
     * Aquí se utiliza el método de Búsqueda DFS donde va a recorrer uno por uno las ramas que se encuentren enlazadas 
     * con el punto de origen.
     * Función que observa la cobertura total en el grafo, esta corre cuando las variables "x" y "T" 
     * son distinta de null y mayor que 0, seguidamente el programa recorre el grafo para sugerir una sucursal,
     * para finalmente mostrar un grafo con la cobertura total.
     */
    
    private void coberturatotalDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coberturatotalDFSActionPerformed
        this.T = InterfazFunciones.getT();
        this.x = InterfazFunciones.getGrafo();
        if (T > 0 && x != null){
            x.resetCobertura();
            Funcionalidades f = new Funcionalidades();
            Vertice v = f.sugerirSucursal(x, T);
            if (v != null){
                JOptionPane.showMessageDialog(rootPane, "SUGERENCIA: Coloque una sucursal en \"" + v.getNombre()[0] + "\"");
            } else{
                JOptionPane.showMessageDialog(rootPane, "¡El sistema ya cubre toda la ciudad!");
            }
            BusquedaDFS busqueda = new BusquedaDFS();
            busqueda.CompleteDFS(x, T);
            x.mostrarGrafo();
        }else {
            if (T <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Tu rango es inválido o no lo has definido...");
            }
            if (x == null) {
                JOptionPane.showMessageDialog(rootPane, "No ha ingresado ningún grafo...");
            }
        }
    }//GEN-LAST:event_coberturatotalDFSActionPerformed

    
    /**
     * @param evt
     * Al presionar el botón se llama a la función de la Clase InterfazFunciones "VolverMenu" para salir de esta ventana al Menú
     */
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        InterfazFunciones.VolverMenu();
    }//GEN-LAST:event_volverActionPerformed

    
    /**
     * @param evt
     * En principio se genera una lista desplegable con todas las paradas que se encuentren en el Json para que puedas
     * seleccionar el punto específico donde está la sucursal y así mostrar su "T".
     * Función que utiliza el método de Búsqueda BFS donde va a recorrer uno por uno los niveles las ramas que se encuentren 
     * enlazadas con el punto de origen hasta llegar a que T = 0.
     */
  
    private void puntoesfecíficoBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoesfecíficoBFSActionPerformed
        this.T = InterfazFunciones.getT();
        this.x = InterfazFunciones.getGrafo();
        if (T > 0 && x != null){
            int i = 0;
            x.resetCobertura();
            Vertice v = x.getListaParadas().getpFirst();
            while(v!= null){
                for(int j = 0; j < v.getNombre().length; j++){
                    i++;
                }
                v = v.getpNext();
            }
            String[] A = new String[i];
            i = 0;
            v = x.getListaParadas().getpFirst();
            while(v!=null){
                for(int j = 0; j < v.getNombre().length; j++){
                    A[i] = v.getNombre()[j];
                    i++;
                }
                v = v.getpNext();
            }
            String S = (String) JOptionPane.showInputDialog(rootPane, "Seleccione una Sucursal:", "", HEIGHT, null, A, DISPOSE_ON_CLOSE);
            if (S != null){
                v = x.busquedaInicial(S);
                if (v.isSucursal() == true){
                    BusquedaBFS buscar = new BusquedaBFS();
                    buscar.BusquedaBFS_Unico(x, T, v);
                    x.mostrarGrafo();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "La parada seleccionada no es una sucursal...");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Seleccione una parada correctamente...");
            }
        }else {
            if (T <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Tu rango es inválido o no lo has definido...");
            }
            if (x == null) {
                JOptionPane.showMessageDialog(rootPane, "No ha ingresado ningún grafo...");
            }
        }
    }//GEN-LAST:event_puntoesfecíficoBFSActionPerformed

    
      /**
     * @param evt
     * En principio se genera una lista desplegable con todas las paradas que se encuentren en el Json para que puedas
     * seleccionar el punto específico donde está la sucursal y así mostrar su "T".
     * Función que utiliza el método de Búsqueda DFS donde va a recorrer una por una las ramas que se encuentren enlazadas 
     * con el punto de origen hasta llegar a que T = 0.
     */
    
    private void puntoespecificoDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoespecificoDFSActionPerformed
        this.T = InterfazFunciones.getT();
        this.x = InterfazFunciones.getGrafo();
        if (T > 0 && x != null){
            x.resetCobertura();
            int i = 0;
            Vertice v = x.getListaParadas().getpFirst();
            while(v!= null){
                for(int j = 0; j < v.getNombre().length; j++){
                    i++;
                }
                v = v.getpNext();
            }
            String[] A = new String[i];
            i = 0;
            v = x.getListaParadas().getpFirst();
            while(v!=null){
                for(int j = 0; j < v.getNombre().length; j++){
                    A[i] = v.getNombre()[j];
                    i++;
                }
                v = v.getpNext();
            }
            String S = (String) JOptionPane.showInputDialog(rootPane, "Seleccione una sucursal:", "", HEIGHT, null, A, DISPOSE_ON_CLOSE);
            if (S != null){
                v = x.busquedaInicial(S);
                if (v.isSucursal() == true){
                    BusquedaDFS buscar = new BusquedaDFS();
                    buscar.BusquedaDFS_Unico(x, T, v);
                    x.mostrarGrafo();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "La parada seleccionada no es una sucursal...");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Seleccione una parada correctamente...");
            }
        }else {
            if (T <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Tu rango es inválido o no lo has definido...");
            }
            if (x == null) {
                JOptionPane.showMessageDialog(rootPane, "No ha ingresado ningún grafo...");
            }
        }
    }//GEN-LAST:event_puntoespecificoDFSActionPerformed

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
            java.util.logging.Logger.getLogger(CoberturaTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoberturaTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoberturaTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoberturaTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoberturaTotal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coberturatotalBFS;
    private javax.swing.JButton coberturatotalDFS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton puntoesfecíficoBFS;
    private javax.swing.JButton puntoespecificoDFS;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
