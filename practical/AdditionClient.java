import java.rmi.*;
import java.net.*;

public class AdditionClient
{
	public static void main(String args[]) throws RemoteException , NotBoundException , MalformedURLException
	{
		Addition i2 = (Addition) Naming.lookup("rmi://localhost:5000/hello");

		int result = i2.add(10,20);
		System.out.println("Addition is: "+result);
	}
}