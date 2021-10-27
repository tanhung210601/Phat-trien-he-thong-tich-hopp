import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.*;
import java.io.InputStreamReader;

import javax.sound.sampled.Line;

class testDocghi {
    private String nameIn;
    private String nameOut;

    public  testDocghi(String nameIn, String nameOut ) {
        this.nameIn=nameIn;
        this.nameOut=nameOut;
        
    }
    public  testDocghi() {
        
    }
    synchronized void doc(String nameIn, String nameOut) throws IOException, InterruptedException {
     
            System.out.println(Thread.currentThread().getName()+" Is created");
            BufferedInputStream bufferIn = null;
            BufferedOutputStream bufferOut = null;
 
        try {
            InputStream inputStream = new FileInputStream(nameIn);
            OutputStream outputStream = new FileOutputStream(nameOut);
 
            bufferIn = new BufferedInputStream(inputStream);
            bufferOut = new BufferedOutputStream(outputStream); 
    
            int c;                    
            while ((c = bufferIn.read()) != -1) {
                System.out.print((char)c);
                bufferOut.write(c);
                Thread.sleep(1000);
            }            
        } finally {
            if (bufferIn != null) {
                bufferIn.close();
            }
            if (bufferOut != null) {
                bufferOut.close();
            }            
        }         
    }    
    
  
    
   

    public static void main(String[] args){
        final testDocghi d = new testDocghi();
       
        Thread t1= new Thread(){
            public void run() {
                try {
                    d.doc("t.txt","t6.txt");
                   
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


