/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesInterface;

import IOpack.FileOperation;
import Objects.*;
import Sale.saleForm;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import java.awt.Color;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import rmi远程.HacoService;
/**
 *
 * @author 79020
 */
public class Saleshow extends javax.swing.JFrame {
    
    
    Color Qianlv = new Color(182, 202, 0xC0);
    saleForm A = new saleForm("","","",1);
    
    String newl = System.getProperty("line.separator");
    /**
     * Creates new form Sale
     */
    public Saleshow() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(182, 202, 192));
        jScrollPane1.setBorder(null);

        jTable1.setFont(new java.awt.Font("微软雅黑 Light", 0, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 212, 212));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "商品码", "品名", "型号", "保质期", "生产日期", "单价", "数量"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(182, 202, 192));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(182, 202, 192));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 110, 685, 360);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 213, 213));
        jButton3.setText("提交审批");
        jButton3.setToolTipText("");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(600, 510, 120, 30);

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("2018010300001");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 50, 150, 22);

        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("单据号：");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 50, 64, 22);

        jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("销售员：");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 50, 64, 22);

        jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("戚城武");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 50, 90, 22);

        jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("01");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(500, 50, 18, 22);

        jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("仓库号：");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 50, 70, 24);

        jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("006");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(620, 50, 27, 22);

        jLabel8.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("操作员：");
        jLabel8.setToolTipText("");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(560, 50, 64, 22);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 152, 152));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("请输入备注：");
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextArea1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 490, 310, 70);

        jLabel9.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("顾客名称：");
        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 80, 80, 22);

        jLabel10.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("_____");
        jLabel10.setToolTipText("");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(140, 80, 70, 22);

        jLabel11.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("1.0");
        jLabel11.setToolTipText("");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(270, 80, 60, 22);

        jLabel12.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("折扣：");
        jLabel12.setToolTipText("");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(220, 80, 70, 24);

        jLabel13.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("总价合计：");
        jLabel13.setToolTipText("");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(510, 80, 80, 22);

        jLabel14.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("0");
        jLabel14.setToolTipText("");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(590, 80, 90, 22);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 213, 213));
        jButton4.setText("删除项目");
        jButton4.setToolTipText("");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(420, 510, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setSize(864,660);
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setBackground(Qianlv);
        setLocationRelativeTo(null);
        DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
        tableModel.setRowCount(8); 
        
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
            
            
//            String inputValue = JOptionPane.showInputDialog("输入ID：");
//            if (inputValue == null) {
//            } else {
//                jTable1.setValueAt(inputValue, jTable1.rowAtPoint(evt.getPoint()), jTable1.columnAtPoint(evt.getPoint()));
//            }
//            
//            String inputValue2 = JOptionPane.showInputDialog("输入生产日期：");
//            if (inputValue == null) {
//            } else {
//                jTable1.setValueAt(inputValue2, jTable1.rowAtPoint(evt.getPoint()), 4);
//            }
//            
//            String inputValue3 = JOptionPane.showInputDialog("输入数量：");
//            if (inputValue == null) {
//            } else {
//                jTable1.setValueAt(inputValue3, jTable1.rowAtPoint(evt.getPoint()), 6);
//            }
//            
//            A.addGoods(inputValue, Integer.valueOf(inputValue3));

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        String inputValue = JOptionPane.showInputDialog("输入顾客名称：");
        if (inputValue == null) {
        } else {
            jLabel10.setText(inputValue);
            A.setCustom(inputValue);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

        String inputValue = JOptionPane.showInputDialog("输入折扣（小数）：");
        if (inputValue == null) {
        } else {
            
            try{
                Double.valueOf(inputValue);
                jLabel11.setText(inputValue);
                A.setDiscount(Double.valueOf(inputValue));
                jLabel14.setText(A.calculate()+"");
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String url = "rmi://localhost:1099/";   
        try {
            Context namingContext = new InitialContext();
            HacoService serv = (HacoService) namingContext.lookup(
                    url + "HacoService1");
            A = serv.searchSaleForm("JHD-20180112-00002");
            refresh();
        } catch (IOException ex) {
            Logger.getLogger(Sale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(Sale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
 
    }//GEN-LAST:event_jButton4MouseClicked

    private void jTextArea1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MousePressed
        if (jTextArea1.getText().equals("请输入备注：")) {
            jTextArea1.setText("");
        }
    }//GEN-LAST:event_jTextArea1MousePressed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void run() {
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
            java.util.logging.Logger.getLogger(Saleshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Saleshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Saleshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Saleshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Saleshow().setVisible(true);
            }
        });
    }
    
    
    public void DATA(){
        A.saleForm(jLabel1.getText(), jLabel4.getText(), jLabel6.getText(), Integer.valueOf(jLabel7.getText()));
        A.setRemarks(jTextArea1.getText());
        A.setCustom(jLabel10.getText());
        A.setDiscount(Double.valueOf(jLabel11.getText()));
    }
    
    
    public void add(String ID,String date,int number){
        A.addGoods(ID, number);
        refresh();
    }
    
    public void refresh(){
        DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
        tableModel.setRowCount(0); 
        
        int ptr = 0;
        for(int i=0;i<A.getNum();i++)
        {
            tableModel.setRowCount(ptr+8); 
            Goods temp = A.List[i];
            if(temp!=null){
                jTable1.setValueAt(temp.getID(), ptr, 0);
                jTable1.setValueAt(temp.getDate(), ptr, 4);
                jTable1.setValueAt(temp.getNumber(), ptr, 6);
                jTable1.setValueAt(temp.getName(), ptr, 1);
                jTable1.setValueAt(temp.getType(), ptr, 2);
                jTable1.setValueAt(temp.getQGtime(),ptr, 3);
                jTable1.setValueAt(temp.getPrice(), ptr, 5);
                ptr++;
            }
        }
        
//        
//        jTable1.setValueAt(ID, jTable1.rowAtPoint(p), 0);
//        jTable1.setValueAt(date, jTable1.rowAtPoint(p), 4);
//        jTable1.setValueAt(number, jTable1.rowAtPoint(p), 6);
//        A.addGoods(ID, number);
//        GoodInfo temp = Goodfamily.search(ID);
//        jTable1.setValueAt(temp.getName(), jTable1.rowAtPoint(p), 1);
//        jTable1.setValueAt(temp.getType(), jTable1.rowAtPoint(p), 2);
//        jTable1.setValueAt(temp.getQGtime(), jTable1.rowAtPoint(p), 3);
//        jTable1.setValueAt(temp.getPrice(), jTable1.rowAtPoint(p), 5);
//        
//        
        
        jLabel14.setText(A.calculate()+"");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
