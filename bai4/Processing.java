package bai4;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.Time;
import java.time.LocalDate;
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
                os.write(("1. Time\n2.Date\n3.Date&Time").getBytes());
                int n=is.read();
                if(n=='q') break;
                String kq="";
                String ngay=String.valueOf(java.time.LocalDate.now());
                String gio=String.valueOf(java.time.LocalTime.now());
                
                switch(n)
                    {
                        case '1': kq+=gio; break;
                        case '2':kq+=ngay; break;
                        case '3':kq=gio+" "+ngay; break;
                        default: kq="Yeu cau khong hop le";                        
                    }

                    os.write(((String)kq).getBytes());
            }

        } catch (Exception e) {
           
        }
    }
    
}
