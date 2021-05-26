
package telephoneconnection;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;
import javax.swing.*;

public class search extends javax.swing.JFrame {

    
    connection cn = new connection();
    ResultSet rs;
    
    public search() {
        initComponents();
        cn.call();
        DoConnect();float alpha = 0.0f;
        Color color = new Color(1, 0, 0, alpha); 
        jScrollPane1.setBackground(color);
    }
    
    private void DoConnect()
    {
        LoadTable();
        SetIcon();
    }
    
    private void SetIcon()
    {
        setTitle("Search...");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("..\\src\\telephoneconnection\\search.png").getImage());
        setSize(400,400);
        setVisible(true);
    }
    
    private void LoadTable()
    {
        try 
        {
            String qu="select ud.User_Id,ud.Name,ud.FatherName,ud.Address,ud.City,un.Tel_Number,mc.Mode,tc.Type "+
                        "from UserDetail as ud,UserNumber as un,ModeOfConnection as mc,TypeofConnection as tc,UserConnection as uc"+
                        " where ud.User_Id=un.User_Id and mc.Mode_Id=uc.Mode_Id and tc.Type_Id=uc.Type_Id and un.Tel_Id=uc.Tel_Id";
      
            rs=cn.st.executeQuery(qu);
            jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            TableColumnName();
            TableSize();
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e);
        }
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
    
    private void searchres()
    {
        if(jTextField1.getText().trim().equals(""))
        {
        }
        else
        {
            int check=0;
            String searchby=jComboBox1.getSelectedItem().toString();
            Validation v=new Validation();
            String Pat="";
            switch(searchby)
            {
                case "PhoneNumber":
                Pat="[0-9]{11,14}";
                break;
                default:
                Pat="[a-z A-Z]{3,20}";
                break;
            }

            if(v.valid(Pat,jTextField1.getText()))
            {
                jLabel1.setText("");
            }
            else
            {
                jLabel1.setText("InValid!");
                check=1;
            }

            if(check==0)
            {
                String serchby1="";
                String str;
                switch(searchby)
                {
                    case "Name" :
                    serchby1="Name";
                    break;
                    case "City":
                    serchby1= "City";
                    break;
                    case "PhoneNumber":
                    serchby1="Tel_Number";
                    break;
                }

                if(serchby1.equals("Tel_Number"))
                {
                    str=("select ud.User_Id,ud.Name,ud.FatherName,ud.Address,ud.City,un.Tel_Number,mc.Mode,tc.Type "+
                        "from UserDetail as ud,UserNumber as un,ModeOfConnection as mc,TypeofConnection as tc,UserConnection as uc"+
                        " where ud.User_Id=un.User_Id and mc.Mode_Id=uc.Mode_Id and tc.Type_Id=uc.Type_Id and un.Tel_Id=uc.Tel_Id and un."+serchby1+"='"+jTextField1.getText()+"'");
                }
                else
                {
                    str=("select ud.User_Id,ud.Name,ud.FatherName,ud.Address,ud.City,un.Tel_Number,mc.Mode,tc.Type "+
                        "from UserDetail as ud,UserNumber as un,ModeOfConnection as mc,TypeofConnection as tc,UserConnection as uc"+
                        " where ud.User_Id=un.User_Id and mc.Mode_Id=uc.Mode_Id and tc.Type_Id=uc.Type_Id and un.Tel_Id=uc.Tel_Id and ud."+serchby1+"='"+jTextField1.getText()+"'");
                }
                try{
                    rs=cn.st.executeQuery(str);
                }
                catch(Exception e)
                {}
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                TableColumnName();
                TableSize();

            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        upUsr = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        regUsr = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        report = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        reload = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search");
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(790, 500));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(790, 500));

        jPanel2.setMaximumSize(new java.awt.Dimension(790, 500));
        jPanel2.setMinimumSize(new java.awt.Dimension(790, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(790, 500));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 119));
        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/Header.png"))); // NOI18N
        jPanel1.add(jLabel3, "card2");

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 119);

        upUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/Update.png"))); // NOI18N
        upUsr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upUsr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                upUsrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                upUsrMouseExited(evt);
            }
        });
        upUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upUsrActionPerformed(evt);
            }
        });
        jPanel2.add(upUsr);
        upUsr.setBounds(472, 421, 150, 40);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/logout.png"))); // NOI18N
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout);
        logout.setBounds(10, 421, 90, 40);

        regUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/register.png"))); // NOI18N
        regUsr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regUsr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regUsrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regUsrMouseExited(evt);
            }
        });
        regUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regUsrActionPerformed(evt);
            }
        });
        jPanel2.add(regUsr);
        regUsr.setBounds(171, 421, 150, 40);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/exit.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit);
        exit.setBounds(691, 421, 90, 40);

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

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 140, 582, 248);

        report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/report.png"))); // NOI18N
        report.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportMouseExited(evt);
            }
        });
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        jPanel2.add(report);
        report.setBounds(353, 421, 85, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "City", "PhoneNumber" }));
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(598, 160, 183, 29);

        reload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/reload.png"))); // NOI18N
        reload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reloadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reloadMouseExited(evt);
            }
        });
        reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadActionPerformed(evt);
            }
        });
        jPanel2.add(reload);
        reload.setBounds(657, 320, 85, 40);

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/searchh.png"))); // NOI18N
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search);
        search.setBounds(657, 251, 85, 40);

        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });
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
        jPanel2.add(jTextField1);
        jTextField1.setBounds(598, 195, 183, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search By:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(598, 140, 183, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(598, 230, 183, 15);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/Background.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void upUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upUsrActionPerformed
        if(jTable1.getSelectedRow()>=0)
        {
            String id="";
            try
            {
                int row;
                row=jTable1.getSelectedRow();
                if(jTable1.getRowSelectionAllowed())
                {
                    id=String.valueOf(jTable1.getValueAt(row,0).toString());
                }
            }
            catch(Exception q)
            {
                JOptionPane.showMessageDialog(this,q);
            }
            new registeration(true,id).setVisible(true);
            this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No Data Selected!");
        }
    }//GEN-LAST:event_upUsrActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new loginform().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void regUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regUsrActionPerformed
        new registeration(false,"").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regUsrActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        searchres();
    }//GEN-LAST:event_searchActionPerformed

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate

    }//GEN-LAST:event_jTextField1CaretUpdate

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

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost

    }//GEN-LAST:event_jTable1FocusLost

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            searchres();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadActionPerformed
        LoadTable();
        jTextField1.setText("");
    }//GEN-LAST:event_reloadActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        report r=new report();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_reportActionPerformed

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\logouth.png");
            logout.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\logout.png");
            logout.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_logoutMouseExited

    private void regUsrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regUsrMouseEntered
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\registerh.png");
            regUsr.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_regUsrMouseEntered

    private void regUsrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regUsrMouseExited
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\register.png");
            regUsr.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_regUsrMouseExited

    private void reportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseEntered
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\reporth.png");
            report.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_reportMouseEntered

    private void reportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseExited
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\report.png");
            report.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_reportMouseExited

    private void upUsrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upUsrMouseEntered
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\Updateh.png");
            upUsr.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_upUsrMouseEntered

    private void upUsrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upUsrMouseExited
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\Update.png");
            upUsr.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_upUsrMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\exith.png");
            exit.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\exit.png");
            exit.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_exitMouseExited

    private void reloadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reloadMouseEntered
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\reloadh.png");
            reload.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_reloadMouseEntered

    private void reloadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reloadMouseExited
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\reload.png");
            reload.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_reloadMouseExited

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\searchhh.png");
            search.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\searchh.png");
            search.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_searchMouseExited
    
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
                new search().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logout;
    private javax.swing.JButton regUsr;
    private javax.swing.JButton reload;
    private javax.swing.JButton report;
    private javax.swing.JButton search;
    private javax.swing.JButton upUsr;
    // End of variables declaration//GEN-END:variables
}
