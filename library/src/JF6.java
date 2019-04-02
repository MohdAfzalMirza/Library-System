import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class JF6 extends javax.swing.JFrame {

    /** Creates new form JF6 */
    public JF6() {
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        c1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        l1 = new javax.swing.JTextField();
        l2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        l3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        l4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("SEARCH BOOK"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16));
        jLabel1.setText("Search By:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16));
        jLabel2.setText("Search ");

        c1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Title", "Author", "ISBN" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16));
        jLabel3.setText("ISBN");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16));
        jLabel4.setText("Title");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16));
        jLabel5.setText("Author");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16));
        jLabel6.setText("Category");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(692, 692, 692))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t1)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(31, 31, 31)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                        .addGap(2, 2, 2))
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String str1 = (String)c1.getSelectedItem();
        String str2 = t1.getText();
        if(str1=="Title")
        {
                 try
                 {


                        Class.forName("com.mysql.jdbc.Driver");
                       String Url = "jdbc:mysql://localhost/library?"+"user=root&password=pass";
                       Connection con = DriverManager.getConnection(Url);
                       PreparedStatement stmt = con.prepareStatement("select * from book where Title=?");
                      stmt.setString(1,str2);
                      ResultSet rs = stmt.executeQuery();
                       while(rs.next())
                       {
                           l1.setText(rs.getString("ISBN"));
                       }


                      PreparedStatement stmt1 = con.prepareStatement("select * from book where Title=?");
                      stmt1.setString(1,str2);
                      ResultSet rs1 = stmt1.executeQuery();
                       while(rs1.next())
                       {
                           l2.setText(rs1.getString("Title"));
                       }
                       PreparedStatement stmt2 = con.prepareStatement("select * from book where Title=?");
                      stmt2.setString(1,str2);
                      ResultSet rs2 = stmt2.executeQuery();
                       while(rs2.next())
                       {
                           l3.setText(rs2.getString("Author"));
                       }
                       PreparedStatement stmt3 = con.prepareStatement("select * from book where Title=?");
                      stmt3.setString(1,str2);
                      ResultSet rs3 = stmt3.executeQuery();
                       while(rs3.next())
                       {
                           l4.setText(rs3.getString("Category"));
                       }


         }
        catch(Exception e)
        {
               JOptionPane.showMessageDialog(null,e);
        }


        }

        else if(str1=="Author")
        {
                 try
                 {


                        Class.forName("com.mysql.jdbc.Driver");
                       String Url = "jdbc:mysql://localhost/library?"+"user=root&password=pass";
                       Connection con = DriverManager.getConnection(Url);
                       PreparedStatement stmt = con.prepareStatement("select * from book where Author=?");
                      stmt.setString(1,str2);
                      ResultSet rs = stmt.executeQuery();
                       while(rs.next())
                       {
                           l1.setText(rs.getString("ISBN"));
                       }


                      PreparedStatement stmt1 = con.prepareStatement("select * from book where Author=?");
                      stmt1.setString(1,str2);
                      ResultSet rs1 = stmt1.executeQuery();
                       while(rs1.next())
                       {
                           l2.setText(rs1.getString("Title"));
                       }
                       PreparedStatement stmt2 = con.prepareStatement("select * from book where Author=?");
                      stmt2.setString(1,str2);
                      ResultSet rs2 = stmt2.executeQuery();
                       while(rs2.next())
                       {
                           l3.setText(rs2.getString("Author"));
                       }
                       PreparedStatement stmt3 = con.prepareStatement("select * from book where Author=?");
                      stmt3.setString(1,str2);
                      ResultSet rs3 = stmt3.executeQuery();
                       while(rs3.next())
                       {
                           l4.setText(rs3.getString("Category"));
                       }


         }
        catch(Exception e)
        {
               JOptionPane.showMessageDialog(null,e);
        }


        }


        else if(str1=="ISBN")
        {
                 try
                 {


                        Class.forName("com.mysql.jdbc.Driver");
                       String Url = "jdbc:mysql://localhost/library?"+"user=root&password=pass";
                       Connection con = DriverManager.getConnection(Url);
                       PreparedStatement stmt = con.prepareStatement("select * from book where ISBN=?");
                      stmt.setString(1,str2);
                      ResultSet rs = stmt.executeQuery();
                       while(rs.next())
                       {
                           l1.setText(rs.getString("ISBN"));
                       }


                      PreparedStatement stmt1 = con.prepareStatement("select * from book where ISBN=?");
                      stmt1.setString(1,str2);
                      ResultSet rs1 = stmt1.executeQuery();
                       while(rs1.next())
                       {
                           l2.setText(rs1.getString("Title"));
                       }
                       PreparedStatement stmt2 = con.prepareStatement("select * from book where ISBN=?");
                      stmt2.setString(1,str2);
                      ResultSet rs2 = stmt2.executeQuery();
                       while(rs2.next())
                       {
                           l3.setText(rs2.getString("Author"));
                       }
                       PreparedStatement stmt3 = con.prepareStatement("select * from book where ISBN=?");
                      stmt3.setString(1,str2);
                      ResultSet rs3 = stmt3.executeQuery();
                       while(rs3.next())
                       {
                           l4.setText(rs3.getString("Category"));
                       }


         }
        catch(Exception e)
        {
               JOptionPane.showMessageDialog(null,e);
        }


        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       close();
        JF2 af = new JF2();
        af.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_c1ActionPerformed

    private void l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_l1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField l1;
    private javax.swing.JTextField l2;
    private javax.swing.JTextField l3;
    private javax.swing.JTextField l4;
    private javax.swing.JTextField t1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
