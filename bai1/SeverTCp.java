package bai1;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverTCp {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(888);
            System.out.println("Sever phuc vu song song");
            while(true)
            {
                try {
                    Socket s=ss.accept();
                    Processing p=new Processing(s);
                    p.start();
                } catch (Exception e) {
                    System.out.println("Loi");
                }
            }
        } catch (Exception e) {
            System.out.println("Loi");
        }
    }
}
