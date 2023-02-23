package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Amazonpage;
import utilities.ConfigReader;
import utilities.Driver;

public class Amazonstepdefinitions {


Amazonpage amazonpage = new Amazonpage();

    @Given("kullanici amazon sayfasina gider")
     public void kullanici_amazon_sayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Given("iphone icin arama yapar")
    public void i_phone_icin_arama_yapar() {
       amazonpage.amazonAramaKutusu.sendKeys("iphone"+ Keys.ENTER);

    }

    @Then("sonuclarin Iphone icerdigini test eder")
    public void sonuclarin_iphone_icerdigini_test_eder() {

       String actualsonuc = amazonpage.aramaSonucuElementi.getText();
       String expectedsonuc = "iphone";

        Assert.assertTrue(actualsonuc.contains(expectedsonuc));

    }

    @Given("tea pot icin arama yapar")
    public void tea_pot_icin_arama_yapar() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
       amazonpage.amazonAramaKutusu.sendKeys("tea pot"+Keys.ENTER);
    }

    @Then("sonuclarin tea pot icerdigini test eder")
    public void sonuclarin_tea_pot_icerdigini_test_eder() {

        String actualsonuc= amazonpage.aramaSonucuElementi.getText();

        Assert.assertTrue(actualsonuc.contains("tea pot"));

    }

    @Given("flower icin arama yapar")
    public void flower_icin_arama_yapar() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        amazonpage.amazonAramaKutusu.sendKeys("flower"+Keys.ENTER);

    }

    @Then("sonuclarin flower icerdigini test eder")
    public void sonuclarin_flower_icerdigini_test_eder() {

        String actualsonuc = amazonpage.aramaSonucuElementi.getText();

        Assert.assertTrue(actualsonuc.contains("flower"));

        Driver.quitDriver();

    }


    @And("{string} icin arama yapar")
    public void icinAramaYapar(String aranacakurun) {

     amazonpage.amazonAramaKutusu.sendKeys(aranacakurun+Keys.ENTER);




    }

    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananUrun) {

   String actualsonuc = amazonpage.aramaSonucuElementi.getText();

   Assert.assertTrue(actualsonuc.contains(arananUrun));

    }


    @Then("Tumsayfalari kapatir")
    public void tumsayfalariKapatir() {
        Driver.quitDriver();

    }




    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
      Driver.closeDriver();
    }


    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String aranan) {

      amazonpage.amazonAramaKutusu.sendKeys(aranan+Keys.ENTER);
    }

    @Then("arama sonuclarının {string} icerdigini test eder")
    public void aramaSonuclarınınIcerdiginiTestEder(String aranan) {

    String actual = amazonpage.aramaSonucuElementi.getText();

    Assert.assertTrue(actual.contains(aranan));
    }
}


