package bai9;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket s=null;
        Scanner nhap=new Scanner(System.in);
        try {
            
            // System.out.println("Nhap IP:");
            // String IP=nhap.nextLine();
            // System.out.println("Nhap Port:");
            // int port=nhap.nextInt();
            // nhap.nextLine();
            // s=new Socket(IP,port);
            s=new Socket("127.0.0.1",1111);

            if(s!=null)
            {
                 System.out.println("Da ket noi");

            }
            
            while(true)
            {   
                InputStream is=s.getInputStream();
                OutputStream os=s.getOutputStream();
                System.out.println("Nhap ten file:");
                String nameFile=nhap.nextLine();
                os.write(nameFile.getBytes());
                
                byte[] b =new byte[1000];
                int ch=is.read(b);
                String kq=new String(b, 0, ch);
                System.out.println(kq);
                

                
            }
    
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
    
}
