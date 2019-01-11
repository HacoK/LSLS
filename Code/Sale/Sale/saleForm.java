package Sale;

/**
 *
 * 该类为销售单列表类，包含了销售单的ID、顾客、销售员、仓库号、备注、商品列表、操作员、折扣、折价、总额、折后总额的信息
 * 
 */


public class saleForm {
        String  ID          = "";
        
        String  Custom      = "";
        String  Salesman    = "";
        
        String  Repertory   = "";        
        String  Remarks     ="";
        Goods[] List        =new Goods[100];
        
        int     Operator    = 00;
        int     Voucher     =00;
        
        double  Discount    =0.0f;
        double  Sum         =0.0f;
        double  sumAfterDiscount = 0.0f;
}
