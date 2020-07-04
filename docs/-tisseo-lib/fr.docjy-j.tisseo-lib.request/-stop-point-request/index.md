[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.request](../index.md) / [StopPointRequest](./index.md)

# StopPointRequest

`class StopPointRequest : RequestTemplate` [(source)](https://github.com/docjyj/tisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/request/StopPointRequest.kt#L29)

The class builder to do a Stop Point request.

### Properties

| Name | Summary |
|---|---|
| [bbox](bbox.md) | Filters stops included in bounding box.`var bbox: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [displayCoordXY](display-coord-x-y.md) | Adds coordinates details of each stop. (stop and logical stopping post)`var displayCoordXY: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayDestinations](display-destinations.md) | Adds line destinations.`var displayDestinations: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayLines](display-lines.md) | Adds lines serving each stop point.`var displayLines: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayStopsWithoutDeparture](display-stops-without-departure.md) | Filters only stops for which there is no departure (and lines / if destinations is requested). For example, without this setting no line is returned.`var displayStopsWithoutDeparture: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [lineId](line-id.md) | Filters stops by ID line.`var lineId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [network](network.md) | Transport operator.`var network: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [number](number.md) | Limit number of results to return.`var number: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [sortByDistance](sort-by-distance.md) | Sorting results by distance from the center of the bounding box.`var sortByDistance: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [srid](srid.md) | Spatial reference number projection. [see](https://en.wikipedia.org/wiki/SRID)`var srid: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [stopAreaId](stop-area-id.md) | Filters only on the id stop zone.`var stopAreaId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [timeframe](timeframe.md) | Number of days covering research, the day time interval is a single day by default.`var timeframe: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |

### Functions

| Name | Summary |
|---|---|
| [execute](execute.md) | Execute the request.`fun execute(): `[`StopPointResponse`](../../fr.docjy-j.tisseo-lib.response/-stop-point-response/index.md) |
| [executeAsString](execute-as-string.md) | Execute the request.`fun executeAsString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getUrl](get-url.md) | Show the URL.`fun getUrl(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
