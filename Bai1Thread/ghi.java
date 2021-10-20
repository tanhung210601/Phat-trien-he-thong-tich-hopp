package Bai1Thread;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ghi extends Thread{
    private String name;

    public  ghi(String name) 
    {
        this.name=name;
        
    }

    @Override
    public void run() {
        try {
            FileOutputStream fos= new FileOutputStream(name);
            DataOutputStream dos=new DataOutputStream(fos);
            System.out.println("Nhap: ");
            Scanner nhap=new Scanner(System.in);
            String s=nhap.nextLine();
            dos.writeBytes(s);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        ghi t1= new ghi("text.txt");
        t1.start();
    }
    
}
