

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcImpl extends UnicastRemoteObject implements CalcInter{

    protected CalcImpl() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }

    
    public int cong(int a, int b){
        
        return a+b;
    }

    
    public int tru(int a, int b){
        // TODO Auto-generated method stub
        return a-b;
    }
    
}
