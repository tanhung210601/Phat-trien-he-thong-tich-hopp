package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Processing extends Thread{
    private Socket s;
    public Processing(Socket s)
    {
        this.s=s;

    }
    @Override
    public void run() {
        
        try {
            
            while(true)
            {   
                InputStream is=s.getInputStream();
                OutputStream os=s.getOutputStream();
                int yc=is.read();
                             
                switch (yc) {
                    case 1:
                        int n1=is.read();
                        os.write(n1);
                        break;
                    case 2:
                        int n2=is.read();
                        os.write(n2-1);
                        break;
                    case 3:
                        int n3=is.read();
                        os.write(n3+1);
                        break;
                    default:
                        os.write(0);
                        break;
                }
                
                
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

       

    }
    

    
}
