import org.json.JSONObject;
import java.io.FileWriter;

public class JSONWriter {
    public static void JSONWRITER(String filename, String key, String value) {
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put(key, value);

            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(jsonObject.toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}