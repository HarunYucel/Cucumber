package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QAdemypage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Reuseable;

public class QualityDemySteps {

    QAdemypage qAdemypage = new QAdemypage();
    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String qdurl) {
        Driver.getDriver().get(ConfigReader.getProperty("qdurl"));

    }

    @Then("ilk sayfa login linkine click yapar")
    public void ilkSayfaLoginLinkineClickYapar() {
        qAdemypage.QAilkloginlink.click();

    }

    @Given("manuel olarak email {string} yazar")
    public void manuelOlarakEmailYazar(String gecersizkullaniciadi) {
        qAdemypage.emailTextBox.sendKeys(gecersizkullaniciadi);

    }

    @Given("manuel olarak pasword {string} yazar")
    public void manuelOlarakPaswordYazar(String gecersizPasword) {


        qAdemypage.password.sendKeys(gecersizPasword);

    }

    @Given("giris yapılamadigini test eder")
    public void girisYapılamadiginiTestEder() {

        qAdemypage.submit.click();

        Reuseable.bekle(2);

     Assert.assertTrue(qAdemypage.submit.isDisplayed());

    }


    @And("accept cookies")
    public void acceptCookies() {
        qAdemypage.cookies.click();
    }
}
