import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.StringTokenizer;

public class Implement extends UnicastRemoteObject implements Interface{

    public Implement() throws RemoteException
    {

    }
    @Override
    public int DemTu(String s) throws RemoteException {
        if (s == null) {
            return -1;
        }
        StringTokenizer str=new StringTokenizer(s);
        int count=str.countTokens();
        return count;
    }

    @Override
    public String DaoChuoi(String s) throws RemoteException {
        StringBuffer str=new StringBuffer(s);
        String kq=str.reverse().toString();
        return kq;
    }
    @Override
    public String Exit(String s) throws RemoteException {
        if(s=="exit")
        {
            UnicastRemoteObject.unexportObject(obj, force)
        }
        return null;
    }
    
    
}
