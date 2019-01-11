/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.io.Serializable;

/**
 *
 * @author qiusheng
 */
public class StockInfo implements Serializable{
    public String ID;
    public int in_number;
    public int out_number;
    public double in_money;
    public double out_money;
    public int buy_number;
    public int sale_number;
    public double buy_price;
    public double sale_price;
    public int sum_stock;
    public double sum_money;
    
    public String name;
    public String mode;
    public int stock_number;
    public int system_number;
    public int warn_number;
    public double stock_price;
    public String batch;
    public String batch_number;
    public String out_date;
}
