package zhiDindFuKuanDan;

public class shengCheng implements fuKuanDanMethod {

	@Override
	public void GetF(String Num,String zhangHu,String Oprater,String tiaoMuQingDan,float jinE) {
		// TODO Auto-generated method stub
		System.out.println("���ɸ��");
	}
	
	public static void main(String[] args) {
		String op= "";
		String Num = null;
		String zhangHu = null;
		String Oprater = null;
		String tiaoMuQingDan = null;
		float jinE = 0;
		float yuE = 0;
		shengCheng a=new shengCheng();
		if(op=="����") {
			a.GetF(Num, zhangHu, Oprater, tiaoMuQingDan, jinE);
		}
	}
}
