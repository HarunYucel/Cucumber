package pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hepsiburada {

    public Hepsiburada(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="onetrust-accept-btn-handler")
    public WebElement cookies;

    @FindBy(className="theme-PWhtyMC28ov8fuPKvrog")
    public WebElement SearchBox;



    @FindBy(className="searchResultSummaryBar-HM2Hk6FnQ2zwnblc0BJb")
    public WebElement SearchResults;







}
