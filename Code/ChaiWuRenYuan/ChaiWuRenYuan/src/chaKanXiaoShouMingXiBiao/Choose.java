package chaKanXiaoShouMingXiBiao;

public class Choose implements xiaoShouMingXiMethod{

	@Override
	public void Timelog(String Time) {
		// TODO Auto-generated method stub
		System.out.println("显示时间区间类");
	}

	@Override
	public void goodsName(String Goods) {
		// TODO Auto-generated method stub
		System.out.println("显示商品名类");
	}

	@Override
	public void Client(String Name) {
		// TODO Auto-generated method stub
		System.out.println("显示客户类");
	}

	@Override
	public void Operater(String opName) {
		// TODO Auto-generated method stub
		System.out.println("显示业务员类");
	}

	@Override
	public void cangKu(String place) {
		// TODO Auto-generated method stub
		System.out.println("显示仓库类");
	}

	@Override
	public void out() {
		// TODO Auto-generated method stub
		String xingHao;
		int num,danJia,zongE;
		System.out.println("显示单据内容");
	}
	
	public static void main(String[] args){
		String op = "";
		String Time = null;
		String Goods = null;
		String Name = null;
		String opName = null;
		String place = null;
		Choose a= new Choose();
		if(op=="时间区间") {
			a.Timelog(Time);
			}
		if(op=="商品名") {
			a.goodsName(Goods);
		}
		if(op=="客户") {
			a.Client(Name);	
		}
		if(op=="业务员") {
			a.Operater(opName);
		}
		if(op=="仓库") {
			a.cangKu(place);
		}
		if(op=="查询") {
			a.out();
		}
		}
}
