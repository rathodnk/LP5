import java.rmi.*;
import java.math.BigInteger;


interface ServerIntf extends Remote{
	// Syntax for method declaration: access_specifier return_type method_name(arguments...){ return value}
	
	public BigInteger Factorial(int n) throws RemoteException;
}
