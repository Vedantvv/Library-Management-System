/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class StudentEntry extends javax.swing.JInternalFrame {

    /**
     * Creates new form StudentEntry
     */
    String imagename=null;
        String gender=" ";
    
    public StudentEntry() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jtxtSname = new javax.swing.JTextField();
        jtxtSemail = new javax.swing.JTextField();
        jtxtSmobile = new javax.swing.JTextField();
        jcombBranch = new javax.swing.JComboBox<>();
        jcmobYear = new javax.swing.JComboBox<>();
        jcomSection = new javax.swing.JComboBox<>();
        jpass = new javax.swing.JPasswordField();
        jRadioMale = new javax.swing.JRadioButton();
        jRadioFemale = new javax.swing.JRadioButton();
        jbtnphoto = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtxtSid = new javax.swing.JTextField();
        jbtnUpdate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlblimg = new javax.swing.JLabel();
        lblbackimg = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("Fill the information of Student");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jButton1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Student Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Student Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Student Mobile");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("Select Branch");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("Select Year");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("Select Section");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setText("Password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setText("Gender");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, -1, -1));

        jButton2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, -1, -1));

        jtxtSname.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jtxtSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 180, -1));

        jtxtSemail.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jtxtSemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 180, -1));

        jtxtSmobile.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jtxtSmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 180, -1));

        jcombBranch.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jcombBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "CSE", "IT", "CIVIL", "MECHANICAL", "ETC", " " }));
        jPanel1.add(jcombBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 180, -1));

        jcmobYear.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jcmobYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1st year", "2nd year", "3rd year", "4th year", " " }));
        jPanel1.add(jcmobYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 180, -1));

        jcomSection.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jcomSection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A", "B", "C", "D", "E" }));
        jPanel1.add(jcomSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 180, -1));

        jpass.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 180, -1));

        jRadioMale.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jRadioMale.setText("Male");
        jRadioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMaleActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, -1, -1));

        jRadioFemale.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jRadioFemale.setText("Female");
        jRadioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioFemaleActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, -1));

        jbtnphoto.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jbtnphoto.setText("UploadPhoto");
        jbtnphoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnphotoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setText("Student Id");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jtxtSid.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jtxtSid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSidActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtSid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 180, -1));

        jbtnUpdate.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblimg, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblimg, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, -1));

        lblbackimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/bb.jpg"))); // NOI18N
        jPanel1.add(lblbackimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 1030, 780));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 784));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtSidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSidActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
       String pass = new String(jpass.getPassword());
       
       
       
        
        
         
         if (jRadioMale.isSelected()) {
         gender = jRadioMale.getText();
}        else if (jRadioFemale.isSelected()) {
         gender = jRadioFemale.getText();
}
        try{
            
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
             
              String sql1="select *from student_entry where s_id='"+jtxtSid.getText()+"'";
                   PreparedStatement pst1=con.prepareStatement(sql1); 
                   ResultSet rs1=pst1.executeQuery();    
                   
                    if(rs1.next()){
                               JOptionPane.showMessageDialog(null, "ID '" + jtxtSid.getText() + "' already exists");
                    }else{  
              String sql = "insert into student_entry(s_id,s_name,s_email,s_mobile,s_branch,s_year,s_section,s_password,s_gender,s_img)values ('"+jtxtSid.getText()+"','"+jtxtSname.getText()+"','"+jtxtSemail.getText()+"','"+jtxtSmobile.getText()+"','"+jcombBranch.getSelectedItem()+"','"+jcmobYear.getSelectedItem()+"','"+jcomSection.getSelectedItem()+"','"+pass+"','"+gender+"','"+imagename+"') ";
        PreparedStatement pst = con.prepareStatement(sql);
        int i = pst.executeUpdate();
        
        if(i>0)
            JOptionPane.showMessageDialog(null, "Record Saved suceessfully");
        
        con.close();
        pst.close();
          clear();
        } 
        }
        catch(Exception ex){
            System.out.println("ex"+ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMaleActionPerformed
        // TODO add your handling code here:
        gender="male";
        
        if(jRadioMale.isSelected()){
            
            jRadioMale.setSelected(true);
            jRadioFemale.setSelected(false);
        }
    }//GEN-LAST:event_jRadioMaleActionPerformed

    private void jRadioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioFemaleActionPerformed
        // TODO add your handling code here:
        gender="female";
        
        if(jRadioFemale.isSelected()){
            
            jRadioFemale.setSelected(true);
            jRadioMale.setSelected(false);
        }
    }//GEN-LAST:event_jRadioFemaleActionPerformed

    private void jbtnphotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnphotoActionPerformed
        // TODO add your handling code here:
         JFileChooser chooser = new JFileChooser();
        int i = chooser.showOpenDialog(null);
        if(i==JFileChooser.APPROVE_OPTION){
            File file = chooser.getSelectedFile();
            imagename = file.getName();
            String path = file.getPath();
            ImageIcon icon = new ImageIcon(path);
            Image image = icon.getImage();
            Image newImage =image.getScaledInstance(jlblimg.getWidth(), jlblimg.getHeight(), Image.SCALE_SMOOTH);
           jlblimg.setIcon(new ImageIcon(newImage));
        }
    }//GEN-LAST:event_jbtnphotoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String newid = jtxtSid.getText().trim();
        int id = Integer.parseInt(newid);
      
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management", "root", "");
                       
            String sql = "select * from student_entry where s_id= '"+id+"' ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            int status=0;
            
            if(rs.next()){
                status=1;
                jtxtSname.setText(rs.getString("s_name"));
                jtxtSemail.setText(rs.getString("s_email"));
                jtxtSmobile.setText(rs.getString("s_mobile"));
                jcombBranch.setSelectedItem(rs.getString("s_branch"));
                 jcmobYear.setSelectedItem(rs.getString("s_year"));
                  jcomSection.setSelectedItem(rs.getString("s_section"));
                
                
                
                if (jRadioMale.getText().equalsIgnoreCase(rs.getString("s_gender"))) {
                    jRadioMale.setSelected(true);
                }
                if (jRadioFemale.getText().equalsIgnoreCase(rs.getString("s_gender"))) {
                    jRadioFemale.setSelected(true);
                }
                
               

                
                
                 
                jpass.setText(rs.getString("s_password"));
               
                imagename = rs.getString("s_img");
               ImageIcon icon=new ImageIcon("D:\\java\\ImageIcon\\"+imagename);
                Image image = icon.getImage();
                
                Image newImage =image.getScaledInstance(jlblimg.getWidth(), jlblimg.getHeight(), Image.SCALE_SMOOTH);
            jlblimg.setIcon(new ImageIcon(newImage));
            
            
            }
            if(status==0)
                JOptionPane.showMessageDialog(null,"Not found");
            
            
       
                               
        } catch (Exception ex) {
            System.out.println("Exception "+ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        // TODO add your handling code here:
         try{
             
              String pass = new String(jpass.getPassword());
              
              if(jRadioFemale.isSelected())
              gender="Female";
           if(jRadioMale.isSelected())
              gender="Male";
            
        
                   
                    Class.forName("com.mysql.jdbc.Driver");
                   
                   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
                   
                   
                 
                 
                    
                  String sql="update student_entry  set  s_name='"+jtxtSname.getText()+"',s_email='"+jtxtSemail.getText()+"',s_mobile='"+jtxtSmobile.getText()+"',s_branch='"+jcombBranch.getSelectedItem()+"',s_year='"+jcmobYear.getSelectedItem()+"',s_section='"+jcomSection.getSelectedItem()+"',s_gender='"+gender+"',s_password='"+pass+"',s_img='"+imagename+"'  where s_id='"+jtxtSid.getText()+"'";
                   
                   PreparedStatement pst=con.prepareStatement(sql);
                   int i=pst.executeUpdate();
                   if(i>0){
                       JOptionPane.showMessageDialog(null,"Record Update suceessfully");
                       
                      
                       con.close();
                       pst.close();
                       clear();
                       
                       
                   }
         }catch(Exception ex){
             System.out.println("ex"+ex);
         }
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    public void clear(){
        
         jtxtSid.setText(" ");
        jtxtSname.setText(" ");
         jtxtSemail.setText(" ");
        
        jtxtSmobile.setText(" ");
         jcombBranch.setSelectedIndex(0);
             jcomSection.setSelectedIndex(0);
                 jcmobYear.setSelectedIndex(0);
       
        jpass.setText("");
       
        
         jRadioMale.setSelected(false);
         jRadioFemale.setSelected(false);
       
      
        
         
         getImage();
        
    }
    
   
        public void getImage(){
         ImageIcon icon=new ImageIcon("D:\\java\\ImageIcon\\Default1.jpg");
                Image image = icon.getImage();
                
                Image newImage =image.getScaledInstance(jlblimg.getWidth(), jlblimg.getHeight(), Image.SCALE_SMOOTH);
               jlblimg.setIcon(new ImageIcon(newImage));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioFemale;
    private javax.swing.JRadioButton jRadioMale;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JButton jbtnphoto;
    private javax.swing.JComboBox<String> jcmobYear;
    private javax.swing.JComboBox<String> jcomSection;
    private javax.swing.JComboBox<String> jcombBranch;
    private javax.swing.JLabel jlblimg;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JTextField jtxtSemail;
    private javax.swing.JTextField jtxtSid;
    private javax.swing.JTextField jtxtSmobile;
    private javax.swing.JTextField jtxtSname;
    private javax.swing.JLabel lblbackimg;
    // End of variables declaration//GEN-END:variables

    
}
