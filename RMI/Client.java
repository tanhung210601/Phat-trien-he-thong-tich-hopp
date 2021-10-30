
package RMI
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry reg=LocateRegistry.getRegistry(7777);
            CalcInter citf=(CalcInter) reg.lookup("Calc");
            System.out.println("Tong hai so: "+citf.cong(5, 6));
            System.out.println("Hieu: "+citf.tru(7, 3));
    
    
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
    
    
}
