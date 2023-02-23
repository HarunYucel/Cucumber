
Feature: kullanici amazonda birden fazla urun aratir

 Background: kullanici amazonda urunler aratir

   Then kullanici amazon sayfasina gider

   Scenario Outline: kullanici amazonda example listesine gore urunler aratir

     Then kullanici "<aranan>" icin arama yapar
     Then arama sonuclarının "<aranan>" icerdigini test eder
     And sayfayi kapatir

Examples:
| aranan |
 | iphone  |
 | tea pot  |
 | flower  |
