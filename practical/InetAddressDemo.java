import java.net.*;
import java.io.*;

public class InetAddressDemo
{
	public static void main(String args[]) throws Exception
	{
		InetAddress addr1 = InetAddress.getLocalHost();
		InetAddress addr2 = InetAddress.getByName("www.weblogic.com");
		
		InetAddress addr[] = {addr1,addr2};
		
		for(int i=0;i<addr.length;i++)
		{
			System.out.println("Host Name: "+addr[i].getHostName());
			System.out.println("Host Address: "+addr[i].getHostAddress());
			System.out.println("Is Multicast Address: "+addr[i].isMulticastAddress()+"\n");
		}
	}
}