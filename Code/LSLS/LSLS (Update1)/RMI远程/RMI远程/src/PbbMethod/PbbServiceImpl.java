/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PbbMethod;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import fileOperate.FileOperation;
import Sale.saleForm;
import fileOperate.pbbIo;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
// Inherit UnicastRemoteObject and implement HelloService interface
public class PbbServiceImpl extends UnicastRemoteObject
        implements PbbService {

    private static final long serialVersionUID = 1L;
    private String name;

    public PbbServiceImpl(String name) throws RemoteException {
        super();
        this.name = name;
        // UnicastRemoteObject.exportObject(this, 0);
    }

    @Override
    public String service(String data) throws RemoteException {
        return "Your data is:"+ data + " ,send from ComputerMSI." + name;
    }
    
    @Override
    public int ADD(int a ,int b) throws RemoteException{
        return a*b;
    } 

    @Override
    public void clientAdd(String name,String in)throws RemoteException{
        pbbIo.clientAdd(name, in);
    }

    @Override
    public void clientChange(String name, String in) throws RemoteException {
        pbbIo.clientChange(name, in);
    }
     @Override
    public void clientDelete(String name) throws RemoteException {
        pbbIo.clientDelete(name);
    }
     @Override
    public  String clientView(String name)throws RemoteException {
           return pbbIo.clientView(name);
    }
    @Override
    public  String readShouRuZhiChuLiRun(String name)throws RemoteException {
           return pbbIo.readShouRuZhiChuLiRun(name);
    }
    @Override
    public  void writeFuKuanDan(String in,String name)throws RemoteException{
        pbbIo.writeFuKuanDan(in,name);
    }
    @Override
    public  void writeFuKuanDanList(String in)throws RemoteException{
        pbbIo.writeFuKuanDanList(in);
    }
     @Override
    public  void changeFuKuanDanList(String in)throws RemoteException{
        pbbIo.changeFuKuanDanList(in);
    }
      @Override
    public  void changeShouKuanDanList(String in)throws RemoteException{
        pbbIo.changeShouKuanDanList(in);
    }
    @Override
    public  void writeShouKuanDan(String in,String name)throws RemoteException{
        pbbIo.writeShouKuanDan(in,name);
    }
    @Override
    public  void writeShouKuanDanList(String in)throws RemoteException{
        pbbIo.writeShouKuanDanList(in);
    }
    @Override
     public  String viewFuKuanDan()throws RemoteException{
         return pbbIo.viewFuKuanDan();
     }
     @Override
    public  String viewShouKuanDan()throws RemoteException{
        return pbbIo.viewShouKuanDan();
    }
    @Override
    public  void writeQiChu(String in,String name)throws RemoteException{
        pbbIo.writeQiChu(in, name);
    }
     @Override
    public  String readQiChu(String name)throws RemoteException{
       return pbbIo.readQiChu(name);
    }
    @Override
     public  String checkFuKuanDan(String name)throws RemoteException{
         return pbbIo.checkFuKuanDan(name);
     }
     @Override
     public  String checkShouKuanDan(String name)throws RemoteException{
         return pbbIo.checkShouKuanDan(name);
     }
     @Override
     public Double calculate()throws RemoteException{
         
         return 1.0; 
     }
      @Override
    public saleForm searchSaleForm(String ID) throws RemoteException{
        
        return pbbIo.searchSaleForm(ID);
    }
}
