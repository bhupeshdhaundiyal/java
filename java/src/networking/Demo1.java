package networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {

//@Override
//	public String toString() {
//		return "Demo1 []";
//	}

public static void main(String[] args) throws UnknownHostException {
	InetAddress i =InetAddress.getLocalHost();
	System.out.println("full info is "+i);
	System.out.println("host addres is "+i.getHostAddress());
	System.out.println("host name is "+i.getHostName());
	
	
	
	
	
	
	
	
	
	
	
	
	
}



}
