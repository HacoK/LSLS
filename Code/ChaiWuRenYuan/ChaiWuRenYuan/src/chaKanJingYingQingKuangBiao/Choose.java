package chaKanJingYingQingKuangBiao;

public class Choose implements jingYingQingKuangBiaoMethod{

	@Override
	public void xiaoShouShouRu() {
		// TODO Auto-generated method stub
		System.out.println("显示销售收入");
	}
	@Override
	public void shangPinBaoYiShouRu() {
		// TODO Auto-generated method stub
		System.out.println("显示商品报溢收入");
	}

	@Override
	public void chengBanTiaoJiaShouRu() {
		// TODO Auto-generated method stub
		System.out.println("显示成本调价收入");
	}

	@Override
	public void jinHuoTuiHuoChaJia() {
		// TODO Auto-generated method stub
		System.out.println("显示进货退货差价 ");
	}

	@Override
	public void daiJinQuan() {
		// TODO Auto-generated method stub
		System.out.println("显示代金券");
	}

	@Override
	public void shiJiShouKuanChaEShouRu() {
		// TODO Auto-generated method stub
		System.out.println("显示实际收款差额收入");
	}

	@Override
	public void zongShouRu() {
		// TODO Auto-generated method stub
		System.out.println("显示折让后总收入，并显示折让了多少");
	}
	@Override
	public void xiaoShouChengBen() {
		// TODO Auto-generated method stub
		System.out.println("显示销售成本");
	}

	@Override
	public void shangPinBaoShun() {
		// TODO Auto-generated method stub
		System.out.println("显示商品报损");
	}

	@Override
	public void shangPinZengChu() {
		// TODO Auto-generated method stub
		System.out.println("显示商品赠出");
	}

	@Override
	public void zongZhiChu() {
		// TODO Auto-generated method stub
		System.out.println("显示总支出");
	}

	@Override
	public void liRun() {
		// TODO Auto-generated method stub
		System.out.println("显示利润");
	}
	public static void main(String[] args) {
		String op1="收入类";
		Choose a=new Choose();
		if(op1=="收入类") {
			a.xiaoShouShouRu();
			a.shangPinBaoYiShouRu();
			a.chengBanTiaoJiaShouRu();
			a.jinHuoTuiHuoChaJia();
			a.daiJinQuan();
			a.shiJiShouKuanChaEShouRu();
			a.zongShouRu();
		}
		if(op1=="支出类") {
			a.xiaoShouChengBen();
			a.shangPinBaoShun();
			a.shangPinZengChu();
			a.zongZhiChu();
		}
		if(op1=="利润") {
			a.liRun();
		}
	}
}
