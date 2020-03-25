package main;

import DAO.AutorDAO;
import DAO.MaterialAutorDAO;
import DAO.MaterialDAO;
import DAO.TemaDAO;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import negocio.Autor;
import negocio.Material;
import negocio.MaterialAutor;
import negocio.Tema;

public class Frame extends javax.swing.JFrame {

    DateFormat df = DateFormat.getDateInstance();
    
    
    

    public Frame() {
        initComponents();
        this.setLocationRelativeTo(Frame.this);
        cargarAutores(0);
        cargarTemas(0);

    }
    Long id;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnver = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p_idmaterial = new javax.swing.JTextField();
        p_titulo = new javax.swing.JTextField();
        registrar_material = new javax.swing.JButton();
        p_respuesta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        registrar_audiovisual = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        list_aut = new javax.swing.JComboBox<>();
        m_otro = new javax.swing.JButton();
        p_date = new com.toedter.calendar.JDateChooser();
        list_aut_tema = new javax.swing.JComboBox<>();
        t_otro = new javax.swing.JButton();

        mnver.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("ID del material");

        jLabel3.setText("Titulo");

        jLabel4.setText("Fecha de publicación");

        p_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_tituloActionPerformed(evt);
            }
        });

        registrar_material.setBackground(new java.awt.Color(153, 0, 0));
        registrar_material.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        registrar_material.setForeground(new java.awt.Color(255, 255, 255));
        registrar_material.setText("Registrar material bibliografico");
        registrar_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_materialActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel5.setText("Registro de material");

        registrar_audiovisual.setBackground(new java.awt.Color(153, 0, 0));
        registrar_audiovisual.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        registrar_audiovisual.setForeground(new java.awt.Color(255, 255, 255));
        registrar_audiovisual.setText("Registrar material audiovisual");
        registrar_audiovisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_audiovisualActionPerformed(evt);
            }
        });

        jLabel1.setText("Autor");

        jLabel6.setText("Tema");

        list_aut.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        list_aut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        list_aut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_autActionPerformed(evt);
            }
        });

        m_otro.setBackground(new java.awt.Color(153, 0, 0));
        m_otro.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        m_otro.setForeground(new java.awt.Color(255, 255, 255));
        m_otro.setText("Otro");
        m_otro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_otroActionPerformed(evt);
            }
        });

        list_aut_tema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        list_aut_tema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_aut_temaActionPerformed(evt);
            }
        });

        t_otro.setBackground(new java.awt.Color(153, 0, 0));
        t_otro.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        t_otro.setForeground(new java.awt.Color(255, 255, 255));
        t_otro.setText("Otro");
        t_otro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_otroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p_titulo)
                                    .addComponent(p_idmaterial)
                                    .addComponent(p_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(list_aut_tema, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(list_aut, javax.swing.GroupLayout.Alignment.LEADING, 0, 164, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(m_otro)
                                            .addComponent(t_otro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(registrar_material)
                                .addGap(30, 30, 30)
                                .addComponent(registrar_audiovisual))
                            .addComponent(p_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(p_idmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(p_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(list_aut_tema, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_otro)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(list_aut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_otro))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar_material)
                    .addComponent(registrar_audiovisual))
                .addGap(29, 29, 29)
                .addComponent(p_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrar_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_materialActionPerformed

        String bien = "Material registrado con éxito";
        Material material = new Material();
        MaterialAutor ma = new MaterialAutor();
        
        Long k_material = Long.valueOf(p_idmaterial.getText());
      //String date = df.format(p_date.getDate());
        
        String dd=Integer.toString(p_date.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mm = Integer.toString(p_date.getCalendar().get(Calendar.MONTH)+1);
        String yyyy = Integer.toString(p_date.getCalendar().get(Calendar.YEAR));
        
        
        String date = yyyy+"-"+mm+"-"+dd;
        Date f =java.sql.Date.valueOf(date);
        
        
        material.setId_material(k_material);
        material.setTitulo(p_titulo.getText());
        material.setF_publicacion(f);
        String resp = MaterialDAO.registrarMaterial(material);

        String i = list_aut.getSelectedItem().toString();
        Long id = BuscarAutor(i);
        ma.setId_autor(id);
        ma.setId_material(k_material);
        String res = MaterialAutorDAO.registrarmaterial_autor(ma);
        p_respuesta.setText(resp + "  " + res);

        if (resp.equals(bien) && res.equalsIgnoreCase("Material Autor registrado con éxito")) {
            MaterialBibliograficoFrame fram = new MaterialBibliograficoFrame();
            fram.setId(p_idmaterial.getText());
            fram.setVisible(true);
          
        }
        
    
        
    }//GEN-LAST:event_registrar_materialActionPerformed

    private void registrar_audiovisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_audiovisualActionPerformed
        String bien = "Material registrado con éxito";

        Material material = new Material();
        MaterialAutor ma = new MaterialAutor();
        Long k_material = Long.valueOf(p_idmaterial.getText());
        
        String dd=Integer.toString(p_date.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mm = Integer.toString(p_date.getCalendar().get(Calendar.MONTH)+1);
        String yyyy = Integer.toString(p_date.getCalendar().get(Calendar.YEAR));
        
        
        String date = yyyy+"-"+mm+"-"+dd;
        
        Date f =java.sql.Date.valueOf(date);

        material.setId_material(k_material);
        material.setTitulo(p_titulo.getText());
        material.setF_publicacion(f);
        String resp = MaterialDAO.registrarMaterial(material);
        
        String i = list_aut.getSelectedItem().toString();
        Long id = BuscarAutor(i);
        ma.setId_autor(id);
        ma.setId_material(k_material);
        String res = MaterialAutorDAO.registrarmaterial_autor(ma);
        p_respuesta.setText(resp + "  " + res);
        
        p_respuesta.setText(resp);

        if (resp.equals(bien) && res.equalsIgnoreCase("Material Autor registrado con éxito")) {
            MaterialAudiovisualFrame fram = new MaterialAudiovisualFrame();
            fram.setId(p_idmaterial.getText());
            fram.setVisible(true);
         //  dispose();
        }
    }//GEN-LAST:event_registrar_audiovisualActionPerformed

    private void list_autActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_autActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_autActionPerformed

    private void m_otroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_otroActionPerformed
        // TODO add your handling code here:
        AutorFrame af = new AutorFrame();
        af.setVisible(true);
        cargarAutores(0);
        
        
    }//GEN-LAST:event_m_otroActionPerformed

    private void p_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_tituloActionPerformed

    private void list_aut_temaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_aut_temaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_aut_temaActionPerformed

    private void t_otroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_otroActionPerformed
        TemaFrame tf = new TemaFrame();
        tf.setVisible(true);
        cargarTemas(0);
    }//GEN-LAST:event_t_otroActionPerformed

    public Long getId() {
        return id;
    }

    public void cargarAutores(int busca) {
        int index = 1;
        list_aut.removeAllItems();
        list_aut.addItem("selecciona el autor");
        for (Autor au : AutorDAO.getListAutor()) {
            list_aut.addItem(au.getNom_autor());
            if (au.getId_autor() == busca) {
                list_aut.setSelectedIndex(index);
            }
            index++;
        }
       

    }
    
    public void cargarTemas(int buscar) {
        int index = 1;
        list_aut_tema.removeAllItems();
        System.out.println("Completooooo");
        list_aut_tema.addItem("selecciona el tema");
        for (Tema tm : TemaDAO.getListTema()) {
            list_aut_tema.addItem(tm.getNom_tema());
            if (tm.getId_tema() == buscar) {
                list_aut_tema.setSelectedIndex(index);
            }
            index++;
        }
    }

    public Long BuscarAutor(String busca) {
        int index = 1;
        Long id = null;

        for (Autor au : AutorDAO.getListAutor()) {
            if (au.getNom_autor().equalsIgnoreCase(busca)) {
                id = au.getId_autor();
            }
            index++;
        }

        return id;
    }

    /* public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
                
            }
        });
    }
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> list_aut;
    private javax.swing.JComboBox<String> list_aut_tema;
    private javax.swing.JButton m_otro;
    public static javax.swing.JMenuItem mnver;
    private com.toedter.calendar.JDateChooser p_date;
    private javax.swing.JTextField p_idmaterial;
    private javax.swing.JTextField p_respuesta;
    private javax.swing.JTextField p_titulo;
    private javax.swing.JButton registrar_audiovisual;
    private javax.swing.JButton registrar_material;
    private javax.swing.JButton t_otro;
    // End of variables declaration//GEN-END:variables
}
