import java.net.*;
import java.io.*;
class UDPDemo1
{
	static final int serverPort=998;
	static final int clientPort=999;
	static DatagramSocket ds;
	static byte buffer[] = new byte[1024];

	public static void main(String args[]) throws Exception
	{
		if(args.length ==1)
		{
			ds = new DatagramSocket(serverPort);
			TheServer();
		}
		else
		{
			ds = new DatagramSocket(clientPort);
			TheClient();
		}
	} 

	public static void TheServer() throws Exception
	{
		int pos=0;
	
		while(true)
		{
			int c =System.in.read();
			switch(c)
			{
				case -1:
					System.out.println("server quits...");
					return;
				case '\r':
					break;
				case '\n':
					ds.send(new DatagramPacket(buffer,pos,InetAddress.getLocalHost(),clientPort));
					int port = 0;
					break;
				default:
					buffer[pos++]= (byte)c;
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
}