package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendyolPages {

    public TrendyolPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
