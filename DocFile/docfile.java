package DocFile;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.Attributes.Name;

public class docfile extends Thread{
    private String tenfile;
    
    public  docfile(String tenfile) {
        this.tenfile=tenfile;
        
        
    }
    @Override
    public void run() {
        try {
            while(true)
            {
                InputStream is=new FileInputStream(tenfile);
                DataInputStream dos=new DataInputStream(is);
                int num=is.available();
                //byte[] b=new byte[num];
                String ch=dos.readUTF();
                //String kq=new String(b,0,ch);
                //if(ch==-1) break;
                System.out.println(ch);
                Thread.sleep(1000);
            }
            

            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        docfile t1= new docfile("t3.txt");
        t1.start();
        
    }
}
