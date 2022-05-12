/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package udpsocket;

import java.util.Date;

/**
 *
 * @author enric
 */
public class MainClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client c=new Client(2000);
        c.comunicazione("Richiesta Data e Ora");
    }
    
}
