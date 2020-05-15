import java.net.*;
import java.io.*;

public class URLDemo 
{
	public static void main(String args[]) throws Exception
	{
		URL url1 = new URL("https://www.google.com:8080/repositories/lecture1");
		URL url2 = new URL("http","yahoo.com","/chatrooms/mychats");
		
		URL url[] = {url1,url2};
		
		for(int i=0;i<url.length;i++)
		{
			System.out.println("The url: "+url[i]);
			System.out.println("Protocol: "+url[i].getProtocol());
			System.out.println("Host Name: "+url[i].getHost());
			System.out.println("Port: "+url[i].getPort());
			System.out.println("File path: "+url[i].getFile());
			System.out.println("toExternalForm: "+url[i].toExternalForm()+"\n");
		}
	}
}