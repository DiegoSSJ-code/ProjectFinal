/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Datos.ClsConexion;
import Datos.ListaPokemons;
import com.mysql.cj.Session;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Win10
 */
public class FiltrarPokemon extends javax.swing.JFrame {

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        ClsConexion cone = new ClsConexion();
        Connection conect = cone.getConexion();
    
        
    /**
     * Creates new form FiltrarPokemon
     */
    public FiltrarPokemon() {
        initComponents();
        this.setTitle("FILTRAR");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    private void filtroHabitat(){
        DefaultTableModel mod = (DefaultTableModel) pokeTable.getModel();
        mod.setRowCount(0);
        
        int columnas;
        int[] ancho = {10, 35, 35, 35, 35, 35, 35, 35, 35};
        for (int i = 0; i < pokeTable.getColumnCount(); i++) {
            pokeTable.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
        }
        String Query = "SELECT id, name, generation_id, height, weight, species, color, habitat, capture_rate, base_experience from test.pokemon where habitat = " + "'" +Habitat.getText()+"'";
            try {
                ps = conect.prepareStatement(Query);
                rs = ps.executeQuery();
                rsmd = rs.getMetaData();
                columnas = rsmd.getColumnCount();
                
                while(rs.next()){
                    Object[] fila = new Object[columnas];
                    for(int indice =0; indice<columnas; indice++){
                       fila[indice] = rs.getObject(indice + 1);
               }
               mod.addRow(fila);
               }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error "+ex.toString());
            }
    }
    
    private void filtroXP(){
        DefaultTableModel mod = (DefaultTableModel) pokeTable.getModel();
        mod.setRowCount(0);
        
        int columnas;
        int[] ancho = {10, 35, 35, 35, 35, 35, 35, 35, 35};
        for (int i = 0; i < pokeTable.getColumnCount(); i++) {
            pokeTable.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
        }
        String Query = "SELECT id, name, generation_id, height, weight, species, color, habitat, capture_rate, base_experience from test.pokemon where base_experience = " + "'" +Experiencia.getText()+"'";
            try {
                ps = conect.prepareStatement(Query);
                rs = ps.executeQuery();
                rsmd = rs.getMetaData();
                columnas = rsmd.getColumnCount();
                
                while(rs.next()){
                    Object[] fila = new Object[columnas];
                    for(int indice =0; indice<columnas; indice++){
                       fila[indice] = rs.getObject(indice + 1);
               }
               mod.addRow(fila);
               }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error "+ex.toString());
            }
    }
    
    private void filtroColor(){
        DefaultTableModel mod = (DefaultTableModel) pokeTable.getModel();
        mod.setRowCount(0);
        
        int columnas;
        int[] ancho = {10, 35, 35, 35, 35, 35, 35, 35, 35};
        for (int i = 0; i < pokeTable.getColumnCount(); i++) {
            pokeTable.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
        }
        String Query = "SELECT id, name, generation_id, height, weight, species, color, habitat, capture_rate, base_experience from test.pokemon where color = " + "'" +Color.getText()+"'";
            try {
                ps = conect.prepareStatement(Query);
                rs = ps.executeQuery();
                rsmd = rs.getMetaData();
                columnas = rsmd.getColumnCount();
                
                while(rs.next()){
                    Object[] fila = new Object[columnas];
                    for(int indice =0; indice<columnas; indice++){
                       fila[indice] = rs.getObject(indice + 1);
               }
               mod.addRow(fila);
               }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error "+ex.toString());
            }
    }
    
    private void filtroGen(){
        DefaultTableModel mod = (DefaultTableModel) pokeTable.getModel();
        mod.setRowCount(0);
        
        int columnas;
        int[] ancho = {10, 35, 35, 35, 35, 35, 35, 35, 35};
        for (int i = 0; i < pokeTable.getColumnCount(); i++) {
            pokeTable.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
        }
        String Query = "SELECT id, name, generation_id, height, weight, species, color, habitat, capture_rate, base_experience from test.pokemon where generation_id = " + "'" +Gen.getText()+"'";
            try {
                ps = conect.prepareStatement(Query);
                rs = ps.executeQuery();
                rsmd = rs.getMetaData();
                columnas = rsmd.getColumnCount();
                
                while(rs.next()){
                    Object[] fila = new Object[columnas];
                    for(int indice =0; indice<columnas; indice++){
                       fila[indice] = rs.getObject(indice + 1);
               }
               mod.addRow(fila);
               }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error "+ex.toString());
            }
    }
    
    private void filtroEspecie(){
        DefaultTableModel mod = (DefaultTableModel) pokeTable.getModel();
        mod.setRowCount(0);
        
        int columnas;
        int[] ancho = {10, 35, 35, 35, 35, 35, 35, 35, 35};
        for (int i = 0; i < pokeTable.getColumnCount(); i++) {
            pokeTable.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
        }
        String Query = "SELECT id, name, generation_id, height, weight, species, color, habitat, capture_rate, base_experience from test.pokemon where species = " + "'" +Especie.getText()+"'";
            try {
                ps = conect.prepareStatement(Query);
                rs = ps.executeQuery();
                rsmd = rs.getMetaData();
                columnas = rsmd.getColumnCount();
                
                while(rs.next()){
                    Object[] fila = new Object[columnas];
                    for(int indice =0; indice<columnas; indice++){
                       fila[indice] = rs.getObject(indice + 1);
               }
               mod.addRow(fila);
               }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error "+ex.toString());
            }
    }
    
    private void MostrarUsuario(){
        String Query = "select usuario from test.usuarios where ID = 1";
            try {
                ps = conect.prepareStatement(Query);
                rs = ps.executeQuery();
                txt_user.add((Component) rs);
    }       catch (SQLException ex) {
                Logger.getLogger(FiltrarPokemon.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private void CrearReporte(){
        List lista = new ArrayList();
        for (int i = 0; i < pokeTable.getRowCount(); i++) {
            ListaPokemons pokemones = new ListaPokemons(pokeTable.getValueAt(i, 0).toString(), pokeTable.getValueAt(i, 1).toString(), pokeTable.getValueAt(i, 2).toString(), pokeTable.getValueAt(i, 3).toString(), pokeTable.getValueAt(i, 4).toString(), pokeTable.getValueAt(i, 5).toString(), pokeTable.getValueAt(i, 6).toString(), pokeTable.getValueAt(i, 7).toString(), pokeTable.getValueAt(i, 8).toString());
            lista.add(pokemones);
        }
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pokeTable = new javax.swing.JTable();
        Habitat = new javax.swing.JTextField();
        Experiencia = new javax.swing.JTextField();
        Color = new javax.swing.JTextField();
        Gen = new javax.swing.JTextField();
        Especie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BackToPokedex = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        Ngenerate = new javax.swing.JButton();
        EnviarCorreo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setForeground(new java.awt.Color(204, 0, 0));

        pokeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Generacion", "Altura", "Peso", "Especie", "Color", "Habitat", "Experiencia_base"
            }
        ));
        jScrollPane1.setViewportView(pokeTable);

        Habitat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                HabitatKeyReleased(evt);
            }
        });

        Experiencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ExperienciaKeyReleased(evt);
            }
        });

        Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorActionPerformed(evt);
            }
        });
        Color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ColorKeyReleased(evt);
            }
        });

        Gen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GenKeyReleased(evt);
            }
        });

        Especie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EspecieKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Habitat: ");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Experiencia:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Color: ");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Generacion:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Especie: ");

        BackToPokedex.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BackToPokedex.setText("Regresar a Pokedex");
        BackToPokedex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToPokedexActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("FAVORITOS:)");

        jLabel7.setText("Username:");

        jLabel8.setText("Correo:");

        txt_user.setEditable(false);

        Ngenerate.setText("Generar Reporte");
        Ngenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgenerateActionPerformed(evt);
            }
        });

        EnviarCorreo.setText("Envair Correo");
        EnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarCorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Especie, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gen, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Experiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Habitat, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EnviarCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ngenerate)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackToPokedex)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Habitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Experiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Especie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ngenerate)
                            .addComponent(EnviarCorreo)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BackToPokedex)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HabitatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HabitatKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            filtroHabitat();
        }
    }//GEN-LAST:event_HabitatKeyReleased

    private void ExperienciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ExperienciaKeyReleased
        // TODO add your handling code here:+
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            filtroXP();
        }
    }//GEN-LAST:event_ExperienciaKeyReleased

    private void ColorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ColorKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            filtroColor();
        }
    }//GEN-LAST:event_ColorKeyReleased

    private void ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColorActionPerformed

    private void GenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GenKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            filtroGen();
        }
    }//GEN-LAST:event_GenKeyReleased

    private void EspecieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EspecieKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            filtroEspecie();
        }
    }//GEN-LAST:event_EspecieKeyReleased

    private void BackToPokedexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToPokedexActionPerformed
        // TODO add your handling code here:
        ventanaPokedex vp = new ventanaPokedex();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackToPokedexActionPerformed

    private void NgenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NgenerateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NgenerateActionPerformed

    private void EnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarCorreoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_EnviarCorreoActionPerformed

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
            java.util.logging.Logger.getLogger(FiltrarPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiltrarPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiltrarPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiltrarPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiltrarPokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToPokedex;
    private javax.swing.JTextField Color;
    private javax.swing.JButton EnviarCorreo;
    private javax.swing.JTextField Especie;
    private javax.swing.JTextField Experiencia;
    private javax.swing.JTextField Gen;
    private javax.swing.JTextField Habitat;
    private javax.swing.JButton Ngenerate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable pokeTable;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
