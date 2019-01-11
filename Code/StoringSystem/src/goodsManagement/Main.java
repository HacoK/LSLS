package goodsManagement;

import java.util.ArrayList;
import goodsClassification.Attribute;

/**
 * 
 * @author qiusheng
 *
 *该类是商品管理的主类，包括了商品信息中的编号、名称、型号、库存数量、进价、零售价、最近进价、最近零售价等。
 *该类继承了商品分类管理中的商品类别。
 *该类包含了商品管理的增删改的基本功能。
 */

public class Main{
	
	public Attribute getName(String ClassName){
		return null;
	}
	
	String gName = null;
	ArrayList<String> gNameList = new ArrayList<String>();
	String gNumber = null;
	ArrayList<String> gNumberList = new ArrayList<String>();
	String gType = null;
	ArrayList<String> gTypeList = new ArrayList<String>();
	int stockQuantity = 0;
	double buyingPrice = 0.0;
	double sellingPrice = 0.0;
	double RbuyingPrice = 0.0;
	double RsellingPrice = 0.0;
	
	public void Searching(String name, String category, String num){		
		this.getName(name);
		this.getName(category);
		this.getName(num);
	}
	
	public boolean ErrorJudgement(){
		//错误判断包含非法输入判断、重复查询判断、中断查询。
		return false;
	}
	public void addGoods(String name, String type, int stock, double bprice, double sprice){
		this.gName += name;
		this.gType += type;
		this.stockQuantity += stock;
		
	}
	public void subGoods(String name, String num){
		gNameList.remove(name);
		gNumberList.remove(num);
	}
	public void modGoods(String name, String num, int stock, double bprice, double sprice){
		this.gName += name;
		this.gNumber += num;
		stockQuantity = stock;
		gNameList.add(gName);
		gNumberList.add(gNumber);
	}
}
