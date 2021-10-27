

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalcInter extends Remote{
    public int cong(int a,int b) throws RemoteException;
    public int tru(int a,int b) throws RemoteException;


    
}
