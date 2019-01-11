/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.io.Serializable;

/**
 *
 * @author 79020
 */
public class Goods implements Serializable{
        private String  ID;
        private String  Name;
        private String  Model;
        private String  Type;
        private String  QGtime;             //QG = Quality Guarantee,即保质期
        private double  Price_in;
        private double  Price_out;
        
        
        private String  dateOfMade;
        
        private int     Number;
        

    public Goods() {
        this.Price_in = 5.0f;
        this.Price_out = 6.0f;
        this.Type = "A";
        this.Number = 00;
        this.QGtime = "365Days";
        this.dateOfMade = "2017/01/01";
        this.Model = "0XABCDEF";
        this.Name = "ExampleGoods";
        this.ID = "00000000";
    }
    public Goods(String id,String dateofmade) {
        this.Price_in = 5.0f;
        this.Price_out = 6.0f;
        this.Type = "A";
        this.Number = 00;
        this.QGtime = "365Days";
        this.dateOfMade = dateofmade;
        this.Model = "0XABCDEF";
        this.Name = "ExampleGoods";
        this.ID = id;
        this.SetInfo(id);
    }
        
    public boolean SetInfo(String ID){
        GoodInfo temp = Goodfamily.search(ID);
        this.Model = temp.getModel();
        this.Name = temp.getName();
        this.Price_in = temp.getPrice();
        this.QGtime = temp.getQGtime();
        this.Type = "A";
        return true;
    }
    
    public void Setdate(String dateOfMade){
        this.dateOfMade = dateOfMade;
    }
    
    public void ADD(int n){
        this.Number+=n;
        if(this.Number<=0)
            this.Number = 0;
    }
    
    public void SETNUM(int n){
        this.Number = n;
        if(this.Number<=0)
            this.Number = 0;
    }
    
    public String Out(char sep){
        String temp = "";
        temp = temp+ID+sep+Number;
        return temp;
    }
    
    public String OutD(char sep){
        String temp = "";
        temp = temp+ID+sep+Number+sep+dateOfMade;
        return temp;
    }    
    
    public void In(String in,char sep){
        int ii = 0,tt = 0;
        String id="";String number="";String dateofmade="";
        while(ii<in.length()){
            if(in.charAt(ii)==sep)
                tt++;
            else{
                switch (tt){
                    case 0:id+=in.charAt(ii);break;
                    case 1:number+=in.charAt(ii);break;
                    case 2:dateofmade+=in.charAt(ii);break;
                }         
            }
            ii++;
        }
        ID = id;
        Number = Integer.valueOf(number);
        dateOfMade = dateofmade;
    }
    
      
    public String getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public String getModel() {
        return Model;
    }
    public String getQGtime() {
        return QGtime;
    }
    public double getPrice() {
        return Price_out;
    }
    
    public double getPriceIn() {
        return Price_in;
    }
    public String getDate() {
        return dateOfMade;
    }
    public String getType() {
        return Type;
    }
    public int getNumber() {
        return Number;
    }
}
 