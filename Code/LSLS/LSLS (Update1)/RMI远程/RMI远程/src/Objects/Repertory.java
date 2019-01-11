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
public class Repertory implements Serializable {
    private String ID = "01";
    private int num = 0;
    private Goods[] List = new Goods[500];

    public Repertory(String ID){
        this.ID = ID;
    }
    
    public boolean ADD(String ID,String DT,int n){
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
            return true;
        }
    
    public void SUB(Goods in){
        
    }
   
    public String[] Out(){
       String[] Out = new String[num];
       String sp = System.getProperty("line.separator");
    
       for(int i=0;i<num;i++){
           Out[num] = List[num].OutD('$');
       }
       return Out;
    }
}
