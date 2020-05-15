import java.net.*;
import java.io.*;
//classpath=%classpath%;C:\java\jre7\bin;
public class UDPDemo 
{
	static final int serverport = 1010;
	static final int clientport = 1011;
	static DatagramSocket ds;
	static byte buffer[] = new byte[1024];
	
	public static void TheServer() throws Exception
	{
		int pos = 0;
		
		while(true)
		{
			int c = System.in.read();
			switch(c)
			{
				case -1:
					System.out.println("Server Quits");
					return;
				case '\r':
					break;
				case '\n':
					ds.send(new DatagramPacket(buffer,pos,InetAddress.getLocalHost(),clientport));
					pos = 0;
					break;
				default:
					buffer[pos++] = (byte)c;
			}
		}
	}
	
	public static void TheClient() throws Exception
	{
		
		while(true)
		{
			DatagramPacket dp = new DatagramPacket(buffer,1024);
			ds.receive(dp);
			System.out.println(new String(buffer,0,dp.getLength()));
		}
	}
	
	public static void main(String args[])throws Exception
	{
		if(args.length == 1)
		{
			ds = new DatagramSocket(serverport);
			TheServer();
		}
		else
		{
			ds = new DatagramSocket(clientport);
			TheClient();
		}
	}
}