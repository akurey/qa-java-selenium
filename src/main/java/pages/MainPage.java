package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    WebDriver driver;

    @FindBy(css = "[name=\"q\"]")
    public WebElement search;


    //Constructor
    public MainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public ResultPage search(String searchCriteria){
        search.sendKeys(searchCriteria);
        search.submit();

        return new ResultPage(this.driver);
    }


}
