
package telephoneconnection;

import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

public class report extends javax.swing.JFrame {

    connection cn= new connection();
    ResultSet rs;
    int auto_id;
    int ID1;
    public report() {
        initComponents();
        cn.call();
        
        DoConnect();
        
    }
    
    private void DoConnect()
    {
        SetIcon();
    }
    
    
    private void SetIcon()
    {
        setTitle("Report");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("..\\src\\telephoneconnection\\search.png").getImage());
        setSize(400,400);
        setVisible(true);
    }

    private void TableSize()
    {
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(50);
    }
    
    private void TableColumnName()
    {
        TableColumn tc;
        JTableHeader th = jTable1.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();
        tc = tcm.getColumn(0);
        tc.setHeaderValue( "ID" );
        tc = tcm.getColumn(1);
        tc.setHeaderValue( "Name" );
        tc = tcm.getColumn(2);
        tc.setHeaderValue( "Father Name" );
        tc = tcm.getColumn(3);
        tc.setHeaderValue( "Address" );
        tc = tcm.getColumn(4);
        tc.setHeaderValue( "City" );
        tc = tcm.getColumn(5);
        tc.setHeaderValue( "Number" );
        tc = tcm.getColumn(6);
        tc.setHeaderValue( "Mode" );
        tc = tcm.getColumn(7);
        tc.setHeaderValue( "Type" );
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        search2 = new javax.swing.JButton();
        search1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(790, 500));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(790, 500));
        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(590, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(590, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(590, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/Header.png"))); // NOI18N
        jPanel2.add(jLabel1, "card2");

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 119);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/back.png"))); // NOI18N
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(691, 421, 90, 40);

        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/logout.png"))); // NOI18N
        LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOutMouseExited(evt);
            }
        });
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel1.add(LogOut);
        LogOut.setBounds(10, 421, 90, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "fathername", "Address", "city", "phonenumber", "modeofconnection", "typeconnection"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setMaximumSize(new java.awt.Dimension(525, 0));
        jTable1.setMinimumSize(new java.awt.Dimension(525, 0));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 140, 582, 248);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Report Base Type");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(598, 140, 183, 17);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select..", "Mode Of Connecion", "Type Of Connection" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(598, 160, 183, 29);

        search2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/generate.png"))); // NOI18N
        search2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search2MouseExited(evt);
            }
        });
        search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });
        jPanel1.add(search2);
        search2.setBounds(350, 421, 105, 40);

        search1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/searchh.png"))); // NOI18N
        search1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search1MouseExited(evt);
            }
        });
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        jPanel1.add(search1);
        search1.setBounds(650, 270, 85, 40);

        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(598, 220, 183, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(598, 200, 183, 17);

        bg.setForeground(new java.awt.Color(255, 51, 51));
        bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/Background.png"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 800, 500);

        jLayeredPane1.add(jPanel1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        new loginform().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogOutActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new search().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost

    }//GEN-LAST:event_jTable1FocusLost

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked
    String flag="";
    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed

        if(jComboBox1.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(this, "Select Report Base Type");
        }
        else
        {
            String str=("select ud.User_Id,ud.Name,ud.FatherName,ud.Address,ud.City,un.Tel_Number,mc.Mode,tc.Type "+
                        "from UserDetail as ud,UserNumber as un,ModeOfConnection as mc,TypeofConnection as tc,UserConnection as uc"+
                        " where ud.User_Id=un.User_Id and mc.Mode_Id=uc.Mode_Id and tc.Type_Id=uc.Type_Id and un.Tel_Id=uc.Tel_Id and "+flag+"='"+jComboBox2.getSelectedItem().toString()+"'");
            try{
                rs=cn.st.executeQuery(str);
            }
            catch(Exception e)
            {}
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            TableColumnName();
            TableSize();
        }
    }//GEN-LAST:event_search1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        
        String Selected=jComboBox1.getSelectedItem().toString();
        if(Selected.equals("Mode Of Connecion"))
        {
            jLabel3.setText("Select Mode");
            jComboBox2.removeAllItems();
            try 
            {
                flag="mc.Mode";
                String q="select * from ModeOfConnection";
                rs=cn.st.executeQuery(q);
                while(rs.next())
                {
                    jComboBox2.addItem(rs.getString("Mode"));
                }
            } 
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        else if(Selected.equals("Type Of Connection"))
        {
            jLabel3.setText("Select Type");
            jComboBox2.removeAllItems();
            try 
            {
                flag="tc.Type";
                String q1="select * from TypeOfConnection";
                rs=cn.st.executeQuery(q1);
                jComboBox2.removeAllItems();
                while(rs.next())
                {
                    jComboBox2.addItem(rs.getString("Type"));
                }
            } 
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        else
        {
            jLabel3.setText("Select");
            jComboBox2.removeAllItems();
            flag = "";
        }
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
        
        try 
        {
            JFileChooser fileSelector = new JFileChooser();
            int r= fileSelector.showSaveDialog(this);
            if(r==0)
            {
            PrintWriter writer = new PrintWriter(fileSelector.getSelectedFile() + ".csv");
            
            writer.println(jTable1.getColumnName(0) + "," +jTable1.getColumnName(1)+ "," +jTable1.getColumnName(2)+ "," +jTable1.getColumnName(3)+ "," +jTable1.getColumnName(4)+ "," +jTable1.getColumnName(5)+ "," +jTable1.getColumnName(6)+ "," +jTable1.getColumnName(7));
            
                for (int i = 0; i < jTable1.getRowCount(); i++)
                {
                    writer.println(jTable1.getValueAt(i, 0) +","+ jTable1.getValueAt(i, 1) +","+jTable1.getValueAt(i, 2) +","+jTable1.getValueAt(i, 3)+","+jTable1.getValueAt(i, 4)+","+jTable1.getValueAt(i, 5)+","+jTable1.getValueAt(i, 6)+","+jTable1.getValueAt(i, 7));
                }
                writer.close();
                JOptionPane.showMessageDialog(this, "Exported!");
            
            }
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_search2ActionPerformed

    private void LogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseEntered
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\logouth.png");
            LogOut.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_LogOutMouseEntered

    private void LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseExited
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\logout.png");
            LogOut.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_LogOutMouseExited

    private void search2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search2MouseEntered
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\generateh.png");
            search2.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_search2MouseEntered

    private void search2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search2MouseExited
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\generate.png");
            search2.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_search2MouseExited

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\backh.png");
            Back.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\back.png");
            Back.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_BackMouseExited

    private void search1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseEntered
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\searchhh.png");
            search1.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_search1MouseEntered

    private void search1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseExited
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\searchh.png");
            search1.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_search1MouseExited
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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new report().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel bg;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton search1;
    private javax.swing.JButton search2;
    // End of variables declaration//GEN-END:variables
}
