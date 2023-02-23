package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Editorpage;
import utilities.ConfigReader;
import utilities.Driver;

public class Editorstepdefinitions {
    Editorpage editorpage=new Editorpage();
    @Then("When kullanici {string} adresine gider")
    public void whenKullaniciAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @Given("new butonuna basar")
    public void newButonunaBasar() {
        editorpage.newbutton.click();
    }

    @And("tum bilgileri girer{string} and {string}")
    public void tumBilgileriGirerAnd(String isim, String soyisim) {
        editorpage.firstname.sendKeys(isim);
        editorpage.lastnime.sendKeys(soyisim);
    }



    @And("Create tusuna basar")
    public void createTusunaBasar() {
        editorpage.create.click();
    }

    @When("kullanici{string} ve {string} ile arama yapar")
    public void kullaniciVeIleAramaYapar(String isim, String soyisim) {
        editorpage.search.sendKeys(isim +" "+ soyisim );
    }

    @Then("arama sonucunda {string} ve  {string} kayıt oldugunu gorur")
    public void aramaSonucundaVeKayıtOldugunuGorur(String isim, String soyad) {
        Assert.assertTrue(editorpage.searchResult.getText().contains(isim +" "+soyad));
    }
}
