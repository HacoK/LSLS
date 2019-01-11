/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileOperate;


import Functions.SZIO;
import Sale.saleForm;
import java.io.File;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class pbbIo {
     //增加账户的方法
    public static void clientAdd(String name,String in){
         File f = new File( "data/User/"+name);
        try {
            FileOperation.createFile(f);
            FileOperation.writeTxtFile(in,f);
        } catch (Exception ex) {
            Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //修改账户的方法
     public static void clientChange(String name,String in){
            File f = new File( "data/User/"+name);
            f.delete();
        try {
            FileOperation.createFile(f);
            FileOperation.writeTxtFile(in,f);
        } catch (Exception ex) {
            Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      //删除账户的方法
     public static void clientDelete(String name){
            File f = new File( "data/User/"+name);
            f.delete();
    }
      //查看账户的方法
     public static String clientView(String name){
          String money = "";
        try {
            File f = new File( "data/User/"+name);
           
            money=FileOperation.readTxtFile(f); 
        } catch (Exception ex) {
            Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return money;
    }
     //收入类支出类利润等的内容读取
      public static String readShouRuZhiChuLiRun(String name){
           String money = "";
        try {
            File f = new File( "data/JingYingQIngKuang/"+name);
           
            money=FileOperation.readTxtFile(f); 
        } catch (Exception ex) {
            Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return money;
      }
      //新建并写入一个新的付款单
      public static void writeFuKuanDan(String in,String name){
            File f = new File( "data/payment/"+name);
        try {
            FileOperation.createFile(f);
            FileOperation.writeTxtFile(in, f);
        } catch (Exception ex) {
            Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       //将新建付款单信息写入付款单列表
        public static void writeFuKuanDanList(String in){
            File f = new File( "data/payment/"+"paymentList");
        try {
            String normal=FileOperation.readTxtFile(f);     
            normal=normal+"\n"+in;         
            FileOperation.writeTxtFile(normal, f);
        } catch (Exception ex) {
            Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        //更改付款单列表内容
        public static void changeFuKuanDanList(String in){
            File f = new File( "data/payment/"+"paymentList");
        try {    
            FileOperation.writeTxtFile(in, f);
        } catch (Exception ex) {
            Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         //更改收款单列表内容
        public static void changeShouKuanDanList(String in){
            File f = new File( "data/voucher/"+"voucherList");
        try {    
            FileOperation.writeTxtFile(in, f);
        } catch (Exception ex) {
            Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        //新建并写入一个新的收款单
         public static void writeShouKuanDan(String in,String name){
            File f = new File( "data/voucher/"+name);
        try {
            FileOperation.createFile(f);
            FileOperation.writeTxtFile(in, f);
        } catch (Exception ex) {
            Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       //将新建的收款单信息写入收款单列表
        public static void writeShouKuanDanList(String in){
            File f = new File( "data/voucher/"+"voucherList");
        try {
            String normal=FileOperation.readTxtFile(f);     
            normal=normal+"\n"+in;         
            FileOperation.writeTxtFile(normal, f);
        } catch (Exception ex) {
            Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        //查看对应付款单的内容
         public static String viewFuKuanDan(){
              File f = new File( "data/payment/"+"paymentList");
              String out="";      
              try {        
                  out=FileOperation.readTxtFile(f);      
              } catch (Exception ex) {          
                  Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);      
              }      
              return out;
         }
         public static String checkFuKuanDan(String name){
              File f = new File( "data/payment/"+name);
              String out="";      
              try {        
                  out=FileOperation.readTxtFile(f);      
              } catch (Exception ex) {          
                  Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);      
              }      
              return out;
         }
         public static String checkShouKuanDan(String name){
              File f = new File( "data/voucher/"+name);
              String out="";      
              try {        
                  out=FileOperation.readTxtFile(f);      
              } catch (Exception ex) {          
                  Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);      
              }      
              return out;
         }
         public static String viewShouKuanDan(){
              File f = new File( "data/voucher/"+"voucherList");
              String out="";      
              try {        
                  out=FileOperation.readTxtFile(f);      
              } catch (Exception ex) {          
                  Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);      
              }      
              return out;
         }
          public static void writeQiChu(String in,String name){
            File f = new File( "data/InitialAccount/"+name);
        try {
            FileOperation.createFile(f);
            FileOperation.writeTxtFile(in, f);
        } catch (Exception ex) {
            Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            public static String readQiChu(String name){
            File f = new File( "data/InitialAccount/"+name);
            String out="";
        try {
            out=FileOperation.readTxtFile(f);
        } catch (Exception ex) {
            Logger.getLogger(pbbIo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return out;
    }
            
        public static saleForm searchSaleForm(String ID) throws RemoteException{
        saleForm a = (saleForm) SZIO.readObjectFromFile("data/SLS/" + ID + ".sls");
        return a;   
    }
}
