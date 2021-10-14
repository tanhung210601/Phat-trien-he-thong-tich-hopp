package bai4;

import java.net.ServerSocket;
import java.net.Socket;

public class SeverTCP {
    try {
        ServerSocket ss=new ServerSocket(999);
        System.out.println("Sever phuc vu song song");
        while(true)
        {
            try {
                Socket s=ss.accept();
                Processing p=new Processing(s);
                p.start();

            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    } catch (Exception e) {
        //TODO: handle exception
    }
}
