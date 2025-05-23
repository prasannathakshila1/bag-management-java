/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Thakshila
 */
public class Home extends javax.swing.JFrame {

     private String userRole;
     
    public Home(String role) {
        initComponents();
        this.userRole = role;
        configureRoleBasedUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addBagButton = new javax.swing.JButton();
        viewAllBagsButton = new javax.swing.JButton();
        userManButton = new javax.swing.JButton();
        searchBagButton = new javax.swing.JButton();
        staffRegButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("The Little Bag Shop");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 28, 216, -1));

        addBagButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBagButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-cart.png"))); // NOI18N
        addBagButton.setText("Add Bag");
        addBagButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        addBagButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBagButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addBagButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 131, 94));

        viewAllBagsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewAllBagsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/allbags.png"))); // NOI18N
        viewAllBagsButton.setText("View All Bags");
        viewAllBagsButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        viewAllBagsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewAllBagsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllBagsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(viewAllBagsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 134, 94));

        userManButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userManButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-management-icon.png"))); // NOI18N
        userManButton.setText("User Management");
        userManButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        userManButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userManButton.setIconTextGap(2);
        userManButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userManButtonActionPerformed(evt);
            }
        });
        getContentPane().add(userManButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 170, 50));

        searchBagButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBagButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portfolio.png"))); // NOI18N
        searchBagButton.setText("Search Bag");
        searchBagButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        searchBagButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBagButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchBagButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 159, 94));

        staffRegButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        staffRegButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register.png"))); // NOI18N
        staffRegButton1.setText("Staff Registation");
        staffRegButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        staffRegButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        staffRegButton1.setIconTextGap(2);
        staffRegButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffRegButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(staffRegButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 170, 94));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_page.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 360));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 550, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBagButtonActionPerformed
            Addbag addbag = new Addbag();
            addbag.setVisible(true);
             dispose(); 
    }//GEN-LAST:event_addBagButtonActionPerformed

    private void userManButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userManButtonActionPerformed
           Usermanagement usermanagement = new Usermanagement();
            usermanagement.setVisible(true);
             dispose(); 
    }//GEN-LAST:event_userManButtonActionPerformed

    private void viewAllBagsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllBagsButtonActionPerformed
          ViewAllbags viewAllbags = new ViewAllbags();
            viewAllbags.setVisible(true);
             dispose(); 
    }//GEN-LAST:event_viewAllBagsButtonActionPerformed

    private void searchBagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBagButtonActionPerformed
         SearchBag searchbag = new SearchBag();
            searchbag.setVisible(true);
             dispose(); 
    }//GEN-LAST:event_searchBagButtonActionPerformed

    private void staffRegButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffRegButton1ActionPerformed
           Staffregistation staffregistation = new Staffregistation();
            staffregistation.setVisible(true);
             dispose();
    }//GEN-LAST:event_staffRegButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Home("Manager").setVisible(true);
            }
        });
    }
     private void configureRoleBasedUI() {
        if ("Cashier".equalsIgnoreCase(userRole)) {
            userManButton.setVisible(false);
            staffRegButton1.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBagButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton searchBagButton;
    private javax.swing.JButton staffRegButton1;
    private javax.swing.JButton userManButton;
    private javax.swing.JButton viewAllBagsButton;
    // End of variables declaration//GEN-END:variables
}
