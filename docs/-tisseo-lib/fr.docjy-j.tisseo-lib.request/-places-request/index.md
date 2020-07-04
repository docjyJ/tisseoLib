[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.request](../index.md) / [PlacesRequest](./index.md)

# PlacesRequest

`class PlacesRequest : RequestTemplate` [(source)](https://github.com/docjyj/tisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/request/PlacesRequest.kt#L36)

The class builder to do a Line request.

Please note that the response object for the Place resource is not implemented.
It is possible to get the response string (via the executeAsString () method) and analyze it afterwards.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Create new request builder with no parameters.`PlacesRequest(apiKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [bbox](bbox.md) | Filters stops included in bounding box.`var bbox: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [coordinatesXY](coordinates-x-y.md) | Returns nearest adresses from given x,y coordinates sorted by distance.`var coordinatesXY: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [displayBestPlace](display-best-place.md) | Returns the best result.`var displayBestPlace: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayOnlyAddresses](display-only-addresses.md) | Returns only object of className “address”.`var displayOnlyAddresses: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayOnlyCities](display-only-cities.md) | Returns only object of className “city”.`var displayOnlyCities: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayOnlyPublicPlaces](display-only-public-places.md) | Returns only object of className “public_places”.`var displayOnlyPublicPlaces: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayOnlyRoads](display-only-roads.md) | Returns only object of className “road”.`var displayOnlyRoads: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayOnlyStopAreas](display-only-stop-areas.md) | Returns only object of className “stop”.`var displayOnlyStopAreas: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [lang](lang.md) | Choice of language.`var lang: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [maxDistance](max-distance.md) | Max search around distance.`var maxDistance: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [network](network.md) | Transport operator.`var network: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [number](number.md) | Filters the results return max number by type of place.`var number: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [publicPlaceFilter](public-place-filter.md) | List of public places to explose.`var publicPlaceFilter: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [simple](simple.md) | Formatting the json output for jquery.`var simple: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [srid](srid.md) | Spatial reference number projection. [see](https://en.wikipedia.org/wiki/SRID)`var srid: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [term](term.md) | Text string. (3 characters minimum)`var term: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |

### Functions

| Name | Summary |
|---|---|
| [execute](execute.md) | Execute the request.`fun execute(): `[`PlacesResponse`](../../fr.docjy-j.tisseo-lib.response/-places-response/index.md) |
| [executeAsString](execute-as-string.md) | Execute the request.`fun executeAsString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getUrl](get-url.md) | Show the URL.`fun getUrl(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
