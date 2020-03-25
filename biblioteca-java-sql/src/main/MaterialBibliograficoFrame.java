
package main;

import DAO.Material_BibliograficoDAO;
import javax.swing.JLabel;
import javax.swing.JTextField;
import negocio.Material_Bibliografico;

public class MaterialBibliograficoFrame extends javax.swing.JFrame {

    public MaterialBibliograficoFrame() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        p_isbn = new javax.swing.JTextField();
        p_clasificacion = new javax.swing.JTextField();
        p_resultado = new javax.swing.JTextField();
        p_registrar_bibliografico = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        p_id = new javax.swing.JLabel();
        p_idmaterial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("isbn");

        jLabel3.setText("clasificación");

        p_isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_isbnActionPerformed(evt);
            }
        });

        p_registrar_bibliografico.setBackground(new java.awt.Color(204, 204, 255));
        p_registrar_bibliografico.setText("Registrar material bibliografico");
        p_registrar_bibliografico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_registrar_bibliograficoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel4.setText("Registrar material bibliografico");

        p_id.setText("codigo material:  ");

        p_idmaterial.setText("xx");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(p_id)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(p_isbn, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                        .addComponent(p_clasificacion)
                                        .addComponent(p_idmaterial, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addComponent(p_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(p_registrar_bibliografico)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_id)
                    .addComponent(p_idmaterial))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addComponent(p_registrar_bibliografico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(p_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p_isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_isbnActionPerformed

    }//GEN-LAST:event_p_isbnActionPerformed

    private void p_registrar_bibliograficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_registrar_bibliograficoActionPerformed
        // TODO add your handling code here:
        Material_Bibliografico material_b = new Material_Bibliografico();
  
        Long cod_material = Long.valueOf(p_idmaterial.getText()); 
        Long isbn = Long.valueOf(p_isbn.getText());
        material_b.setId_material(cod_material);
        material_b.setisbn(isbn);
        material_b.setClasificacion(p_clasificacion.getText());
        String resp = Material_BibliograficoDAO.registrarMaterialBibligrafico(material_b);
        p_resultado.setText(resp);
        if(resp.equals("Material registrado con éxito")){ 
            dispose();
        }
    }//GEN-LAST:event_p_registrar_bibliograficoActionPerformed
    
    
    
    public void setId(String id) {
        p_idmaterial.setText(id);
    }
    
    public String getId(){
        return p_idmaterial.getText();
    }

  /*  
    public JTextField getP_cod() {
        return p_cod;
    }

    public void setP_cod(JTextField p_cod) {
        this.p_cod = p_cod;
    }

*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField p_clasificacion;
    private javax.swing.JLabel p_id;
    private javax.swing.JLabel p_idmaterial;
    private javax.swing.JTextField p_isbn;
    private javax.swing.JButton p_registrar_bibliografico;
    private javax.swing.JTextField p_resultado;
    // End of variables declaration//GEN-END:variables
}
