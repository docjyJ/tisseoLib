# Tisséo API Library [![download_latest-release](https://img.shields.io/github/v/release/docjyJ/TisseoLib?label=download&logo=java&style=flat-square)](https://github.com/docjyJ/TisseoLib/releases/latest)
Library to simplify calls to the Tisséo API in Java.

This library require [Kotlin Standard Library JDK 8 1.3.72](https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-stdlib-jdk8/1.3.72).

This library require [Gson 2.8.6](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.6).

This library require [JTS Core 1.16.1](https://mvnrepository.com/artifact/org.locationtech.jts/jts-core/1.16.1).

## Information before usage
This library is neither created nor approved by Tisséo.

The Tisséo API is under [ODbL](http://opendatacommons.org/licenses/odbl/1.0/) license. [More information (french)](https://data.toulouse-metropole.fr/page/licence/)

You are responsible for requests made with this library.

## Documentation
See the Library documentation [here](docs/-tisseo-lib/index.md)

Refer to the documentation provided by Tisséo (French and English) for resources, parameters, responses and as well as how to obtain a key.

[https://data.toulouse-metropole.fr/explore/dataset/api-temps-reel-tisseo/](https://data.toulouse-metropole.fr/explore/dataset/api-temps-reel-tisseo/).

## Usage Example
### JAVA

```java
public StopAreaResponse stopArea() throws TisseoException {
    //Create request object
    StopAreaRequest request = new StopAreaRequest(API_KEY);

    //Set parameters
    request.setLineId("11821949021892003");
    request.setDisplayCoordXY(true);

    //Execute request
    return request.execute();
}
```
More example [here](docs/exemple-java.md).

### KOTLIN

```kotlin
fun stopArea() = StopAreaRequest(API_KEY) //Create request object
    .apply { //Set parameters
        lineId = "11821949021892003"
        displayCoordXY = true
    }
    .execute() //Execute request
```
More example [here](docs/example-kotlin.md).
