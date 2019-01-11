package Zhanghuguanli;


public class change implements changemethod{


	@Override
	public void NameChange(String a) {
		// TODO Auto-generated method stub
		System.out.println("修改成功");
	}

	@Override
	public void NameDelete(String a) {
		// TODO Auto-generated method stub
		System.out.println("删除成功");
	}

	@Override
	public void NameAdd(String a) {
		// TODO Auto-generated method stub
		System.out.println("增加成功");
	}

	@Override
	public void NameCheck(String a) {
		// TODO Auto-generated method stub
		System.out.println("账户成功显示");
	}

	@Override
	public void JinEchange(float a) {
		// TODO Auto-generated method stub
		System.out.println("金额改变");
	}

	@Override
	public void YuEchange(float a) {
		// TODO Auto-generated method stub
		System.out.println("余额改变");
	}
	
	public static void main(String[] args) {
		String op="修改账户";
		String Name = null;
		float Jine = 0;
		float Yue = 0;
		change c=new change();
		if(op=="修改账户") {
			c.NameChange(Name);
			c.JinEchange(Jine);
			c.YuEchange(Yue);
		}
		if(op=="删除账户") {
			c.NameDelete(Name);
		}
		if(op=="增加账户") {
			c.NameAdd(Name);
			c.JinEchange(Jine);
			c.YuEchange(Yue);
		}
		if(op=="查询账户") {
			c.NameCheck(Name);
		}
	}

	
}