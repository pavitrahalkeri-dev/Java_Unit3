import java.io.FileWriter;
import java.io.IOException;

public class Program8_FileWriteDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("program9.txt");
        fw.write("Java File Handling Program");
        fw.close();
        System.out.println("File written successfully");
    }
}
