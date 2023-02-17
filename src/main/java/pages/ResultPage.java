package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class ResultPage {
    WebDriver driver;

    public List<WebElement> links;

    // Constructor
    public ResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickLink(int position) throws Exception {
        links = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> {
                    List<WebElement> list = driver.findElements(By.cssSelector("h3"));
                    return list.size() > 0 ? list : null;
                });
        links.get(position - 1).click();
    }

}
