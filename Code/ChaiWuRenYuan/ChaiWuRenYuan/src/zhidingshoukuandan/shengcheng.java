package zhidingshoukuandan;

public class shengcheng implements shoukuandanmethod{

		@Override
	public void GetS(String Num, String keHu, String Oprater, String zhuanZhangLieBiao, float jinE) {
		// TODO Auto-generated method stub
			System.out.println("�����տ");
	}
	public static void main(String[] args) {
		String op= "";
		String Num = null;
		String keHu = null;
		String Oprater = null;
		String zhuanZhangLieBiao = null;
		float jinE = 0;
		shengcheng Danju=new shengcheng();
		if(op=="����") {
			Danju.GetS(Num,keHu, Oprater, zhuanZhangLieBiao, jinE);
		}
	}


}
