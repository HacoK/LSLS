package zhidingshoukuandan;

public class shengcheng implements shoukuandanmethod{

		@Override
	public void GetS(String Num, String keHu, String Oprater, String zhuanZhangLieBiao, float jinE) {
		// TODO Auto-generated method stub
			System.out.println("生成收款单");
	}
	public static void main(String[] args) {
		String op= "";
		String Num = null;
		String keHu = null;
		String Oprater = null;
		String zhuanZhangLieBiao = null;
		float jinE = 0;
		shengcheng Danju=new shengcheng();
		if(op=="生成") {
			Danju.GetS(Num,keHu, Oprater, zhuanZhangLieBiao, jinE);
		}
	}


}
