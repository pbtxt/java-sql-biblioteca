
package main;

import DAO.ConsultaDAO;
import DAO.ReservaDAO;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import negocio.Consulta;
import negocio.Reserva;

public class ReservaFrame extends javax.swing.JFrame {

    public ReservaFrame() {
        initComponents();
        this.setLocationRelativeTo(ReservaFrame.this);
    
    }
    
    public void generarTabla(String sql){
        DefaultTableModel model = (DefaultTableModel) copia_table.getModel();
        
        for (Consulta con : ConsultaDAO.getListCopia(sql)) {
            model.addRow(new Object[]{ con.getId_copia(), con.getTitulo(), con.getEstado_fisico() , con.getId_material()
            });
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        copia_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        r_fecha = new com.toedter.calendar.JDateChooser();
        r_estudiante = new javax.swing.JTextField();
        r_enviar = new javax.swing.JButton();
        r_resp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("Reserva de material");

        copia_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID copia", "Titulo", "Estado fisico", "ID material"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(copia_table);

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel2.setText("ID estudiante: ");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel3.setText("Fecha");

        r_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_estudianteActionPerformed(evt);
            }
        });

        r_enviar.setBackground(new java.awt.Color(153, 0, 0));
        r_enviar.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        r_enviar.setForeground(new java.awt.Color(255, 255, 255));
        r_enviar.setText("Enviar");
        r_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(r_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(r_enviar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(r_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(r_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(r_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(r_enviar)
                .addGap(18, 18, 18)
                .addComponent(r_resp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_estudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r_estudianteActionPerformed

    private void r_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_enviarActionPerformed
        // TODO add your handling code here:
        Reserva reserva = new Reserva(); 
        int fila = copia_table.getSelectedRow();
        Long id_copia =  (Long) copia_table.getValueAt(fila,0);
        Long id_material = (Long) copia_table.getValueAt(fila,3);
        
        String dd=Integer.toString(r_fecha.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mm = Integer.toString(r_fecha.getCalendar().get(Calendar.MONTH)+1);
        String yyyy = Integer.toString(r_fecha.getCalendar().get(Calendar.YEAR));
        
        String date = yyyy+"-"+mm+"-"+dd;
        Date fecha =java.sql.Date.valueOf(date);
        
        
        
        //validar si el id de la copia está en prestamo 
        //suponiendo que está disponible: 
        
        reserva.setF_reserva(fecha);
        reserva.setId_material(id_material);
        reserva.setCodigo_estudiante(Long.valueOf(r_estudiante.getText()));
        reserva.setId_copia(id_copia);
        
         System.out.print(fecha);
         System.out.print(id_material+r_estudiante.getText()+id_copia);
        
        String resp = ReservaDAO.registrarReserva(reserva);
        
        r_resp.setText(resp);
        
        
    }//GEN-LAST:event_r_enviarActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable copia_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton r_enviar;
    private javax.swing.JTextField r_estudiante;
    private com.toedter.calendar.JDateChooser r_fecha;
    private javax.swing.JTextField r_resp;
    // End of variables declaration//GEN-END:variables
}
