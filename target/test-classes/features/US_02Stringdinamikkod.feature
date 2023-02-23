

  Feature: US1001_kullanici amazonda farkli urunler aratır


  Background: kullanıcı ortak adimlaricin bacground kullanir

    Given kullanici amazon sayfasina gider


Scenario:
      And "iphone" icin arama yapar

  Then sonuclarin "iphone" icerdigini test eder

Scenario:
      And "tea pot" icin arama yapar
      Then sonuclarin "tea pot" icerdigini test eder

Scenario:
      And "flower" icin arama yapar
      Then sonuclarin "flower" icerdigini test eder

      Then Tumsayfalari kapatir
