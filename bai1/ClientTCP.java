package bai1;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class ClientTCP {
    public final static String severIP="127.0.0.1";
    public final static int severPort=999;
    public static void main(String[] args)  throws InterruptedException,IOException{
        Socket s=null;
        try {
            s=new Socket(severIP,severPort);
            System.out.println("Client đã dc tao");
            InputStream is =s.getInputStream();
            OutputStream os=s.getOutputStream();
            while(true)
            {   
                System.out.println("Nhap so:");
                int n=System.in.read();
                System.in.skip(2);
                os.write(n);
                if(n=='q') break;
                byte b[]=new byte[100];
                int ch=is.read(b);
                String kqua=new String(b,0,ch);
                System.out.println(kqua);
            }

        } catch (Exception e) {
            System.out.println("Lỗi");
        }
        finally{
            if(s!=null)
            {
                s.close();
            }
        }
    }
}
