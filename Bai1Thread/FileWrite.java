package Bai1Thread;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;

public class FileWrite extends Thread{
   private FileOutputStream fos;
   DataOutputStream dos;
    public  FileWrite(FileOutputStream fos) 
    {
       this.fos=fos;
       this.dos=new DataOutputStream(fos);
    }
    
    public void run() {
        try {
           System.out.println(Thread.currentThread().getName()+"is runnig");
           for(int i=0;i<10;i++)
           {
               Random rand=new Random();
               int randNum=rand.nextInt(100);
               String str=String.valueOf(randNum);
               System.out.println(Thread.currentThread().getName());
               System.out.println(randNum);
               Thread.sleep(1000);
               this.dos.writeBytes(str+"\n");

           }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos=new FileOutputStream("text.txt");
        FileWrite t1=new FileWrite(fos);
        t1.start();

        
    }
    
}
