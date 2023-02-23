
Feature: kullanicinin amazon sayfasına gitmesi

  @wip
  Scenario:kullanici amazonda urunler aratir


    Given kullanici amazon sayfasina gider
    And iphone icin arama yapar
    Then sonuclarin Iphone icerdigini test eder
    Given kullanici amazon sayfasina gider
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder
    Given kullanici amazon sayfasina gider
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder

