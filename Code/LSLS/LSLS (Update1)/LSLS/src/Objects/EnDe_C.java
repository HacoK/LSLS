/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Kevin
 */
public class EnDe_C {
    public static String EnID(String ID){
        StringBuilder stb=new StringBuilder();
        int i=0;
        for(;i+1<ID.length();i+=2){
            stb.append(((char)~ID.charAt(i+1)));
            stb.append(((char)~ID.charAt(i)));
        }
        if(i<ID.length())
            stb.append(((char)~ID.charAt(i)));
        return stb.toString();
    }
    public static String DeID(String ID){
        StringBuilder stb=new StringBuilder();
        int i=0;
        for(;i+1<ID.length();i+=2){
            stb.append(((char)~ID.charAt(i+1)));
            stb.append(((char)~ID.charAt(i)));
        }
        if(i<ID.length())
            stb.append(((char)~ID.charAt(i)));
        return stb.toString();
    }
    public static String EnP(String password){
        StringBuilder stb=new StringBuilder();
        int i=(password.length()-1)/2,j=i+1;
        int length=password.length();
        while(stb.length()!=length){
            if(i>=0){
                stb.append(((char)~password.charAt(i)));
                i--;
            }
            if(j<length){
                stb.append(((char)~password.charAt(j)));
                j++;
            }
        }
        return stb.toString();
    }
    public static String DeP(String password){
        String s="";
        int length=password.length();
        int i=0;
        boolean flag=true;
        while(i!=length){
            if(flag){
                s=(((char)~password.charAt(i)))+s;
                i++;
                flag=false;
            }
            else{
                s+=(((char)~password.charAt(i)));
                i++;
                flag=true;
            }
        }
        return s;
    }
}
