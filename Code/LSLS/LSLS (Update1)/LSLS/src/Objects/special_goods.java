/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.io.Serializable;

/**
 *
 * @author Kevin
 */
public class special_goods implements Serializable{
    private String ID;
    private String Name;
    private double Price_ori;
    private double Price_spc;
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public void setPrice_ori(double Price) {
        this.Price_ori = Price;
    }
    public void setPrice_spc(double Price) {
        this.Price_spc = Price;
    }
    public double getPrice_ori() {
        return Price_ori;
    }
    public double getPrice_spc() {
        return Price_spc;
    }
}
