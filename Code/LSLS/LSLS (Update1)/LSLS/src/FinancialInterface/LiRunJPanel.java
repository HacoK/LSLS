/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinancialInterface;

import FinancialInterface.AddJPanel;
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
public class LiRunJPanel extends javax.swing.JPanel {

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
     String name;
    public LiRunJPanel() {
        initComponents();
        String money;        
        try {
            name="利润";
            money=readserv();
            jLabel2.setText(money);
        } catch (RemoteException ex) {
            Logger.getLogger(LiRunJPanel.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        setPreferredSize(new java.awt.Dimension(740, 600));
        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 213, 213));
        jLabel1.setText("利润");
        add(jLabel1);
        jLabel1.setBounds(20, 10, 72, 49);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(310, 220, 160, 35);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("微软雅黑", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 213, 213));
        jLabel11.setText("利润");
        add(jLabel11);
        jLabel11.setBounds(160, 220, 90, 35);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
