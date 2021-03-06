package Sale;
import Objects.Goods;
import java.io.*;
/**
 *
 * 该类为销售单列表类，包含了销售单的ID、顾客、销售员、仓库号、备注、商品列表、操作员、折扣、折价、总额、折后总额的信息
 * 
 */


public class saleForm implements Serializable   {
        String  ID          = "";//单号
        
        String  Custom      = "";public String getCustom(){return Custom;}//顾客  
        String  Salesman    = "";public String getSalesman(){return Salesman;}//销售员
        
        String  Repertory   = "";public String getRepertory(){return Repertory;}//仓库号  
        String  Remarks     = "";public String getRemarks(){return Remarks;}//备注
        public Goods[] List        =new Goods[100];
        
        int     Operator    = 00;public int getOperator(){return Operator;}//操作员
        int     num         =0;
        
        double  Discount    =1.0f;public double getDiscount(){return Discount;}
        double  Sum         =0.0f;public double getSum(){return Sum;}
        double  sumAfterDiscount = 0.0f;
        
        String newl = System.getProperty("line.separator");
        
        
        //默认构造方法
        public saleForm(String ID,String  Salesman,String  Repertory,int  Operator){
            this.ID=ID;
            this.Operator = Operator;
            this.Salesman = Salesman;
            this.Repertory= Repertory;
        }      
        
        //重新构造的构造方法
        public void saleForm(String ID,String  Salesman,String  Repertory,int  Operator){
            this.ID=ID;
            this.Operator = Operator;
            this.Salesman = Salesman;
            this.Repertory= Repertory;
        }      
        public void setCustom(String in){
            Custom = in;
        }
        public void setRemarks(String in){
            Remarks = in;
        }
        public void setDiscount(double in){
            calculate();
            Discount = in;
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
            sumAfterDiscount = Sum*Discount;
            return sumAfterDiscount;
        }
        
        //String输出
        public String out(String sp){
            String out="";
            out  =  out+ID+sp+Custom+sp+Salesman+sp+Repertory+sp+Remarks+sp+Operator+sp+Discount+sp+Sum
                    +sp+sumAfterDiscount+sp+num;
            for(int i=0;i<num;i++){
                if (List[i] != null) {
                out = out +newl+ List[i].OutD('$');
                }
            }
            
            return out+newl;
        }
        
        
        
        //在窗体上显示并刷新商品信息，实时更新
        public boolean Play(){
            return true;
        }
        
        //确认表单信息，确认此次交易并提交审核
        public String Confirm() throws IOException{
            
            
            String out = out("$");
            System.out.print(out);
            
//            String[] Out = new String[num+1] ;
//            Out[0] = writeObj.writeToStr(saleForm.this);
//            for(int i=1;i<=num;i++){
//                Out[i] = writeObj.writeToStr(List[i-1]);
//            }
//            
//            System.out.print("====>");
//            for(int i=0;i<=num;i++){
//                System.out.println(Out[i]);
//            }
            return out;
            
        }
        
        //取消交易
        public boolean Cancel(){
            return true;
        }
        
        
}
