package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class Editorpage {


    public Editorpage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath="(//button[@type='button'])[1]")
    public WebElement newbutton;

    @FindBy(xpath="//input[@id='DTE_Field_first_name']")
    public WebElement firstname;

    @FindBy(xpath="//input[@id='DTE_Field_last_name']")
    public WebElement lastnime;

    @FindBy(xpath="//button[text()='Create']")
    public WebElement create;

    @FindBy(xpath="//input[@type='search']")
    public WebElement search;
    @FindBy(xpath = "//td[@class='sorting_1']")
    public  WebElement searchResult;



}
