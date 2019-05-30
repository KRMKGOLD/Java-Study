import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExceptionCase extends Object{
    public static void main(String[] args) {
        Path file = Paths.get("C:\\temp\\Simple.txt");
        BufferedReader writer = null;

        try {
            writer = Files.newBufferedReader(file);
//            writer.write('A');
//            writer.write('Z');
            if (writer != null) {
                writer.close();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
