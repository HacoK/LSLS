package chaKanXiaoShouMingXiBiao;

public class Choose implements xiaoShouMingXiMethod{

	@Override
	public void Timelog(String Time) {
		// TODO Auto-generated method stub
		System.out.println("��ʾʱ��������");
	}

	@Override
	public void goodsName(String Goods) {
		// TODO Auto-generated method stub
		System.out.println("��ʾ��Ʒ����");
	}

	@Override
	public void Client(String Name) {
		// TODO Auto-generated method stub
		System.out.println("��ʾ�ͻ���");
	}

	@Override
	public void Operater(String opName) {
		// TODO Auto-generated method stub
		System.out.println("��ʾҵ��Ա��");
	}

	@Override
	public void cangKu(String place) {
		// TODO Auto-generated method stub
		System.out.println("��ʾ�ֿ���");
	}

	@Override
	public void out() {
		// TODO Auto-generated method stub
		String xingHao;
		int num,danJia,zongE;
		System.out.println("��ʾ��������");
	}
	
	public static void main(String[] args){
		String op = "";
		String Time = null;
		String Goods = null;
		String Name = null;
		String opName = null;
		String place = null;
		Choose a= new Choose();
		if(op=="ʱ������") {
			a.Timelog(Time);
			}
		if(op=="��Ʒ��") {
			a.goodsName(Goods);
		}
		if(op=="�ͻ�") {
			a.Client(Name);	
		}
		if(op=="ҵ��Ա") {
			a.Operater(opName);
		}
		if(op=="�ֿ�") {
			a.cangKu(place);
		}
		if(op=="��ѯ") {
			a.out();
		}
		}
}
