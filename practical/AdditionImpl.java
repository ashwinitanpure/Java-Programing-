import java.rmi.*;
import java.rmi.Remote;
import java.rmi.server.*;

public class AdditionImpl extends UnicastRemoteObject implements Addition
{
	public AdditionImpl() throws RemoteException
	{
		super();
	}
	public int add(int a, int b) 
	{
		return (a+b);
	}
}