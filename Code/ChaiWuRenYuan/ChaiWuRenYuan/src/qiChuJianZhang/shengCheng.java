package qiChuJianZhang;

public class shengCheng implements jianZhangMethod{
	@Override
	public void getShangPinXinXi(String shangPinFenLei, String mouYiShangPinMingCheng, String leiBie, String xingHao,
			int jinJia, int shouJia, int zuiJinJinJia, int zuiJinShouJiaLiukong) {
		// TODO Auto-generated method stub
		System.out.println("��ӳɹ�");
	}

	@Override
	public void getKeHuXinXi(String keHuFenLei, String mouYiKeHuMingCheng, String lianXiFnagShi, int yingShou, int yingFu) {
		// TODO Auto-generated method stub
		System.out.println("��ӳɹ�");
	}

	@Override
	public void getYingHangZhangHuXinXi(String mingCheng, int yuE) {
		// TODO Auto-generated method stub
		System.out.println("��ӳɹ�");
	}
	
	@Override
	public void out(){
		// TODO Auto-generated method stub
		System.out.println("��ʾ�ڳ�����");
	}
/*������Ա�����Ʒ��Ϣ��������Ʒ���࣬ĳһ��Ʒ�����ƣ�����ͺţ�����/�ۼۣ�������ۺ�����ۼ�����
3��������Ա��ӿͻ���Ϣ�������ͻ����࣬ĳһ���ͻ������ƣ���ϵ��ʽ��Ӧ��Ӧ��
4��������Ա���������˻���Ϣ���������ƣ����
*/
	public static void main(String[] args) {
		String op1="�����Ʒ��Ϣ";
		String op2="��ӿͻ���Ϣ";
		String op3="���������˻���Ϣ";
		shengCheng a=new shengCheng();
		String shangPinFenLei = null,mouYiShangPinMingCheng = null,leiBie = null,xingHao = null,keHuFenLei = null,mouYiKeHuMingCheng = null,lianXiFnagShi = null,mingCheng = null;
		int jinJia = 0,shouJia = 0,zuiJinJinJia = 0,zuiJinShouJiaLiukong = 0,yingShou = 0,yingFu = 0,yuE = 0;
		if(op1=="�����Ʒ��Ϣ") {
			a.getShangPinXinXi(shangPinFenLei, mouYiShangPinMingCheng, leiBie, xingHao, jinJia, shouJia, zuiJinJinJia, zuiJinShouJiaLiukong);
		}
		if(op2=="��ӿͻ���Ϣ") {
			a.getKeHuXinXi(keHuFenLei, mouYiKeHuMingCheng, lianXiFnagShi, yingShou, yingFu);
		}
		if(op3=="���������˻���Ϣ") {
			a.getYingHangZhangHuXinXi(mingCheng, yuE);
		}
		a.out();
	}




}
