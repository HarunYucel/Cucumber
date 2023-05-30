package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Reusable;

public class TrendyolStepdefinitions {

Trendyol trendyol = new Trendyol();

    @When("User goes to Trendyol page")
    public void user_goes_to_trendyol_page() {
        Driver.getDriver().get(ConfigReader.getProperty("trendyolUrl"));
        trendyol.TrendCookies.click();
    }
    @Then("The customer searches Trendyol for {string}")
    public void the_customer_searches_trendyol_for(String search) {
        Reusable.wait(3);
     trendyol.TrendSearchBox.sendKeys(search+ Keys.ENTER);

    }
    @Then("Trendyol tests that search results contain {string}")
    public void trendyol_tests_that_search_results_contain(String search) {

        Assert.assertTrue(trendyol.SearchResults.getText().contains(search));

        Driver.quitDriver();



    }





}
