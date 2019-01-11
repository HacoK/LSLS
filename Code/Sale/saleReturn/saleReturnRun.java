package saleReturn;

import Sale.*;
/**
 * 该类为销售退货单执行类，包含了销售过程中执行所需的方法。
 * @author 79020
 */
public class saleReturnRun {
        saleForm saleForm = new saleForm();
        saleReturnForm saleReturnForm = new saleReturnForm();
        
        //该方法用于查找原始的销售单的信息，输入格式为销售单ID
        public boolean findSaleForm(String ID){
            return true;
        }
        
        //该方法用于查找销售单的往期退货信息，输入格式为销售单的ID
        public boolean findReturnForm(String ID){
            return true;
        }
        
        //增加退货商品，向表单中添加商品，输入格式为商品ID及数量
        public boolean addGoods(String ID,int n){
            return true;
        }
        
        //减少退货商品，向表单中删去商品，输入格式为商品ID及数量
        public boolean subGoods(String ID,int n){
            return true;
        }
        
        //在窗体上显示并刷新商品信息，实时更新
        public boolean Play(){
            return true;
        }
        
        //确认表单信息，确认此次交易并提交审核
        public boolean Confirm(){
            return true;
        }
        
        //取消退货交易
        public boolean Cancel(){
            return true;
        }
        
        
}
