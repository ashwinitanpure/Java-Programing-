import java.rmi.*;
import java.net.*;

public class AdditionServer
{
	public static void main(String args[]) throws RemoteException , MalformedURLException
	{
		Addition i= new AdditionImpl();
		Naming.rebind("rmi://localhost:5000/hello",i);

		System.out.println("Server connection...............");
	}
}