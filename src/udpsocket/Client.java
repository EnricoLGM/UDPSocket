/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udpsocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enric
 */
public class Client {
        
    DatagramSocket client;
    DatagramPacket reader;
    DatagramPacket writer;
    byte[] buffer;
    
    String inReader;
    String outWriter;
    
    int porta;
    
    public Client(int porta) {
        try {
            this.porta=porta;
            client=new DatagramSocket();
            buffer=new byte[256];
            reader=new DatagramPacket(buffer, buffer.length);
        } catch (SocketException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        inReader="";
        outWriter="";
    }
    
    //public void scrittura(String testo) firma precedente del metodo
    public void comunicazione(String testo) {
        try {
            writer=new DatagramPacket(testo.getBytes(), testo.length(), InetAddress.getLocalHost(), porta);
            client.send(writer);
            
            client.receive(reader);
            inReader = new String(reader.getData(), 0, reader.getLength());
            System.out.println("Messaggio del server: " + inReader);
            
            client.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
