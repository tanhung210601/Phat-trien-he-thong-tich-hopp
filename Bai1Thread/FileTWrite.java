package Bai1Thread;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Random;

public class FileTWrite extends Thread{
    private String name;
    public  FileTWrite(String name) 
    {
        this.name=name;
        
    }
    
    public  void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"Is running");
            FileOutputStream fo=new FileOutputStream(name);
            DataOutputStream DataOutputStream = new DataOutputStream(fo);
            for(int i=0;i<10;i++)
            {
                double randomDouble = Math.random();
                randomDouble = randomDouble * 100 + 1;
                int randomInt=(int)randomDouble;
                String randomString = String.valueOf(randomInt);
                DataOutputStream.writeBytes(randomString +"\n");
                DataOutputStream.flush();
                System.out.println(Thread.currentThread().getName()+": "+randomInt);
                sleep(1000);

            }
            System.out.println(Thread.currentThread().getName()+" Is exit");
        } catch (Exception e) {
            //TODO: handle exception
        }
        

    }
    public static void main(String[] args) {
        FileTWrite t1= new FileTWrite("t3.txt");
        FileTWrite t2= new FileTWrite("t4.txt");
        FileTWrite t3= new FileTWrite("t5.txt");
        t1.start();
        t2.start();
        t3.start();
    }

    
}
