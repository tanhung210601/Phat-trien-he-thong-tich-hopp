import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.channels.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {
  public static void main(String[] args) {
      try {
        
        LocateRegistry.createRegistry(5555);
        Naming.bind("rmi://localhost:5555/MyService1", new Implement());
        System.out.println("Server started");

      } catch (Exception e) {
          System.out.println("Lỗi");
      }
       
  }
}
