
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ammr6
 */
public class FarmerIntro extends javax.swing.JFrame {

    private Component FarmerIntro1;
    Connection con;
    static String F_C="";
    /**
     * Creates new form FarmerIntro
     */
    public FarmerIntro(String F_C) {
        initComponents();
        this.F_C=F_C;
        try {
            DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
            String url = "jdbc:oracle:thin:@//localhost:1521/orcl";
            con= DriverManager.getConnection (url, "myfarmproj", "654321");
        } catch (SQLException ex) {
            Logger.getLogger(FarmerIntro.class.getName()).log(Level.SEVERE, null, ex);
        }
       // String Str="<html><u>لدي حسـاب بـالفعل</u></html>";
       // jLabel12.setText(Str);
        setSize(1076, 641);
        this.setLocationRelativeTo(FarmerIntro1);
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
        jLabel13 = new javax.swing.JLabel();
        StreetTextFiled = new javax.swing.JTextField();
        FnameTextFiled = new javax.swing.JTextField();
        EmailTextFeild = new javax.swing.JTextField();
        LnameTextField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        phoneTextField = new javax.swing.JTextField();
        TellTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        jLabel14 = new javax.swing.JLabel();
        BackLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1076, 641));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 188, 162));
        jPanel1.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setText("X");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1040, 0, 30, 44);

        StreetTextFiled.setFont(new java.awt.Font("Sakkal Majalla", 0, 18)); // NOI18N
        StreetTextFiled.setForeground(new java.awt.Color(181, 181, 181));
        StreetTextFiled.setText("Feisal St.");
        StreetTextFiled.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StreetTextFiledMouseClicked(evt);
            }
        });
        jPanel1.add(StreetTextFiled);
        StreetTextFiled.setBounds(370, 250, 130, 40);

        FnameTextFiled.setFont(new java.awt.Font("Sakkal Majalla", 0, 18)); // NOI18N
        FnameTextFiled.setForeground(new java.awt.Color(181, 181, 181));
        FnameTextFiled.setText("Amr");
        FnameTextFiled.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FnameTextFiledMouseClicked(evt);
            }
        });
        FnameTextFiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameTextFiledActionPerformed(evt);
            }
        });
        jPanel1.add(FnameTextFiled);
        FnameTextFiled.setBounds(150, 150, 120, 40);

        EmailTextFeild.setFont(new java.awt.Font("Sakkal Majalla", 0, 18)); // NOI18N
        EmailTextFeild.setForeground(new java.awt.Color(181, 181, 181));
        EmailTextFeild.setText("example@something.com");
        EmailTextFeild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailTextFeildMouseClicked(evt);
            }
        });
        jPanel1.add(EmailTextFeild);
        EmailTextFeild.setBounds(150, 200, 350, 40);

        LnameTextField.setFont(new java.awt.Font("Sakkal Majalla", 0, 18)); // NOI18N
        LnameTextField.setForeground(new java.awt.Color(181, 181, 181));
        LnameTextField.setText("Nabeel");
        LnameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LnameTextFieldMouseClicked(evt);
            }
        });
        LnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(LnameTextField);
        LnameTextField.setBounds(380, 150, 120, 40);

        jComboBox1.setFont(new java.awt.Font("Arabic Typesetting", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nablus", "Hebron", "Jurosalem", "beathlehem", "Jenin", "Khan Younes", "Ramallah & Berih", "Rafah", "Selfeet", "South Gaza", "Tubas", "Tulkarem", "Gaza", "Qalqilya", "Jericho" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(150, 250, 120, 40);

        phoneTextField.setFont(new java.awt.Font("Sakkal Majalla", 0, 18)); // NOI18N
        phoneTextField.setForeground(new java.awt.Color(181, 181, 181));
        phoneTextField.setText("0590000000");
        phoneTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneTextFieldMouseClicked(evt);
            }
        });
        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(phoneTextField);
        phoneTextField.setBounds(150, 300, 350, 40);

        TellTextField.setFont(new java.awt.Font("Sakkal Majalla", 0, 18)); // NOI18N
        TellTextField.setForeground(new java.awt.Color(181, 181, 181));
        TellTextField.setText("2300000");
        TellTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TellTextFieldMouseClicked(evt);
            }
        });
        TellTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TellTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(TellTextField);
        TellTextField.setBounds(220, 350, 280, 40);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(70, 510, 430, 10);

        jLabel2.setFont(new java.awt.Font("Arabic Typesetting", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 119, 68));
        jLabel2.setText("First name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 150, 110, 40);

        jLabel3.setFont(new java.awt.Font("Arabic Typesetting", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 119, 68));
        jLabel3.setText("Last name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 150, 130, 40);

        jLabel4.setFont(new java.awt.Font("Arabic Typesetting", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 119, 68));
        jLabel4.setText("E-mail :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 200, 110, 40);

        jLabel5.setFont(new java.awt.Font("Arabic Typesetting", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 119, 68));
        jLabel5.setText("City :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 250, 110, 40);

        jLabel6.setFont(new java.awt.Font("Arabic Typesetting", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 119, 68));
        jLabel6.setText("Street :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 250, 90, 40);

        jLabel7.setFont(new java.awt.Font("Arabic Typesetting", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 119, 68));
        jLabel7.setText("Cell-phone:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 300, 110, 40);

        jLabel8.setFont(new java.awt.Font("Arabic Typesetting", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 119, 68));
        jLabel8.setText("Tel-phone:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 350, 110, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_DataBase-small-final.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(230, 10, 150, 130);

        jComboBox2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09", "02", "04", "08" }));
        jComboBox2.setEnabled(false);
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(150, 350, 60, 40);

        jPasswordField1.setForeground(new java.awt.Color(181, 181, 181));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(150, 400, 350, 40);

        jPasswordField2.setForeground(new java.awt.Color(181, 181, 181));
        jPasswordField2.setText("jPasswordField2");
        jPasswordField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField2MouseClicked(evt);
            }
        });
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(150, 450, 350, 40);

        jLabel10.setFont(new java.awt.Font("Arabic Typesetting", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 119, 68));
        jLabel10.setText("Password:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 400, 100, 40);

        jLabel11.setFont(new java.awt.Font("Arabic Typesetting", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 119, 68));
        jLabel11.setText("Repeat ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 450, 90, 20);

        button1.setBackground(new java.awt.Color(51, 119, 68));
        button1.setFont(new java.awt.Font("Sakkal Majalla", 1, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(249, 246, 242));
        button1.setLabel("Cancel");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1);
        button1.setBounds(300, 530, 130, 40);

        button2.setBackground(new java.awt.Color(51, 119, 68));
        button2.setFont(new java.awt.Font("Sakkal Majalla", 1, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(249, 246, 242));
        button2.setLabel("Sign up");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2);
        button2.setBounds(110, 530, 130, 40);

        jLabel14.setFont(new java.awt.Font("Arabic Typesetting", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 119, 68));
        jLabel14.setText("Password :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(40, 470, 100, 20);

        BackLabel.setFont(new java.awt.Font("Sakkal Majalla", 1, 24)); // NOI18N
        BackLabel.setForeground(new java.awt.Color(51, 119, 68));
        BackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back_25px.png"))); // NOI18N
        BackLabel.setText("Back");
        BackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLabelMouseClicked(evt);
            }
        });
        jPanel1.add(BackLabel);
        BackLabel.setBounds(10, 10, 100, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digital_crop.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(560, 0, 520, 640);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Farmland-Agriculture-Farm-Field-Cropland-1867212.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(560, 0, 520, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1076, 641);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        //Nablus, Hebron, Jurosalem, beathlehem, Jenin, Khan Younes, Ramallah & Berih, Rafah, Selfeet, South Gaza, Tubas, Tulkarem, Gaza, Qalqilya
        String CityComboString=jComboBox1.getSelectedItem().toString();
        if(CityComboString.equals("Nablus")||CityComboString.equals("Tubas")||CityComboString.equals("Tulkarem")||CityComboString.equals("Qalqilya")||CityComboString.equals("Selfeet")){
            jComboBox2.setSelectedItem("09");
        }
        if(CityComboString.equals("Ramallah & Berih")||CityComboString.equals("Jericho")||CityComboString.equals("Jurosalem")||CityComboString.equals("beathlehem")||CityComboString.equals("Hebron")){
            jComboBox2.setSelectedItem("02");
        }
        if(CityComboString.equals("Jenin")){
            jComboBox2.setSelectedItem("04");
        }
        if(CityComboString.equals("Khan Younes")||CityComboString.equals("Rafah")||CityComboString.equals("South Gaza")||CityComboString.equals("Gaza")){
            jComboBox2.setSelectedItem("08");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void FnameTextFiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameTextFiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameTextFiledActionPerformed

    private void LnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnameTextFieldActionPerformed

    private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextFieldActionPerformed

    private void TellTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TellTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TellTextFieldActionPerformed

    private void FnameTextFiledMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FnameTextFiledMouseClicked
        // TODO add your handling code here:
       if(FnameTextFiled.getText().equals("Amr"))
          FnameTextFiled.setText("");
          FnameTextFiled.setForeground(Color.BLACK);
    }//GEN-LAST:event_FnameTextFiledMouseClicked

    private void LnameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LnameTextFieldMouseClicked
        // TODO add your handling code here:
        if(LnameTextField.getText().equals("Nabeel"))
           LnameTextField.setText("");
           LnameTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_LnameTextFieldMouseClicked

    private void EmailTextFeildMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailTextFeildMouseClicked
        // TODO add your handling code here:
        if(EmailTextFeild.getText().equals("example@something.com"))
           EmailTextFeild.setText("");
           EmailTextFeild.setForeground(Color.BLACK);
    }//GEN-LAST:event_EmailTextFeildMouseClicked

    private void StreetTextFiledMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StreetTextFiledMouseClicked
        // TODO add your handling code here:
         if(StreetTextFiled.getText().equals("Feisal St."))
            StreetTextFiled.setText("");
            StreetTextFiled.setForeground(Color.BLACK);
    }//GEN-LAST:event_StreetTextFiledMouseClicked

    private void phoneTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneTextFieldMouseClicked
        // TODO add your handling code here:
        if(phoneTextField.getText().equals("0590000000"))
           phoneTextField.setText("");
           phoneTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_phoneTextFieldMouseClicked

    private void TellTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TellTextFieldMouseClicked
        // TODO add your handling code here:
        if(TellTextField.getText().equals("2300000"))
           TellTextField.setText("");
           TellTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_TellTextFieldMouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        // TODO add your handling code here:
        if(new String(jPasswordField1.getPassword()).equals("jPasswordField1"))
           jPasswordField1.setText("");
           jPasswordField1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jPasswordField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField2MouseClicked
        // TODO add your handling code here:
        if(new String(jPasswordField2.getPassword()).equals("jPasswordField2"))
           jPasswordField2.setText("");
           jPasswordField2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jPasswordField2MouseClicked

    private void BackLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLabelMouseClicked
        // TODO add your handling code here:
        new FarmerIntro1("").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackLabelMouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        new Entro().setVisible(true);
        this.setVisible(false);
       /*try{
        Statement stmt = con.createStatement();
            String n;
            {
               n= "delete from client where first_name='nabeel'";
            stmt.executeUpdate(n);
         
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(null,"The account was deleted succssfuly"); 
            }
         } catch (SQLException ex) {
          // JOptionPane.showMessageDialog(null,ex.toString()); 
            Logger.getLogger(FarmerIntro.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        
        //JOptionPane.shovMessageDialog(null, ex.toString ());
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
         try {
              Statement stmt = con.createStatement();
              String n, m;

              if (FnameTextFiled.getText().equals("Amr")|LnameTextField.getText().equals("Nabeel")|
                  EmailTextFeild.getText().equals("example@something.com") | 
                  StreetTextFiled.getText().equals("Feisal St.")| TellTextField.getText().equals("2300000")|
                  phoneTextField.getText().equals("0590000000")|(new String(jPasswordField1.getPassword())).equals("jPasswordField1")|
                  new String(jPasswordField2.getPassword()).equals("jPasswordField2")
                  |FnameTextFiled.getText().equals("")|LnameTextField.getText().equals("")|
                  EmailTextFeild.getText().equals("") | 
                  StreetTextFiled.getText().equals("")| TellTextField.getText().equals("")|
                  phoneTextField.getText().equals("")|(new String(jPasswordField1.getPassword())).equals("")|
                  new String(jPasswordField2.getPassword()).equals(""))
                  JOptionPane.showMessageDialog(null,"There is an empty fieldes");

              
              else if (F_C.equals("customer")){
                       ResultSet rs= stmt.executeQuery("select c_email from client where c_email='"+
                                     EmailTextFeild.getText()+"'");
                       int count = 0;
                       while (rs.next()) {
                              count++;} 
                       
                        if (count!=0)
                           JOptionPane.showMessageDialog(null,"This email is exist.");
                        else if (!(new String(jPasswordField1.getPassword()).equals(new String(jPasswordField2.getPassword()))))
                                  JOptionPane.showMessageDialog(null,"The password doesn't match.");
                      else{
                           n = "insert into client values('"+FnameTextFiled.getText()+"','"+LnameTextField.getText()+
                               "','"+ EmailTextFeild.getText()+"','"+ new String(jPasswordField1.getPassword())+
                               "','"+jComboBox1.getSelectedItem()+"','"+StreetTextFiled.getText()+"',"+"c_number.nextval)";
                           m = "insert into client_number values("+phoneTextField.getText()+","+jComboBox2.getSelectedItem()+
                               ","+TellTextField.getText()+","+"c_number.currval)";
                           stmt.executeUpdate(n);
                           stmt.executeUpdate(m);
                           con.commit();
                           con.close();
                           JOptionPane.showMessageDialog(null,"The account was created successfully."); 
                           new FarmerIntro1(this.F_C).setVisible(true);
                           this.setVisible(false);
                          }
                }
              else{
                  
                   ResultSet rs= stmt.executeQuery("select f_email from farmer where f_email='"+
                                 EmailTextFeild.getText()+"'");
                   int count = 0;
                   while (rs.next()) {
                          count++;} 
                   
                   if (count!=0)
                       JOptionPane.showMessageDialog(null,"This email is exist.");
                   else if (!(new String(jPasswordField1.getPassword()).equals(new String(jPasswordField2.getPassword()))))
                       JOptionPane.showMessageDialog(null,"The password doesn't match.");
                   else{
                       try{
                        String Farmer_SSN=JOptionPane.showInputDialog("Write Your SSN");
                       
                        n = "insert into farmer values('"+FnameTextFiled.getText()+"','"+LnameTextField.getText()+
                            "','"+ EmailTextFeild.getText()+"','"+ new String(jPasswordField1.getPassword())+
                            "',"+"0"+",'"+jComboBox1.getSelectedItem()+"','"+StreetTextFiled.getText()+"',"+Farmer_SSN+","+"0,"+"0,"+"0)";
                        m = "insert into farmer_number values("+phoneTextField.getText()+","+jComboBox2.getSelectedItem()+","+
                            TellTextField.getText()+","+Farmer_SSN+")";
                        stmt.executeUpdate(n);
                        stmt.executeUpdate(m);
                        con.commit();
                        con.close();
                         JOptionPane.showMessageDialog(null,"The account was created Successfully."); 
                        new FarmerIntro1(this.F_C).setVisible(true);
                        this.setVisible(false);
                       }
                       
                       catch(java.sql.SQLIntegrityConstraintViolationException e){
                            JOptionPane.showMessageDialog(null,"This ssn is exist."); 

                       }
                       
                       } 
               }
              
             /*   "update farmer " + 
                                "set f_email ='"+j.getText()+"' "+
                                ",f_password='"+new String(p.getPassword())+
                                ", city='"+c.getText()+"'"+
                                ", street ='"+ s.getText "'"+
                                 ", first_name ='"+ s.getText "'"+
                                 ", last_name ='"+ s.getText "'"+ */
         }
         catch (SQLException ex) {
            Logger.getLogger(FarmerIntro.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_button2ActionPerformed

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel13MousePressed

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
            java.util.logging.Logger.getLogger(FarmerIntro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FarmerIntro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FarmerIntro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FarmerIntro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FarmerIntro(F_C).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLabel;
    private javax.swing.JTextField EmailTextFeild;
    private javax.swing.JTextField FnameTextFiled;
    private javax.swing.JTextField LnameTextField;
    private javax.swing.JTextField StreetTextFiled;
    private javax.swing.JTextField TellTextField;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField phoneTextField;
    // End of variables declaration//GEN-END:variables
}
