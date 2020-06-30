[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.request](../index.md) / [StopAreaRequest](./index.md)

# StopAreaRequest

`class StopAreaRequest` [(source)](https://github.com/docjyJ/TisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/request/StopAreaRequest.kt#L26)

The class builder to do a Stop Area request.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Create new request builder with no parameters.`StopAreaRequest(apiKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [bbox](bbox.md) | Filters stops included in bounding box`var bbox: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [displayArrivalOnlyLines](display-arrival-only-lines.md) | Filters only lines which arrive to stops (and which do not start from) No effect displayLines is 0`var displayArrivalOnlyLines: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayCoordXY](display-coord-x-y.md) | Adds centroid coordonate lines of each stop`var displayCoordXY: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayLines](display-lines.md) | Adds lines of each stop`var displayLines: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayStopPoints](display-stop-points.md) | Display stop point of stop areas`var displayStopPoints: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [ignoreUnservedStops](ignore-unserved-stops.md) | Ignore unserved stop in the given timeframe`var ignoreUnservedStops: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [lineId](line-id.md) | Filters stops by line`var lineId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [network](network.md) | Transport operator`var network: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [srid](srid.md) | spatial reference number projection [see](https://en.wikipedia.org/wiki/SRID)`var srid: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [terminusId](terminus-id.md) | Filters on stop areas arriving and departing from this terminal only`var terminusId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [timeframe](timeframe.md) | Number of days to calculate which lines pass through a given point`var timeframe: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |

### Functions

| Name | Summary |
|---|---|
| [execute](execute.md) | Execute the request.`fun execute(): `[`StopAreaResponse`](../../fr.docjy-j.tisseo-lib.model.stop-area/-stop-area-response/index.md) |
| [executeAsString](execute-as-string.md) | Execute the request.`fun executeAsString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
