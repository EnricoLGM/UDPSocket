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
public class MainServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Server s=new Server(2000);
        Date d=new Date();
        while(true) {
            s.comunicazione("Ciao Client! " + d.toString());
        }
    }
    
}
