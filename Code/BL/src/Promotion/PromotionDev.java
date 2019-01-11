package Promotion;

import java.util.ArrayList;

public class PromotionDev {
	public enum promotionType{
		specialPrice,sum,client;
	}
	public static boolean SPP_Dev(ArrayList<Integer> goodsList,ArrayList<Double> SPList){
		//PromotionUpdata
		return false;
	}
	public static boolean SP_Dev(double sum,ArrayList<Integer> giftsList,double voucher,double discount){
		//PromotionUpdata
		return false;
	}
	public static boolean CP_Dev(int userLevel,ArrayList<Integer> giftsList,double voucher,double discount){
		//PromotionUpdata
		return false;
	}
}

class Promotion{
	String dateStart,duration;
}
class SPP extends Promotion{
	ArrayList<Integer> goodsList;
	ArrayList<Double> SPList;
}
class SP extends Promotion{
	double sum;
	ArrayList<Integer> giftsList;
	double voucher;
	double discount;
}
class CP extends Promotion{
	int userLevel;
	ArrayList<Integer> giftsList;
	double voucher;
	double discount;
}