package bai4;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.Time;
import java.util.Date;

public class Processing extends Thread{
    Socket s;
    public Processing(Socket s){
        this.s=s;
    }
    
    public void run() {
        try {
            InputStream is=s.getInputStream();
            OutputStream os=s.getOutputStream();
            while(true)
            {
                int n=is.read();
                if(n=='q') break;
                Long tg;  
                
                switch(n)
                    {
                        case '1': tg=System.currentTimeMillis();
                        
                    }

                    os.write(tg);
            }

        } catch (Exception e) {
           
        }
    }
    
}
