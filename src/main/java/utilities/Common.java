package utilities;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Optional;

public class Common {

    public static WebElement searchByText (String text, List<WebElement> ele) {
        Optional<WebElement> result =
                ele.stream().filter(item -> text.equals(item.getText())).findFirst();
        return result.get();
    }

}

