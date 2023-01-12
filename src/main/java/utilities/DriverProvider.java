package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverProvider {

    public static WebDriver driver;
    public static boolean Instance;

    public static WebDriver createDriver(){

        ReadConfig read = new ReadConfig();

        if(driver == null) {
            switch (read.readProperty("browser")) {

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "Edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "IE":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();

                case "safari":
                    driver = new SafariDriver();

            }
        }

        return driver;
    }


}
