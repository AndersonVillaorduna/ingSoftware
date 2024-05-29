package Vista;

import Clases.consultas;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class Jframe1 extends javax.swing.JFrame {

    //Variable global
    consultas con = new consultas();
    public Jframe1() {
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, 100));

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel2.setText("Mostrar libros");

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jTable1.setBackground(new java.awt.Color(153, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 740, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Jbtn_guardar2;
    private javax.swing.JSeparator Separator;
    private javax.swing.JFormattedTextField jFrtLiteralA;
    private javax.swing.JFormattedTextField jFrtLiteralB;
    private javax.swing.JFormattedTextField jFrtLiteralC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblLiteralA;
    private javax.swing.JLabel jLblLiteralB;
    private javax.swing.JLabel jLblLiteralC;
    private javax.swing.JLabel jLblX1;
    private javax.swing.JLabel jLblX2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPnlFormulaGeneral;
    private javax.swing.JPanel jPnlMiFormula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTabbedPane jTbdFormulas;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField jTxtNombre2;
    private java.awt.TextField jTxtTitulo2;
    // End of variables declaration//GEN-END:variables
}
