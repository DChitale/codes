import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Remote Interface for Calculator
 * Defines the methods that can be called remotely
 */
public interface CalculatorInterface extends Remote {
    
    // Addition operation
    public int add(int a, int b) throws RemoteException;
    
    // Subtraction operation
    public int subtract(int a, int b) throws RemoteException;
    
    // Multiplication operation
    public int multiply(int a, int b) throws RemoteException;
    
    // Division operation
    public double divide(int a, int b) throws RemoteException;
}
