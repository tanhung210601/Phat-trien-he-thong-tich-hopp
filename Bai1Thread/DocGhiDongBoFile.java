package Bai1Thread;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.sound.sampled.Line;

class DocGhiDongBoFile {
    private String nameIn;
    private String nameOut;

    public  DocGhiDongBoFile(String nameIn, String nameOut ) {
        this.nameIn=nameIn;
        this.nameOut=nameOut;
        
    }
    public  DocGhiDongBoFile() {
        
    }
    synchronized void doc(String nameIn, String nameOut) throws IOException, InterruptedException {
     
            System.out.println(Thread.currentThread().getName()+" Is created");
            FileInputStream inputStream = null;
            FileOutputStream outputStream = null;
        
            try {
                inputStream = new FileInputStream(nameIn);
                outputStream = new FileOutputStream(nameOut);
                
                int c;
                
                while ((c = inputStream.read()) != -1) {
                    System.out.print((char)c);
                    outputStream.write(c);
                    Thread.sleep(1000);          
                }
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                System.out.println(Thread.currentThread().getName()+"end");
            }         
    }
  
    
   

    public static void main(String[] args){
        final DocGhiDongBoFile d = new DocGhiDongBoFile();
       
        Thread t1= new Thread(){
            public void run() {
                try {
                    d.doc("t3.txt","t6.txt");
                   
                } catch (IOException | InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }
        };
        t1.start();
        Thread t2= new Thread(){
            public void run() {
                try {
                    d.doc("t5.txt","t7.txt");
                } catch (IOException | InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }
        };
        t2.start();
    }  
}


