package Zhanghuguanli;


public class change implements changemethod{


	@Override
	public void NameChange(String a) {
		// TODO Auto-generated method stub
		System.out.println("�޸ĳɹ�");
	}

	@Override
	public void NameDelete(String a) {
		// TODO Auto-generated method stub
		System.out.println("ɾ���ɹ�");
	}

	@Override
	public void NameAdd(String a) {
		// TODO Auto-generated method stub
		System.out.println("���ӳɹ�");
	}

	@Override
	public void NameCheck(String a) {
		// TODO Auto-generated method stub
		System.out.println("�˻��ɹ���ʾ");
	}

	@Override
	public void JinEchange(float a) {
		// TODO Auto-generated method stub
		System.out.println("���ı�");
	}

	@Override
	public void YuEchange(float a) {
		// TODO Auto-generated method stub
		System.out.println("���ı�");
	}
	
	public static void main(String[] args) {
		String op="�޸��˻�";
		String Name = null;
		float Jine = 0;
		float Yue = 0;
		change c=new change();
		if(op=="�޸��˻�") {
			c.NameChange(Name);
			c.JinEchange(Jine);
			c.YuEchange(Yue);
		}
		if(op=="ɾ���˻�") {
			c.NameDelete(Name);
		}
		if(op=="�����˻�") {
			c.NameAdd(Name);
			c.JinEchange(Jine);
			c.YuEchange(Yue);
		}
		if(op=="��ѯ�˻�") {
			c.NameCheck(Name);
		}
	}

	
}