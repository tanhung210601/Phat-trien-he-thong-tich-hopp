package bai9;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.net.Socket;
import java.util.Scanner;

public class Processing extends Thread{
    private Socket s;
    public  Processing(Socket s) {
        this.s=s;
        
    }
    @Override
    public void run() {
        try {
            

            while(true)
            {
                InputStream is=s.getInputStream();
                OutputStream os=s.getOutputStream();
                int num=is.available();              
                if(num>0)
                {
                    byte a[]=new byte[num];
                    int ch=is.read(a);
                    String nameFile=new String(a,0,ch);
                    FileInputStream fis= new FileInputStream(nameFile);
                    if(fis.available()>0)
                    {
                        byte[] b= new byte[fis.available()];
                        int c=fis.read(b);
                        String file=new String(b,0,c);
                        os.write(file.getBytes());
                        System.out.println(file);
                        
                    }
                    
                    
   
                }
                

                
            }
           
           
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
    
}
