import java.io.*;
public class InStream1 {
public static void main(String args[]) {
InputStream is = System.in;
try {
    
    while(true)
    {   
        int ch=is.read();
        if(ch==-1 || ch=='q') break;
        
        System.out.print((char)ch);
    }
    
} catch (IOException e) {
    System.out.println("Lỗi: "+e);
}
}
}