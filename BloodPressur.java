package chap4;

import javax.swing.JOptionPane;

public class BloodPressure extends javax.swing.JFrame {

    public BloodPressure() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtUpper = new javax.swing.JTextField();
        txtLower = new javax.swing.JTextField();
        lblResult = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("darutnee");
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 102));
        jLabel2.setText("ความดันโลหิต");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ค่าบน (ตัวเลข)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ค่าล่าง (ตัวเลข)");

        btnCalculate.setBackground(new java.awt.Color(204, 204, 204));
        btnCalculate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCalculate.setText("คำนวน");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(204, 204, 204));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ความอันตราย");

        txtUpper.setBackground(new java.awt.Color(255, 204, 255));

        txtLower.setBackground(new java.awt.Color(255, 204, 255));
        txtLower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLowerActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblResult.setOpaque(true);

        txtResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("ผลการวัดความดัน/ข้อเเนะนำ");

        btnExit.setBackground(new java.awt.Color(204, 204, 204));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit)
                            .addGap(99, 99, 99)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalculate)
                        .addGap(57, 57, 57)
                        .addComponent(btnClear))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLower, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUpper, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUpper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnClear))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnExit)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {                                             
        float sys, dia, result = 0;
        sys = Float.parseFloat(txtUpper.getText());
        dia = Float.parseFloat(txtLower.getText());

        if ((sys >= 160) && (dia >= 100)) {
            lblResult.setBackground(new java.awt.Color(204, 0, 51));
            lblResult.setText("สูงมาก");
            txtResult.setText("พบแพทย์ด่วน");
        } else if ((sys >= 140 && sys < 160) && (dia >= 90 && dia < 100)) {
            lblResult.setBackground(new java.awt.Color(255, 102, 204));
            lblResult.setText("สูง");
            txtResult.setText("พบแพทย์");
        } else if ((sys >= 121 && sys < 140) && (dia >= 80 && dia < 90)) {
            lblResult.setBackground(new java.awt.Color(255, 255, 102));
            lblResult.setText("ค่อนข้างสูง");
            txtResult.setText("ปรึกษาแพทย์");
        } else if ((sys <= 120) && (dia <= 80)) {
            lblResult.setBackground(new java.awt.Color(102, 255, 102));
            lblResult.setText("ปกติ");
            txtResult.setText("ตรวจเช็คความดันโลหิตสม่ำเสมอ");
        }
    }                                            

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        lblResult.setBackground(new java.awt.Color(215, 218, 218));
        txtUpper.setText("");
        txtLower.setText("");
        txtResult.setText("");
        lblResult.setText("");
    }                                        

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int option = JOptionPane.showConfirmDialog(rootPane, "Do u want to Exit ?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }                                       

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txtLowerActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    /**
     * @param args the command lin  e arguments
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
            java.util.logging.Logger.getLogger(BloodPressure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodPressure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodPressure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodPressure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodPressure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtLower;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtUpper;
    // End of variables declaration                   
}
