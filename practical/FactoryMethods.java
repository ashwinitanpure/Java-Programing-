import java.net.*;

class FactoryMethods 
{
	public static void main(String args[]) throws UnknownHostException
	{
 	InetAddress host= InetAddress.getLocalHost();
	System.out.println("Host: "+host);

	host = InetAddress.getByName("www.weblogic.com");
	System.out.println("Name: "+host);

	InetAddress addr[] = InetAddress.getAllByName("www.weblogic.com");
	for(int i=0; i<addr.length; i++)
	{
		System.out.println(addr[i]);
	}
	}
}