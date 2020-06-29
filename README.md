# Tisséo API Library
Library to simplify calls to the Tisséo API in Java.

## Information before usage
This library is neither created nor approved by Tisséo.

The Tisséo API is licensed under ODbL. [More information (french)](https://data.toulouse-metropole.fr/page/licence/)

You are responsible for requests made with this library.

## Usage
Download the latest version. [(2.0-alpha)](https://github.com/docjyJ/TisseoLib/releases/tag/2.0-alpha)

Only the following resources are supported: *(others are coming)*
- stop_area
- stop_points
- networks
- lines
- messages
- stops_schedules *(in the next version)*
- jouneys *(in the next version)*

Refer to the documentation provided by Tisséo (French and English) for resources, parameters, possible responses, as well as how to obtain a key.

[https://data.toulouse-metropole.fr/explore/dataset/api-temps-reel-tisseo/](https://data.toulouse-metropole.fr/explore/dataset/api-temps-reel-tisseo/)

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
More example [here](src/test/java/Example.java)

### KOTLIN

```kotlin
fun stopArea() = StopAreaRequest(API_KEY) //Create request object
    .apply { //Set parameters
        lineId = "11821949021892003"
        displayCoordXY = true
    }
    .execute() //Execute request
```
More example [here](src/test/kotlin/Example.kt)
