/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesInterface;

import java.awt.Point;
/**
 *
 * @author 79020
 */
public class ChatinStock extends javax.swing.JFrame {

    
    int Originx;
    int Originy;
    
    int kaiguan[] = {0,0,0};
    
    
    /**
     * Creates new form ChatinSale
     */
    public ChatinStock(Stock in) {
        initComponents(in);
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(Stock in) {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("微软雅黑 Light", 0, 18)); // NOI18N
        jLabel1.setText("商品信息输入");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 108, 25);

        jLabel2.setFont(new java.awt.Font("微软雅黑", 1, 24)); // NOI18N
        jLabel2.setText("√");
        jLabel2.setToolTipText("");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt,in);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 170, 40, 40);

        jTextField1.setFont(new java.awt.Font("微软雅黑 Light", 0, 20)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("商品码");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(60, 50, 220, 40);

        jTextField2.setFont(new java.awt.Font("微软雅黑 Light", 0, 20)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("生产日期");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField2MousePressed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(60, 90, 220, 40);

        jTextField3.setFont(new java.awt.Font("微软雅黑 Light", 0, 20)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("数量");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField3MousePressed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(60, 130, 220, 40);

        jLabel3.setFont(new java.awt.Font("微软雅黑", 1, 24)); // NOI18N
        jLabel3.setText("×");
        jLabel3.setToolTipText("");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 0, 40, 40);

        pack();
    }// </editor-fold>                        

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        getContentPane().setBackground(new java.awt.Color(235, 235, 214));
        setLocation(600,350);
        setSize(355,210);
    }                                 

    private void formMouseDragged(java.awt.event.MouseEvent evt) {                                  
        Point p = this.getLocation();
        setLocation(p.x + evt.getX() - Originx, p.y + evt.getY()- Originy);
    }                                 

    private void formMousePressed(java.awt.event.MouseEvent evt) {                                  
        Originx = evt.getX();
        Originy = evt.getY();
    }                                 

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        dispose();
    }                                    

    private void formMouseClicked(java.awt.event.MouseEvent evt) {                                  
        if(jTextField1.getText().equals("")){
            jTextField1.setText("商品码");
        }
        if(jTextField2.getText().equals("")){
            jTextField2.setText("生产日期");
        }
        if(jTextField3.getText().equals("")){
            jTextField3.setText("数量");
        }
    }                                 

    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {                                         
        jTextField1.setForeground(new java.awt.Color(0,0,0));
        if(jTextField1.getText().equals("商品码")){
            jTextField1.setText("");
        }
    }                                        

    private void jTextField2MousePressed(java.awt.event.MouseEvent evt) {                                         
        jTextField2.setForeground(new java.awt.Color(0,0,0));
        if(jTextField2.getText().equals("生产日期")){
            jTextField2.setText("");
        }
    }                                        

    private void jTextField3MousePressed(java.awt.event.MouseEvent evt) {                                         
        jTextField3.setForeground(new java.awt.Color(0,0,0));
        if(jTextField3.getText().equals("数量")){
            jTextField3.setText("");
        }
    }                                        

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt,Stock in) {                                     
        
        try{
            long temp2 = Long.valueOf(jTextField1.getText());
            jTextField1.setForeground(new java.awt.Color(0,0,0));
            kaiguan[0] =1;
        }catch(Exception e){
            jTextField1.setForeground(new java.awt.Color(255,0,0));
        }
         
        kaiguan[1] =1;
        
        try{
            int temp = Integer.valueOf(jTextField3.getText());
            jTextField3.setForeground(new java.awt.Color(0,0,0));
            kaiguan[2] =1;
        }catch(Exception e){
            jTextField3.setForeground(new java.awt.Color(255,0,0));
        }
        

        
        if(kaiguan[0]+kaiguan[1]+kaiguan[2]==3){
            in.add(jTextField1.getText(), jTextField2.getText(), Integer.valueOf(jTextField3.getText()));
            dispose();
        }
        
        
    }                                    

    /**
     * @param DT
     * @param args the command line arguments
     */
    public void run(Stock in) {
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
            java.util.logging.Logger.getLogger(ChatinStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatinStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatinStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatinStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatinStock(in).setVisible(true);
            }
            
        });
        
       
        
    }
    
    

    
    
    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration                   
}
