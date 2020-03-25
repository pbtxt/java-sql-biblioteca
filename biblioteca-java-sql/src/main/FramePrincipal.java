package main;

import DAO.AutorDAO;
import DAO.ConsultaDAO;
import DAO.MaterialDAO;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import negocio.Autor;
import negocio.Consulta;
import negocio.Material;

public class FramePrincipal extends javax.swing.JFrame {

    public FramePrincipal() {

        initComponents();
        this.setLocationRelativeTo(FramePrincipal.this);

    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b_palabra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        b_list = new javax.swing.JComboBox<>();
        b_enviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        b_table = new javax.swing.JTable();
        b_limpiar = new javax.swing.JButton();
        b_reservar = new javax.swing.JButton();
        b_admin = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Broadway", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema de información ");

        jLabel2.setFont(new java.awt.Font("Broadway", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("bibliotecario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(351, 351, 351))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel3.setText("Busqueda básica");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel4.setText("Palabra clave");

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel5.setText("Buscar por: ");

        b_list.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        b_list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir busqueda", "Autor", "Titulo", "Nacionalidad", "Ver todos" }));

        b_enviar.setBackground(new java.awt.Color(153, 0, 0));
        b_enviar.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        b_enviar.setForeground(new java.awt.Color(255, 255, 255));
        b_enviar.setText("Enviar");
        b_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_enviarActionPerformed(evt);
            }
        });

        b_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "ID autor", "Autor", "Formato", "Publicacion", "Pais"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(b_table);

