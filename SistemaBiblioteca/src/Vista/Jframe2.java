package Vista;

import Clases.consultas;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class Jframe2 extends javax.swing.JFrame {

    //Variable global
    consultas con = new consultas();
    public Jframe2() {
        initComponents();
        this.setLocationRelativeTo(this);
        con.RellenaLaTablaConDatosMySQL("libro", jTable_libros);
        con.leerLectores("usuario", jTable_lectores);
        con.leerPrestamos(jTable_prestamos);
        con.leerSalidas("salida", jTable_pres);
        
        
        jTable_libros.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent Mouse_evt)
                {
                    JTable table = (JTable) Mouse_evt.getSource();
                    Point point = Mouse_evt.getPoint();
                    int row = table.rowAtPoint(point);
                    if(Mouse_evt.getClickCount() == 1)
               
                {
                    jTxtTitulo.setText(jTable_libros.getValueAt(jTable_libros.getSelectedRow(), 1).toString());
                    jTxtEditorial.setText(jTable_libros.getValueAt(jTable_libros.getSelectedRow(), 2).toString());
                    jTxtAnio.setText(jTable_libros.getValueAt(jTable_libros.getSelectedRow(), 3).toString());
                }
                }
        });
        
        
        jTable_lectores.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent Mouse_evt)
                {
                    JTable table = (JTable) Mouse_evt.getSource();
                    Point point = Mouse_evt.getPoint();
                    int row = table.rowAtPoint(point);
                    if(Mouse_evt.getClickCount() == 1)
               
                {
                    jTxtNombre.setText(jTable_lectores.getValueAt(jTable_lectores.getSelectedRow(), 1).toString());
                    jTxtDireccion.setText(jTable_lectores.getValueAt(jTable_lectores.getSelectedRow(), 2).toString());
                    jTxtTelefono.setText(jTable_lectores.getValueAt(jTable_lectores.getSelectedRow(), 3).toString());
                    jTxtCiudad.setText(jTable_lectores.getValueAt(jTable_lectores.getSelectedRow(), 4).toString());
                    jTxtCorreo.setText(jTable_lectores.getValueAt(jTable_lectores.getSelectedRow(), 5).toString());
                }
                }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTbdFormulas = new javax.swing.JTabbedPane();
        jPnlFormulaGeneral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFrtLiteralB = new javax.swing.JFormattedTextField();
        jFrtLiteralC = new javax.swing.JFormattedTextField();
        jFrtLiteralA = new javax.swing.JFormattedTextField();
        jLblLiteralA = new javax.swing.JLabel();
        jLblLiteralB = new javax.swing.JLabel();
        jLblLiteralC = new javax.swing.JLabel();
        Separator = new javax.swing.JSeparator();
        jLblX1 = new javax.swing.JLabel();
        jLblX2 = new javax.swing.JLabel();
        jPnlMiFormula = new javax.swing.JPanel();
        Jbtn_guardar2 = new java.awt.Button();
        jTxtTitulo2 = new java.awt.TextField();
        jTxtNombre2 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jPnlFormulaGeneral.setBackground(new java.awt.Color(255, 204, 0));
        jPnlFormulaGeneral.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Ingresa la literales y resuelve la fórmula");

        jFrtLiteralB.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFrtLiteralB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFrtLiteralBActionPerformed(evt);
            }
        });

        jFrtLiteralC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFrtLiteralC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFrtLiteralCActionPerformed(evt);
            }
        });

        jFrtLiteralA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFrtLiteralA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFrtLiteralAActionPerformed(evt);
            }
        });

        jLblLiteralA.setText("a:");

        jLblLiteralB.setText("b:");

        jLblLiteralC.setText("c:");

        Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLblX1.setText("X1:");

        jLblX2.setText("x2:");

        javax.swing.GroupLayout jPnlFormulaGeneralLayout = new javax.swing.GroupLayout(jPnlFormulaGeneral);
        jPnlFormulaGeneral.setLayout(jPnlFormulaGeneralLayout);
        jPnlFormulaGeneralLayout.setHorizontalGroup(
            jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlFormulaGeneralLayout.createSequentialGroup()
                .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlFormulaGeneralLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1))
                    .addGroup(jPnlFormulaGeneralLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblLiteralA)
                            .addComponent(jLblLiteralB)
                            .addComponent(jLblLiteralC))
                        .addGap(27, 27, 27)
                        .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFrtLiteralA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFrtLiteralC, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFrtLiteralB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblX1)
                            .addComponent(jLblX2))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPnlFormulaGeneralLayout.setVerticalGroup(
            jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlFormulaGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlFormulaGeneralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnlFormulaGeneralLayout.createSequentialGroup()
                                .addGap(0, 14, Short.MAX_VALUE)
                                .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFrtLiteralA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblLiteralA))
                                .addGap(18, 18, 18)
                                .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFrtLiteralB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblLiteralB))
                                .addGap(18, 18, 18)
                                .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFrtLiteralC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblLiteralC)))
                            .addComponent(Separator))
                        .addGap(19, 19, 19))
                    .addGroup(jPnlFormulaGeneralLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLblX1)
                        .addGap(52, 52, 52)
                        .addComponent(jLblX2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTbdFormulas.addTab("Fórmula General", jPnlFormulaGeneral);

        javax.swing.GroupLayout jPnlMiFormulaLayout = new javax.swing.GroupLayout(jPnlMiFormula);
        jPnlMiFormula.setLayout(jPnlMiFormulaLayout);
        jPnlMiFormulaLayout.setHorizontalGroup(
            jPnlMiFormulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );
        jPnlMiFormulaLayout.setVerticalGroup(
            jPnlMiFormulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );

        jTbdFormulas.addTab("Mi Fórmula", jPnlMiFormula);

        Jbtn_guardar2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        Jbtn_guardar2.setLabel("Guardar");

        jTxtTitulo2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTxtNombre2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, 100));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mariori\\Downloads\\book_open_book_read_icon_186989 (1).png")); // NOI18N
        jButton1.setText("Bienvenido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mariori\\Downloads\\3.PNG")); // NOI18N

        jButton2.setBackground(new java.awt.Color(102, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mariori\\Downloads\\search_book_open_search_locate_6178.png")); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mariori\\Downloads\\child-reading-book_icon-icons.com_49293.png")); // NOI18N
        jButton3.setText("Mostrar Libros");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(42, 42, 42))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 480, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFrtLiteralBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFrtLiteralBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrtLiteralBActionPerformed

    private void jFrtLiteralCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFrtLiteralCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrtLiteralCActionPerformed

    private void jFrtLiteralAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFrtLiteralAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrtLiteralAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Jframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Jbtn_guardar2;
    private javax.swing.JSeparator Separator;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFrtLiteralA;
    private javax.swing.JFormattedTextField jFrtLiteralB;
    private javax.swing.JFormattedTextField jFrtLiteralC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLblLiteralA;
    private javax.swing.JLabel jLblLiteralB;
    private javax.swing.JLabel jLblLiteralC;
    private javax.swing.JLabel jLblX1;
    private javax.swing.JLabel jLblX2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPnlFormulaGeneral;
    private javax.swing.JPanel jPnlMiFormula;
    private javax.swing.JTabbedPane jTbdFormulas;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField jTxtNombre2;
    private java.awt.TextField jTxtTitulo2;
    // End of variables declaration//GEN-END:variables
}
