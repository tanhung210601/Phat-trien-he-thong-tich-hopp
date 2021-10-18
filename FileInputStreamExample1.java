import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class FileInputStreamExample1 {
    public static void main(String args[]) throws IOException {
        FileInputStream fin  = new FileInputStream("6.txt");
        FileOutputStream fos=new FileOutputStream("7.txt");
        int num=fin.available();
        while(true)
        {
            try {
                
                if(num>0)
                {
                    byte[] b=new byte[num];
                    int i = fin.read(b);
                   if(i==-1) break;
                   String s= new String(b);
                   System.out.println(s);
                   fos.write(b);
                  
                
                }
            } catch (Exception e) {
                System.out.println(e);
            
           
            }

        }
        fin.close();
        fos.close();
}}
