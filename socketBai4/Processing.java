package socketBai4;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Processing extends Thread{
    private Socket s;
    public  Processing(Socket s) {
         this.s=s;
         
    }

    @Override
    public void run() {
        while(true)
        {   
            try {
                InputStream is=s.getInputStream();
                OutputStream os=s.getOutputStream();
                int yc=is.read();
                // byte[] b= new byte[is.available()];
                // String kq="";
                String time=String.valueOf(java.time.LocalTime.now());
                String date=String.valueOf(java.time.LocalDate.now());
                String timeDate= time+date;

                switch (yc) {
                    case 1:
                        os.write(time.getBytes());
                            
                        break;
                    case 2:
                        os.write(date.getBytes());
                        break;
                    case 3:
                        os.write(timeDate.getBytes());
                        break;
                    
                    default:os.write(0);
                        break;
                }
                
            } catch (Exception e) {
                //TODO: handle exception
            }
           

        }
        
    }
     
    
}
