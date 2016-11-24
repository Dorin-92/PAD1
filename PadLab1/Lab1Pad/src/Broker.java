import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Broker {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
			    ServerSocket serverSocket = new ServerSocket(4003);
			    Socket clientSocket = serverSocket.accept();
			    System.out.println("Sender este conectat");
			    PrintWriter out =
			        new PrintWriter(clientSocket.getOutputStream(), true);
			    BufferedReader in = new BufferedReader(
			        new InputStreamReader(clientSocket.getInputStream()));
			    
			    while(true){
			    	System.out.println(in.readLine());
			    }
			    
			   
			

	}

}
