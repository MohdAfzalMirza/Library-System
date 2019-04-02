import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Return extends javax.swing.JFrame {

    /** Creates new form Return */
    public Return() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tt1 = new javax.swing.JTextField();
        tt2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Return Book"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel2.setText("Student ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 40, 90, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel3.setText("ISBN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 80, 90, 30);
        jPanel1.add(tt1);
        tt1.setBounds(170, 50, 140, 20);

        tt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tt2ActionPerformed(evt);
            }
        });
        jPanel1.add(tt2);
        tt2.setBounds(170, 90, 140, 20);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 140, 90, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(70, 140, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      close();
        JF2 af = new JF2();
        af.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tt2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tt2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         String str1=tt1.getText();
         String str2=tt2.getText();

        close();


        try {


            Class.forName("com.mysql.jdbc.Driver");
            String Url = "jdbc:mysql://localhost/library?"+"user=root&password=pass";
            Connection con = DriverManager.getConnection(Url);

            PreparedStatement pdst = con.prepareStatement("delete from essuedbook where Stu_ID= "+str1+"and ISBN="+str2);
            pdst.executeUpdate();
            JOptionPane.showMessageDialog(this,"essuedbook record deleted successfully..");
            close();
            JF2 d= new JF2();
            d.setVisible(true);
            // Statement stmt = con.createStatement();
            //            PreparedStatement stmt = con.prepareStatement("select * from student where ID=?");
            //            // ResultSet rs = stmt.executeQuery("select * from book where ISBN=?");
            //            stmt.setString(1,str1);
            //            ResultSet rs = stmt.executeQuery();
            //
            //
            //            g.func2(rs,str1);
            //JOptionPane.showMessageDialog(this,"JF11 worked completted..");

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Return().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tt1;
    private javax.swing.JTextField tt2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
