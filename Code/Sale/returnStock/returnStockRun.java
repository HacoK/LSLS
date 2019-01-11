package returnStock;

/**
 * 该类为退货执行类，包含了销售过程中执行所需的方法。
 * @author 79020
 */
public class returnStockRun {
        returnForm returnForm = new returnForm();
        
        //增加退货商品，向表单中添加商品，输入格式为商品ID及数量，不得超过库存
        public boolean addGoods(String ID,int n){
            return true;
        }
        
        //减少退货商品，向表单中删去商品，输入格式为商品ID及数量，不得少于0
        public boolean subGoods(String ID,int n){
            return true;
        }
        
        //在窗体上显示并刷新退货商品信息，实时更新
        public boolean Play(){
            return true;
        }
        
        //确认表单信息，确认此次交易并提交审核
        public boolean Confirm(){
            return true;
        }
        
        
}
