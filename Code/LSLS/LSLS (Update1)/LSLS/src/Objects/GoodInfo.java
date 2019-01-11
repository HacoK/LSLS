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
public class GoodInfo implements Serializable{

    private String ID;
    private String Name;
    private String Model;
    private String QGtime;             //QG = Quality Guarantee,即保质期
    private String Type;
    private double Price_in;

    public GoodInfo() {
        this.Price_in = 5.0f;
        this.QGtime = "365Days";
        this.Model = "0XABCDEF";
        this.Name = "ExampleGoods";
        this.ID = "00000000";
        this.Type = "A";
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setModel(String Model) {
        this.Model = Model;
    }
    public void setQGtime(String QGtime) {
        this.QGtime = QGtime;
    }
    public void setType(String Type) {
        this.Type = Type;
    }
    public void setPrice(double Price) {
        this.Price_in = Price;
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
    public String getType() {
        return Type;
    }
    public double getPrice() {
        return Price_in;
    }
}
