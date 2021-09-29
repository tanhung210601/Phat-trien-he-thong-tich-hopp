package javaSocket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPEchoSever {
    public final static int severPort=7;
    public static void main(String[] args) {
        try {
            DatagramSocket ds =new DatagramSocket();
            System.out.println("Sever duoc tao");
            byte[] buffer =new byte[6000];
                while(true)
                {
                    DatagramPacket incoming=new DatagramPacket(buffer,buffer.length);
                    ds.receive(incoming);
                    String theString =new String(incoming.getData(),0,incoming.getLength());
                    DatagramPacket outsending=new DatagramPacket(theString.getBytes(),incoming.getLength(),incoming.getAddress(),incoming.getPort());
                    ds.send(outsending);
                }
            }
             catch (Exception e) 
            {
                System.out.println("Loi");
            }
            
    }
    
}
