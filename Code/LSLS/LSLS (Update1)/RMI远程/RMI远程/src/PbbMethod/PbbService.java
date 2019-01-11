/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PbbMethod;

import Sale.saleForm;
import java.rmi.Remote;  
import java.rmi.RemoteException;  
// Inherit the java.rmi.Remote interface  
public interface PbbService extends Remote {  
    // Remote method should throw RemoteException  
    public String service(String data) throws RemoteException;  
    public int ADD(int a ,int b) throws RemoteException; 
    public void clientAdd(String name,String in)throws RemoteException;
    public void clientChange(String name,String in)throws RemoteException;
    public void clientDelete(String name)throws RemoteException;
    public  String clientView(String name)throws RemoteException;
    public  String readShouRuZhiChuLiRun(String name)throws RemoteException;
    public  void writeFuKuanDan(String in,String name)throws RemoteException;
    public  void writeFuKuanDanList(String in)throws RemoteException;
    public  void changeFuKuanDanList(String in)throws RemoteException;
    public  void changeShouKuanDanList(String in)throws RemoteException;
    public  void writeShouKuanDan(String in,String name)throws RemoteException;
    public  void writeShouKuanDanList(String in)throws RemoteException;
    public  String viewFuKuanDan()throws RemoteException;
    public  String viewShouKuanDan()throws RemoteException;
    public  void writeQiChu(String in,String name)throws RemoteException;
    public  String readQiChu(String name)throws RemoteException;
    public  String checkFuKuanDan(String name)throws RemoteException;
    public  String checkShouKuanDan(String name)throws RemoteException;
    public Double calculate()throws RemoteException;
    public saleForm searchSaleForm(String ID) throws RemoteException;
}  