/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author shivamawasthi
 */
public class EditLinguistic extends javax.swing.JFrame {

    /**
     * Creates new form EditLinguistic
     */
    List[] linVal = null;
    public EditLinguistic() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Triangular", "Gaussian", "Guangle" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        jTextField6.setText("jTextField6");

        jTextField7.setText("jTextField7");

        jTextField8.setText("jTextField8");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel2");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel3");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("UMF");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LMF");

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("jLabel6");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(16, 16, 16)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jComboBox1, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(jTextField3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .add(jTextField1))
                                    .add(layout.createSequentialGroup()
                                        .add(5, 5, 5)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                            .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(18, 18, 18)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jComboBox2, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jComboBox3, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(jTextField4)
                                            .add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 62, Short.MAX_VALUE)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jTextField8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                            .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 430, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(89, 89, 89)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 107, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(82, 82, 82)
                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(37, 37, 37)
                        .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 395, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(102, 102, 102)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(85, 85, 85)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(17, 17, 17)
                .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(17, 17, 17)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jLabel2)
                    .add(jLabel3))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5))
                .add(8, 8, 8)
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton2))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        int q = jComboBox1.getSelectedIndex();
        jComboBox2.removeAllItems();
       // jComboBox3.removeAllItems();
        List[] l = null;
        if(q!= -1)
        {
        l = (List[]) linVal[2].get(q);
        Iterator w = l[0].iterator();
        while(w.hasNext())
        {
            jComboBox2.addItem(w.next());
        }
        jComboBox2.setSelectedIndex(0);
        
        jTextField1.setText((String) l[1].get(0));
        
       
        jComboBox3.setSelectedIndex(0);
        
        
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        int t = jComboBox1.getSelectedIndex();
        double[] d =new double[6];
        List[] lll = null;
        if(t!= -1)
        {
        lll = (List[]) linVal[2].get(t);
        jTextField3.setText((String)jComboBox2.getSelectedItem());
        try{
        jComboBox3.setSelectedIndex(jComboBox2.getSelectedIndex());
        jTextField1.setText((String)lll[1].get(jComboBox2.getSelectedIndex()));
        String y =(String)lll[1].get(jComboBox2.getSelectedIndex());
        d = (double[]) lll[2].get(jComboBox2.getSelectedIndex());
        System.out.println((int)jComboBox2.getSelectedIndex()+"  Selected index is:"+ d[0]);
        if(y.equals("Triangular"))
        {
            jTextField5.setEnabled(true);
            jTextField8.setEnabled(true);
            jLabel1.setText("Start");
            jLabel2.setText("Peak");
            jLabel3.setText("End");
            jTextField2.setText(""+d[0]);
            jTextField4.setText(""+d[1]);
            jTextField5.setText(""+d[2]);
            jTextField6.setText(""+d[3]);
            jTextField7.setText(""+d[4]);
            jTextField8.setText(""+d[5]);
        }
        if(y.equals("Gauangle"))
        {
            jTextField5.setEnabled(true);
            jTextField8.setEnabled(true);
            jLabel1.setText("Start");
            jLabel2.setText("Center");
            jLabel3.setText("End");
            jTextField2.setText(""+d[0]);
            jTextField4.setText(""+d[1]);
            jTextField5.setText(""+d[2]);
            jTextField6.setText(""+d[3]);
            jTextField7.setText(""+d[4]);
            jTextField8.setText(""+d[5]);
        }
        if(y.equals("Gaussian"))
        {
            jLabel1.setText("Mean");
            jLabel2.setText("Spread");
            jLabel3.setText("");
            jTextField2.setText(""+d[0]);
            jTextField4.setText(""+d[1]);
            //jTextField5.setText(""+d[2]);
            jTextField5.setEnabled(false);
            jTextField6.setText(""+d[3]);
            jTextField7.setText(""+d[4]);
            //jTextField8.setText(""+d[5]);
            jTextField8.setEnabled(false);
        }
        }catch(IllegalArgumentException e)
        {
            System.out.println((String)jComboBox2.getSelectedItem());
        }catch(ArrayIndexOutOfBoundsException e )
        {
            System.out.println((int)jComboBox2.getSelectedIndex());
        }
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        
       // jTextField1.setText((String)jComboBox3.getSelectedItem());
        String y =(String)jComboBox3.getSelectedItem();
        if(jComboBox3.getSelectedIndex()!= -1)
        {
        if(y.equals("Triangular"))
        {
            jTextField5.setEnabled(true);
            jTextField8.setEnabled(true);
            jLabel1.setText("Start");
            jLabel2.setText("Peak");
            jLabel3.setText("End");
            jTextField2.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
        }
        if(y.equals("Gauangle"))
        {
            jTextField5.setEnabled(true);
            jTextField8.setEnabled(true);
            jLabel1.setText("Start");
            jLabel2.setText("Center");
            jLabel3.setText("End");
            jTextField2.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
        }
        if(y.equals("Gaussian"))
        {
            jLabel1.setText("Mean");
            jLabel2.setText("Spread");
            jLabel3.setText("");
            jTextField2.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField5.setEnabled(false);
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField8.setEnabled(false);
        }
        }
        
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(!"".equals(jTextField3.getText()))
        {
            jLabel6.setText(" ");
            if(!"".equals(jTextField1.getText()))
            { 
                try{
                jLabel6.setText(" ");
                if(!"".equals(jTextField2.getText()))
            {
                jLabel6.setText(" ");
                if(!"".equals(jTextField4.getText()))
            {
                jLabel6.setText(" ");
                if(!"".equals(jTextField5.getText()))
            {
                jLabel6.setText(" ");
                if(!"".equals(jTextField6.getText()))
            {
                jLabel6.setText(" ");
                if(!"".equals(jTextField7.getText()))
            {
                jLabel6.setText(" ");
                if(!"".equals(jTextField8.getText()))
            {
                jLabel6.setText(" ");
                
                
            }else
            {
              jLabel6.setText("Please enter a correct Value");  
            }
                
            }else
            {
              jLabel6.setText("Please enter a correct Value");  
            }
            }else
            {
              jLabel6.setText("Please enter a correct Value");  
            }
                
            }else
            {
              jLabel6.setText("Please enter a correct Value");  
            }
                
            }else
            {
              jLabel6.setText("Please enter a correct Value");  
            }
                
            }else
            {
              jLabel6.setText("Please enter a correct Value");  
            }
             
            }catch(NumberFormatException e)
                {
                    jLabel6.setText("Please enter a correct Value"); 
                }
            }else
            {
              jLabel6.setText("Please enter a correct Value");  
            }
        
            
        }else
        {
            jLabel6.setText("Please enter a correct Value");
        }
        
        if((jLabel6.getText()).equals(" "))
        {
            System.out.println("jLabel6 :   ");
            int x = jComboBox1.getSelectedIndex();
            List[] v = (List[]) linVal[2].get(x);
            v[0].set(jComboBox2.getSelectedIndex(), jTextField3.getText());
            v[1].set(jComboBox2.getSelectedIndex(), jComboBox3.getSelectedItem());
            double[] b = new double[6];
            if(jComboBox3.getSelectedItem().equals("Gaussian"))
            {
                b[0] = Double.parseDouble(jTextField2.getText());
                b[1] = Double.parseDouble(jTextField4.getText());
                b[2] = 0;
                b[3] = Double.parseDouble(jTextField6.getText());
                b[4] = Double.parseDouble(jTextField7.getText());
                b[5] = 0;
            }else
            {
                 b[0] = Double.parseDouble(jTextField2.getText());
                b[1] = Double.parseDouble(jTextField4.getText());
                b[2] = Double.parseDouble(jTextField5.getText());
                b[3] = Double.parseDouble(jTextField6.getText());
                b[4] = Double.parseDouble(jTextField7.getText());
                b[5] = Double.parseDouble(jTextField8.getText());
            }
            
            v[2].set(jComboBox2.getSelectedIndex(), b);
            linVal[2].set(jComboBox1.getSelectedIndex(), v);
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EditLinguistic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditLinguistic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditLinguistic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditLinguistic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditLinguistic().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

public void editLinguist(List[] l)
{
    jComboBox1.removeAllItems();
    jComboBox2.removeAllItems();
   // jComboBox3.removeAllItems();
    jTextField1.setText(null);
    jTextField2.setText(null);
    jTextField3.setText(null);
    jTextField4.setText(null);
    jTextField5.setText(null);
    jTextField6.setText(null);
    jTextField7.setText(null);
    jTextField8.setText(null);
    jLabel6.setText(" ");
    
    linVal = l;
    Iterator i = l[0].iterator();
    while(i.hasNext())
    {
        jComboBox1.addItem(i.next());
        
    }
    jComboBox1.setSelectedIndex(0);
}


}