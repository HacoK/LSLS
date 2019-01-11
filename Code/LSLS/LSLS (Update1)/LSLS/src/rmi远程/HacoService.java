/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi远程;

import Objects.GoodInfo;
import Objects.GoodsClass;
import Objects.GoodsQS;
import Objects.client_p;
import Objects.special_goods;
import Objects.sum_p;
import java.io.File;
import java.rmi.Remote;  
import java.rmi.RemoteException; 
import Objects.User;
import Sale.saleForm;
import java.util.ArrayList;
import java.util.List;
// Inherit the java.rmi.Remote interface  

public interface HacoService extends Remote {  
    // Remote method should throw RemoteException  
    public String service(String data) throws RemoteException;  
    public String Try() throws RemoteException; 
    
    //将管理员创建的新用户信息保存在服务器端
    public boolean userNew(int p,String name,String ID,String password) throws RemoteException;
    
    public boolean clientNew(String ID, int p,short level, String name, String phoneNumber,String address,String zipCode,String eMail,int amountOfRec,int receivable,int payable) throws RemoteException;
    
    //管理员通过ID在服务器端查找对应用户
    public String userSearch(String ID,boolean delete)throws RemoteException;
    
    public String clientSearch(String ID,boolean delete)throws RemoteException;
    
    //将经过管理员编辑的用户信息保存在服务器端
    public boolean userEdit(User opUser) throws RemoteException;
    
    //将被管理员删除的用户信息在服务器端删除
    public boolean userDel(User delUser) throws RemoteException;
    
    //将总经理创建的特价策略保存在服务器端
    public boolean SPP_D(String[] Date,int duration,List<special_goods> spcs)throws RemoteException;
    
    //将服务器端的所有用户信息提供给管理员
    public ArrayList<String> GetUsers() throws RemoteException;

    public ArrayList<String> GetClients() throws RemoteException;
    
    //将总经理创建的总价促销策略保存在服务器端
    public boolean SP_D(String[] Date,int duration,List<sum_p> sps)throws RemoteException;
    
    //将总经理创建的客户促销策略保存在服务器端
    public boolean CP_D(String[] Date,int duration,List<client_p> sps)throws RemoteException;
    
    //管理员通过ID查找用户对应二维码
    public void QR_Delete(String ID)throws RemoteException;
    
    public boolean Docs_Approve(ArrayList<String> IDs)throws RemoteException;
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////分割线
    public void sendsaleForm(Sale.saleForm in) throws RemoteException;
    public Sale.saleForm searchSaleForm(String ID) throws RemoteException;
    
    public void sendStockForm(Sale.stockForm in) throws RemoteException;
    public Sale.stockForm searchStockForm(String ID) throws RemoteException;
    
    public void sendStockReturnForm(Sale.returnForm in) throws RemoteException;
    public Sale.returnForm searchStockReturnForm(String ID) throws RemoteException;
    
    public void sendSaleReturnForm(Sale.saleReturnForm in) throws RemoteException;
    public Sale.saleReturnForm searchSaleReturnForm(String ID) throws RemoteException;
    
    
    public String newSaleFormID() throws RemoteException;
    public String newStockFormID() throws RemoteException;
    public String newStockReturnFormID() throws RemoteException;
    public String newSaleReturnFormID()throws RemoteException;
    
    public GoodInfo searchGoodInfo(String ID)throws RemoteException;//向远程数据库搜索商品信息
    public void addGoodInfo(GoodInfo in)throws RemoteException;//向远程数据库添加商品信息
    public void delGoodInfo(String ID)throws RemoteException;//向远程数据库删去商品信息
    
    public ArrayList<String> GetsaleForms()throws RemoteException;
    public ArrayList<String> GetsaleReturnForms()throws RemoteException;
    public ArrayList<String> GetstockForms()throws RemoteException;
    public ArrayList<String> GetreturnForms()throws RemoteException;
    
    public boolean AddGoods(ArrayList<GoodsQS> gs) throws RemoteException;//添加商品

    public boolean AddGoodsClass(ArrayList<GoodsClass> gsc) throws RemoteException;//添加商品类别

    public String goodsSearch(String ID, boolean delete) throws RemoteException;//将已经添加进文件的商品通过查找商品ID的形式搜索出来

    public ArrayList<String> GetGoods() throws RemoteException;//读取具体存入的商品信息

    public ArrayList<String> GetGoodsClass() throws RemoteException;//读取具体存入的商品类别信息

    public String classSearch(String ID, boolean delete) throws RemoteException;//将已经添加进文件的商品类别通过查找商品类别ID的形式搜索出来

    public boolean DonateCreate(String ID, String content) throws RemoteException;

    public boolean LossCreate(String ID, String content) throws RemoteException;

    public boolean OverflowCreate(String ID, String content) throws RemoteException;

    public boolean WarningCreate(String ID, String content) throws RemoteException;
}  