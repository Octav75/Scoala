package networking.example1;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHost {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		System.out.printf("%s/%s%n", address.getHostName(), address.getHostAddress());
		System.out.println(address.toString()); // este echivalent
		System.out.println(new Object());
	} // %s = formateaza ca un String, %n = trece la urmatoarea linie
}