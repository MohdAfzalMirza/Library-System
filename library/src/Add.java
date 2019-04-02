import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Add extends javax.swing.JFrame {

   
    public Add() {
        initComponents();
        setLocationRelativeTo(null);
    }
 public void close()
    {
    WindowEvent wn = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wn);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t5 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        c6 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        c8 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        c4 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Add Student"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 560, 120, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(300, 560, 110, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel1.setText("Student ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 40, 70, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 80, 68, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 120, 80, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel4.setText("Gender");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 170, 60, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel5.setText("Address");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 220, 60, 20);
        jPanel1.add(t1);
        t1.setBounds(200, 40, 170, 20);

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel1.add(t3);
        t3.setBounds(200, 120, 170, 20);
        jPanel1.add(t2);
        t2.setBounds(200, 80, 170, 20);

        t5.setColumns(20);
        t5.setRows(5);
        jScrollPane1.setViewportView(t5);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(200, 230, 170, 100);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel6.setText("Year");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 350, 50, 17);

        c6.setFont(c6.getFont().deriveFont(c6.getFont().getSize()+1f));
        c6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th" }));
        jPanel1.add(c6);
        c6.setBounds(200, 350, 60, 21);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel7.setText("E.mail Add.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 410, 90, 17);
        jPanel1.add(t7);
        t7.setBounds(200, 410, 170, 20);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel8.setText("Course");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 450, 60, 20);

        c8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diploma", "B.tech", "M.tech", "B.C.A", "M.C.A" }));
        jPanel1.add(c8);
        c8.setBounds(200, 450, 110, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel9.setText("Contact no.");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 500, 90, 17);

        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });
        jPanel1.add(t9);
        t9.setBounds(200, 500, 170, 20);

        c4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(c4);
        c4.setBounds(200, 170, 120, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           close();
           Student d= new Student();
           d.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
       
}//GEN-LAST:event_t3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String str1=t1.getText();
			String str2= t2.getText();
            String str3 = t3.getText();
			String str4 = (String)c4.getSelectedItem();
            String str5 = t5.getText();
			String str6 = (String)c6.getSelectedItem();
            String str7 = t7.getText();
			String str8 = (String)c8.getSelectedItem();
            String str9 = t9.getText();


            try
            {
           Class.forName("com.mysql.jdbc.Driver");
           String Url = "jdbc:mysql://localhost/library?"+"user=root&password=pass";
           Connection con = DriverManager.getConnection(Url);

           PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?);");
           pst.setString(1, str1);
           pst.setString(2,str2);
           pst.setString(3,str3);
           pst.setString(4,str4);
           pst.setString(5, str5);
           pst.setString(6,str6);
           pst.setString(7,str7);
           pst.setString(8,str8);
           pst.setString(9,str9);


           pst.executeUpdate();
           JOptionPane.showMessageDialog(this,"Student added successfully..");
           close();
           JF2 d= new JF2();
           d.setVisible(true);
            }
            catch(Exception e)
            {
                System.out.println("Failed.."+e);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox c4;
    private javax.swing.JComboBox c6;
    private javax.swing.JComboBox c8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextArea t5;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t9;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
