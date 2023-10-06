# Streamit ja Lambdat

Tässä tehtävärepositoriossa perehdytään Javan stream-apiin sekä lambda-lausekkeisiin.

Harjoitus on jaettu osiin, joista jokainen sisältää Java-luokan, jossa on keskeneräisiä metodeja. Tavoitteesi on täydentää näiden metodien logiikkaa käyttäen streameja ja lambdoja.


## Tehtävien testaaminen

Tämä tehtäväpaketti ei sisällä ns. "pääohjelmaa". Pääohjelman sijasta paketti sisältää jokaiselle tehtävän osalle omat [JUnit-yksikkötestit](./src/test/java/). Testeihin perehtyminen ei ole tehtävän suorittamiseksi välttämätöntä, mutta testien suorittaminen on ehdottomasti suositeltua, jotta saat palautetta tekemiesi ratkaisujen toimivuudesta. Voit suorittaa yksikkötestit koodieditorisi testaustyökalulla ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)) tai [Gradle-automaatiotyökalulla](https://docs.gradle.org/current/userguide/java_testing.html). Halutessasi voit myös toteuttaa omia `main`-metodeja, joiden avulla kokeilet ratkaisujesi toimivuutta.

💡 *Saat kirjoittaa halutessasi lisää testejä, mutta älä muuta tai poista valmiiksi kirjoitettuja testejä.*

💡 *Tehtävänannossa määritettyjen metodien ja luokkien nimien, parametrien tai paluuarvojen muuttaminen ei ole sallittua testien toimivuuden varmistamiseksi.*


## Tehtävän palauttaminen

Palauta tehtävä Gitin `add`-, `commit`- ja `push`-komennoilla edellisten tehtävien tavoin.

Jos teet tehtävää ratkoessasi tiedostoihin muutoksia, jotka haluat perua, voit palauttaa tiedoston edelliseen tilaan `git restore <file>...`-komennolla.



## Osa 1: Laskuoperaatiot Streamien avulla *(perusteet, 10 %)*

Opit hyödyntämään IntStream-luokan valmiita metodeja, jotka suorittavat laskuoperaatioita striimeille.

Täydennä tiedostossa [IntegerStreams.java](./src/main/java/part01/IntegerStreams.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [IntegerStreamsTest.java](./src/test/java/part01/IntegerStreamsTest.java)-testiluokalla, jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:
```
./gradlew test --tests IntegerStreamsTest      # unix
gradlew.bat test --tests IntegerStreamsTest    # windows
```

## Osa 2: Optional *(perusteet, 10 %)*

Tässä osassa opit myös käsittelemään tilanteita, joissa striimi ei välttämättä sisällä yhtään arvoa, mikä tulee huomioida esimerkiksi keskiarvoa tai ääriarvoja selvitettäessä.

Täydennä tiedostossa [OptionalValues.java](./src/main/java/part02/OptionalValues.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [OptionalValuesTest.java](./src/test/java/part02/OptionalValuesTest.java)-testiluokalla, jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:
```
./gradlew test --tests OptionalValuesTest      # unix
gradlew.bat test --tests OptionalValuesTest    # windows
```

## Osa 3: Listat ja streamit *(perusteet, 10 %)*

Tässä osassa opit luomaan striimejä listoista sekä muodostamaan listoja streameista.

Täydennä tiedostossa [ListsAndStreams.java](./src/main/java/part03/ListsAndStreams.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [ListsAndStreamsTest.java](./src/test/java/part03/ListsAndStreamsTest.java)-testiluokalla, jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:
```
./gradlew test --tests ListsAndStreamsTest      # unix
gradlew.bat test --tests ListsAndStreamsTest    # windows
```

## Osa 4: Map-operaatio *(perusteet, 10 %)*

Tässä osassa opit muodostamaan uusia streameja muuntamalla olemassa olevan streamin arvoja. Muunnoksissa tarvitset tyypillisesti operaatioita, jotka toteutetaan labmda-lausekkeina.

Täydennä tiedostossa [MappingStreams.java](./src/main/java/part04/MappingStreams.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [MappingStreamsTest.java](./src/test/java/part04/MappingStreamsTest.java)-testiluokalla, jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:
```
./gradlew test --tests MappingStreamsTest      # unix
gradlew.bat test --tests MappingStreamsTest    # windows
```

## Osa 5: Filter-operaatio *(perusteet, 10 %)*

Tässä osassa opit suodattamaan striimeistä vain tietyt ehdot täyttävät arvot, jotka tulevat osaksi uutta striimiä.

Täydennä tiedostossa [FilteringStreams.java](./src/main/java/part05/FilteringStreams.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [FilteringStreamsTest.java](./src/test/java/part05/FilteringStreamsTest.java)-testiluokalla, jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:
```
./gradlew test --tests FilteringStreamsTest      # unix
gradlew.bat test --tests FilteringStreamsTest    # windows
```

## Osa 6: Predikaatit *(perusteet, 10 %)*

Täydennä tiedostossa [PredicatesWithStreams.java](./src/main/java/part06/PredicatesWithStreams.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [PredicatesWithStreamsTest.java](./src/test/java/part06/PredicatesWithStreamsTest.java)-testiluokalla, jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:

```
./gradlew test --tests PredicatesWithStreamsTest      # unix
gradlew.bat test --tests PredicatesWithStreamsTest    # windows
```

## Osa 7: Oliot *(soveltava, 20 %)*

Täydennä tiedostossa [ObjectStreams.java](./src/main/java/part07/ObjectStreams.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [ObjectStreamsTest.java](./src/test/java/part07/ObjectStreamsTest.java)-testiluokalla, jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:

```
./gradlew test --tests ObjectStreamsTest      # unix
gradlew.bat test --tests ObjectStreamsTest    # windows
```

## Osa 8: Soveltaminen *(soveltava, 20 %)*

Täydennä tiedostossa [PersonStreams.java](./src/main/java/part08/PersonStreams.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [PersonStreamsTest.java](./src/test/java/part08/PersonStreamsTest.java)-testiluokalla, jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:

```
./gradlew test --tests PersonStreamsTest      # unix
gradlew.bat test --tests PersonStreamsTest    # windows
```


## Lisenssi ja tekijät

Tämän tehtävän on kehittänyt Teemu Havulinna ja se on lisensoitu [Creative Commons BY-NC-SA -lisenssillä](https://creativecommons.org/licenses/by-nc-sa/4.0/).

Tehtävänannon, käsiteltävien tiedostojen sekä lähdekoodien toteutuksessa on hyödynnetty ChatGPT 3.5:ttä sekä GitHub copilot-tekoälyavustinta.
