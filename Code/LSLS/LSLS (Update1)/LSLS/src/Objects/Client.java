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
public class Client implements Serializable{
    public static enum clientType {
        importer, supplier;
    }
    String ID;
    clientType type;
    short level;
    String name;
    String phoneNumber;
    String address;
    String zipCode;
    String eMail;
    int amountOfRec;
    int receivable;
    int payable;
    String defaultClerk;
}
