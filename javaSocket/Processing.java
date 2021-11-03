package javaSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;


public class Processing extends Thread {
    Socket s;
   public Processing(Socket s){
        this.s=s;
    }
    public void run() {
        try {
            OutputStream os=s.getOutputStream();
            InputStream is=s.getInputStream();
          
            while(true){
                int n=is.read();
                
                if(n==-1) break;
                System.out.println((char)n);
                os.write(n);
            }
           
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}
