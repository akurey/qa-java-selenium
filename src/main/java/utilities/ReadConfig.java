package utilities;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties prop = new Properties();

    public String readProperty(String text){
    String result = "";
        try {
            prop.load(new FileInputStream("config.properties"));
            result = prop.getProperty(text);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(" " + result);

        return result.toLowerCase().trim();
    }
}
