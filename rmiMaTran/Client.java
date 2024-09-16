import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap so dong: ");
        int soDong=nhap.nextInt();
        System.out.println("Nhap so cot:");
        int soCot=nhap.nextInt();
        int a[][]=new int[soDong][soCot];
        int b[][]=new int[soDong][soCot];
        for(int i=0;i<soDong;i++)
        {
            for(int j=0;j<soCot;j++)
            {
                System.out.println("Nhap:"+a[i][j]);
                a[i][j]=nhap.nextInt();
            }
        }
        System.out.println("Nhap ma tran b");
        for(int i=0;i<soDong;i++)
        {
            for(int j=0;j<soCot;j++)
            {
                System.out.println("Nhap:"+b[i][j]);
                b[i][j]=nhap.nextInt();
            }
        }
        try {
            Registry reg=LocateRegistry.getRegistry(1111);
            MaTranInterface citf=(MaTranInterface) reg.lookup("Calc");
            // citf.congMaTran(a, b, soDong, soCot);
            System.out.println("Ket qua:");
            int kq[][]= citf.congMaTran(a, b, soDong, soCot);
            for(int i=0;i<soDong;i++)
            {
                for(int j=0;j<soCot;j++)
                {
                    System.out.print(kq[i][j]+" ");

                    
                }
                System.out.println();
            }
            
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}
