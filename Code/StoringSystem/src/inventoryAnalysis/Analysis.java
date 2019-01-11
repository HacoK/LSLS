package inventoryAnalysis;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import inventoryManagement.Checking;

/**
 * @author qiusheng
 * 
 *该类是库存分析的主类，用于库存管理人员查看库存状况，从而生成报单。
 *
 */

public class Analysis {

	public Checking getData(String data){
		return null;
	}
	//查询
	public boolean Searching(){
		return true;
	}
	//计算规则	
	
	Date storeDate = new Date();
	Date abandonDate = new Date();
	Date putInDate = new Date();
	Date scaleDate = new Date();
	Calendar cal1 = Calendar.getInstance();
	Calendar cal2 = Calendar.getInstance();
	Calendar cal3 = Calendar.getInstance();
	Calendar cal4 = Calendar.getInstance();
	int storeDay = cal1.get(Calendar.DAY_OF_YEAR);
	int abandonDay = cal2.get(Calendar.DAY_OF_YEAR);
	int putInDay = cal3.get(Calendar.DAY_OF_YEAR);
	int scaleDay = cal4.get(Calendar.DAY_OF_YEAR);
	int sumOfCirculation = 0;
	int lastNum = 0;
	int lastStorage = 0;
	int nowStorage = 0;
	int ExpectedDay,ExpectedAbandonRate;

}
