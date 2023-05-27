import java.rmi.*;
import java.util.Scanner;



public class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		try{
			String serverURL = "rmi://localhost/Server";
			ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverURL);
			
			System.out.println("Enter Your Number");
			int n =sc.nextInt();
			
			System.out.println("--------------- Results ---------------");
			System.out.println("Factorial is: "+serverIntf.Factorial(n));
			
		}catch(Exception e){
			System.out.println("Exception Occurred At Client!" + e.getMessage());
		}
		
	}

}
