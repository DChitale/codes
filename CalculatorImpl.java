import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Implementation of the Remote Interface
 * This class implements the actual business logic
 */
public class CalculatorImpl extends UnicastRemoteObject implements CalculatorInterface {
    
    // Constructor
    public CalculatorImpl() throws RemoteException {
        super();
    }
    
    // Implementation of add method
    @Override
    public int add(int a, int b) throws RemoteException {
        System.out.println("Server: Adding " + a + " + " + b);
        return a + b;
    }
    
    // Implementation of subtract method
    @Override
    public int subtract(int a, int b) throws RemoteException {
        System.out.println("Server: Subtracting " + a + " - " + b);
        return a - b;
    }
    
    // Implementation of multiply method
    @Override
    public int multiply(int a, int b) throws RemoteException {
        System.out.println("Server: Multiplying " + a + " * " + b);
        return a * b;
    }
    
    // Implementation of divide method
    @Override
    public double divide(int a, int b) throws RemoteException {
        if (b == 0) {
            throw new RemoteException("Cannot divide by zero!");
        }
        System.out.println("Server: Dividing " + a + " / " + b);
        return (double) a / b;
    }
}
