import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
       
            Scanner nhap=new Scanner(System.in);
            try {
            Registry reg=LocateRegistry.getRegistry(5555);
            Interface citf=(Interface) reg.lookup("MyService1");
            
            
            while (reg!=null) {
                System.err.println("--------Menu--------");         
                System.out.println("1.Dem tu\n2.Dao chuoi\nNhap exit de thoat");      
                System.out.println("Nhap lua chon");
                String luaChon=nhap.nextLine();
                // nhap.nextLine();
                
                    
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
                        case "exit":
                            // System.exit(0);
                            UnicastRemoteObject.unexportObject(citf, true);
                            break;
                        default:
                            System.out.println("Lua chon khong hop le");
                            break;
                    }
                    
              
            }
            } catch (Exception e) {
                //TODO: handle exception
            }
        
        
        
        

    }
}
