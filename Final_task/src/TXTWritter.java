import java.io.FileWriter;
import java.io.IOException;

public class TXTWritter {
    public void TXTWRITER(String string) throws IOException {
        try(FileWriter fileWriter = new FileWriter("output.txt",false)){
            fileWriter.write(string);
            fileWriter.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
