package saleReturn;

/**
 *
 * 该类为销售退货单列表类，包含了销售退货单的ID、顾客、备注、操作员的信息
 * 
 */

public class saleReturnForm {
        String  ID          = "";
        String  Remarks     ="";
        String  Custom      = "";
        
        Goods[] List        =new Goods[100];
        
        int     Operator    = 00;
}
