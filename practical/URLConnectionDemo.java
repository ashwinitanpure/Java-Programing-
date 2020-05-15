import java.net.*;
import java.io.*;

public class URLConnectionDemo
{
	public static void main(String args[]) throws Exception
	{
		URL url = new URL("http://www.google.com");
		
		URLConnection urlcon = url.openConnection();
		
		System.out.println("Content type: "+urlcon.getContentType());
		System.out.println("Content Length: "+urlcon.getContentLength());
		System.out.println("Expiration: "+urlcon.getExpiration());
		System.out.println("Url associated to this connection: "+urlcon.getURL().toString()+"\n");
		
		System.out.println("Data sent by the other host connected through URLConnection is: "+"\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
		String str;
		while((str = br.readLine()) != null)
		{
			System.out.println(str);
		}
	}
}