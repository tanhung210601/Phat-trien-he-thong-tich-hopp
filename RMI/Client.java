
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap port: ");
        int port=nhap.nextInt();
        System.out.println("Nhap a:");
        int a =nhap.nextInt();
        System.out.println("Nhap b:");
        int b=nhap.nextInt();
        try {
            Registry reg=LocateRegistry.getRegistry(port);
            CalcInter citf=(CalcInter) reg.lookup("Calc");
            System.out.println("Tong hai so: "+citf.cong(a, b));
            System.out.println("Hieu: "+citf.tru(a, b));
            System.out.println("Tich hai so:"+citf.tich(a, b));
            System.out.println("Thuong hai so: "+citf.chia(a, b));
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
    
    
}
