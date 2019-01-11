package Sale;
import Objects.Goods;
import java.io.Serializable;

/**
 *
 * 该类为销售退货单列表类，包含了销售退货单的ID、顾客、备注、操作员的信息
 * 
 */

public class saleReturnForm implements Serializable{
        String  ID    = "";
       
        double  Sum = 0.0f;

        public Goods[] List =new Goods[100];
        int num = 0;

        public saleForm  SL;
        String  SLID  =   "";
        double discount = 1.0;
        String Custom;
        
        
        public saleReturnForm(){}
        public saleReturnForm(String id){ID = id;}
        public void saleReturnForm(String id){ID = id;}
        public void addin(saleForm s){
            SL = s;
            SLID = SL.ID;
            discount = SL.Discount;
            Custom = SL.Custom;
        }
        
        public int getNum(){return num;}
        public String getID(){return ID;}
        
        //增加商品，向表单中添加商品，输入格式为商品ID及数量
        public boolean addGoods(String ID,int n){
            for(int i=0;i<num;i++){
                if (List[i] == null) {
                    List[i] = new Goods(ID, "");
                    List[i].ADD(n);
                    return true;
                } else {
                    if (List[i].getID().equals(ID)) {
                        List[i].ADD(n);
                        return true;
                    }
                }
            }
            List[num] = new Goods(ID,"");
            List[num].ADD(n);
            num++;
            calculate();
            return true;
        }
        
        public boolean addGoods(String ID,String DT,int n){
            for(int i=0;i<num;i++){
                if (List[i] == null){}
                else{
                    if ((List[i].getID().equals(ID))&&(List[i].getDate().equals(DT))){
                        List[i].ADD(n);
                        return true;
                    }
                    
                }
            }
            for(int i=0;i<num;i++){
                if (List[i] == null) {
                    List[i] = new Goods(ID, DT);
                    List[i].ADD(n);
                    return true;
                }
            }
            List[num] = new Goods(ID,DT);
            List[num].ADD(n);
            num++;
            calculate();
            return true;
        }
        
        public boolean setGoodsNums(String ID,int n){
            for (int i = 0; i < num; i++) {
                if (List[i] == null) {
                } else {
                    if (List[i].getID().equals(ID)) {
                        List[i].SETNUM(n);
                        calculate();
                        return true;
                    }
                }
            }
            calculate();
            return false;
        }
        
        
        
        //减少商品，向表单中删去商品，输入格式为商品ID及数量
        public boolean delGoods(String ID){
            for(int i=0;i<num;i++){
                if (List[i] == null) {
                } else {
                    if (List[i].getID().equals(ID)) {
                        List[i] = null;
                        calculate();
                        return true;
                    }
                }
            }
            return false;
        }
        
        //计算价格
        public Double calculate(){
            double temp = 0;
            for(int i=0;i<num;i++){
                if (List[i] != null) {
                    temp += List[i].getPrice() * List[i].getNumber();
                }
            }
            Sum = temp;
            Sum = Sum*discount;
            return Sum;
        }
        
}
