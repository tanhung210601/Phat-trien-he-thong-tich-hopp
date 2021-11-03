import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {
  public static void main(String[] args) {
      try {
        LocateRegistry.createRegistry(11111);
        Naming.bind("rmi://localhost:11111/MyService1", new Implement());
        System.out.println("Server started");

      } catch (Exception e) {
          System.out.println("Lỗi");
      }
       
  }
}
