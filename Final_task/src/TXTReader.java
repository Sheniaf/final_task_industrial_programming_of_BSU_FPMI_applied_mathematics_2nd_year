import java.io.*;

public class TXTReader {
    public String TXTREADER() throws IOException {
        File file_input = new File("src/input.txt");
        FileReader fileReader = new FileReader(file_input);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        return line;
    }
}
