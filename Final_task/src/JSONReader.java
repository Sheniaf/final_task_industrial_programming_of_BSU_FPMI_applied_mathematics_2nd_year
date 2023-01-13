import org.json.JSONObject;
import java.io.FileReader;
public class JSONReader {
    public static String JSONREADER(String filename, String key){
        String str = "";
        try {
            JSONObject jsonObject = new JSONObject(new FileReader(filePath));
            str =  jsonObject.getString(key);
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
