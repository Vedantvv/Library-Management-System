/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

/**
 *
 * @author HP
 */
public class StudentProfile extends javax.swing.JFrame {

    /**
     * Creates new form StudentProfile
     */
     
        
    public StudentProfile(String studentId, String studentName, String studentEmail, String studentMobile,
                          String Branch, String Year, String Section, String Gender, String imagename) {
        initComponents();
        
        jtxtsid.setText(""+studentId);
        jtxtsname.setText(""+ studentName);
        jtxtsemail.setText(""+studentEmail);
         jtxtsmobile.setText(""+studentMobile);
          jtxtsbranch.setText(""+Branch);
           jtxtyear.setText(""+Year);
            jtxtsection.setText(""+Section);
             jtxtgender.setText(""+Gender);
             
             
               ImageIcon icon=new ImageIcon("D:\\java\\ImageIcon\\"+imagename);
                Image image = icon.getImage();
                
                Image newImage =image.getScaledInstance(lblimg.getWidth(), lblimg.getHeight(), Image.SCALE_SMOOTH);
            lblimg.setIcon(new ImageIcon(newImage));
        
            
           int count=getBookIssueCount(jtxtsid.getText());
            
            if(count>0){
                jtxtissue.setText(""+count);
            }
            
            
    }
    
   
    private int getBookIssueCount(String sid) {
        
          int count = 0;
        
          try{
  
    
            Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management", "root", "");
             
            String sql = "select count(*) from issue_book where  s_id='"+sid+"' ";
            
            PreparedStatement pst=con.prepareStatement(sql);
             
             ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
               count = rs.getInt(1);
            }
        

    } catch (Exception ex) {
            System.out.println("ex"+ex);
    }
    return count;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtsid = new javax.swing.JTextField();
        jtxtsname = new javax.swing.JTextField();
        jtxtsemail = new javax.swing.JTextField();
        jtxtsmobile = new javax.swing.JTextField();
        jtxtsbranch = new javax.swing.JTextField();
        jtxtyear = new javax.swing.JTextField();
        jtxtsection = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblimg = new javax.swing.JLabel();
        jtxtgender = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtissue = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setText("Student Id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Student Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 90, 20));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Student Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Student Mobile");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("Branch");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("Year");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("Section");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        jtxtsid.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jtxtsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 140, -1));

        jtxtsname.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jtxtsname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 140, -1));

        jtxtsemail.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jtxtsemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 140, -1));

        jtxtsmobile.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jtxtsmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 140, -1));

        jtxtsbranch.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jtxtsbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 140, -1));

        jtxtyear.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jtxtyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 140, -1));

        jtxtsection.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jtxtsection, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 140, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimg, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimg, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 77, -1, 110));

        jtxtgender.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jtxtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 140, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setText("Issue book");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, -1));

        jtxtissue.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(jtxtissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 140, -1));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel10.setText("Student Profile");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/bb.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 710));

        desktopPane.add(jPanel1);
        jPanel1.setBounds(0, 0, 1040, 710);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
     /*   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentProfile().setVisible(true);
            }
        }); 
*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jtxtgender;
    private javax.swing.JTextField jtxtissue;
    private javax.swing.JTextField jtxtsbranch;
    private javax.swing.JTextField jtxtsection;
    private javax.swing.JTextField jtxtsemail;
    private javax.swing.JTextField jtxtsid;
    private javax.swing.JTextField jtxtsmobile;
    private javax.swing.JTextField jtxtsname;
    private javax.swing.JTextField jtxtyear;
    private javax.swing.JLabel lblimg;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
