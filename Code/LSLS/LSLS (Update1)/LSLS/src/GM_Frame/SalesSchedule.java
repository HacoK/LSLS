/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GM_Frame;

import Admin_Frame.Client;
import Objects.Goods;
import Sale.saleForm;
import java.awt.Toolkit;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class SalesSchedule extends javax.swing.JFrame {

    /**
     * Creates new form SalesSchedule
     */
    public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    public int windowsWidth = 975;
    public int windowsHeight = 450;
    public SalesSchedule() {
        initComponents();
        this.setBounds((width - windowsWidth) / 2, (height - windowsHeight) / 2, windowsWidth, windowsHeight);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 213, 213));
        jLabel1.setText("查看销售明细表");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 260, 49);

        jScrollPane1.setFont(new java.awt.Font("微软雅黑", 0, 24)); // NOI18N
        jScrollPane1.setHorizontalScrollBar(null);

        jTable1.setFont(new java.awt.Font("微软雅黑", 0, 24)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 213, 213));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                " 时间", " 商品名称", " 型号", " 数量", " 单价", " 总额"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setDoubleBuffered(true);
        jTable1.setGridColor(new java.awt.Color(172, 172, 172));
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(0, 213, 213));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 930, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ArrayList<String> IDs=new ArrayList<String>();
        try {
            IDs = Client.serv.GetsaleForms();
        } catch (RemoteException ex) {
            Logger.getLogger(SalesSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<saleForm> saleForms=new ArrayList<>();
        for(String s:IDs){
            try {
                saleForms.add(Client.serv.searchSaleForm(s));
            } catch (RemoteException ex) {
                Logger.getLogger(SalesSchedule.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ArrayList<String> ReIDs=new ArrayList<String>();
        try {
            ReIDs = Client.serv.GetsaleReturnForms();
        } catch (RemoteException ex) {
            Logger.getLogger(SalesSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Goods> goods=new ArrayList<>();
        ArrayList<String> times=new ArrayList<>();
        String[] beg=SalesSchedule_S.time_b.split("\\.");
        String[] end=SalesSchedule_S.time_e.split("\\.");
        String[] cur=new String[3];
        String Goodsname=SalesSchedule_S.Goodsname;
        for(saleForm sF:saleForms){
            String[] ID=sF.getID().split("-");
            String time=ID[1];
            cur[0]=time.substring(0,4);
            cur[1]=time.substring(4,6);
            cur[2]=time.substring(6);
            if (!ReIDs.contains(sF.getID())) {
                if ((Integer.parseInt(beg[0]) < Integer.parseInt(cur[0]) && Integer.parseInt(end[0]) > Integer.parseInt(cur[0]))
                       || (Integer.parseInt(beg[0]) == Integer.parseInt(cur[0])&&Integer.parseInt(beg[1]) < Integer.parseInt(cur[1])) 
                       ||(Integer.parseInt(end[0]) == Integer.parseInt(cur[0])&&Integer.parseInt(end[1]) > Integer.parseInt(cur[1]))
                       || (Integer.parseInt(beg[0]) == Integer.parseInt(cur[0])&&Integer.parseInt(beg[1]) == Integer.parseInt(cur[1])&&Integer.parseInt(beg[2]) <= Integer.parseInt(cur[2]))
                       || (Integer.parseInt(end[0]) == Integer.parseInt(cur[0])&&Integer.parseInt(end[1]) == Integer.parseInt(cur[1])&&Integer.parseInt(end[2]) >= Integer.parseInt(cur[2]))) {
                    if (SalesSchedule_S.Client.equals("Client") || sF.getCustom().equals(SalesSchedule_S.Client)) {
                        if (SalesSchedule_S.Salesman.equals("Salesman") || sF.getSalesman().equals(SalesSchedule_S.Salesman)) {
                            if (SalesSchedule_S.Warehouse.equals("Warehouse") || sF.getRepertory().equals(SalesSchedule_S.Warehouse)) {
                                if (Goodsname.equals("Name")) {
                                    for (int index = 0; index < sF.List.length; index++) {
                                        goods.add(sF.List[index]);
                                        times.add(cur[0] + '-' + cur[1] + '-' + cur[2]);
                                    }
                                } else {
                                    for (int index = 0; index < sF.List.length; index++) {
                                        if (sF.List[index].getName().equals(Goodsname)) {
                                            goods.add(sF.List[index]);
                                            times.add(cur[0] + '-' + cur[1] + '-' + cur[2]);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        for(int i=0;i<goods.size();i++){
             String[] arr=new String[6];
             arr[0]=times.get(i);
             arr[1]=goods.get(i).getName();
             arr[2]=goods.get(i).getModel();
             arr[3]=String.valueOf(goods.get(i).getNumber());
             arr[4]=String.valueOf(goods.get(i).getPrice());
             arr[5]=String.valueOf(goods.get(i).getNumber()*goods.get(i).getPrice());
             tableModel.addRow(arr);
        }
        jTable1.invalidate();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(SalesSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
