/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinancialInterface;

import PbbMethod.PbbService;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import fileOperate.FileOperation;
import java.rmi.RemoteException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;



/**
 *
 * @author Administrator
 */
public class ShouRuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddJPanel
     */
     public  String readserv() throws RemoteException {
        String url = "rmi://localhost:1098/";
        String money="";
        try {
            Context namingContext = new InitialContext();
            PbbService serv = (PbbService) namingContext.lookup(
                    url + "HelloService1");
            money=serv.readShouRuZhiChuLiRun(name);
        }
        catch (NamingException e) {
            e.printStackTrace();
        }
        return money;
    }
     public  double read35serv() throws RemoteException {
        String url = "rmi://localhost:1098/";
        double money=0;
        try {
            Context namingContext = new InitialContext();
            PbbService serv = (PbbService) namingContext.lookup(
                    url + "HelloService1");
            money=serv.searchSaleForm("XSD-20180113-00004").calculate();
           /* money+=serv.searchSaleForm("XSD-20180112-00001").calculate();
            money+=serv.searchSaleForm("XSD-20180112-00002").calculate();
            money+=serv.searchSaleForm("XSD-20180113-00001").calculate();
            money+=serv.searchSaleForm("XSD-20180113-00002").calculate();*/
        }
        catch (NamingException e) {
            e.printStackTrace();
        }
        return money;
    }
     String name;
    public ShouRuJPanel() {
        initComponents();
       
        String money; 
        double num;
         try {    
             name="销售收入"; 
             num=read35serv();
             jLabel2.setText(Double.toString(num).substring(0,10));           
             name="商品报溢收入";
             money=readserv();
             jLabel6.setText(money);
             name="成本调价收入";          
             money=readserv();    
             jLabel7.setText(money);     
             name="进货退货差价";       
             money=readserv();      
             jLabel8.setText(money);       
             name="代金券";      
             money=readserv();       
             jLabel9.setText(money);        
             name="实际收款差额收入";       
             money=readserv();        
             jLabel10.setText(money);      
             name="折让金额";      
             money=readserv();       
             jLabel5.setText(money);     
             name="折让后总收入";       
             money=readserv();      
             jLabel4.setText(money);
         } catch (RemoteException ex) {
             Logger.getLogger(ShouRuJPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        setPreferredSize(new java.awt.Dimension(740, 600));
        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 213, 213));
        jLabel1.setText("收入类");
        add(jLabel1);
        jLabel1.setBounds(20, 10, 108, 49);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(360, 70, 330, 35);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 213, 213));
        jLabel3.setText("商品类收入：");
        add(jLabel3);
        jLabel3.setBounds(20, 110, 130, 50);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(360, 350, 150, 35);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(360, 390, 150, 35);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(360, 120, 150, 35);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(360, 170, 150, 35);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(360, 220, 150, 35);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        add(jLabel9);
        jLabel9.setBounds(360, 260, 150, 35);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        add(jLabel10);
        jLabel10.setBounds(360, 300, 150, 35);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 213, 213));
        jLabel11.setText("销售收入");
        add(jLabel11);
        jLabel11.setBounds(170, 70, 90, 35);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 213, 213));
        jLabel12.setText("商品报溢收入");
        add(jLabel12);
        jLabel12.setBounds(170, 120, 130, 35);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 213, 213));
        jLabel13.setText("成本调价收入");
        add(jLabel13);
        jLabel13.setBounds(170, 170, 120, 35);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 213, 213));
        jLabel14.setText("进货退货差价");
        add(jLabel14);
        jLabel14.setBounds(170, 220, 120, 35);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 213, 213));
        jLabel15.setText("代金券");
        add(jLabel15);
        jLabel15.setBounds(170, 260, 80, 35);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 213, 213));
        jLabel16.setText("实际收款差额收入");
        add(jLabel16);
        jLabel16.setBounds(170, 300, 160, 35);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 213, 213));
        jLabel17.setText("折让金额");
        add(jLabel17);
        jLabel17.setBounds(170, 390, 100, 35);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 213, 213));
        jLabel18.setText("折让后总收入");
        add(jLabel18);
        jLabel18.setBounds(170, 350, 120, 35);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
