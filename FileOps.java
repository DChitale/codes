import java.io.*;

public class FileOps {
    public static void main(String[] args) throws Exception {
        // Create / Write
        FileWriter writer = new FileWriter("javafile.txt");
        writer.write("Hello from Java file system program!");
        writer.close();

        // Read
        BufferedReader reader = new BufferedReader(new FileReader("javafile.txt"));
        String line;
        System.out.println("File content:");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

        // Delete
        File file = new File("javafile.txt");
        if (file.delete())
            System.out.println("File deleted.");
        else
            System.out.println("Failed to delete.");
    }
}
