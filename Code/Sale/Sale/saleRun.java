package Sale;

/**
 * 该类为销售单执行类，包含了销售过程中执行所需的方法。
 * @author 79020
 */
public class saleRun {
        saleForm saleForm = new saleForm();
        
        
        //增加商品，向表单中添加商品，输入格式为商品ID及数量
        public boolean addGoods(String ID,int n){
            return true;
        }
        
        
        //减少商品，向表单中删去商品，输入格式为商品ID及数量
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
        
        //取消交易
        public boolean Cancel(){
            return true;
        }
        
        
}
