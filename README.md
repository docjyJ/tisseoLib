# Tisséo API Librairie
Bibliothèque pour simplifier les appels à l'API Tisséo en Java.

## Information
Ni créér, ni cautionner par Tisséo 

L'API tisséo est sous lisence ODbL. [Plus d'information](https://data.toulouse-metropole.fr/page/licence/)

Vous êtes résponsable des requête éffectuer.

## Usage
Télécharger la dernière vertion. [(1.0-alpha)](https://github.com/docjyJ/TisseoLib/releases/tag/1.0-alpha)

Seul les resource suivante sont pris en charge : (les autre sont à venir)
- stop_area
- stop_points
- networks
- lines
- messages

Se référer à la documentation fournis par tisséo pour les resource, les parrametres et les réponses possible, ansi que pour la façon d'obtenir une cléf.

[https://data.toulouse-metropole.fr/explore/dataset/api-temps-reel-tisseo/](https://data.toulouse-metropole.fr/explore/dataset/api-temps-reel-tisseo/)

## Exemple

```java
//Creation de l'objet
Tisseo tisseo = new Tisseo("[Votre clef]");

try {
 //Création de la requête
 StopAreaResponse response = tisseo.stopArea()
  .setLineId("11821949021892003")
  .setDisplayCoordXY(true)
  .execute();

 System.out.println(response.toString());
}
catch (TisseoException e) {
 e.printStackTrace(); 
}
```
Pllus d'exemple [ici](src/test/java/Example.java)
