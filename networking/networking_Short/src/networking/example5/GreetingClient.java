package networking.example5;

import java.net.*;
import java.io.*;

public class GreetingClient {

   public static void main(String [] args) {
	  if (args.length != 2) {
		System.err.println("The program must get exactly 2 arguments: the server and the port number");
		return;
	  }
	  
      String serverName = args[0];
      int port = Integer.valueOf(args[1]);
      try {
         System.out.println("Connecting to " + serverName + " on port " + port);
         Socket client = new Socket(serverName, port);
         
         System.out.println("Connected to " + client.getRemoteSocketAddress());
         OutputStream outToServer = client.getOutputStream();
         DataOutputStream out = new DataOutputStream(outToServer);
         
         out.writeUTF("Hello from Octav " + client.getLocalSocketAddress());
         InputStream inFromServer = client.getInputStream();
         DataInputStream in = new DataInputStream(inFromServer);
         
         System.out.println("Server says: " + in.readUTF());
         client.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}