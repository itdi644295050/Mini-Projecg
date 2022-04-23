package chap4;

import javax.swing.JOptionPane;

public class ThaiChildrenheight extends javax.swing.JFrame {

    public ThaiChildrenheight() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rdoFemale = new javax.swing.JRadioButton();
        rdoMan = new javax.swing.JRadioButton();
        txtAge = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("วัดความสูงเด็กไทย");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("เพศ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("อายุ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ความสูง");

        txtResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("ผลการวัดความสูง");

        btnExit.setBackground(new java.awt.Color(255, 255, 153));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnCalculate.setBackground(new java.awt.Color(255, 255, 153));
        btnCalculate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCalculate.setText("คำนวน");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 255, 153));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("เซนติเมตร");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("ปี");

        buttonGroup1.add(rdoFemale);
        rdoFemale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdoFemale.setText("หญิง");

        buttonGroup1.add(rdoMan);
        rdoMan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdoMan.setText("ชาย");

        txtAge.setBackground(new java.awt.Color(204, 255, 204));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        txtHeight.setBackground(new java.awt.Color(204, 255, 204));
        txtHeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHeightKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(rdoFemale)
                        .addGap(18, 18, 18)
                        .addComponent(rdoMan))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnCalculate)
                                .addGap(57, 57, 57)
                                .addComponent(btnClear))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel3)))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(btnExit)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rdoFemale)
                    .addComponent(rdoMan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnClear))
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int option = JOptionPane.showConfirmDialog(rootPane, "Do u want to Exit ?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }                                       

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String age = txtAge.getText();
        String height = txtHeight.getText();
        
        int ages = Integer.valueOf(age);
        int hei = Integer.valueOf(height);
        if (rdoMan.isSelected()) { 
            switch (ages) {
                case 5:
                     if (hei <= 105) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 115 && hei <= 120){
                        txtResult.setText("สูง");
                    } else if(hei >=106 && hei <=114){
                        txtResult.setText("สมส่วน");
                    }
                    break;
               
                case 6: if (hei <= 112) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 118 && hei <= 125){
                        txtResult.setText("สูง");
                    } else if(hei >=113 && hei <=117){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                    
                case 7: if (hei <= 117) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 125 && hei <= 132){
                        txtResult.setText("สูง");
                    } else if(hei >=118 && hei <=124){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 8: if (hei <= 122) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 136 && hei <= 145){
                        txtResult.setText("สูง");
                    } else if(hei >=123 && hei <=135){
                        txtResult.setText("สมส่วน"); 
                    }
                    break;
                case 9: if (hei <= 126) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 142 && hei <= 152){
                        txtResult.setText("สูง");
                    } else if(hei >=127 && hei <=141){
                        txtResult.setText("สมส่วน"); 
                    }
                    break;
                case 10: if ( hei <= 132) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 146 && hei <= 158){
                        txtResult.setText("สูง");
                    } else if(hei >=134 && hei <=145){
                        txtResult.setText("สมส่วน"); 
                    }
                    break;
                case 11: if ( hei <= 136) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 158 && hei <= 163){
                        txtResult.setText("สูง");
                    } else if(hei >=137 && hei <=157){
                        txtResult.setText("สมส่วน"); 
                    }
                    break;
                case 12: if ( hei <= 142) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 162 && hei <= 168){
                        txtResult.setText("สูง");
                    } else if(hei >=143 && hei <=161){
                        txtResult.setText("สมส่วน"); 
                    }
                     break;
                case 13: if ( hei <= 146) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 165 && hei <= 170){
                        txtResult.setText("สูง");
                    } else if(hei >=147 && hei <=164){
                        txtResult.setText("สมส่วน"); 
                    }
                    break;
                case 14:  if ( hei <= 150) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 172 && hei <= 175){
                        txtResult.setText("สูง");
                    } else if(hei >=151 && hei <=171){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                     case 15:  if ( hei <= 157) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 177 && hei <= 185){
                        txtResult.setText("สูง");
                    } else if(hei >=158 && hei <=176){
                        txtResult.setText("สมส่วน"); 
                    }
                    break;
                case 16:  if ( hei <= 160) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 181 && hei <= 187){
                        txtResult.setText("สูง");
                    } else if(hei >=161 && hei <=180){
                        txtResult.setText("สมส่วน"); 
                    }
                    break;
                case 17:  if ( hei <= 163) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 183 && hei <= 189){
                        txtResult.setText("สูง");
                    } else if(hei >=164 && hei <=182){
                        txtResult.setText("สมส่วน"); 
                    }
                    break;
                case 18:  if ( hei <= 165) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 185 && hei <= 188){
                        txtResult.setText("สูง");
                    } else if(hei >=166 && hei <=184){
                        txtResult.setText("สมส่วน"); 
                    }
                    break;
                case 19:  if ( hei <= 165) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 187 && hei <= 190){
                        txtResult.setText("สูง");
                    } else if(hei >=166 && hei <=186){
                        txtResult.setText("สมส่วน"); 
                    }
                    break;
                case 20:  if ( hei <= 165) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 188 && hei <= 192){
                        txtResult.setText("สูง");
                    } else if(hei >=166 && hei <=187){
                        txtResult.setText("สมส่วน"); 
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(rootPane, "ป้อนอายุใหม่");
                    break;
            }
        } else if (rdoFemale.isSelected()) { 
            switch (ages) {
                case 5:
                    if (hei <= 105) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 115 && hei <= 120){
                        txtResult.setText("สูง");
                    } else if(hei >=106 && hei <=114){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 6:
                    if (hei <= 110) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 118 && hei <= 123){
                        txtResult.setText("สูง");
                    } else if(hei >=111 && hei <=117){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                     case 7:
                    if (hei <= 117) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 123 && hei <= 132){
                        txtResult.setText("สูง");
                    } else if(hei >=118 && hei <=122){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 8:
                    if (hei <= 123) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 137 && hei <= 145){
                        txtResult.setText("สูง");
                    } else if(hei >=124 && hei <=136){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 9:
                    if (hei <= 128) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 145 && hei <= 150){
                        txtResult.setText("สูง");
                    } else if(hei >=129 && hei <=144){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                    case 10:
                    if (hei <= 132) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 147 && hei <= 152){
                        txtResult.setText("สูง");
                    } else if(hei >=133 && hei <=146){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 11:
                    if (hei <= 137) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 153 && hei <= 162){
                        txtResult.setText("สูง");
                    } else if(hei >=138 && hei <=152){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 12:
                    if (hei <= 145) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 157 && hei <= 165){
                        txtResult.setText("สูง");
                    } else if(hei >=146 && hei <=156){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                       case 13:
                    if (hei <= 149) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 163 && hei <= 168){
                        txtResult.setText("สูง");
                    } else if(hei >=150 && hei <=162){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 14:
                    if (hei <= 152) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 165 && hei <= 170){
                        txtResult.setText("สูง");
                    } else if(hei >=153 && hei <=164){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                     case 15:
                    if (hei <= 155) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 167 && hei <= 175){
                        txtResult.setText("สูง");
                    } else if(hei >=156 && hei <=166){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 16:
                    if (hei <= 157) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 170 && hei <= 173){
                        txtResult.setText("สูง");
                    } else if(hei >=158 && hei <=169){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                    case 17:
                    if (hei <= 157) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 171 && hei <= 173){
                        txtResult.setText("สูง");
                    } else if(hei >=158 && hei <=170){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 18:
                    if (hei <= 158) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 172 && hei <= 175){
                        txtResult.setText("สูง");
                    } else if(hei >=159 && hei <=171){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                     case 19:
                    if (hei <= 159) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 172 && hei <= 177){
                        txtResult.setText("สูง");
                    } else if(hei >=160 && hei <=171){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 20:
                    if (hei <= 160) {
                        txtResult.setText("เตี้ย");
                    } else if(hei >= 172 && hei >= 179){
                        txtResult.setText("สูง");
                    } else if(hei >=161 && hei <=171){
                        txtResult.setText("สมส่วน");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(rootPane, "ป้อนอายุใหม่");
                    break;
            }
        
        }
   
    }                                            

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtAge.setText("");
        txtHeight.setText("");
        txtResult.setText("");
        buttonGroup1.clearSelection();
    }                                        

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {                                
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }                               

    private void txtHeightKeyTyped(java.awt.event.KeyEvent evt) {                                   
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
        
    
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
            java.util.logging.Logger.getLogger(ThaiChildrenheight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThaiChildrenheight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThaiChildrenheight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThaiChildrenheight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThaiChildrenheight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMan;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtResult;
    // End of variables declaration                   
}
