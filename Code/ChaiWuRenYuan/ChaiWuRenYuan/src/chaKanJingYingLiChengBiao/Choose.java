package chaKanJingYingLiChengBiao;

public class Choose implements jingYingLiChengBiaoMethod{

	@Override
	public void xiaoShouChuHuoDan() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ���۳�����");
	}

	@Override
	public void xiaoShouTuiHuoDan() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ�����˻���");
	}

	@Override
	public void jinHuoDan() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ������");
	}

	@Override
	public void jinHuoTuiHuoDan() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ�����˻���");
	}

	@Override
	public void fuKuanDan() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ���");
	}

	@Override
	public void shouKuanDan() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ�տ");
	}

	@Override
	public void xianJinFeiYongDan() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ�ֽ���õ�");
	}

	@Override
	public void baoYiDan() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ���絥");
	}

	@Override
	public void baoShunDan() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ����");
	}

	@Override
	public void zengSongDan() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ���͵�");
	}

	@Override
	public void hongChong() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ��������ĵ���");
	}

	@Override
	public void hongChongFuZhi() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ��岢���Ʋ�����ĵ���");
	}
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
	/* �����൥�ݲ��ڽ������������˻�����ѡ��һ��
3��������Աѡ������൥�ݲ��ڸ�����տ���ֽ���õ���ѡ��һ��
4��������Աѡ�����൥�ݲ��ڱ��絥�����𵥣����͵���ѡ��һ��
 */
	public static void main(String [] args) {
		String op = "";
		String Time = null;
		String Goods = null;
		String Name = null;
		String opName = null;
		String place = null;
		String op1="�����൥��";
		String op2="�տ";
		String op3="";
		String op4="���к�岢���ƵĲ���";
		Choose a=new Choose();
		if(op1=="�����൥��") {
			if(op2=="���۳�����") {
				a.xiaoShouChuHuoDan();
			}
			if(op2=="�����˻���") {
				a.xiaoShouTuiHuoDan();
			}
		}
		if(op1=="�����൥��") {
			if(op2=="������") {
				a.jinHuoDan();
			}
			if(op2=="�����˻���") {
				a.jinHuoTuiHuoDan();
			}
		}
		if(op1=="�����൥��") {
			if(op2=="���") {
				a.fuKuanDan();
			}
			if(op2=="�տ") {
				a.shouKuanDan();
			}
			if(op2=="�ֽ���õ�") {
				a.xianJinFeiYongDan();
			}
		}
		if(op1=="����൥��") {
			if(op2=="���絥") {
				a.baoYiDan();
			}
			if(op2=="����") {
				a.baoShunDan();
			}
			if(op2=="���͵�") {
				a.zengSongDan();
			}
		}
		if(op3=="���к��Ĳ���") {
			a.hongChong();
		}
		if(op4=="���к�岢���ƵĲ���") {
			a.hongChong();
			a.hongChongFuZhi();
		}
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
