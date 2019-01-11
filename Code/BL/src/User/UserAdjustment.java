package User;

public class UserAdjustment {
	public static boolean userNew(){
		User newUser=null;
		//User.Update
		return false;
	}
	public static boolean userEdit(User opUser){
		//User.Update
		return false;
	}
	public static boolean userDel(User delUser){
		//User.Update
		return false;
	}
}
class User {
	public enum position{
		stockM,IE_staff,F_Officer,generalM,administrator;
	}
	String ID,name;
	position type;
	String password;
}
