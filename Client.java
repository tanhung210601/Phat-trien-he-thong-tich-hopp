import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        while (true) {
            System.out.println("1. Dem tu trong chuoi\n2. Dao chuoi\nExit");
            String luaChon=nhap.nextLine();
            // nhap.nextLine();
            try {
                Registry reg=LocateRegistry.getRegistry(11111);
                Interface citf=(Interface) reg.lookup("MyService1");
                switch (luaChon) {
                    case "1":
                        System.out.println("Nhap chuoi: ");
                        String s=nhap.nextLine();
                        System.out.println("So tu trong chuoi: "+citf.DemTu(s));
                        break;
                    case "2":
                        System.out.println("Nhap chuoi: ");
                        String s2=nhap.nextLine();
                        System.out.println("Chuoi dao nguoc: "+citf.DaoChuoi(s2));
                        break;
                    default:
                        System.out.println("Lua chon khong hop le");
                        break;
                }
                
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        
        
        

    }
}
