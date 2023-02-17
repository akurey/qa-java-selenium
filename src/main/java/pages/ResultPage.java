package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import java.util.List;

public class ResultPage {
    WebDriver driver;

    @FindBy(css= "h3")
    public List<WebElement> links;

    // Constructor
    public ResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public void clickLink(int position) throws Exception {
        links.get(position - 1).click();
    }

}
