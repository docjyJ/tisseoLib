[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.request](../index.md) / [JourneysRequest](./index.md)

# JourneysRequest

`class JourneysRequest : `[`TisseoRequest`](../-tisseo-request/index.md) [(source)](https://github.com/docjyJ/TisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/request/JourneysRequest.kt#L38)

The class builder to do a Journeys request.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Create new request builder with no parameters.`JourneysRequest(apiKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [arrivalPlace](arrival-place.md) | Arrival address or stop name.`var arrivalPlace: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [arrivalPlaceXY](arrival-place-x-y.md) | The arrivalPlaceXY propriety.`var arrivalPlaceXY: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [departurePlace](departure-place.md) | Departure address or stop name.`var departurePlace: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [departurePlaceXY](departure-place-x-y.md) | Departure coordinates.`var departurePlaceXY: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [displayMessages](display-messages.md) | Returns in extra id, service disruption messages.`var displayMessages: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayResultTable](display-result-table.md) | Add routes summary in table form.`var displayResultTable: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayWording](display-wording.md) | Returns human description for each section of the course.`var displayWording: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [firstDepartureDatetime](first-departure-datetime.md) | First date time of departure.`var firstDepartureDatetime: LocalDateTime?` |
| [lastDepartureDatetime](last-departure-datetime.md) | Last date time of departure.`var lastDepartureDatetime: LocalDateTime?` |
| [maxApproachDistance](max-approach-distance.md) | Maximum walking distance.`var maxApproachDistance: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [maxTransferDuration](max-transfer-duration.md) | Is the maximum travel time.`var maxTransferDuration: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [maxTransferNumber](max-transfer-number.md) | Specifies the maximum number of matches to use.`var maxTransferNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [networkList](network-list.md) | Network Transport operators number.`var networkList: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [number](number.md) | Max number of results.`var number: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [roadMaxDistance](road-max-distance.md) | Maximum distance of all road sections (unless a different startRoadMaxDistance specified) including the begining and the end of the journey.`var roadMaxDistance: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [roadMode](road-mode.md) | Specifies the mode in which the portions are made of any path "Transit" at the beginning (unless a "startRoadMode" different is specified) or at the end of the journey.`var roadMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [roadSpeed](road-speed.md) | Velocity (meter by seconds) of selected roadMode.`var roadSpeed: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`?` |
| [rollingStockList](rolling-stock-list.md) | Rolling Stock List (Bus, Metro, Tram, ...) to take into account in the calculation.`var rollingStockList: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [srid](srid.md) | Spatial reference number projection. [see](https://en.wikipedia.org/wiki/SRID)`var srid: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [startRoadMaxDistance](start-road-max-distance.md) | Maximum distance for departure road section.`var startRoadMaxDistance: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [startRoadMode](start-road-mode.md) | Conveyance with which to perform the portion of the road path at the beginning of the journey.`var startRoadMode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [startRoadSpeed](start-road-speed.md) | Speed (meter by seconds) of selected roadMode.`val startRoadSpeed: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`?` |

### Functions

| Name | Summary |
|---|---|
| [execute](execute.md) | Execute the request.`fun execute(): `[`JourneysResponse`](../../fr.docjy-j.tisseo-lib.response/-journeys-response/index.md) |
| [executeAsString](execute-as-string.md) | Execute the request.`fun executeAsString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getUrl](get-url.md) | Show the URL.`fun getUrl(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
