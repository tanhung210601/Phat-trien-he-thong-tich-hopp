import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MaTranImpl extends UnicastRemoteObject implements MaTranInterface{
    public MaTranImpl() throws RemoteException
    {
        super();
    }
   
    @Override
    public int[][] congMaTran(int[][] a, int[][] b,int soDong, int soCot) throws RemoteException {
        int c[][]=new int[soDong][soCot];
        for(int i=0;i<soDong;i++)
        {
            for(int j=0;j<soCot;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        return c;
    }
    
}
