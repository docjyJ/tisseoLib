# Tisséo API Librairie
Bibliothèque pour simplifier les appels à l'API Tisséo en Java.

## Information
Ni créér, ni cautionner par Tisséo 

L'API tisséo est sous lisence ODbL. [Plus d'information](https://data.toulouse-metropole.fr/page/licence/)

Vous êtes résponsable des requête éffectuer.

## Usage
Télécharger la dernière vertion. [(2.0-alpha)](https://github.com/docjyJ/TisseoLib/releases/tag/2.0-alpha)

Seul les resource suivante sont pris en charge : *(les autres sont à venir)*
- stop_area
- stop_points
- networks
- lines
- messages
- stops_schedules *(dans la prochaine vertion)*

Se référer à la documentation fournis par tisséo pour les resource, les parrametres et les réponses possible, ansi que pour la façon d'obtenir une cléf.

[https://data.toulouse-metropole.fr/explore/dataset/api-temps-reel-tisseo/](https://data.toulouse-metropole.fr/explore/dataset/api-temps-reel-tisseo/)

## Example

### JAVA

```java
//Creation de l'objet
public StopAreaResponse stopArea() throws TisseoException {
    //Create request Object
    StopAreaRequest request = new StopAreaRequest(API_KEY);

    //set parameters
    request.setLineId("11821949021892003");
    request.setDisplayCoordXY(true);

    //Execute request
    return request.execute();
}
```
Pllus d'exemple [ici](src/test/java/Example.java)

### KOTLIN

```kotlin
//Creation de l'objet
fun stopArea() = StopAreaRequest(API_KEY)
    .apply { //set parameters
        lineId = "11821949021892003"
        displayCoordXY = true
    }
    .execute() //Execute request
}
```
Pllus d'exemple [ici](src/test/kotlin/Example.kt)
