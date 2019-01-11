/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinancialInterface;
import PbbMethod.PbbService;
import java.io.File;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import PbbMethod.PbbServiceImpl;
import fileOperate.FileOperation;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import sun.swing.table.DefaultTableCellHeaderRenderer;
/**
 *
 * @author Administrator
 */

public class CheckFuKuanDanJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddJPanel
     */
     public  String checkFuKuanDan(String name) throws RemoteException {
        String url = "rmi://localhost:1098/";
        String out="";
        try {
            Context namingContext = new InitialContext();
            PbbService serv = (PbbService) namingContext.lookup(
                    url + "HelloService1");
            out=serv.checkFuKuanDan(name);
        }
        catch (NamingException e) {
            e.printStackTrace();
        }
        return out;
    }
      public  String viewFuKuanDanlist() throws RemoteException {
        String url = "rmi://localhost:1098/";
        String out="";
        try {
            Context namingContext = new InitialContext();
            PbbService serv = (PbbService) namingContext.lookup(
                    url + "HelloService1");
            out=serv.viewFuKuanDan();
        }
        catch (NamingException e) {
            e.printStackTrace();
        }
        return out;
    }
      public  void writeListserv() throws RemoteException {
        String url = "rmi://localhost:1098/";
        try {
            Context namingContext = new InitialContext();
            PbbService serv = (PbbService) namingContext.lookup(
                    url + "HelloService1");
            serv.changeFuKuanDanList(list);
        }
        catch (NamingException e) {
            e.printStackTrace();
        }
    }
      String list="";
    public CheckFuKuanDanJPanel(String name,String time) {
        initComponents();
         DefaultTableCellRenderer renderer=new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        jTable1.setDefaultRenderer(Object.class, renderer);  
        DefaultTableCellHeaderRenderer hr = new DefaultTableCellHeaderRenderer();  
        hr.setHorizontalAlignment(JLabel.CENTER);  
        jTable1.getTableHeader().setDefaultRenderer(hr); 
        jLabel13.setText(name);
        jLabel12.setText(time);
         String line;
         try {
             line = checkFuKuanDan(name);
             String line0[]=line.split("\n");
            String line1[]=line.split(" ");
            jLabel11.setText(line1[line1.length-1]);
            String number[]=line0[0].split(" ");
            String item[]=line0[1].split(" ");
            String amount[] =line0[2].split(" ");
            String note[]=line0[3].split(" ");
            for(int i=0;i<number.length;i++){
                jTable1.setValueAt(number[i], i, 0);
                jTable1.setValueAt(item[i], i, 1);
                jTable1.setValueAt(amount[i], i, 2);
                jTable1.setValueAt(note[i], i, 3);
            }
         } catch (RemoteException ex) {
             Logger.getLogger(CheckFuKuanDanJPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
           
            
          String readOut="";
         try {
             //readOut = viewFuKuanDanlist().substring(1);
             //出现莫名方框时启用此方法
             readOut = viewFuKuanDanlist();
             System.out.println(readOut);
             String rO[]=readOut.split("\r\n");
             for(int i=0;i<(rO.length+1)/2;i++){
                     String li[]=rO[i*2].split(" ");
                      if(i==0){
                         if(rO[i*2].split(" ")[0].substring(1).equals(name)){
                         li[1]="已审核";
                     }
                      }
                     if(li[0].equals(name)){
                         li[1]="已审核";                 
                     }
                     rO[i*2]=li[0]+" "+li[1]+" "+li[2];
                 }
               for(int i=0;i<(rO.length+1)/2;i++){
                    if(i==(rO.length+1)/2){
                       list=list+rO[i*2];
               }
                   else{
                     list=list+rO[i*2]+"\r\n"+"\n";    
                   }       
                 }
                System.out.println(list);
         } catch (RemoteException ex) {
             Logger.getLogger(CheckFuKuanDanJPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
                            
            
            
        
        
    }
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        setPreferredSize(new java.awt.Dimension(740, 600));
        setLayout(null);

        jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 213, 213));
        jLabel5.setText("付款单");
        jLabel5.setToolTipText("");
        add(jLabel5);
        jLabel5.setBounds(40, 20, 108, 49);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jButton2.setText("返回");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(630, 30, 69, 33);

        jScrollPane1.setFont(new java.awt.Font("微软雅黑", 0, 24)); // NOI18N
        jScrollPane1.setHorizontalScrollBar(null);

        jTable1.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                " 单据编号", "  条目名", "   金额", "   备注"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setDoubleBuffered(true);
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(160);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(50, 240, 650, 240);

        jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel7.setText("操作员");
        add(jLabel7);
        jLabel7.setBounds(510, 100, 54, 24);

        jLabel8.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel8.setText("pbb");
        add(jLabel8);
        jLabel8.setBounds(610, 100, 36, 24);

        jLabel10.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel10.setText("时间");
        add(jLabel10);
        jLabel10.setBounds(90, 100, 36, 25);

        jLabel11.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        add(jLabel11);
        jLabel11.setBounds(570, 180, 90, 25);

        jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel6.setText("银行账户");
        add(jLabel6);
        jLabel6.setBounds(90, 180, 72, 25);

        jLabel12.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        add(jLabel12);
        jLabel12.setBounds(170, 100, 170, 25);

        jLabel9.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jLabel9.setText("总额");
        add(jLabel9);
        jLabel9.setBounds(500, 180, 36, 25);

        jLabel13.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        add(jLabel13);
        jLabel13.setBounds(200, 180, 90, 25);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        jButton1.setText("审核通过");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(600, 520, 110, 33);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFrame F = (JFrame)(getParent().getParent().getParent().getParent());
        F.dispose();
        FinancialInterface.ZhiDingDanJu.run();     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try {
             writeListserv();
         } catch (RemoteException ex) {
             Logger.getLogger(CheckFuKuanDanJPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
         JOptionPane.showMessageDialog(null,"审核成功", "提示",  JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
