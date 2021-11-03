package javaSocket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoSever {
    public final static int severPort=7;
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(severPort);
            System.out.println("Sever đã được tạo");
            while(true)
            {
               
                    Socket s=ss.accept();
                    OutputStream os=s.getOutputStream();
                    InputStream is=s.getInputStream();
                    int ch=0;
                    while(true){
                        ch=is.read();
                        if(ch==-1) break;
                        System.out.println((char)ch);
                        os.write(ch);
                    }
                    s.close();
                
                   
                
            }
        } catch (Exception e) {
           System.out.println("Sever creation error");
        }
    }
    
}
