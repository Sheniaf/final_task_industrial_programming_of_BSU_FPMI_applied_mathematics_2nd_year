import java.io.*;

public class TXTReader {
    public String TXTREADER(String filename) throws IOException {
        File file_input = new File(filename);
        FileReader fileReader = new FileReader(file_input);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        return line;
    }
}
