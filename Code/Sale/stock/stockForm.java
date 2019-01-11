package stock;

/**
 *
 * 该类为进货单列表类，包含了进货单的ID、进货商、仓库号、备注、商品列表、操作员、总额的信息
 * 
 */

public class stockForm{
        String  ID          = "";
        String  Supplier    = "";
        String  Repertory   = "";        
        String  Remarks     ="";
        Goods[] List        =new Goods[100];
        int     Operator    = 00;
        double  Sum         =0.0f;
}

