package chaKanJingYingLiChengBiao;

public class Choose implements jingYingLiChengBiaoMethod{

	@Override
	public void xiaoShouChuHuoDan() {
		// TODO Auto-generated method stub
		System.out.println("显示销售出货单");
	}

	@Override
	public void xiaoShouTuiHuoDan() {
		// TODO Auto-generated method stub
		System.out.println("显示销售退货单");
	}

	@Override
	public void jinHuoDan() {
		// TODO Auto-generated method stub
		System.out.println("显示进货单");
	}

	@Override
	public void jinHuoTuiHuoDan() {
		// TODO Auto-generated method stub
		System.out.println("显示进货退货单");
	}

	@Override
	public void fuKuanDan() {
		// TODO Auto-generated method stub
		System.out.println("显示付款单");
	}

	@Override
	public void shouKuanDan() {
		// TODO Auto-generated method stub
		System.out.println("显示收款单");
	}

	@Override
	public void xianJinFeiYongDan() {
		// TODO Auto-generated method stub
		System.out.println("显示现金费用单");
	}

	@Override
	public void baoYiDan() {
		// TODO Auto-generated method stub
		System.out.println("显示报溢单");
	}

	@Override
	public void baoShunDan() {
		// TODO Auto-generated method stub
		System.out.println("显示报损单");
	}

	@Override
	public void zengSongDan() {
		// TODO Auto-generated method stub
		System.out.println("显示赠送单");
	}

	@Override
	public void hongChong() {
		// TODO Auto-generated method stub
		System.out.println("显示红冲操作后的单据");
	}

	@Override
	public void hongChongFuZhi() {
		// TODO Auto-generated method stub
		System.out.println("显示红冲并复制操作后的单据");
	}
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
	/* 进货类单据并在进货单，进货退货单中选择一种
3、财务人员选择财务类单据并在付款单，收款单，现金费用单中选择一种
4、财务人员选择库存类单据并在报溢单，报损单，赠送单中选择一种
 */
	public static void main(String [] args) {
		String op = "";
		String Time = null;
		String Goods = null;
		String Name = null;
		String opName = null;
		String place = null;
		String op1="财务类单据";
		String op2="收款单";
		String op3="";
		String op4="进行红冲并复制的操作";
		Choose a=new Choose();
		if(op1=="销售类单据") {
			if(op2=="销售出货单") {
				a.xiaoShouChuHuoDan();
			}
			if(op2=="销售退货单") {
				a.xiaoShouTuiHuoDan();
			}
		}
		if(op1=="进货类单据") {
			if(op2=="进货单") {
				a.jinHuoDan();
			}
			if(op2=="进货退货单") {
				a.jinHuoTuiHuoDan();
			}
		}
		if(op1=="财务类单据") {
			if(op2=="付款单") {
				a.fuKuanDan();
			}
			if(op2=="收款单") {
				a.shouKuanDan();
			}
			if(op2=="现金费用单") {
				a.xianJinFeiYongDan();
			}
		}
		if(op1=="库存类单据") {
			if(op2=="报溢单") {
				a.baoYiDan();
			}
			if(op2=="报损单") {
				a.baoShunDan();
			}
			if(op2=="赠送单") {
				a.zengSongDan();
			}
		}
		if(op3=="进行红冲的操作") {
			a.hongChong();
		}
		if(op4=="进行红冲并复制的操作") {
			a.hongChong();
			a.hongChongFuZhi();
		}
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
