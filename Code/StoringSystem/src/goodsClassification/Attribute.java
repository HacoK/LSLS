package goodsClassification;
import java.rmi.RemoteException;
import java.util.*;
/**
 * 
 * @author qiusheng
 *
 *该类是商品分类的基本属性类，包含了商品分类主类的类别名称及编号。以及商品类别的增删改基本功能。
 *该类将作为商品分类管理的主类，包括授权管理员、登录登出等功能。
 */
public class Attribute {
		
	String cName = null;
	ArrayList<String> cNameList = new ArrayList<String>();
	String cNumber = null;
	ArrayList<String> cNumberList = new ArrayList<String>();
	
	public void addClassification(String num, String str){
		this.cNumber += num;
		this.cName += str;
		cNameList.add(cName);
		cNumberList.add(cNumber);
	}
	
	public void modClassification(int n, String num, String str){
		cNumber = cNumber.replace(cNumber, num);
		cName = cName.replace(cName, str);
		cNameList.set(n, cName);
		cNumberList.set(n, cNumber);
	}
	
	public void subClassification(int n){		
		cNameList.remove(cName);
		cNumberList.remove(cNumber);
	}

	public boolean login(String username, String password) throws RemoteException {
		// TODO 自动生成的方法存根
		return false;
	}

	public boolean logout(String username) throws RemoteException {
		// TODO 自动生成的方法存根
		return false;
	}

	public boolean register(String username, String password) throws RemoteException {
		// TODO 自动生成的方法存根
		return false;
	}
}
