package chap4;

import javax.swing.JOptionPane;

public class FortuneTelling extends javax.swing.JFrame {

    public FortuneTelling() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtResultHabit1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdoMon = new javax.swing.JRadioButton();
        rdoTue = new javax.swing.JRadioButton();
        rdoWed = new javax.swing.JRadioButton();
        rdoThu = new javax.swing.JRadioButton();
        rdoSun = new javax.swing.JRadioButton();
        rdoSat = new javax.swing.JRadioButton();
        rdoFri = new javax.swing.JRadioButton();
        btnRun = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblLove = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultHabit = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultLoveHabit = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("ทำนายความรักตามวันเกิด");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("วันเกิด");

        buttonGroup1.add(rdoMon);
        rdoMon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdoMon.setForeground(new java.awt.Color(153, 0, 0));
        rdoMon.setText("วันจันทร์");

        buttonGroup1.add(rdoTue);
        rdoTue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdoTue.setForeground(new java.awt.Color(153, 0, 0));
        rdoTue.setText("วันอังคาร");

        buttonGroup1.add(rdoWed);
        rdoWed.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdoWed.setForeground(new java.awt.Color(153, 0, 0));
        rdoWed.setText("วันพุธ");

        buttonGroup1.add(rdoThu);
        rdoThu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdoThu.setForeground(new java.awt.Color(153, 0, 0));
        rdoThu.setText("วันพฤหัสบดี");

