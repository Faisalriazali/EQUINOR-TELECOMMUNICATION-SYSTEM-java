
package telephoneconnection;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class loginform extends javax.swing.JFrame {

    connection cn = new connection();
    ResultSet rs;
    Statement st;
   
    public loginform() {
        initComponents();
        cn.call();
        DoConnect();
    }
    
    //Load On Connect
    private void DoConnect()
    {
        SetIcon();
    }
    
    //Set Frame Title And Icon
    private void SetIcon()
    {
        setTitle("Login");
        setIconImage(new ImageIcon("..\\src\\telephoneconnection\\Login.png").getImage());
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(790, 500));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(790, 500));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "login form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(0, 51, 51))); // NOI18N
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 119));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 119));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 119));
        jPanel2.setLayout(new java.awt.CardLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/Header.png"))); // NOI18N
        jPanel2.add(jLabel5, "card2");

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 119);

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(180, 220, 245, 29);

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(180, 290, 245, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("UserName");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 220, 130, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 290, 130, 29);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/loginn.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(300, 360, 120, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(185, 260, 240, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(185, 330, 240, 15);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/member.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(500, 150, 240, 250);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/exit.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(691, 421, 90, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/Background.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 800, 500);

        jLayeredPane1.add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void Login()
    {
        if(jTextField1.getText().trim().equals("") || jPasswordField1.getText().trim().equals(""))  
            {
                JOptionPane.showMessageDialog(this, "Fill All Fields"); 
            }
            else
            {
                int check=0;

                Validation v=new Validation();

                if(v.valid("[a-zA-Z]{3,20}",jTextField1.getText()))
                {
                    jLabel3.setText("");
                }
                else
                {
                    jLabel3.setText("Invalid UserName!");
                    check=1;
                }

                if(check==0)
                {
                    String  query=("select * from Login where  UserName = '"+jTextField1.getText()+"' and  Password ='"+jPasswordField1.getText()+"'");

                    try 
                    {
                        st=cn.c.createStatement();
                        rs=st.executeQuery(query);
                        if(rs.next())
                        {
                            search s = new search();
                            s.show();
                            this.setVisible(false);
                        }   
                        else
                        {
                            JOptionPane.showMessageDialog(this, "Invalid UserName Or Password!");
                        }
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(this,e);
                    }
                }
            }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        StringTokenizer st = new StringTokenizer(jTextField1.getText());
        while (st.hasMoreTokens()) 
        {
            String pal = st.nextToken();
            String up = pal.toUpperCase();
            char first = up.charAt(0);
            CharSequence gur= pal.subSequence(1, pal.length());
            jTextField1.setText(first+String.valueOf(gur));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            Login();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            Login();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\loginnh.png");
            jButton1.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\loginn.png");
            jButton1.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\exith.png");
            jButton2.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\exit.png");
            jButton2.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton2MouseExited

    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new loginform().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