        b_limpiar.setBackground(new java.awt.Color(153, 0, 0));
        b_limpiar.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        b_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        b_limpiar.setText("Limpiar");
        b_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limpiarActionPerformed(evt);
            }
        });

        b_reservar.setBackground(new java.awt.Color(153, 0, 0));
        b_reservar.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        b_reservar.setForeground(new java.awt.Color(255, 255, 255));
        b_reservar.setText("Reservar");
        b_reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_reservarActionPerformed(evt);
            }
        });

        b_admin.setBackground(new java.awt.Color(51, 0, 0));
        b_admin.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        b_admin.setForeground(new java.awt.Color(255, 255, 255));
        b_admin.setText("Administrar");
        b_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_adminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(b_palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b_list, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(b_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(62, 62, 62)
                                    .addComponent(b_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(382, 382, 382))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(b_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addComponent(b_reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_admin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_palabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(b_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_limpiar)
                    .addComponent(b_enviar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_reservar)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_enviarActionPerformed

        DefaultTableModel model = (DefaultTableModel) b_table.getModel();

        String opcion = b_list.getSelectedItem().toString();
        String au = b_palabra.getText();
        String sql = "";
        if (opcion.equalsIgnoreCase("Autor")) {
            sql = "SELECT m.id_material, nom_material, f_publicacion, a.id_autor, nom_autor, nacionalidad, clasificacion FROM material m, autor a, material_autor ma, bibliografico b WHERE m.id_material = ma.id_material AND a.id_autor = ma.id_autor AND b.id_material = m.id_material AND nom_autor LIKE'%" + au + "%' "
                    + "UNION "
                    + "SELECT mat.id_material, nom_material, f_publicacion, a.id_autor, nom_autor, nacionalidad, formato FROM material mat, autor a, material_autor ma, audiovisual aud WHERE mat.id_material = ma.id_material AND a.id_autor = ma.id_autor AND aud.id_material = mat.id_material AND nom_autor LIKE '%" + au + "%';";
        } else {
            if (opcion.equalsIgnoreCase("Titulo")) {
                sql = "SELECT m.id_material, nom_material, f_publicacion, a.id_autor, nom_autor, nacionalidad, clasificacion FROM material m, autor a, material_autor ma, bibliografico b WHERE m.id_material = ma.id_material AND a.id_autor = ma.id_autor AND b.id_material = m.id_material AND nom_material LIKE '%" + au + "%' "
                        + "UNION "
                        + "SELECT mat.id_material, nom_material, f_publicacion, a.id_autor, nom_autor, nacionalidad, formato FROM material mat, autor a, material_autor ma, audiovisual aud WHERE mat.id_material = ma.id_material AND a.id_autor = ma.id_autor AND aud.id_material = mat.id_material AND nom_material lIKE '%" + au + "%';";
            } else {
                if (opcion.equalsIgnoreCase("Nacionalidad")) {
                    sql = "SELECT m.id_material, nom_material, f_publicacion, a.id_autor, nom_autor, nacionalidad, clasificacion FROM material m, autor a, material_autor ma, bibliografico b WHERE m.id_material = ma.id_material AND a.id_autor = ma.id_autor AND b.id_material = m.id_material AND nacionalidad LIKE '%" + au + "%' "
                            + "UNION "
                            + "SELECT mat.id_material, nom_material, f_publicacion, a.id_autor, nom_autor, nacionalidad, formato FROM material mat, autor a, material_autor ma, audiovisual aud WHERE mat.id_material = ma.id_material AND a.id_autor = ma.id_autor AND aud.id_material = mat.id_material AND nacionalidad LIKE '%" + au + "%';";
                } else {
                    if (opcion.equalsIgnoreCase("Ver todos")) {
                      /*  sql = "SELECT m.id_material, nom_material, f_publicacion, a.id_autor, nom_autor, nacionalidad, clasificacion FROM material m, autor a, material_autor ma, bibliografico b WHERE m.id_material = ma.id_material AND a.id_autor = ma.id_autor AND b.id_material = m.id_material AND "
                                + "(nacionalidad='" + au + "' OR nom_autor='" + au + "' OR nom_material='" + au + "' ) "
                                + "UNION "
                                + "SELECT mat.id_material, nom_material, f_publicacion, a.id_autor, nom_autor, nacionalidad, formato FROM material mat, autor a, material_autor ma, audiovisual aud WHERE mat.id_material = ma.id_material AND a.id_autor = ma.id_autor AND aud.id_material = mat.id_material AND "
                                + "nacionalidad='"+au + "' OR nom_autor='" + au + "' OR nom_material='" + au +"';";
                        */
                      sql="SELECT m.id_material, nom_material, f_publicacion, a.id_autor, nom_autor, nacionalidad, clasificacion FROM material m, autor a, material_autor ma, bibliografico b WHERE m.id_material = ma.id_material AND a.id_autor = ma.id_autor AND b.id_material = m.id_material "
                    + "UNION "
                    + "SELECT mat.id_material, nom_material, f_publicacion, a.id_autor, nom_autor, nacionalidad, formato FROM material mat, autor a, material_autor ma, audiovisual aud WHERE mat.id_material = ma.id_material AND a.id_autor = ma.id_autor AND aud.id_material = mat.id_material ;";
                    }

                }
            }
        }

        for (Consulta con : ConsultaDAO.getListConsulta(sql)) {
            model.addRow(new Object[]{con.getId_material(), con.getTitulo(), con.getId_autor(), con.getNom_autor(),
                con.getClasificacion(), con.getF_publicacion(), con.getNacionalidad()});
        }

    }//GEN-LAST:event_b_enviarActionPerformed

    private void b_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) b_table.getModel();
        b_table.setModel( new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "ID autor", "Autor", "Formato", "Publicacion", "Pais", "Disponibilidad"
            }
        ));
        jScrollPane1.setViewportView(b_table);
        
        ;
        
   
    }//GEN-LAST:event_b_limpiarActionPerformed

    private void b_reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_reservarActionPerformed
        // TODO add your handling code here:
        int fila = b_table.getSelectedRow();
        Long cod =  (Long) b_table.getValueAt(fila,0);
        MaterialDAO m = new MaterialDAO();
        //Material mate = m.buscarMaterial(cod);
        ReservaFrame rf = new ReservaFrame(); 
        String sql = "SELECT id_copia, nom_material, est_fisico, copia.id_material FROM material, copia WHERE copia.id_material = material.id_material  AND material.id_material = "+cod+" ;";
        rf.generarTabla(sql);
        rf.setVisible(true);
        
           
       
    }//GEN-LAST:event_b_reservarActionPerformed

    private void b_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_adminActionPerformed
        // TODO add your handling code here:
        new AdminFrame().setVisible(true);
    }//GEN-LAST:event_b_adminActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_admin;
    private javax.swing.JButton b_enviar;
    private javax.swing.JButton b_limpiar;
    private javax.swing.JComboBox<String> b_list;
    private javax.swing.JTextField b_palabra;
    private javax.swing.JButton b_reservar;
    private javax.swing.JTable b_table;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
