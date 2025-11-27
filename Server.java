import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * Server class that creates and registers the remote object
 */
public class Server {
    
    public static void main(String[] args) {
        try {
            // Create and export a registry on port 1099
            System.out.println("Starting RMI Registry on port 1099...");
            LocateRegistry.createRegistry(1099);
            
            // Create the remote object
            System.out.println("Creating Calculator remote object...");
            CalculatorImpl calculator = new CalculatorImpl();
            
            // Bind the remote object to the registry with a name
            String url = "rmi://localhost:1099/CalculatorService";
            Naming.rebind(url, calculator);
            
            System.out.println("Server is ready and waiting for client requests...");
            System.out.println("Calculator service bound to: " + url);
            
        } catch (Exception e) {
            System.err.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
