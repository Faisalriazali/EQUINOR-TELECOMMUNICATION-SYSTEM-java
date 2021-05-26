
package telephoneconnection;

import java.sql.ResultSet;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

public class registeration extends javax.swing.JFrame {

    connection cn= new connection();
    ResultSet rs;
    int auto_id;
    String Icon;
    String Title;
    int ID1;
    public registeration(boolean get,String ID) {
        initComponents();
        cn.call();
        LoadComboBox();
        if(!ID.equals("")){
            ID1=Integer.valueOf(ID);
            UpdateOrInsert(get,ID1);
        }
        else{
            Update.setEnabled(get);
            Insert.setEnabled(!get);
            Icon="AddUser";
            Title="Register New User";
        }
        DoConnect();
    }
    
    private void DoConnect()
    {
        SetIcon();
    }
    
    private void UpdateOrInsert(boolean get,int ID)
    {
        if(get){
            
            Update.setEnabled(get);
            Insert.setEnabled(!get);
            
            Icon="UpdateUser";
            Title="Update Existing User";
            
            try
            {
                String str=("select ud.User_Id,ud.Name,ud.FatherName,ud.Address,ud.City,un.Tel_Number,mc.Mode,mc.Mode_Id,tc.Type,tc.Type_Id "+
                                "from UserDetail as ud,UserNumber as un,ModeOfConnection as mc,TypeofConnection as tc,UserConnection as uc"+
                                " where ud.User_Id=un.User_Id and mc.Mode_Id=uc.Mode_Id and tc.Type_Id=uc.Type_Id and un.Tel_Id=uc.Tel_Id and ud.User_Id='"+ID+"'");
                rs=cn.st.executeQuery(str);
                if(rs.next())
                txtname.setText(rs.getString("Name"));
                txtfathername.setText(rs.getString("FatherName"));
                txtAdress.setText(rs.getString("Address"));
                txtcity.setText(rs.getString("City"));
                Number.setText(rs.getString("Tel_Number"));
                cmbmode.setSelectedIndex(rs.getInt("Mode_Id")-1);
                cmbtype.setSelectedIndex(rs.getInt("Type_Id")-1);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }
    private void SetIcon()
    {
        setTitle(Title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("..\\src\\telephoneconnection\\"+Icon+".png").getImage());
        setSize(400,400);
        setVisible(true);
    }
    private void LoadComboBox()
    {
        try 
        {
            String q="select * from ModeOfConnection";
            rs=cn.st.executeQuery(q);
            cmbmode.removeAllItems();
            while(rs.next())
            {
                cmbmode.addItem(rs.getString("Mode"));
            }

            String q1="select * from TypeOfConnection";
            rs=cn.st.executeQuery(q1);
            cmbtype.removeAllItems();
            while(rs.next())
            {
                cmbtype.addItem(rs.getString("Type"));
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        Insert = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtfathername = new javax.swing.JTextField();
        Number = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        cmbmode = new javax.swing.JComboBox();
        cmbtype = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        FatherName = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        City = new javax.swing.JLabel();
        PhoneNumber = new javax.swing.JLabel();
        PhoneNumber1 = new javax.swing.JLabel();

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

        Insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/insertt.png"))); // NOI18N
        Insert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InsertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InsertMouseExited(evt);
            }
        });
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        jPanel1.add(Insert);
        Insert.setBounds(430, 421, 150, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/Header.png"))); // NOI18N
        jPanel2.add(jLabel1, "card2");

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 119);

        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/updatee.png"))); // NOI18N
        Update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateMouseExited(evt);
            }
        });
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update);
        Update.setBounds(220, 421, 150, 40);

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

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("  Name");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(60, 149, 245, 22);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("  FatherName");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(323, 149, 245, 22);

        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });
        jPanel1.add(txtname);
        txtname.setBounds(60, 177, 245, 29);

        txtfathername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfathernameFocusLost(evt);
            }
        });
        jPanel1.add(txtfathername);
        txtfathername.setBounds(323, 177, 245, 29);

        Number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NumberFocusLost(evt);
            }
        });
        jPanel1.add(Number);
        Number.setBounds(60, 263, 245, 29);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("  Phone Nnumber");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(60, 234, 245, 23);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("  City");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(323, 234, 245, 22);

        txtcity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcityFocusLost(evt);
            }
        });
        jPanel1.add(txtcity);
        txtcity.setBounds(323, 263, 245, 29);

        cmbmode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmodeActionPerformed(evt);
            }
        });
        jPanel1.add(cmbmode);
        cmbmode.setBounds(586, 177, 153, 29);

        cmbtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtypeActionPerformed(evt);
            }
        });
        jPanel1.add(cmbtype);
        cmbtype.setBounds(586, 263, 153, 29);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("  Mode Of Connection");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(586, 149, 153, 22);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("  Type Of Connection");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(586, 234, 153, 23);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("  Address");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(60, 320, 98, 29);
        jPanel1.add(txtAdress);
        txtAdress.setBounds(162, 320, 406, 29);

        Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(Name);
        Name.setBounds(60, 212, 245, 15);

        FatherName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FatherName.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(FatherName);
        FatherName.setBounds(323, 212, 245, 15);

        Address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(Address);
        Address.setBounds(586, 320, 153, 30);

        City.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        City.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(City);
        City.setBounds(323, 298, 245, 15);

        PhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PhoneNumber.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(PhoneNumber);
        PhoneNumber.setBounds(60, 298, 245, 15);

        PhoneNumber1.setForeground(new java.awt.Color(255, 51, 51));
        PhoneNumber1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PhoneNumber1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephoneconnection/Background.png"))); // NOI18N
        jPanel1.add(PhoneNumber1);
        PhoneNumber1.setBounds(0, 0, 800, 500);

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

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        if(txtname.getText().trim().equals("") || txtfathername.getText().trim().equals("") || txtAdress.getText().trim().equals("")||txtcity.getText().trim().equals(""))
        { 
            JOptionPane.showMessageDialog(this, "Fill All Fields!");
        }
        else
        {
            int check=0;
            
            Validation v=new Validation();
            
            if(v.valid("[a-zA-Z]{3,20}",txtname.getText()))
            {
                Name.setText("");
            }
            else
            {
                Name.setText("InValid!");
                check=1;
            }
            if(v.valid("[a-zA-Z]{3,20}",txtfathername.getText()))
            {
                FatherName.setText("");
            }
            else
            {
                FatherName.setText("InValid!");
                check=1;
            }
            if(v.valid("[a-zA-Z]{3,20}",txtcity.getText()))
            {
                City.setText("");
            }
            else
            {
                City.setText("InValid!");
                check=1;
            }
            if(v.valid("[0-9]{11,15}",Number.getText()))
            {
                PhoneNumber.setText("");
            }
            else
            {
                PhoneNumber.setText("InValid!");
                check=1;
            }
            
            if(check==0)
            {
                try
                {
                    String ch="select Tel_Number from UserNumber where Tel_Number='"+Number.getText()+"'";
                    rs=cn.st.executeQuery(ch);
                    if(!rs.next())
                    {
                    //   user all registeretion informati0n 
                        String r=("insert into UserDetail  values('"+txtname.getText()+"','"+txtfathername.getText()+"','"+txtAdress.getText()+"','"+txtcity.getText()+"')");
                        cn.st.executeUpdate(r);

                    // get id of User Detail 
                        String suid="select User_Id from UserDetail order by User_Id desc";
                        rs=cn.st.executeQuery(suid);
                        rs.next();
                        String uid=rs.getString("User_Id");
                    // user phone number
                        String num=Number.getText();
                        String q1=("insert into UserNumber values('"+num+"','"+uid+"')");
                        cn.st.executeUpdate(q1);

                    // get id of telephone number
                        String sutid="select Tel_Id from UserNumber order by Tel_Id desc";
                        rs=cn.st.executeQuery(sutid);
                        rs.next();
                        String utid=rs.getString("Tel_Id");
                    // get mode id for user selected mode
                        String modid="select Mode_Id  from ModeOfConnection where Mode='"+cmbmode.getSelectedItem().toString()+"' order by Mode_Id desc";
                        rs=cn.st.executeQuery(modid);
                        rs.next();
                        String umid=rs.getString("Mode_Id");
                    // get type id for user selected type
                        String typeid="select Type_Id  from TypeOfConnection where Type='"+cmbtype.getSelectedItem().toString()+"' order by Type_Id desc";
                        rs=cn.st.executeQuery(typeid);
                        rs.next();
                        String typeids=rs.getString("Type_Id");
                    // insert userconnection
                        String q2="insert into UserConnection values("+umid+","+typeids+","+utid+")";
                        cn.st.executeUpdate(q2);

                        txtname.setText("");
                        txtfathername.setText("");
                        txtAdress.setText("");
                        txtcity.setText("");
                        Number.setText("");
                        cmbmode.setSelectedIndex(0);
                        cmbtype.setSelectedIndex(0);

                        JOptionPane.showMessageDialog(this, "Inserted!");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Phone Number already in use!");
                    }
                }
                catch(Exception f)
                {
                    JOptionPane.showMessageDialog(this, f);
                }
            }
        }
    }//GEN-LAST:event_InsertActionPerformed

    private void cmbmodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmodeActionPerformed

    private void cmbtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbtypeActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        if(txtname.getText().trim().equals("") || txtfathername.getText().trim().equals("") || txtAdress.getText().trim().equals("")||txtcity.getText().trim().equals(""))
        { 
            JOptionPane.showMessageDialog(this, "Fill All Fields..");
        }
        else
        {
            int check=0;
            
            Validation v=new Validation();
            
            if(v.valid("[a-zA-Z]{3,20}",txtname.getText()))
            {
                Name.setText("");
            }
            else
            {
                Name.setText("InValid!");
                check=1;
            }
            if(v.valid("[a-zA-Z]{3,20}",txtfathername.getText()))
            {
                FatherName.setText("");
            }
            else
            {
                FatherName.setText("InValid!");
                check=1;
            }
            if(v.valid("[a-zA-Z]{3,20}",txtcity.getText()))
            {
                City.setText("");
            }
            else
            {
                City.setText("InValid!");
                check=1;
            }
            if(v.valid("[0-9]{11,15}",Number.getText()))
            {
                PhoneNumber.setText("");
            }
            else
            {
                PhoneNumber.setText("InValid!");
                check=1;
            }
            
            if(check==0)
            {
                try
                {
                //   user all registeretion informati0n 
                    String r=("update UserDetail set Name='"+txtname.getText()+"', FatherName='"+txtfathername.getText()+"', Address='"+txtAdress.getText()+"', City='"+txtcity.getText()+"' where User_ID="+ID1);
                    cn.st.executeUpdate(r);
     
                // user phone number
                    String q1=("update UserNumber set Tel_Number='"+Number.getText().toString()+"' where User_ID="+ID1);
                    cn.st.executeUpdate(q1);
                        
                // get id of telephone number
                    String sutid="select Tel_Id from UserNumber where User_ID="+ID1;
                    rs=cn.st.executeQuery(sutid);
                    rs.next();
                    String utid=rs.getString("Tel_Id");
                // get mode id for user selected mode
                    String modid="select Mode_Id  from ModeOfConnection where Mode='"+cmbmode.getSelectedItem().toString()+"'";
                    rs=cn.st.executeQuery(modid);
                    rs.next();
                    String umid=rs.getString("Mode_Id");
                // get type id for user selected type
                    String typeid="select Type_Id  from TypeOfConnection where Type='"+cmbtype.getSelectedItem().toString()+"'";
                    rs=cn.st.executeQuery(typeid);
                    rs.next();
                    String typeids=rs.getString("Type_Id");
                // insert userconnection
                    String q2="update UserConnection set Mode_Id="+umid+", Type_Id="+typeids+" where Tel_Id="+utid;
                    cn.st.executeUpdate(q2);
                    
                    txtname.setText("");
                    txtfathername.setText("");
                    txtAdress.setText("");
                    txtcity.setText("");
                    Number.setText("");
                    cmbmode.setSelectedIndex(0);
                    cmbtype.setSelectedIndex(0);
                    
                    Update.setEnabled(false);
                    Insert.setEnabled(true);
                    Icon="AddUser";
                    Title="Register New User";
                    SetIcon();
                    
                    JOptionPane.showMessageDialog(this, "Updated!");
                }
                catch(Exception f)
                {
                    JOptionPane.showMessageDialog(this, f);
                }
            }
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        new loginform().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogOutActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new search().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
        StringTokenizer st = new StringTokenizer(txtname.getText());
        while (st.hasMoreTokens()) 
        {
            String pal = st.nextToken();
            String up = pal.toUpperCase();
            char first = up.charAt(0);
            CharSequence gur= pal.subSequence(1, pal.length());
            txtname.setText(first+String.valueOf(gur));
        }
    }//GEN-LAST:event_txtnameFocusLost

    private void txtfathernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfathernameFocusLost
        StringTokenizer st = new StringTokenizer(txtfathername.getText());
        while (st.hasMoreTokens()) 
        {
            String pal = st.nextToken();
            String up = pal.toUpperCase();
            char first = up.charAt(0);
            CharSequence gur= pal.subSequence(1, pal.length());
            txtfathername.setText(first+String.valueOf(gur));
        }
    }//GEN-LAST:event_txtfathernameFocusLost

    private void NumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NumberFocusLost
        StringTokenizer st = new StringTokenizer(Number.getText());
        while (st.hasMoreTokens()) 
        {
            String pal = st.nextToken();
            String up = pal.toUpperCase();
            char first = up.charAt(0);
            CharSequence gur= pal.subSequence(1, pal.length());
            Number.setText(first+String.valueOf(gur));
        }
    }//GEN-LAST:event_NumberFocusLost

    private void txtcityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcityFocusLost
        StringTokenizer st = new StringTokenizer(txtcity.getText());
        while (st.hasMoreTokens()) 
        {
            String pal = st.nextToken();
            String up = pal.toUpperCase();
            char first = up.charAt(0);
            CharSequence gur= pal.subSequence(1, pal.length());
            txtcity.setText(first+String.valueOf(gur));
        }
    }//GEN-LAST:event_txtcityFocusLost

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

    private void UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseEntered
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\updateeh.png");
            Update.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_UpdateMouseEntered

    private void UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseExited
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\updatee.png");
            Update.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_UpdateMouseExited

    private void InsertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertMouseEntered
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\insertth.png");
            Insert.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_InsertMouseEntered

    private void InsertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertMouseExited
        try 
        {
            ImageIcon icon = new ImageIcon("..\\src\\telephoneconnection\\insertt.png");
            Insert.setIcon(icon);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_InsertMouseExited

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JButton Back;
    private javax.swing.JLabel City;
    private javax.swing.JLabel FatherName;
    private javax.swing.JButton Insert;
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField Number;
    private javax.swing.JLabel PhoneNumber;
    private javax.swing.JLabel PhoneNumber1;
    private javax.swing.JButton Update;
    private javax.swing.JComboBox cmbmode;
    private javax.swing.JComboBox cmbtype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtfathername;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
