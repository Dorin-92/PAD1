import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sender {

	static List<String> coada;
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		coada = new ArrayList<>();
		Socket kkSocket = new Socket("localhost", 4003);
	    PrintWriter out = new PrintWriter(kkSocket.getOutputStream(), true);
	   // BufferedReader in = new BufferedReader(
	       // new InputStreamReader(kkSocket.getInputStream()));
	    Scanner scan = new Scanner(System.in);

	    while(true){
	    	String message = scan.nextLine();
	    	out.println(message);
	    	coada.add(message);
	    }
	}

}
