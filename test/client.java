package test;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        Socket s=null;
        Scanner nhap=new Scanner(System.in);
        try {
            System.out.println("Nhap Ip");
            String IP=nhap.nextLine();
            System.out.println("Port:");
            int port=nhap.nextInt();
            s=new Socket(IP,port);
            if(s!=null)
            {
                System.out.println(" Da ket noi");
            }
            while(true)
            {
                InputStream is=s.getInputStream();
                OutputStream os=s.getOutputStream();
                System.out.println("1.N\n2.N+1\n3.N-1");
                System.out.println("Nhâp yeu cau:");
                int yc=nhap.nextInt();
                os.write(yc);
                
                System.out.println("Nhap n:");
                int n=nhap.nextInt();
                os.write(n);
                int kq=is.read();
                if(kq==0)
                {
                    System.out.println("Yeu cau khong hop le");
                    break;
                }
                
                System.out.println("Ket qua: "+kq);
            }
            



        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}
