import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class test {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fis=new FileInputStream("t.txt");
            byte[] b= new byte[1000];
            int c=fis.read(b);
            String file=new String(b,0,c);
            System.out.println(file);

            
            

           
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
