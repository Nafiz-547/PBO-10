import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {
    public static void writeToFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("File berhasil ditulis.");
        } catch (IOException e) {
            System.out.println("Terjadi error saat menulis file: " + e.getMessage());
        }
    }
}