import java.rmi.*;

public interface Addition extends Remote
{
	 int add(int a, int b) throws RemoteException ;
}
