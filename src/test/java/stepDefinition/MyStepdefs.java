package stepDefinition;

import io.cucumber.java8.En;
import io.cucumber.java8.Scenario;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.ResultPage;
import utilities.DriverProvider;

import static org.junit.Assert.assertEquals;


public class MyStepdefs implements En {

    public WebDriver driver;
    public MainPage google;
    public ResultPage result;
    public Scenario scenario;

    public MyStepdefs() {

        Before(() -> {
            if(driver == null){
                driver = DriverProvider.createDriver();
            }
        });

        After((scenario) -> {
            String firstElement = "";
            if(!scenario.getSourceTagNames().isEmpty()){
                firstElement = scenario.getSourceTagNames().iterator().next();
            }

            if(firstElement.equals("@End")){
                driver.quit();
            }
        });

        Given("I go on the {string} page", (String page) -> driver.get(page));

        Then("should the url of the page be {string}", (String page) -> {
            assertEquals(driver.getCurrentUrl(), page);
        });

        When("I will search {string}", (String searchCriteria) -> {
            google = new MainPage(this.driver);
            result = google.search(searchCriteria);
        });

        When("I click the position {string}", (String position) -> {
            result.clickLink(Integer.parseInt(position));
        });

    }

}
