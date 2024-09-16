import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            MaTranImpl citf=new MaTranImpl();
            System.out.println("Khoi tao doi tuong MaTranImpl");
            LocateRegistry.createRegistry(1111);
            Registry reg=LocateRegistry.getRegistry(1111);
            reg.bind("Calc", citf);
            System.out.println("Calc da duoc dang ky");
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}
