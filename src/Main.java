public class Main {
    public static void main(String[] args) {
        String filename = "data.txt";
        String content = "Halo, ini isi dari file data.txt\nBelajar Exception Handling dan File I/O di Java.";

        FileWriterUtil.writeToFile(filename, content);
        FileReaderUtil.readFromFile(filename);
    }
}