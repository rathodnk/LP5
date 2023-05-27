import java.math.BigInteger;
import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject
	implements ServerIntf {
	
		public ServerImpl() throws RemoteException{
		
		}

		public BigInteger Factorial(int n) throws RemoteException{
			BigInteger fact = BigInteger.ONE;
			for(int i = 1; i<=n; i++){
				fact = fact.multiply(BigInteger.valueOf(i));
			}
			return fact;
		}
		
	}
	

