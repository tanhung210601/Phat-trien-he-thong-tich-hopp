package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements HelloInterface{

    protected HelloImpl() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    public String printHello() throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }
    
    
}
