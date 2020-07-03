[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.request](../index.md) / [StopSchedulesRequest](./index.md)

# StopSchedulesRequest

`class StopSchedulesRequest : `[`TisseoRequest`](../-tisseo-request/index.md) [(source)](https://github.com/docjyJ/TisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/request/StopSchedulesRequest.kt#L29)

The class builder to do a Stop Schedules request.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Create new request builder with no parameters.`StopSchedulesRequest(apiKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [datetime](datetime.md) | Date and time at which we request the schedules.`var datetime: LocalDateTime?` |
| [displayRealTime](display-real-time.md) | Allows specify « theoretical » or « real time » passages time.`var displayRealTime: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [firstAndLastOfDay](first-and-last-of-day.md) | Will return only first and last departure of the day.`var firstAndLastOfDay: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [lineId](line-id.md) | Filters schedules of a specific line.`var lineId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [maxDays](max-days.md) | Number of days used to get “number” departures.`var maxDays: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [network](network.md) | Transport operator.`var network: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [number](number.md) | Max returned results number.`var number: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [operatorCode](operator-code.md) | Operator code. (id used by transport operator)`var operatorCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [stopAreaId](stop-area-id.md) | Is the number of logical stop point. (zone)`var stopAreaId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [stopPointId](stop-point-id.md) | Is the number of physical stop point.`var stopPointId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [stopsList](stops-list.md) | A list of stop areas or stop points (or both) separated by commas. Allows you to filter them in each argument by business line or direction.`var stopsList: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [timetableByArea](timetable-by-area.md) | Groups the results by stop areas then couples (line, destination) ordered by time of next departure.`var timetableByArea: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |

### Functions

| Name | Summary |
|---|---|
| [execute](execute.md) | Execute the request.`fun execute(): `[`StopSchedulesResponse`](../../fr.docjy-j.tisseo-lib.response/-stop-schedules-response/index.md) |
| [executeAsString](execute-as-string.md) | Execute the request.`fun executeAsString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getUrl](get-url.md) | Show the URL.`fun getUrl(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
