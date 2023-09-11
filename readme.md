# Streams & Lambdas Kata

Tämä repositio sisältää harjoituksia, joiden avulla voit harjoitella Javan stream:ien ja lambda-lausekkeiden perusteita. Jokainen harjoitus sisältää Java-luokan, jossa on keskeneräisiä metodeja. Tavoitteesi on täydentää näiden metodien logiikkaa käyttäen stream:eja ja lambdoja. Suorita harjoitukset valmiiksi ja tarkista ratkaisut ajamalla esikirjoitetut JUnit-yksikkötestit Gradlella.


## Aloitusohjeet

Seuraa näitä vaiheita päästäksesi alkuun harjoitusten kanssa:

1. **Kloonaa repositio**: Kloonaa Git-repositorio paikalliselle koneellesi. Huom! Harjoitus täytyy tehdä omassa kopiossasi, eli varmista, että repositorion osoitteessa on mukana oma GitHub-käyttäjätunnuksesi!

    ```bash
    git clone https://github.com/varmista-etta-github-tunnuksesi-on-repositorion-osoitteessa.git
    ```

1. **Avaa projekti VS Code:ssa**

    Täydennä harjoitukset: avaa hakemisto `src/main/java/`. Tässä hakemistossa löydät Java-paketit ja luokat jokaiselle harjoitukselle. Jokaisessa luokassa on keskeneräisiä metodeja ja kommentteja, jotka kuvaavat odotettua toiminnallisuutta. Tehtäväsi on täydentää metodien koodi käyttäen stream:eja ja lambdoja.

    Tarkista ratkaisut: Jokaiselle harjoitukselle on esikirjoitetut yksikkötestit ratkaisujen tarkistamiseksi. Voit suorittaa testit Gradlella:

    ```sh
    ./gradlew test       # unix
    gradlew.bat test     # windows
    ```

1. **Lähetä ratkaisusi**: Kun olet suorittanut harjoitukset, voit lähettää ratkaisusi `git add`-, `git commit`- ja `git push`-komennoilla. Tehtävät tarkistetaan automaattisesti lähetyksen jälkeen samoilla yksikkötesteillä, joita voit käyttää itse tehtävien tarkastamiseen.


## Harjoitusten rakenne

Jokainen harjoitus on rakennettu seuraavasti:

    * Java-luokat, jotka sisältävät harjoitukset, löytyvät hakemistosta [src/main/java/](./src/main/java/).
        * Kustakin luokasta löytyvät metodit, joissa on kommentteja, jotka kuvaavat metodin odotettua toimintaa.
        * Tehtäväsi on muokata metodien koodia saavuttaaksesi halutun toiminnallisuuden käyttäen Java-virtoja ja lambdoja.
    * Luokille on kirjoitettu valmiit testit, jotka löytyvät hakemistosta [src/test/java/](./src/test/java/).
        * Testien tutkiminen ei ole välttämätöntä tehtävien ratkaisemiseksi, mutta siitä voi olla apua.


Tsemppiä koodaukseen!

----

Special thanks to [ChatGPT](https://www.openai.com/) for assistance in creating this README.

