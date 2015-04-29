import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
public class QuestionPage2 extends javax.swing.JFrame {
    
    int score2=0;
    String ans[] = new String[18];
    public QuestionPage2() {
        initComponents();
        btnnext2.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnnext2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        txtscore2 = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        btnss2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Page 2");

        jLabel1.setText("Have you ever eaten raw meat?");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Yes");
        jRadioButton1.setActionCommand("Y");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No");
        jRadioButton2.setActionCommand("N");

        btnnext2.setText("Next Page");
        btnnext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnext2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Have you ever crashed a car?");

        jLabel3.setText("Have you ever given to charity?");

        jLabel4.setText("Have you ever played an instrument?");

        jLabel5.setText("Have you crapped yourself?");

        jLabel6.setText("Have you ever had sex?");

        jLabel7.setText("Have you ever been slapped?");

        jLabel8.setText("Have you ever slapped someone?");

        jLabel9.setText("Have you ever been to a concert?");

        jLabel10.setText("Have you ever travelled to a different country?");

        jLabel11.setText("Have you ever babysat someone?");

        jLabel12.setText("Have you ever been given oral?");

        jLabel13.setText("Have you ever given oral?");

        jLabel14.setText("Have you ever slept with someone(sleep)?");

        jLabel15.setText("Have you ever saved nudes?");

        jLabel16.setText("Have you ever masturbated?");

        jLabel17.setText("Have you ever sniffed your penis/vagina?");

        jLabel18.setText("Have you ever walked in on your sibling/parent?");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Yes");
        jRadioButton3.setActionCommand("Y");

        buttonGroup3.add(jRadioButton4);
        jRadioButton4.setText("No");
        jRadioButton4.setActionCommand("N");

        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setText("Yes");
        jRadioButton5.setActionCommand("Y");

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("No");
        jRadioButton6.setActionCommand("N");

        buttonGroup4.add(jRadioButton7);
        jRadioButton7.setText("Yes");
        jRadioButton7.setActionCommand("Y");

        buttonGroup4.add(jRadioButton8);
        jRadioButton8.setText("No");
        jRadioButton8.setActionCommand("N");

        buttonGroup5.add(jRadioButton9);
        jRadioButton9.setText("Yes");
        jRadioButton9.setActionCommand("Y");

        buttonGroup5.add(jRadioButton10);
        jRadioButton10.setText("No");
        jRadioButton10.setActionCommand("N");

        buttonGroup6.add(jRadioButton11);
        jRadioButton11.setText("Yes");
        jRadioButton11.setActionCommand("Y");

        buttonGroup6.add(jRadioButton12);
        jRadioButton12.setText("No");
        jRadioButton12.setActionCommand("N");

        buttonGroup7.add(jRadioButton13);
        jRadioButton13.setText("Yes");
        jRadioButton13.setActionCommand("Y");

        buttonGroup7.add(jRadioButton14);
        jRadioButton14.setText("No");
        jRadioButton14.setActionCommand("N");

        buttonGroup8.add(jRadioButton15);
        jRadioButton15.setText("Yes");
        jRadioButton15.setActionCommand("Y");

        buttonGroup8.add(jRadioButton16);
        jRadioButton16.setText("No");
        jRadioButton16.setActionCommand("N");

        buttonGroup9.add(jRadioButton17);
        jRadioButton17.setText("Yes");
        jRadioButton17.setActionCommand("Y");

        buttonGroup9.add(jRadioButton18);
        jRadioButton18.setText("No");
        jRadioButton18.setActionCommand("N");

        buttonGroup10.add(jRadioButton19);
        jRadioButton19.setText("Yes");
        jRadioButton19.setActionCommand("Y");

        buttonGroup10.add(jRadioButton20);
        jRadioButton20.setText("No");
        jRadioButton20.setActionCommand("N");

        buttonGroup11.add(jRadioButton21);
        jRadioButton21.setText("Yes");
        jRadioButton21.setActionCommand("Y");

        buttonGroup11.add(jRadioButton22);
        jRadioButton22.setText("No");
        jRadioButton22.setActionCommand("N");

        buttonGroup12.add(jRadioButton23);
        jRadioButton23.setText("Yes");
        jRadioButton23.setActionCommand("Y");

        buttonGroup12.add(jRadioButton24);
        jRadioButton24.setText("No");
        jRadioButton24.setActionCommand("N");

        buttonGroup13.add(jRadioButton25);
        jRadioButton25.setText("Yes");
        jRadioButton25.setActionCommand("Y");

        buttonGroup13.add(jRadioButton26);
        jRadioButton26.setText("No");
        jRadioButton26.setActionCommand("N");

        buttonGroup14.add(jRadioButton27);
        jRadioButton27.setText("Yes");
        jRadioButton27.setActionCommand("Y");

        buttonGroup14.add(jRadioButton28);
        jRadioButton28.setText("No");
        jRadioButton28.setActionCommand("N");

        buttonGroup15.add(jRadioButton29);
        jRadioButton29.setText("Yes");
        jRadioButton29.setActionCommand("Y");

        buttonGroup15.add(jRadioButton30);
        jRadioButton30.setText("No");
        jRadioButton30.setActionCommand("N");

        buttonGroup16.add(jRadioButton31);
        jRadioButton31.setText("Yes");
        jRadioButton31.setActionCommand("Y");

        buttonGroup16.add(jRadioButton32);
        jRadioButton32.setText("No");
        jRadioButton32.setActionCommand("N");

        buttonGroup17.add(jRadioButton33);
        jRadioButton33.setText("Yes");
        jRadioButton33.setActionCommand("Y");

        buttonGroup17.add(jRadioButton34);
        jRadioButton34.setText("No");
        jRadioButton34.setActionCommand("N");

        buttonGroup18.add(jRadioButton35);
        jRadioButton35.setText("Yes");
        jRadioButton35.setActionCommand("Y");

        buttonGroup18.add(jRadioButton36);
        jRadioButton36.setText("No");
        jRadioButton36.setActionCommand("N");

        jLabel19.setText("Score: ");

        txtscore2.setEditable(false);

        lbl2.setText(" ");

        lbl1.setText(" ");

        lbl3.setText(" ");

        lbl9.setText(" ");

        lbl11.setText(" ");

        lbl10.setText(" ");

        lbl12.setText(" ");

        lbl13.setText(" ");

        lbl14.setText(" ");

        lbl4.setText("  ");

        lbl5.setText("  ");

        lbl6.setText("  ");

        lbl7.setText("        ");

        lbl8.setText("   ");

        lbl16.setText(" ");

        lbl15.setText(" ");

        lbl17.setText(" ");

        lbl18.setText(" ");

        btnss2.setText("See Score");
        btnss2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnss2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnss2)
                        .addGap(65, 65, 65)
                        .addComponent(btnnext2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel1)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbl5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(lbl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(lbl3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                                    .addGap(6, 6, 6))
                                .addComponent(lbl7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(lbl6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lbl15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtscore2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton5)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton4))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton9)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton10))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton7)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton8))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton11)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton12))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton13)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton14))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton15)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton16))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton17)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton19)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton20))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton21)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton22))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton23)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton24))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton25)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton26))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton27)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton28))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton29)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton30))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton31)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton32))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton33)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton34))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton35)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton36))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton3)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton6))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(lbl1))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jRadioButton3)
                                                    .addComponent(jRadioButton6))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jRadioButton5)
                                                .addComponent(jRadioButton4)
                                                .addComponent(lbl3)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jRadioButton9)
                                        .addComponent(jRadioButton10)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jRadioButton11)
                                    .addComponent(jRadioButton12)
                                    .addComponent(lbl6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jRadioButton13)
                                    .addComponent(jRadioButton14)
                                    .addComponent(lbl7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jRadioButton15)
                                    .addComponent(jRadioButton16)
                                    .addComponent(lbl8))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton7)
                                    .addComponent(jRadioButton8)
                                    .addComponent(lbl4))
                                .addGap(18, 18, 18)
                                .addComponent(lbl5)
                                .addGap(140, 140, 140)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jRadioButton17)
                            .addComponent(jRadioButton18)
                            .addComponent(lbl9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jRadioButton19)
                            .addComponent(jRadioButton20)
                            .addComponent(lbl10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jRadioButton21)
                            .addComponent(jRadioButton22))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jRadioButton23)
                            .addComponent(jRadioButton24)
                            .addComponent(lbl12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jRadioButton25)
                            .addComponent(jRadioButton26)
                            .addComponent(lbl13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jRadioButton27)
                            .addComponent(jRadioButton28)
                            .addComponent(lbl14)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbl2)
                        .addGap(334, 334, 334)
                        .addComponent(lbl11)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jRadioButton29)
                    .addComponent(jRadioButton30)
                    .addComponent(lbl15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jRadioButton31)
                    .addComponent(jRadioButton32)
                    .addComponent(lbl16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jRadioButton33)
                    .addComponent(jRadioButton34)
                    .addComponent(lbl17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jRadioButton35)
                    .addComponent(jRadioButton36)
                    .addComponent(lbl18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnext2)
                    .addComponent(jLabel19)
                    .addComponent(txtscore2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnss2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    private void btnnext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnext2ActionPerformed
        if(ans[0].equals("Y"))score2+=10;
        else score2+=20;
        if(ans[1].equals("Y"))score2-=50;
        else score2+=5;
        if(ans[2].equals("Y"))score2+=80;
        else score2+=0;
        if(ans[3].equals("Y"))score2+=10;
        else score2+=0;
        if(ans[4].equals("Y"))score2-=30;
        else score2+=10;
        if(ans[5].equals("Y"))score2+=100;
        else score2+=0;
        if(ans[6].equals("Y"))score2+=0;
        else score2+=5;
        if(ans[7].equals("Y"))score2-=10;
        else score2+=5;
        if(ans[8].equals("Y"))score2+=20;
        else score2+=0;
        if(ans[9].equals("Y"))score2+=100;
        else score2+=0;
        if(ans[10].equals("Y"))score2+=35;
        else score2+=0;
        if(ans[11].equals("Y"))score2+=45;
        else score2+=5;
        if(ans[12].equals("Y"))score2+=45;
        else score2+=5;
        if(ans[13].equals("Y"))score2+=75;
        else score2+=30;
        if(ans[14].equals("Y"))score2+=2;
        else score2+=30;
        if(ans[15].equals("Y"))score2+=10;
        else score2+=0;
        if(ans[16].equals("Y"))score2-=120;
        else score2+=20;
        if(ans[17].equals("Y"))score2+=5;
        else score2+=20;
        
        close();
        QuestionPage3 q3 = new QuestionPage3();
        QuestionPage3.txtscore3.setText(this.txtscore2.getText());
        q3.setVisible(true);
    }//GEN-LAST:event_btnnext2ActionPerformed

    private void btnss2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnss2ActionPerformed
        try{
            ans[0] = buttonGroup1.getSelection().getActionCommand();
            ans[1] = buttonGroup2.getSelection().getActionCommand();
            ans[2] = buttonGroup3.getSelection().getActionCommand();
            ans[3] = buttonGroup4.getSelection().getActionCommand();
            ans[4] = buttonGroup5.getSelection().getActionCommand();
            ans[5] = buttonGroup6.getSelection().getActionCommand();
            ans[6] = buttonGroup7.getSelection().getActionCommand();
            ans[7] = buttonGroup8.getSelection().getActionCommand();
            ans[8] = buttonGroup9.getSelection().getActionCommand();
            ans[9] = buttonGroup10.getSelection().getActionCommand();
            ans[10] = buttonGroup11.getSelection().getActionCommand();
            ans[11] = buttonGroup12.getSelection().getActionCommand();
            ans[12] = buttonGroup13.getSelection().getActionCommand();
            ans[13] = buttonGroup14.getSelection().getActionCommand();
            ans[14] = buttonGroup15.getSelection().getActionCommand();
            ans[15] = buttonGroup16.getSelection().getActionCommand();
            ans[16] = buttonGroup17.getSelection().getActionCommand();
            ans[17] = buttonGroup18.getSelection().getActionCommand();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.toString());//"Must fill out form correctly");
            return;
        }
        btnss2.setEnabled(false);
        btnnext2.setEnabled(true);
        txtscore2.setText(""+score2);
    }//GEN-LAST:event_btnss2ActionPerformed

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
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnext2;
    private javax.swing.JButton btnss2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    public static javax.swing.JTextField txtscore2;
    // End of variables declaration//GEN-END:variables
}
