/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.sql.*;
import javax.swing.*;
public class directer_genaral_loginpage extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    /**
     * Creates new form directer_genaral_loginpage
     */
    public directer_genaral_loginpage() {
        initComponents();
        con=SQLCON.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDGL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnlogin = new javax.swing.JButton();
        lblpass = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        lblNIC = new javax.swing.JLabel();
        PFpass = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDGL.setFont(new java.awt.Font("Bookman Old Style", 1, 70)); // NOI18N
        lblDGL.setForeground(new java.awt.Color(255, 255, 255));
        lblDGL.setText("Director General Login");
        getContentPane().add(lblDGL, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 840, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,120));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel3.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 120, 50));

        lblpass.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblpass.setForeground(new java.awt.Color(255, 255, 255));
        lblpass.setText("Password");
        jPanel3.add(lblpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        txtNIC.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel3.add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 320, 60));

        lblNIC.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblNIC.setForeground(new java.awt.Color(255, 255, 255));
        lblNIC.setText("NIC");
        jPanel3.add(lblNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, -1));

        PFpass.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        PFpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PFpassActionPerformed(evt);
            }
        });
        jPanel3.add(PFpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 320, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 300, 620, 470));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, -1, -1));

        btnback.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\BCMS\\images\\left-arrow.png")); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\BCMS\\images\\bg13.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 530, 610));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\BCMS\\images\\grasss.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 780, 580, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 1250));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\BCMS\\images\\pexels-daniyal-ghanavati-110812.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, -4, 1390, 1090));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        this.toBack();
        Login lg = new Login();
        lg.setVisible(true);
        lg.toFront();
        this.hide();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "Select * from directorgeneral where nic=? and password=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,txtNIC.getText());
            pst.setString(2,PFpass.getText());
            ResultSet rs =pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"NIC and Password Matched");
                director_genaral_dashb dgd = new director_genaral_dashb();
                dgd.setVisible(true);
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"Incorrect NIC or Password");
                txtNIC.setText("");
                PFpass.setText("");
            }con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void PFpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PFpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PFpassActionPerformed

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
            java.util.logging.Logger.getLogger(directer_genaral_loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(directer_genaral_loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(directer_genaral_loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(directer_genaral_loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new directer_genaral_loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PFpass;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDGL;
    private javax.swing.JLabel lblNIC;
    private javax.swing.JLabel lblpass;
    private javax.swing.JTextField txtNIC;
    // End of variables declaration//GEN-END:variables
}
