package goodsClassification;

import java.rmi.RemoteException;

/**
 * 库存管理人员的授权注册、登录、登出。
 */

public class Administrator extends Attribute {
	
	public boolean login(String username, String password) throws RemoteException {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean logout(String username) throws RemoteException {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean register(String username, String password) throws RemoteException {
		// TODO Auto-generated method stub
		return true;
	}
}
