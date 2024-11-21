# Streams and lambdas

In this task repository, you will explore Java's Stream API and lambda expressions. The exercise is divided into parts, each containing a Java class with incomplete methods. Your goal is to complete the logic of these methods using streams and lambdas.

Recommended self-study materials:

* [The Stream API (dev.java)](https://dev.java/learn/api/streams/)
* [Lambda Expressions in Java (Coding with John, YouTube)](https://youtu.be/tj5sLSFjVj4)
* [Optionals In Java (Coding with John, YouTube)](https://youtu.be/vKVzRbsMnTQ)
* [The Java 8 Stream API Tutorial (baeldung.com)](https://www.baeldung.com/java-8-streams)

## Testing the exercises

This exercise package does not include a "main program" (`main` method). Instead of a main program, the package includes [JUnit unit tests](./src/test/java/) for each part of the task. Familiarizing yourself with the tests is not necessary to complete the task, but running the tests is highly recommended to get feedback on the functionality of your solutions.

You can run the unit tests using your code editor's testing tool ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)) or the [Gradle automation tool](https://docs.gradle.org/current/userguide/java_testing.html). If you wish, you can also create your own `main` methods to test the functionality of your solutions.

💡 *You may write additional tests if you wish, but do not modify or delete the pre-written tests.*

💡 *Changing the names, parameters, or return values of the methods and classes specified in the task instructions is not allowed to ensure the tests function correctly.*

## Tehtävän palauttaminen

Palauta tehtävä Gitin `add`-, `commit`- ja `push`-komennoilla edellisten tehtävien tavoin. Voit lähettää ratkaisusi arvioitavaksi niin monta kertaa kuin on tarpeen tehtävän määräaikaan asti. Varmista kuitenkin, että viimeisin suoritus tuottaa parhaat pisteet, koska vain viimeisimmät pisteet jäävät voimaan.


## Osa 1: IntegerStreams *(perusteet, 10 %)*

Tässä osassa opit hyödyntämään [Javan IntStream-luokan](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/IntStream.html) valmiita metodeja, jotka suorittavat tyypillisiä laskuoperaatioita striimeille, jotka sisältävät ainoastaan kokonaislukuja. Tehtävän tukena tarvitset mm. [Javan dokumentaatiota](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/IntStream.html).

Täydennä [`IntegerStreams`-luokassa](./src/main/java/part01/IntegerStreams.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [`IntegerStreamsTest`-testiluokalla](./src/test/java/part01/IntegerStreamsTest.java), jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:

```
./gradlew test --tests IntegerStreamsTest      # unix
.\gradlew.bat test --tests IntegerStreamsTest  # windows
```

## Osa 2: OptionalValues *(perusteet, 10 %)*

Tässä osassa opit käsittelemään tilanteita, joissa stream ei välttämättä sisällä yhtään arvoa, mikä tulee huomioida esimerkiksi keskiarvoa tai ääriarvoja selvitettäessä. Java hyödyntää tällaisissa tilanteissa "optional"-olioita, joista voit lukea lisää Javan dokumentaatiosta: [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Optional.html), [OptionalDouble](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/OptionalDouble.html) ja [OptionalInt](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/OptionalInt.html).

Täydennä [`OptionalValues`-luokassa](./src/main/java/part02/OptionalValues.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [`OptionalValuesTest`-testiluokalla](./src/test/java/part02/OptionalValuesTest.java), jonka voit suorittaa joko koodieditorisi testaustyökalulla tai Gradlella:

```
./gradlew test --tests OptionalValuesTest      # unix
.\gradlew.bat test --tests OptionalValuesTest  # windows
```

## Osa 3: ListsAndStreams *(perusteet, 10 %)*

Tässä osassa opit luomaan striimejä listoista sekä muodostamaan listoja streameista.

Täydennä tiedostossa [ListsAndStreams.java](./src/main/java/part03/ListsAndStreams.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [ListsAndStreamsTest.java](./src/test/java/part03/ListsAndStreamsTest.java)-testiluokalla, jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:

```
./gradlew test --tests ListsAndStreamsTest      # unix
.\gradlew.bat test --tests ListsAndStreamsTest  # windows
```

## Osa 4: MappingStreams *(perusteet, 10 %)*

Tässä osassa opit muodostamaan uusia streameja muuntamalla olemassa olevan streamin arvoja. Muunnoksissa tarvitset operaatioita, jotka toteutetaan tyypillisesti lambda-lausekkeina.

Täydennä tiedostossa [MappingStreams.java](./src/main/java/part04/MappingStreams.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [MappingStreamsTest.java](./src/test/java/part04/MappingStreamsTest.java)-testiluokalla, jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:
```
./gradlew test --tests MappingStreamsTest      # unix
.\gradlew.bat test --tests MappingStreamsTest  # windows
```

## Osa 5: FilteringStreams *(perusteet, 10 %)*

Hyvin tavallinen streamien käyttötapaus on aineiston suodattaminen eli filtteröinti. Tässä osassa opit suodattamaan striimeistä vain tietyt ehdot täyttävät arvot, jotka tulevat osaksi uutta striimiä.

Täydennä tiedostossa [FilteringStreams.java](./src/main/java/part05/FilteringStreams.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [FilteringStreamsTest.java](./src/test/java/part05/FilteringStreamsTest.java)-testiluokalla, jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:

```
./gradlew test --tests FilteringStreamsTest      # unix
.\gradlew.bat test --tests FilteringStreamsTest  # windows
```

## Osa 6: PredicatesWithStreams *(perusteet, 10 %)*

Tässä tehtävässä opit tarkastamaan koko striimiä koskevia ehtoja.

Täydennä tiedostossa [PredicatesWithStreams.java](./src/main/java/part06/PredicatesWithStreams.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [PredicatesWithStreamsTest.java](./src/test/java/part06/PredicatesWithStreamsTest.java)-testiluokalla, jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:

```
./gradlew test --tests PredicatesWithStreamsTest      # unix
.\gradlew.bat test --tests PredicatesWithStreamsTest  # windows
```

## Osa 7: ObjectStreams *(soveltava, 10 %)*

Tässä osassa sovellamme Javan streameja oman [Person](./src/main/java/person/Person.java)-luokan kanssa. Tulet huomaamaan, että omien luokkien käsittely streameilla on lopulta hyvin samanlaista kuin Javan valmiiden tietotyyppien käsittely.

Täydennä tiedostossa [ObjectStreams.java](./src/main/java/part07/ObjectStreams.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [ObjectStreamsTest.java](./src/test/java/part07/ObjectStreamsTest.java)-testiluokalla, jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:

```
./gradlew test --tests ObjectStreamsTest      # unix
.\gradlew.bat test --tests ObjectStreamsTest  # windows
```

## Osa 8: PersonStreams *(soveltava, 10 %)*

Tässä osassa sovellamme oppimaamme ja muunnamme merkkijonoja [Person](./src/main/java/person/Person.java)-olioiksi ja toisin päin. Opimme myös tekemään soveltavia operaatioita, kuten kaikkien striimissä olevien henkilöiden iän kasvattamisen yhdellä vuodella.

Täydennä tiedostossa [PersonStreams.java](./src/main/java/part08/PersonStreams.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [PersonStreamsTest.java](./src/test/java/part08/PersonStreamsTest.java)-testiluokalla, jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:

```
./gradlew test --tests PersonStreamsTest      # unix
.\gradlew.bat test --tests PersonStreamsTest  # windows
```


## Osa 9: PizzaStreams *(edistynyt, 20 %)*

Tehtävän viimeisessä osassa käsittelemme [Pizzoja](./src/main/java/pizza/Pizza.java) ja pizzojen täytteitä streamien avulla. Keskitymme erityisesti ananakseen, joka on täytteenä erityisen kiistanalainen. Ohessa harjoittelemme soveltavia operaatioita, kuten streamien järjestämistä.

Täydennä tiedostossa [PizzaStreams.java](./src/main/java/part09/PizzaStreams.java) olevat metodit niiden kommenttien ja vinkkien mukaisesti. Tehtävän tämä osa testataan [PizzaStreamsTest.java](./src/test/java/part09/PizzaStreamsTest.java)-testiluokalla, jonka voit suorittaa joko koodieditorisi testaustyökalulla, tai Gradlella:

```
./gradlew test --tests PizzaStreamsTest      # unix
.\gradlew.bat test --tests PizzaStreamsTest  # windows
```


## Lisenssi ja tekijät

Tämän tehtävän on kehittänyt Teemu Havulinna ja se on lisensoitu [Creative Commons BY-NC-SA -lisenssillä](https://creativecommons.org/licenses/by-nc-sa/4.0/).

Tehtävänannon, käsiteltävien tiedostojen sekä lähdekoodien toteutuksessa on hyödynnetty ChatGPT 3.5:ttä sekä GitHub copilot -tekoälyavustinta.
