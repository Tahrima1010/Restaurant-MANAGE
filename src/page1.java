/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class page1 extends javax.swing.JFrame {

    /**
     * Creates new form page1
     */
    public page1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        perviousButton = new javax.swing.JButton();
        manuButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        homedelButton = new javax.swing.JButton();
        recieptButton = new javax.swing.JButton();
        empdataButton = new javax.swing.JButton();
        monthprofitButton = new javax.swing.JButton();
        totalButton = new javax.swing.JButton();
        withdeliveryButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        chargeTextField = new javax.swing.JTextField();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(620, 544));

        jPanel17.setBackground(new java.awt.Color(204, 255, 204));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel17.setPreferredSize(new java.awt.Dimension(620, 544));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Food Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Quantity");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("price");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("vat");

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        perviousButton.setBackground(new java.awt.Color(0, 51, 51));
        perviousButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        perviousButton.setForeground(new java.awt.Color(102, 0, 102));
        perviousButton.setText("Previous");
        perviousButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        perviousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perviousButtonActionPerformed(evt);
            }
        });

        manuButton.setBackground(new java.awt.Color(0, 0, 204));
        manuButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manuButton.setText("Manu");
        manuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuButtonActionPerformed(evt);
            }
        });

        nextButton.setBackground(new java.awt.Color(0, 51, 51));
        nextButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nextButton.setForeground(new java.awt.Color(0, 153, 51));
        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "chilli mashroom", "chilli panir", "spring roll", "lollipop", "chilli chicken bol", "chicken vegetable", "soup", "Noddle soup", "corn soup", "Lung Fung soup", "Lamon chicken", "Garli Checken Bone", "special checken", "Ginger chicken Bone", "S.K Soup", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        homedelButton.setBackground(new java.awt.Color(153, 153, 0));
        homedelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        homedelButton.setText("Home Delivery");
        homedelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homedelButtonActionPerformed(evt);
            }
        });

        recieptButton.setBackground(new java.awt.Color(0, 153, 153));
        recieptButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recieptButton.setText("Receipt");
        recieptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recieptButtonActionPerformed(evt);
            }
        });

        empdataButton.setBackground(new java.awt.Color(0, 102, 102));
        empdataButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empdataButton.setText("Employees Data");
        empdataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empdataButtonActionPerformed(evt);
            }
        });

        monthprofitButton.setBackground(new java.awt.Color(153, 153, 153));
        monthprofitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        monthprofitButton.setText("Monthly Profit");
        monthprofitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthprofitButtonActionPerformed(evt);
            }
        });

        totalButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalButton.setForeground(new java.awt.Color(0, 153, 153));
        totalButton.setText("Total Amount");
        totalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalButtonActionPerformed(evt);
            }
        });

        withdeliveryButton.setBackground(new java.awt.Color(255, 204, 204));
        withdeliveryButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        withdeliveryButton.setText("Total Amount with delivery charge");
        withdeliveryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdeliveryButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText(" Delivery charge");

        chargeTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(perviousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButton)
                .addGap(102, 102, 102))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(recieptButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(homedelButton)
                                .addGap(18, 18, 18)
                                .addComponent(empdataButton)
                                .addGap(18, 18, 18)
                                .addComponent(monthprofitButton))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(39, 39, 39)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(63, Short.MAX_VALUE))))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(manuButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(withdeliveryButton)
                        .addGap(36, 36, 36)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(chargeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(totalButton)
                        .addGap(61, 61, 61)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(manuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalButton))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5))
                    .addComponent(chargeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdeliveryButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homedelButton)
                    .addComponent(recieptButton)
                    .addComponent(empdataButton)
                    .addComponent(monthprofitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perviousButton)
                    .addComponent(nextButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuButtonActionPerformed
         new Foodmanu().setVisible(true);
       dispose();// TODO add your handling code here:
    }//GEN-LAST:event_manuButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
         new calculator().setVisible(true);
       dispose();// TODO add your handling code here:
    }//GEN-LAST:event_nextButtonActionPerformed

    private void perviousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perviousButtonActionPerformed
        new loginform().setVisible(true);
       dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_perviousButtonActionPerformed

    private void homedelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homedelButtonActionPerformed
           new infohd().setVisible(true);
       dispose();// TODO add your handling code here:
    }//GEN-LAST:event_homedelButtonActionPerformed

    private void recieptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recieptButtonActionPerformed
          new Receipt().setVisible(true);
       dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_recieptButtonActionPerformed

    private void empdataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empdataButtonActionPerformed
           new DataofEmoloyees().setVisible(true);
       dispose();// TODO add your handling code here:
    }//GEN-LAST:event_empdataButtonActionPerformed

    private void monthprofitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthprofitButtonActionPerformed
            new profit().setVisible(true);
       dispose();// TODO add your handling code here:
    }//GEN-LAST:event_monthprofitButtonActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void totalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalButtonActionPerformed
        // TODO add your handling code here:
        String st_num1, st_num2,st_num3;
        st_num1 =jTextField4.getText(); 
        st_num2 = jTextField5.getText();
        st_num3 = jTextField3.getText();
        System.out.println("1st Value "+st_num1+" \n2nd Value "+st_num2+ "\n3rd Value"+st_num3);
        int n1,n2,n3,res;
        n1 = Integer.parseInt(st_num1);
        n2 = Integer.parseInt(st_num2);
        n3 = Integer.parseInt(st_num3);
        res = (n1+n2)*n3;
        jTextField6.setText(""+res);
    }//GEN-LAST:event_totalButtonActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void withdeliveryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdeliveryButtonActionPerformed
        // TODO add your handling code here:
         String st_num1, st_num2,st_num3,st_num4;
        st_num1 =jTextField4.getText(); 
        st_num2 = jTextField5.getText();
        st_num3 = jTextField3.getText();
        st_num4 = chargeTextField.getText();
        System.out.println("1st Value "+st_num1+" \n2nd Value "+st_num2+ "\n3rd Value"+st_num3+"\n 4th value"+st_num4);
        int n1,n2,n3,n4,res;
        n1 = Integer.parseInt(st_num1);
        n2 = Integer.parseInt(st_num2);
        n3 = Integer.parseInt(st_num3);
        n4 = Integer.parseInt(st_num4);
        res = (((n1+n2)*n3)+n4);
        jTextField7.setText(""+res);
        
    }//GEN-LAST:event_withdeliveryButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chargeTextField;
    private javax.swing.JButton empdataButton;
    private javax.swing.JButton homedelButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton manuButton;
    private javax.swing.JButton monthprofitButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton perviousButton;
    private javax.swing.JButton recieptButton;
    private javax.swing.JButton totalButton;
    private javax.swing.JButton withdeliveryButton;
    // End of variables declaration//GEN-END:variables
}
