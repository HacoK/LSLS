package returnStock;

/**
 *
 * 该类为退货单列表类，包含了退货单的ID、供货商、仓库号、备注、退货列表、操作员、总额的信息
 * 
 */

public class returnForm {
        String  ID          = "";
        String  Supplier    = "";
        String  Repertory   = "";        
        String  Remarks     ="";
        Goods[] List        =new Goods[100];
        int     Operator    = 00;
        double  Sum         =0.0f;
}
