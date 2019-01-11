package qiChuJianZhang;

public class shengCheng implements jianZhangMethod{
	@Override
	public void getShangPinXinXi(String shangPinFenLei, String mouYiShangPinMingCheng, String leiBie, String xingHao,
			int jinJia, int shouJia, int zuiJinJinJia, int zuiJinShouJiaLiukong) {
		// TODO Auto-generated method stub
		System.out.println("添加成功");
	}

	@Override
	public void getKeHuXinXi(String keHuFenLei, String mouYiKeHuMingCheng, String lianXiFnagShi, int yingShou, int yingFu) {
		// TODO Auto-generated method stub
		System.out.println("添加成功");
	}

	@Override
	public void getYingHangZhangHuXinXi(String mingCheng, int yuE) {
		// TODO Auto-generated method stub
		System.out.println("添加成功");
	}
	
	@Override
	public void out(){
		// TODO Auto-generated method stub
		System.out.println("显示期初建账");
	}
/*财务人员添加商品信息，包括商品分类，某一商品的名称，类别，型号，进价/售价，最近进价和最近售价留空
3、财务人员添加客户信息，包括客户分类，某一个客户的名称，联系方式，应收应付
4、财务人员输入银行账户信息，包括名称，余额
*/
	public static void main(String[] args) {
		String op1="添加商品信息";
		String op2="添加客户信息";
		String op3="输入银行账户信息";
		shengCheng a=new shengCheng();
		String shangPinFenLei = null,mouYiShangPinMingCheng = null,leiBie = null,xingHao = null,keHuFenLei = null,mouYiKeHuMingCheng = null,lianXiFnagShi = null,mingCheng = null;
		int jinJia = 0,shouJia = 0,zuiJinJinJia = 0,zuiJinShouJiaLiukong = 0,yingShou = 0,yingFu = 0,yuE = 0;
		if(op1=="添加商品信息") {
			a.getShangPinXinXi(shangPinFenLei, mouYiShangPinMingCheng, leiBie, xingHao, jinJia, shouJia, zuiJinJinJia, zuiJinShouJiaLiukong);
		}
		if(op2=="添加客户信息") {
			a.getKeHuXinXi(keHuFenLei, mouYiKeHuMingCheng, lianXiFnagShi, yingShou, yingFu);
		}
		if(op3=="输入银行账户信息") {
			a.getYingHangZhangHuXinXi(mingCheng, yuE);
		}
		a.out();
	}




}
