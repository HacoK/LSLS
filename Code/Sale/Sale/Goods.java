package Sale;

/**
 *
 * @author 79020
 */
/**
 *
 * 该类为商品属性类，包含了商品的 ID、名称、型号、生产日期、报废日期、数量、单价、总价的信息
 * 建议提出，作为整个程序的公共类。
 */


public class Goods {
        String  ID      = "";
        String  Name    = "";
        String  Model   = "";
        
        String  dateOfMade = "";
        String  dateOfScrap = "";
        int     Number  = 00;        
        double  Price   = 0.0f;
        double  sumPrice = 0.0f;
        
        //当商品数量发生变化时，商品的总价随之变化
        public void addNumber(int n){
            this.Number+=n;
            this.sumPrice = this.Number*this.Price;
        }
        
        public void subNumber(int n){
            this.Number-=n;
            if(this.Number<=0)
                this.Number = 0 ;
            this.sumPrice = this.Number*this.Price;
        }
        
        
}
