# Tisséo API Library [![download_latest-release](https://img.shields.io/github/v/release/docjyJ/TisseoLib?label=download&logo=java&style=flat-square)](https://github.com/docjyJ/TisseoLib/releases/latest)
Library to simplify calls to the Tisséo API in Java.

## Information before usage
This library is neither created nor approved by Tisséo.

The Tisséo API is under [ODbL](http://opendatacommons.org/licenses/odbl/1.0/) license. [More information (french)](https://data.toulouse-metropole.fr/page/licence/)

You are responsible for requests made with this library.

## Usage
Download the [latest version](https://github.com/docjyJ/TisseoLib/releases/latest).

Only the following resources are support: *(others are coming)*
- stop_area
- stop_points
- networks
- lines
- messages
- stops_schedules
- journeys

## Documentation
See the Library documentation [here](https://docjyj.github.io/TisseoLib/-tisseo-lib/)

Refer to the documentation provided by Tisséo (French and English) for resources, parameters, responses and as well as how to obtain a key.

[https://data.toulouse-metropole.fr/explore/dataset/api-temps-reel-tisseo/](https://data.toulouse-metropole.fr/explore/dataset/api-temps-reel-tisseo/).

## Example

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
More example [here](src/test/java/Example.java).

### KOTLIN

```kotlin
fun stopArea() = StopAreaRequest(API_KEY) //Create request object
    .apply { //Set parameters
        lineId = "11821949021892003"
        displayCoordXY = true
    }
    .execute() //Execute request
```
More example [here](src/test/kotlin/Example.kt).