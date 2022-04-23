package chap4;

import javax.swing.JOptionPane;

public class mailingProgram extends javax.swing.JFrame {

    public mailingProgram() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        rdoOrdinary = new javax.swing.JRadioButton();
        rdoRegister = new javax.swing.JRadioButton();
        rdoEms = new javax.swing.JRadioButton();
        txtResult = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("ส่งจดหมาย");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ประเภทจดหมาย");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("น้ำหนักจดหมาย(g)");

        btnClear.setBackground(new java.awt.Color(255, 255, 153));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 153));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnCalculate.setBackground(new java.awt.Color(204, 204, 204));
        btnCalculate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCalculate.setText("คำนวน");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdoOrdinary);
        rdoOrdinary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdoOrdinary.setText("ธรรมดา");
        rdoOrdinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoOrdinaryActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdoRegister);
        rdoRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdoRegister.setText("ลงทะเบียน");
        rdoRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoRegisterActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdoEms);
        rdoEms.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdoEms.setText("EMS");
        rdoEms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoEmsActionPerformed(evt);
            }
        });

        txtResult.setBackground(new java.awt.Color(204, 255, 255));
        txtResult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

        txtWeight.setBackground(new java.awt.Color(204, 255, 255));
        txtWeight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(9, 9, 9)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCalculate))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(btnClear)
                            .addGap(64, 64, 64)
                            .addComponent(btnExit))
                        .addComponent(txtResult))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addComponent(rdoOrdinary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoRegister)
                        .addGap(12, 12, 12)
                        .addComponent(rdoEms)))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rdoOrdinary)
                    .addComponent(rdoRegister)
                    .addComponent(rdoEms))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnCalculate)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtWeight.setText("");
        txtResult.setText("");
        buttonGroup1.clearSelection();
    }                                        

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int option = JOptionPane.showConfirmDialog(rootPane, "Do u want to Exit ?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }                                       

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {                                             
        float wei, result = 0;
        wei = Float.parseFloat(txtWeight.getText());
        if (rdoOrdinary.isSelected()) {
            if ((wei > 1000) && (wei <= 2000)) {
                txtResult.setText("45");
            } else if ((wei > 500) && (wei <= 1000)) {
                txtResult.setText("25");
            } else if ((wei > 250) && (wei <= 500)) {
                txtResult.setText("15");
            } else if ((wei > 100) && (wei <= 250)) {
                txtResult.setText("9");
            } else if ((wei > 20) && (wei <= 100)) {
                txtResult.setText("5");
            } else {
                txtResult.setText("3");
            }
        } else if (rdoEms.isSelected()) {
            if ((wei > 1000) && (wei <= 2000)) {
                txtResult.setText("77");
            } else if ((wei > 500) && (wei <= 1000)) {
                txtResult.setText("62");
            } else if ((wei > 250) && (wei <= 500)) {
                txtResult.setText("47");
            } else if ((wei > 100) && (wei <= 250)) {
                txtResult.setText("37");
            } else if ((wei > 20) && (wei <= 100)) {
                txtResult.setText("32");
            } else {
                txtResult.setText("27");
            }
        } else if (rdoRegister.isSelected()) {
            if ((wei > 1000) && (wei <= 2000)) {
                txtResult.setText("58");
            } else if ((wei > 500) && (wei <= 1000)) {
                txtResult.setText("38");
            } else if ((wei > 250) && (wei <= 500)) {
                txtResult.setText("28");
            } else if ((wei > 100) && (wei <= 250)) {
                txtResult.setText("22");
            } else if ((wei > 20) && (wei <= 100)) {
                txtResult.setText("18");
            } else {
                txtResult.setText("16");
            } 
            
        }  
      
    }                                            

    private void rdoOrdinaryActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void rdoRegisterActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void rdoEmsActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

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
            java.util.logging.Logger.getLogger(mailingProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mailingProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mailingProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mailingProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mailingProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton rdoEms;
    private javax.swing.JRadioButton rdoOrdinary;
    private javax.swing.JRadioButton rdoRegister;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration                   
}
