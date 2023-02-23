package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.Reuseable;

public class QAdemypage {

    public QAdemypage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement QAilkloginlink;

    @FindBy(id = "login-email")
    public WebElement emailTextBox;

    @FindBy(id = "login-password")
    public WebElement password;

    @FindBy(xpath = "(//*[text()='Login'])[2]")
    public WebElement submit;

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement cookies;
    public  void handleCookies(){
        if(cookies.isDisplayed()) {
            cookies.click();
            Reuseable.bekle(2);
        }
    }



}
