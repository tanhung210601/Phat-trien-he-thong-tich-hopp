import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MaTranInterface extends Remote{
    public int[][] congMaTran(int a[][],int b[][],int soDong, int soCot) throws RemoteException;
    
}
