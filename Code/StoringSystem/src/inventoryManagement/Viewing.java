package inventoryManagement;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import goodsManagement.Main;

/**
 * 
 * @author qiusheng
 * 
 *该类是库存查看类，主要功能是用于查看指定时间段内的库存状况。
 *该类继承了商品管理中的商品信息。
 */

public class Viewing {
	
	public Main getName(String GoodsName){
		return null;
	}
	
	public void Searching() throws ParseException{		
		//输入指定的时间段
		String startDate = null;  
		String endDate = null;  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		Date date1 = sdf.parse(startDate);  
	    Date date2 = sdf.parse(endDate);  
		Calendar calendar = Calendar.getInstance();  
		calendar.setTime(date1);  
		while (!calendar.getTime().equals(date2)) { 
			
		}  
		//查询
			
	}
	
	
}