        buttonGroup1.add(rdoSun);
        rdoSun.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdoSun.setForeground(new java.awt.Color(153, 0, 0));
        rdoSun.setText("วันอาทิตย์");
        rdoSun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoSunActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoSat);
        rdoSat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdoSat.setForeground(new java.awt.Color(153, 0, 0));
        rdoSat.setText("วันเสาร์");

        buttonGroup1.add(rdoFri);
        rdoFri.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdoFri.setForeground(new java.awt.Color(153, 0, 0));
        rdoFri.setText("วันศุกร์");

        btnRun.setBackground(new java.awt.Color(255, 153, 0));
        btnRun.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRun.setForeground(new java.awt.Color(51, 51, 51));
        btnRun.setText("ทำนาย");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("นิสัย");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("นิสัยเวลามีความรัก");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("ระดับความคลั้งรัก");

        btnExit.setBackground(new java.awt.Color(255, 255, 153));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblLove.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblLove.setForeground(new java.awt.Color(255, 0, 255));
        lblLove.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 255));
        jLabel6.setText("%");

        txtResultHabit.setBackground(new java.awt.Color(204, 255, 204));
        txtResultHabit.setColumns(20);
        txtResultHabit.setFont(new java.awt.Font("TH Mali Grade 6", 1, 18)); // NOI18N
        txtResultHabit.setRows(5);
        jScrollPane1.setViewportView(txtResultHabit);

        txtResultLoveHabit.setBackground(new java.awt.Color(204, 255, 204));
        txtResultLoveHabit.setColumns(20);
        txtResultLoveHabit.setFont(new java.awt.Font("TH Mali Grade 6", 1, 18)); // NOI18N
        txtResultLoveHabit.setRows(5);
        jScrollPane2.setViewportView(txtResultLoveHabit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdoMon)
                                    .addComponent(rdoFri))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdoTue)
                                    .addComponent(rdoSat))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdoWed)
                                    .addComponent(rdoSun))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btnRun))
                                    .addComponent(rdoThu)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnExit)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(83, 83, 83)
                                        .addComponent(lblLove, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rdoMon)
                    .addComponent(rdoTue)
                    .addComponent(rdoWed)
                    .addComponent(rdoThu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoSun)
                    .addComponent(rdoSat)
                    .addComponent(rdoFri)
                    .addComponent(btnRun))
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLove, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void rdoSunActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int option = JOptionPane.showConfirmDialog(rootPane, "Do u want to Exit ?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }                                       

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String habit = "", lovehabit = "";
        int love = 0;
        if (rdoMon.isSelected()) {
            habit = "ปกติคนที่เกิดวันนี้เป็นคนที่ค่อนข้างแพรวพราว เป็นคนที่ค่อนข้างจะรักอิสระ\n"
                    + "ดูเป็นคนเจ้าชู้ไม่รู้ตัว เพราะเป็นคนมีเสน่ห์ วางตัวดี";
            lovehabit = "ถ้ามีความรักขึ้นมาล่ะก็ เหมือนเป็นคนละคน! จากเสีอตัวใหญ่ พอ\n"
                    + "มีแฟนแล้วจะกลายเป็นแมวน้อย ขี้อ้อน เอาใจ อยากได้อะไรจัดให้ทุกอย่าง งอแงกับแฟนเพราะอยากเรียกร้อง\n"
                    + "ความสนใจ ถ้าคบกันแล้วก็อยากให้ดูแล เอาอกเอาใจซึ่งกันและกัน มือถือนี่ถ้าไม่ล็อกรหัสก็เรียบร้อย! เพราะ\n"
                    + "คนเกิดวันนี้จะแอบหึง แอบส่องทุกอย่าง แฟนไปไหน ทําอะไร อยู่กับใคร รู้หมด! แต่ คนที่เกิดวันจันทร์ถึงจะมี\n"
                    + "แฟนยังไงก็ยังไม่ทิ้งเพื่อน ถ้าอีกฝ่ายเข้าใจ ไม่คิดมากก็คบกันได้ยาว ๆ จ้า";
            love = 90;
        } else if (rdoTue.isSelected()) {
            habit = "คนเกิดวันนี้เป็นพ่อแม่บุญทุ่ม เวลารักใครจะจริงจังมากระดับสิบ! เป็นคนใจร้อน\n"
                    + "ตอบช้า 5 นาทีจะรู้สึกใจหายแล้ว ว่าเราพูดอะไรผิดไปไหมนะ? หรือว่าเขาไม่อยากคุยกับเราหรือเปล่า? หรือว่า\n"
                    + "เกิดเหตุร้ายอะไรขึ้น เอ๊ะ! หรือว่าแอบคุยกับคนอื่น";
            lovehabit = "ถ้าอยู่ในช่วงอินเลิฟแล้วจะอารมณ์ดีทั้งวัน ยิ้มคนเดียว เป็นคนติด\n"
                    + "แฟน อยากอยู่ด้วยตลอดเวลา เธออยู่ที่ไหน จะไปอยู่ตรงหน้า จะไปหาแน่ ๆ! และค่อนข้างคาดหวังในตัวคนรัก\n"
                    + "มาก ๆ ถ้าให้ 100 ต้องได้กลับมา 100 ชอบอะไรที่แฟร์ ๆ ถ้าไม่แฟร์ก็หาใหม่ ชอบความตื่นเต้นท้าทาย ถ้าอีก\n"
                    + "ฝ่ายเล่นตัวนิดหน่อย เข้าหาบ้าง เอาใจก่อนบ้าง แกล้งไม่ตอบบ้าง ยิ่งตื่นเต้น ยิ่งถ้าอีกฝ่ายใส่ใจ และเข้าใจใน\n"
                    + "ตัวของคนที่เกิดวันอังคาร รับรองว่ารักจนมูฟออนไปไหนไม่ได้!";
            love = 100;
        } else if (rdoWed.isSelected()) {
            habit = "คารมดีเป็นที่ 1 ตบมุขโบ๊ะบ๊ะได้ ทันคน เทคนิคอ่อยชั้นครู แพรวพราวพอ ๆ กับคน\n"
                    + "เกิดวันจันทร์ เป็นคนที่ค่อย ๆ ดู ค่อย ๆ เก็บข้อมูลฝ่ายตรงข้าม ไม่วู่วาม ชอบนะ แต่ไม่แสดงออกตรง ๆ รอ\n"
                    + "จนกว่าจะแน่ใจจริง ๆ แล้วถึงจะตกลงเป็นแฟน";
            lovehabit = "เป็นคนที่รักใครแล้วรักจริง โรแมนติก เรื่องเล็ก ๆ น้อยก็จําได้ เอาใจ\n"
                    + "ใส่แฟนหรือคนรักมาก แต่ข้อเสียของคนที่เกิดวันนี้ เป็นเพราะอีโก้ที่สูงเสียดฟ้า อาจจะทําให้เรื่องราวที่มันไม่ได้\n"
                    + "มีอะไรเลย พังได้ง่าย ๆ เพราะความมีอีโก้ของตัวเอง เวลาโกรธมาก็จะใช้คําพูดที่ไม่ค่อยดี เป็นคนคาดหวังกับ\n"
                    + "ความรักสูง คิดมาก ขี้หึง ขี้ระแวง แล้วพอไม่ได้ตามที่หวัง ก็อาจจะพาลเบื่อได้ง่าย ๆ แนะนําให้ใจเย็น ๆ และ\n"
                    + "ลดความคาดหวังกับอีโก้ลงนิดหน่อย จะทําให้ความรักไปได้ดี";
            love = 50;
        } else if (rdoThu.isSelected()) {
            habit = "ภายนอกอาจจะดูเป็นคนอ่อยเก่ง แพรวพราว แต่จริง ๆ แล้วเป็นคนค่อนข้าง\n"
                    + "อ่อนไหว เป็นคนออกจะบ๊อง ๆ ขาด ๆ เกิน ๆ ด้วยซ้ํา คนเกิดวันนี้ถึงจะดูอ่อยเก่งก็จริง ดูเป็นสาวฮอต หนุ่ม\n"
                    + "ฮอต แต่รักใครแล้วรักจริงจังมาก ไม่ชอบการนอกใจ และการถูกหักหลัง";
            lovehabit = "เวลาคนเกิดวันพฤหัสบดีมีความรักแล้วเหมือนเมากัญชา อารมณ์\n"
                    + "ดีทั้งวัน และวันครบรอบ วันเกิด จําได้หมด ตกหลุมรักคนง่าย ยิ่งถ้าเจอคนที่คุยแบบ Deep Conversation\n"
                    + "ได้ ยิ่งชอบ ชอบคนที่เป็นผู้ใหญ่ ยิ่งมีทัศนคติดี ๆ หรือพลังบวก คนที่เกิดวันพฤหัสบดีจะมโนไปถึงขั้นแต่งงาน\n"
                    + "เลย ทั้ง ๆ ที่แค่เริ่มคุย แต่ก็ชอบความรักที่ค่อยเป็นค่อยไป ไม่รีบนะ";
            love = 60;
        } else if (rdoFri.isSelected()) {
            habit = "คนเกิดวันนี้ออกแนวพ่อบ้านใจกล้า ไม่เถียงหรอกนะ แต่อย่าให้โกรธ! เป็นคนช่าง\n"
                    + "มโน ชอบเพ้อเงียบ ๆ เป็นตุเป็นตะอยู่คนเดียว และคนเกิดวันนี้เป็นคนอ่อนโยน เอาใจใส่แฟนมาก ต้องการให้\n"
                    + "แฟนเอาใจใส่ตัวเองเหมือนกัน ถ้าเจอคนที่ทําให้คนเกิดวันศุกร์รู้สึกรักทั้งแฟน รักทั้งตัวเอง หรือชอบตัวเองตอน\n"
                    + "อยู่กับแฟน จะเป็นอะไรที่เพอร์เฟ็กต์มาก";
            lovehabit = "ใครชอบคนสายเปย์ มาทางนี้! คนเกิดวันศุกร์บอกเลยว่าเปย์เก่งงงง\n"
                    + "ชอบหาอะไรทํา ชวนแฟนทํานู่น ทํานี่ อยู่ด้วยแล้วไม่มีทางเบื่อแน่นอน และมักจะเจอคนที่แตกต่างกันที่ อายุ\n"
                    + "เชื้อชาติ ศาสนา ฐานะ ฯลฯ แต่ไม่ค่อยสนใจเท่าไร ถ้าพร้อมจะเดินไปด้วยกันก็โอเค คบกันได้ยาว ๆ";
            love = 85;
        } else if (rdoSat.isSelected()) {
            habit = "คนที่เกิดวันเสาร์ชอบทําตัวเป็นผู้นํา อีโก้สูง บ้าพลัง ไม่ชอบคนต่อล้อต่อเถียง ฉะนั้น\n"
                    + "คนที่นิ่ง ๆ สุขุมหน่อย ๆ ก็จะเข้าทางคนที่เกิดวันนี้ เป็นคนเด็ดขาด ชัดเจน ชอบก็คือชอบ ไม่ยึก ๆ ยัก ๆ ชอบ\n"
                    + "คนเอาใจ ใส่ใจ ชอบอะไรที่เรียบง่าย มั่นคง ถ้ามีแฟนแล้วก็จะทุ่มสุด ๆ";
            lovehabit = "อยากได้อะไรบอกจะจัดให้ตามที่ขอทุกอย่าง ยกเว้นให้ลุงลาออก\n"
                    + "(เอ๊ย! ไม่ใช่!) ดูแลแฟนหรือคนรักดีเว่อร์! เหมือนเราเป็นเจ้าหญิงหรือเจ้าชาย แต่ไม่ชอบอะไรที่จุกจิก ชนิดว่า\n"
                    + "ตามหึงตามจิกเกินเบอร์จะเบื่อมาก แต่ถึงจะไม่ชอบอะไรแบบนั้น คนที่เกิดวันเสาร์เวลาหึงจะน่ากลัวระดับสิบ!";
            love = 70;
        } else if (rdoSun.isSelected()) {
            habit = "คนที่เกิดวันอาทิตย์ เขาว่าเป็นคนอารมณ์ขึ้น ๆ ลง ๆ อาจจะตามอารมณ์ยากสัก\n"
                    + "หน่อย เป็นคนใจกว้าง ให้อิสระกับคนรัก แต่ถ้าเข้าโหมดจริงจังแล้วไม่ชอบอะไรเล่น ๆ อยู่ไหน ทําอะไรกับใคร\n"
                    + "ต้องบอก ต้องรายงาน และถ้าชอบใครก็จะทําทุกวิถีทางเพื่อให้ได้คบ";
            lovehabit = "พอมีแฟนแล้วโลกสดใส อะไรก็เป็นสีชมพูไปหมด ถ้ามีแฟนจะขี้\n"
                    + "บ่นมาก ๆ แต่ก็เป็นเพราะรักแหละถึงบ่น เป็นคนรักเดียวใจเดียว คบใครก็คบทีละคน ไม่ได้หว่านไปทั่วถ้าเทียบ\n"
                    + "กับคนเกิดวันอื่น ๆ ถ้าเจอแฟนหรือคนรักที่เข้ากับครอบครัวหรือเพื่อนได้ก็ผ่านฉลุย เพราะชอบความรักแบบ\n"
                    + "ลึกซึ้ง พร้อมที่จะเป็นครอบครัวเดียวกันในอนาคต ชอบคนพูดเพราะ ใส่ใจ ยิ้มหวาน ถ้าสอบผ่านก็จะเสมอต้น\n"
                    + "เสมอปลายกับคนรักมาก ๆ";
            love = 75;
        }
        txtResultHabit.setText("" + habit);
        txtResultLoveHabit.setText("" + lovehabit);
        lblLove.setText("" + love);
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
            java.util.logging.Logger.getLogger(FortuneTelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FortuneTelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FortuneTelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FortuneTelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FortuneTelling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRun;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLove;
    private javax.swing.JRadioButton rdoFri;
    private javax.swing.JRadioButton rdoMon;
    private javax.swing.JRadioButton rdoSat;
    private javax.swing.JRadioButton rdoSun;
    private javax.swing.JRadioButton rdoThu;
    private javax.swing.JRadioButton rdoTue;
    private javax.swing.JRadioButton rdoWed;
    private javax.swing.JTextArea txtResultHabit;
    private javax.swing.JTextField txtResultHabit1;
    private javax.swing.JTextArea txtResultLoveHabit;
    // End of variables declaration                   

}
