import java.rmi.Naming;

/**
 * Client class that looks up and uses the remote object
 */
public class Client {
    
    public static void main(String[] args) {
        try {
            // Look up the remote object from the registry
            String url = "rmi://localhost:1099/CalculatorService";
            System.out.println("Looking up Calculator service at: " + url);
            
            CalculatorInterface calculator = (CalculatorInterface) Naming.lookup(url);
            System.out.println("Successfully connected to Calculator service!\n");
            
            // Test the remote methods
            int num1 = 25;
            int num2 = 5;
            
            // Addition
            int addResult = calculator.add(num1, num2);
            System.out.println("Client: " + num1 + " + " + num2 + " = " + addResult);
            
            // Subtraction
            int subResult = calculator.subtract(num1, num2);
            System.out.println("Client: " + num1 + " - " + num2 + " = " + subResult);
            
            // Multiplication
            int mulResult = calculator.multiply(num1, num2);
            System.out.println("Client: " + num1 + " * " + num2 + " = " + mulResult);
            
            // Division
            double divResult = calculator.divide(num1, num2);
            System.out.println("Client: " + num1 + " / " + num2 + " = " + divResult);
            
            System.out.println("\nAll operations completed successfully!");
            
        } catch (Exception e) {
            System.err.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
