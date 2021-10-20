package bai7;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket s=null;
        Scanner nhap=new Scanner(System.in);
        try {
            
            System.out.println("Nhap IP:");
            String IP=nhap.nextLine();
            System.out.println("Nhap Port:");
            int port=nhap.nextInt();
            String s1=nhap.nextLine();
            s=new Socket(IP,port);
            if(s!=null)
            {
                 System.out.println("Da ket noi");

            }
            InputStream is=s.getInputStream();
            OutputStream os=s.getOutputStream();
            
                is=s.getInputStream();
                os=s.getOutputStream();
                System.out.println("Nhap ten file:");
                String nameFile=nhap.nextLine();
                os.write(nameFile.getBytes());
                FileInputStream fis = null;
                try
                {
                    fis = new FileInputStream(nameFile);
                    byte[] b=new byte[1000];
                    int c=is.read(b);
                    String file=new String(b,0,c);
                    os.write(file.getBytes());

                }
                catch (IOException e)
                {
                    System.out.println("Loi");
                }
                finally
                {
                    if (fis != null)
                        fis.close();
                }
                
            
    
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
    
}
