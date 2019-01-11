/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.io.*;

/**
 *
 * @author 79020
 */
public class Goodfamily implements Serializable{
    private static int ptr = 0;
    private static GoodInfo[] family = new GoodInfo[100];
    
    public Goodfamily(){ptr = 0;}
    
    public static void ADD(String ID,String Name,String Model,String QGtime,String Type,double Price){
        family[ptr] = new GoodInfo();
        family[ptr].setID(ID);
        family[ptr].setModel(Model);
        family[ptr].setName(Name);
        family[ptr].setQGtime(QGtime);
        family[ptr].setPrice(Price);
        family[ptr].setType(Type);
        while(family[ptr]!=null)
        {ptr++;}
    }
    
    public static void ADD(GoodInfo in){
        family[ptr] = new GoodInfo();
        family[ptr].setID(in.getID());
        family[ptr].setModel(in.getModel());
        family[ptr].setName(in.getName());
        family[ptr].setQGtime(in.getQGtime());
        family[ptr].setPrice(in.getPrice());
        family[ptr].setType(in.getType());
        while(family[ptr]!=null)
        {ptr++;}
    }
    
    public static void DELETE(String ID){
        for(int i=0;i<ptr;i++){
            if(family[ptr].getID().equals(ID))
                family[ptr] = null;
        }
    }
    
    public static GoodInfo search(String ID){
        for(int i=0;i<ptr;i++){
            if(family[ptr].getID().equals(ID))
                return family[ptr];
        }
        return new GoodInfo();
    }
    
}
