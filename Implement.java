import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Implement extends UnicastRemoteObject implements Interface{

    public Implement() throws RemoteException
    {

    }
    @Override
    public int DemTu(String s) throws RemoteException {
        if (s == null) {
            return -1;
        }
        int count = 0;
        int size = s.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) != ' ' && s.charAt(i) != '\t' 
                    && s.charAt(i) != '\n') {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }

    @Override
    public String DaoChuoi(String s) throws RemoteException {
        byte[] strAsByteArray = s.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        String kq=new String(result);
        
        return kq;
    }
    
}
