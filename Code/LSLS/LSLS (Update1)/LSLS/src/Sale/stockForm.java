package Sale;
import Objects.Goods;
import java.io.Serializable;
/**
 *
 * 该类为销售单列表类，包含了销售单的ID、顾客、销售员、仓库号、备注、商品列表、操作员、折扣、折价、总额、折后总额的信息
 * 
 */


public class stockForm implements Serializable{
        String  ID          = "";//单号
        
         String  Supplier      = "";public String getSupplier(){return Supplier;}//顾客
        
        String  Repertory   = "";public String getRepertory(){return Repertory;}//仓库号  
        String  Remarks     = "";public String getRemarks(){return Remarks;}//备注
        public Goods[] List        =new Goods[100];
        
        int     Operator    = 00;public int getOperator(){return Operator;}//操作员
        int     num         =0;
        
        String newl = System.getProperty("line.separator");
        
        
        
        public stockForm(String ID,String  Repertory,int  Operator){
            this.ID=ID;
            this.Operator = Operator;
            this.Repertory= Repertory;
        }      
        
        public void stockForm(String ID,String  Repertory,int  Operator){
            this.ID=ID;
            this.Operator = Operator;
            this.Repertory= Repertory;
        }      
        public void setSupplier(String in){
            Supplier = in;
        }
        public void setRemarks(String in){
            Remarks = in;
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
            return true;
        }
        
        public boolean addGoods(String ID,String DT,int n){
            for(int i=0;i<num;i++){
                if (List[i] == null) {
                    List[i] = new Goods(ID, DT);
                    List[i].ADD(n);
                    return true;
                } else {
                    if (List[i].getID().equals(ID)) {
                        List[i].ADD(n);
                        return true;
                    }
                }
            }
            List[num] = new Goods(ID,DT);
            List[num].ADD(n);
            num++;
            return true;
        }
        
        //减少商品，向表单中删去商品，输入格式为商品ID及数量
        public boolean subGoods(String ID,int n){
            for(int i=0;i<num;i++){
                if(List[i].getID().equals(ID))
                   List[i].ADD(n);
                return true;
            }
            return false;
        }
        
        public boolean delGoods(String ID){
            for(int i=0;i<num;i++){
                if (List[i] == null) {
                } else {
                    if (List[i].getID().equals(ID)) {
                        List[i] = null;
                        return true;
                    }
                }
            }
            return false;
        }
        
        //String输出
        public String out(String sp){
            String out="stockForm"+sp;
            out  =  out+ID+sp+Supplier+sp+Repertory+sp+Remarks+sp+Operator+sp+num;
            for(int i=0;i<num;i++){
                out = out +newl+ List[i].OutD('$');
            }
            
            return out+newl;
        }
        
        
        
        //在窗体上显示并刷新商品信息，实时更新
        public boolean Play(){
            return true;
        }
        
        //确认表单信息，确认此次交易并提交审核
        public boolean Confirm(){
            String out = out("$");
            System.out.print(out);
            return true;
        }
        
        //取消交易
        public boolean Cancel(){
            return true;
        }
        
        
}
