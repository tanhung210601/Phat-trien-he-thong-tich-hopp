package Bai1Thread;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileRead  extends Thread{
   private String name;

   public FileRead(String name)
   {
       this.name=name;
      
   }
   
   public void run() {
       try {
            System.out.println(Thread.currentThread().getName()+" is running");
           FileInputStream fs=new FileInputStream(name);
           InputStreamReader ir =new InputStreamReader(fs);
           BufferedReader br=new BufferedReader(ir);
           while(true)
           {
               String line=br.readLine();
               if(line==null) break;
               System.out.println(line);
               sleep(1000);
           }
            System.out.println(Thread.currentThread().getName()+" ket thuc");

            
       } catch (Exception e) {
           //TODO: handle exception
       }
       
      
       
   }
   public static void main(String[] args) {
       FileRead t1= new FileRead("text.txt");
       t1.start();
       FileRead t2=new FileRead("text1.txt");
       t2.start();
   }
    
}
