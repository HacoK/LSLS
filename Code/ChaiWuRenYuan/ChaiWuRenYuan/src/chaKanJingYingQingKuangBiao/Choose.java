package chaKanJingYingQingKuangBiao;

public class Choose implements jingYingQingKuangBiaoMethod{

	@Override
	public void xiaoShouShouRu() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ��������");
	}
	@Override
	public void shangPinBaoYiShouRu() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ��Ʒ��������");
	}

	@Override
	public void chengBanTiaoJiaShouRu() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ�ɱ���������");
	}

	@Override
	public void jinHuoTuiHuoChaJia() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ�����˻���� ");
	}

	@Override
	public void daiJinQuan() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ����ȯ");
	}

	@Override
	public void shiJiShouKuanChaEShouRu() {
		// TODO Auto-generated method stub
		System.out.println("��ʾʵ���տ�������");
	}

	@Override
	public void zongShouRu() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ���ú������룬����ʾ�����˶���");
	}
	@Override
	public void xiaoShouChengBen() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ���۳ɱ�");
	}

	@Override
	public void shangPinBaoShun() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ��Ʒ����");
	}

	@Override
	public void shangPinZengChu() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ��Ʒ����");
	}

	@Override
	public void zongZhiChu() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ��֧��");
	}

	@Override
	public void liRun() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ����");
	}
	public static void main(String[] args) {
		String op1="������";
		Choose a=new Choose();
		if(op1=="������") {
			a.xiaoShouShouRu();
			a.shangPinBaoYiShouRu();
			a.chengBanTiaoJiaShouRu();
			a.jinHuoTuiHuoChaJia();
			a.daiJinQuan();
			a.shiJiShouKuanChaEShouRu();
			a.zongShouRu();
		}
		if(op1=="֧����") {
			a.xiaoShouChengBen();
			a.shangPinBaoShun();
			a.shangPinZengChu();
			a.zongZhiChu();
		}
		if(op1=="����") {
			a.liRun();
		}
	}
}
