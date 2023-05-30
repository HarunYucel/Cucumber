
Feature: kullanici farklı isim ve pasword ile Qademy sitesine giris yapar
  Background: ortak bolumler
    Given kullanici "qdurl" sayfasina gider
    And accept cookies

 Scenario Outline: Kullanici gecersiz isim ve pasword ile giris yapmamali
   Then ilk sayfa login linkine click yapar
   Given manuel olarak email "<gecersizkullaniciadi>" yazar
   Given manuel olarak pasword "<gecersizPasword>" yazar
   Given giris yapılamadigini test eder




  Examples:
  |gecersizkullaniciadi | gecersizPasword|
     | doyitap469@tingn.com|Hy270154! |
     | Manager6@gmail.com|  Manager6|
     | Manager7@gmail.com|  Manager7|
     |Manager8@gmail.com | Manager8 |
     |Manager9@gmail.com | Manager9 |



