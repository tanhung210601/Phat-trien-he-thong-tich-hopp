

import java.net.MalformedURLException;
import java.nio.channels.AlreadyBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args){
        try {
            CalcImpl citf=new CalcImpl();
            System.out.println("Khoi tao doi tuong CalcImpl");
            LocateRegistry.createRegistry(7777);
            Registry reg=LocateRegistry.getRegistry(7777);
            reg.bind("Calc", citf);
            System.out.println("Calc da duoc dang ky");

        } catch (Exception e) {
            //TODO: handle exception
        }
        

        
    }
    
    
}
