package Client;

public class ClientManage {
	public static boolean clientNew(){
		Client newClient=null;
		//Client.Update
		return false;
	}
	public static boolean clientEdit(Client opClient){
		//Client.Update
		return false;
	}
	public static boolean clientDel(Client delClient){
		//Client.Update
		return false;
	}
}
class Client {
	public enum clientType{
		importer,supplier;
	}
	String ID;
	clientType type;
	short level;
	String name;
	String phoneNumber;
	String address;
	String zipCode;
	String eMail;
	int amountOfRec;
	int receivable;
	int payable;
	String defaultClerk;
}