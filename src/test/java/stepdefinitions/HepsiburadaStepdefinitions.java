package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Hepsiburada;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Reusable;

public class HepsiburadaStepdefinitions {

Hepsiburada hepsiburada = new Hepsiburada();


    @Then("User goes to Hepsiburada page")
    public void user_goes_to_hepsiburada_page() {
        Driver.getDriver().get(ConfigReader.getProperty("hepsiburadaUrl"));

    }
    @Then("The customer searches for {string}")
    public void the_customer_searches_for(String search ) {

     hepsiburada.SearchBox.click();

        Reusable.wait(3);

     hepsiburada.SearchBox.sendKeys(search+ Keys.ENTER);


    }
    @Then("tests that search results contain {string}")
    public void tests_that_search_results_contain(String search) {
        String actual = hepsiburada.SearchResults.getText();

        Assert.assertTrue(actual.contains(search));


    }


    @Then("accepts cookies")
    public void acceptsCookies() {

    hepsiburada.cookies.click();


    }


    @Given("siteye git arama yap")
    public void siteye_git_arama_yap() {

        Driver.getDriver().get(ConfigReader.getProperty("hepsiburadaUrl"));


        hepsiburada.cookies.click();
        hepsiburada.SearchBox.click();
        hepsiburada.SearchBox.sendKeys( "kalem" + Keys.ENTER);



    }






}
