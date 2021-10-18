package bai4;

import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Client{
    // public final static String severIP="127.0.0.1";
    // public final static int severPort=999;
    public static void main(String[] args)  throws InterruptedException,IOException{
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap Dia chi IP");
        String severIP=nhap.nextLine();
        System.out.println("Nhap Port");
        int severPort=nhap.nextInt();
        Socket s=null;
        try {
            s=new Socket(severIP,severPort);
            System.out.println("Client duoc tao");
            InputStream is =s.getInputStream();
            OutputStream os=s.getOutputStream();
            while(true)
            {   
                byte d[]=new byte[100];
                int c=is.read(d);
                String kq=new String(d,0,c);
                System.out.println(kq);
                System.out.println("Nhap so:");
                int n=System.in.read();
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
