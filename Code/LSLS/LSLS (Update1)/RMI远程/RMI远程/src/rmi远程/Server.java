/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi远程;

import PbbMethod.PbbService;
import PbbMethod.PbbServiceImpl;
import fileOperate.FileOperation;
import java.io.File;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Server {

    public static void main(String[] args) throws Exception {
        try {
            LocateRegistry.createRegistry(1098);

            PbbService service1 = new PbbServiceImpl("service1");
            Context namingContext = new InitialContext();
            namingContext.rebind("rmi://127.0.0.1:1098/HelloService1",
                    service1);
        }
        catch (RemoteException | NamingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Successfully register a remote object.");

    }
}
