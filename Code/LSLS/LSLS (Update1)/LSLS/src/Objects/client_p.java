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
public class client_p implements Serializable{
    private String G_ID=null;
    private int userLevel=0;
    private double discount=1;
    private double voucher=0;
    public void setG_ID(String G_ID) {
        this.G_ID = G_ID;
    }
    public String getG_ID() {
        return G_ID;
    }
    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }
    public double getUserLevel() {
        return userLevel;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }
    public void setVoucher(double voucher) {
        this.voucher = voucher;
    }
    public double getVoucher() {
        return voucher;
    }
}
