package inventoryManagement;

import goodsManagement.Main;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 
 * @author qiusheng
 *
 *该类是库存盘点类，主要功能是根据输入的日期显示当天的库存快照。 
 */
public class Checking {
	
	public Main getName(String GoodsName){
		return null;
	}
	//输入当前日期
	Date d = new Date();
	Calendar now = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String today = sdf.format(d);
	//系统显示

}
