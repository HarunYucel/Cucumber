package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Trendyol {

    public Trendyol(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
    public WebElement TrendCookies;

    @FindBy(className="V8wbcUhU")
    public WebElement TrendSearchBox;



    @FindBy(xpath="//div[@class='dscrptn']")
    public WebElement SearchResults;







}
