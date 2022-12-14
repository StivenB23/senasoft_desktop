/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import sena.sena.Models.Cuenta;
import sena.sena.Models.Services.ICuentaService;

/**
 *
 * @author andre
 */
public class CuentaView extends javax.swing.JFrame {

    DefaultTableModel modeloCuenta;

    @Autowired
//    private ICuentaService cuentaService;

    /**
     * Creates new form Cuenta
     */
    public CuentaView() {
        initComponents();
        this.setLocationRelativeTo(null);
        modeloCuenta = new DefaultTableModel();
        modeloCuenta.addColumn("Numero Cuenta");
        modeloCuenta.addColumn("Titular");
        modeloCuenta.addColumn("Saldo");
        modeloCuenta.addColumn("Fecha Apertura");
        this.jTable1.setModel(modeloCuenta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextFieldNumeroCuenta = new javax.swing.JTextField();
        jTextFieldTitular = new javax.swing.JTextField();
        jLabelCedulaCliente1 = new javax.swing.JLabel();
        jLabelCedulaCliente2 = new javax.swing.JLabel();
        jTextFieldSaldo = new javax.swing.JTextField();
        jLabelCedulaCliente3 = new javax.swing.JLabel();
        jTextFieldFApertura = new javax.swing.JTextField();
        jLabelCedulaCliente4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 139, 255));
        jLabel6.setText("Cuentas");

        jTextFieldNumeroCuenta.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldNumeroCuenta.setForeground(new java.awt.Color(20, 20, 20));
        jTextFieldNumeroCuenta.setBorder(null);
        jTextFieldNumeroCuenta.setCaretColor(new java.awt.Color(0, 139, 255));
        jTextFieldNumeroCuenta.setSelectedTextColor(new java.awt.Color(0, 139, 255));

        jTextFieldTitular.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldTitular.setForeground(new java.awt.Color(20, 20, 20));
        jTextFieldTitular.setBorder(null);
        jTextFieldTitular.setCaretColor(new java.awt.Color(0, 139, 255));
        jTextFieldTitular.setSelectedTextColor(new java.awt.Color(0, 139, 255));

        jLabelCedulaCliente1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabelCedulaCliente1.setForeground(new java.awt.Color(5, 5, 5));
        jLabelCedulaCliente1.setText("Titular");

        jLabelCedulaCliente2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabelCedulaCliente2.setForeground(new java.awt.Color(5, 5, 5));
        jLabelCedulaCliente2.setText("Numero Cuenta");

        jTextFieldSaldo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldSaldo.setForeground(new java.awt.Color(20, 20, 20));
        jTextFieldSaldo.setBorder(null);
        jTextFieldSaldo.setCaretColor(new java.awt.Color(0, 139, 255));
        jTextFieldSaldo.setSelectedTextColor(new java.awt.Color(0, 139, 255));

        jLabelCedulaCliente3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabelCedulaCliente3.setForeground(new java.awt.Color(5, 5, 5));
        jLabelCedulaCliente3.setText("Saldo");

        jTextFieldFApertura.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldFApertura.setForeground(new java.awt.Color(20, 20, 20));
        jTextFieldFApertura.setBorder(null);
        jTextFieldFApertura.setCaretColor(new java.awt.Color(0, 139, 255));
        jTextFieldFApertura.setSelectedTextColor(new java.awt.Color(0, 139, 255));

        jLabelCedulaCliente4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabelCedulaCliente4.setForeground(new java.awt.Color(5, 5, 5));
        jLabelCedulaCliente4.setText("Fecha Apertura");

        jButton1.setBackground(new java.awt.Color(0, 139, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar Cuenta");
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCedulaCliente1)
                                    .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCedulaCliente3)
                                    .addComponent(jTextFieldFApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCedulaCliente4)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jTextFieldNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCedulaCliente2))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(220, 220, 220))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabelCedulaCliente2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCedulaCliente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCedulaCliente3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCedulaCliente4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(448, 448, 448)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String[] Datos = new String[4];
        Datos[0] = jTextFieldNumeroCuenta.getText();
        jTextFieldNumeroCuenta.setText(null);
        Datos[1] = jTextFieldTitular.getText();
        jTextFieldTitular.setText(null);
        Datos[2] = jTextFieldSaldo.getText();
        jTextFieldSaldo.setText(null);
        Datos[3] = jTextFieldFApertura.getText();
        jTextFieldFApertura.setText(null);
        modeloCuenta.addRow(Datos);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CuentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuentaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCedulaCliente1;
    private javax.swing.JLabel jLabelCedulaCliente2;
    private javax.swing.JLabel jLabelCedulaCliente3;
    private javax.swing.JLabel jLabelCedulaCliente4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldFApertura;
    private javax.swing.JTextField jTextFieldNumeroCuenta;
    private javax.swing.JTextField jTextFieldSaldo;
    private javax.swing.JTextField jTextFieldTitular;
    // End of variables declaration//GEN-END:variables
}
