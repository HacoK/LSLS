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

public class User implements Serializable{
    public static enum position{
        stockM,IE_staff,F_Officer,generalM,administrator;
    }
    public String ID,name;
    public position type;
    public String password;
    public User(){};
    public User(position p,String name,String ID,String password){
        type=p;
        this.name=name;
        this.ID=ID;
        this.password=password;
        };
}
