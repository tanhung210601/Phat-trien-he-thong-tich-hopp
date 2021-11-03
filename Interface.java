import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote{
    public int DemTu(String s) throws RemoteException;
    public String DaoChuoi(String s) throws RemoteException;
    

    
}
