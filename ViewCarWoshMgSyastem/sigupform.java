/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewCarWoshMgSyastem;

import DaoContral.SignUpDao;
import Model.SignUp;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author M NJERIC
 */
public class sigupform extends javax.swing.JInternalFrame {

    /**
     * Creates new form sigupform
     */
    public sigupform() {
        initComponents();
        jPanel1.setVisible(false);
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI  ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EmailBox = new javax.swing.JTextField();
        CreateBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PasswordBox = new javax.swing.JPasswordField();
        confirmPasswordBox = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CreateBTN1 = new javax.swing.JButton();
        national_id = new javax.swing.JTextField();

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("SIGNUP  FORM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Password  :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Email :");

        EmailBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        CreateBTN.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CreateBTN.setText("Create");
        CreateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBTNActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Confirm Password  :");

        PasswordBox.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        confirmPasswordBox.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirmPasswordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PasswordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EmailBox, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(CreateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EmailBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(PasswordBox, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(confirmPasswordBox, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CreateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("SEARCHING STAFF WORKER  ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("National ID :");

        CreateBTN1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CreateBTN1.setText("Search");
        CreateBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBTN1ActionPerformed(evt);
            }
        });

        national_id.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        national_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                national_idKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CreateBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(national_id, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(national_id, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(CreateBTN1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBTN1ActionPerformed
        SignUp sg=new SignUp();
        sg.setNational_id(national_id.getText());
        
        SignUpDao sd=new SignUpDao();
        String feed=sd.Searchingdadata(sg);
        if(feed!=null){
         jPanel1.setVisible(true);  
        }else{
            JOptionPane.showMessageDialog(null, "This National Id Is not Exist Or not Registered On Staff Role ", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CreateBTN1ActionPerformed

    private void CreateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBTNActionPerformed
         if(EmailBox.getText().trim().isEmpty()||PasswordBox.getText().trim().isEmpty()||confirmPasswordBox.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(null, "Plz fill all fields!!", "Password Message", JOptionPane.ERROR_MESSAGE); 
         }else if(!(Pattern.matches("[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", EmailBox.getText()))){
          JOptionPane.showMessageDialog(null, "Your Email is Not Valid!!", "Email Message", JOptionPane.ERROR_MESSAGE);   
         }else if(!national_id.getText().trim().startsWith("1")||national_id.getText().trim().length()!=16){
          JOptionPane.showMessageDialog(null, "National ID should be 16 Digit and Start 1", "Information Message",JOptionPane.INFORMATION_MESSAGE);
         }else if(PasswordBox.getText().trim().length()<8 || PasswordBox.getText().trim().length()>16){
          JOptionPane.showMessageDialog(null, "password must be between 8 nand 16", "Password Message", JOptionPane.ERROR_MESSAGE);
         }else if(!PasswordBox.getText().trim().equals(confirmPasswordBox.getText().trim())){
          JOptionPane.showMessageDialog(null, "Password Not Matching!!", "Password Message", JOptionPane.ERROR_MESSAGE);
        }else{
         SignUp sGg=new SignUp();
         sGg.setUsername(EmailBox.getText());
             SignUpDao sdd=new SignUpDao();
        String feedd=sdd.Searchingdadatafromsemail(sGg);
        if(feedd!=null){
        JOptionPane.showMessageDialog(null, "Your Email is already Exist try another!", "Error Message", JOptionPane.ERROR_MESSAGE);
        }else{
        SignUp sg=new SignUp();
        sg.setNational_id(national_id.getText());
        
        SignUpDao sd=new SignUpDao();
        String feed=sd.Searchingdadatafromsignuptable(sg);
        if(feed!=null){
        
            JOptionPane.showMessageDialog(null, "This National_id IS Already Exist Try To Update", "Error Message", JOptionPane.ERROR_MESSAGE);
       jPanel1.setVisible(false);
       national_id.setText("");
        }else{
            
      sg.setNational_id(national_id.getText());
      sg.setUsername(EmailBox.getText());
      sg.setPassword(PasswordBox.getText());
      
      SignUpDao sdao=new SignUpDao();
      String feedback=sdao.insertdata(sg);
       JOptionPane.showMessageDialog(null, feedback, "Information Message",JOptionPane.INFORMATION_MESSAGE);
        EmailBox.setText("");
        PasswordBox.setText("");
        confirmPasswordBox.setText("");
        }
        }
         }
    }//GEN-LAST:event_CreateBTNActionPerformed

    private void national_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_national_idKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_national_idKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateBTN;
    private javax.swing.JButton CreateBTN1;
    private javax.swing.JTextField EmailBox;
    private javax.swing.JPasswordField PasswordBox;
    private javax.swing.JPasswordField confirmPasswordBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField national_id;
    // End of variables declaration//GEN-END:variables
}
