import java.io.File;

public class DirOps {
    public static void main(String[] args) {

        // Create Directory
        File dir = new File("myfolder");
        dir.mkdir();

        // List files
        File current = new File(".");
        String[] list = current.list();

        System.out.println("Directory contents:");
        for (String name : list) {
            System.out.println(name);
        }
    }
}
