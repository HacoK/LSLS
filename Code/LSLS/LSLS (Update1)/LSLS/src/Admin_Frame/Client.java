package Admin_Frame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.RemoteException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import rmi远程.HacoService;

public class Client {
    public static HacoService serv;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String url = "rmi://localhost:1099/";
        try {
            Context namingContext = new InitialContext();
            serv = (HacoService) namingContext.lookup(
                    url + "HacoService1");
            System.out.println(serv.Try());
            Admin_Frame.LoginJFrame.run(serv);
        } catch (NamingException | RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
