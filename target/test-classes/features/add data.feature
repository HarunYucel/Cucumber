
Feature: kullanici data ekleme
Scenario Outline:kullanici_data_ekleyebilmeli

  Then When kullanici "editorurl" adresine gider
  Given new butonuna basar
  And tum bilgileri girer"<isim>" and "<soyisim>"
  And Create tusuna basar
  When kullanici"<isim>" ve "<soyisim>" ile arama yapar
  Then arama sonucunda "<isim>" ve  "<soyisim>" kayıt oldugunu gorur


  Examples:
|  isim   | soyisim|
| faruk   |  yucel |
|harun   |  yucel   |
|hakan   |  yildiz  |
|ahmet   |  yo      |
|hakan   |    mo    |



