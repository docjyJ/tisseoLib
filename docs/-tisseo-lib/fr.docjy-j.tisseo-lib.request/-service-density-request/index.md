[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.request](../index.md) / [ServiceDensityRequest](./index.md)

# ServiceDensityRequest

`class ServiceDensityRequest : `[`TisseoRequestGetBuilder`](../-tisseo-request-get-builder.md)`<`[`ServiceDensityResponse`](../../fr.docjy-j.tisseo-lib.response/-service-density-response/index.md)`>` [(source)](https://github.com/docjyj/tisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/request/ServiceDensityRequest.kt#L23)

The class builder to do a Service Density request.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Create new request builder with no parameters.`ServiceDensityRequest(apiKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [beginDateTimeSlot](begin-date-time-slot.md) | Beginning date and time of time slot.`var beginDateTimeSlot: LocalDateTime?` |
| [centerXY](center-x-y.md) | Address or place of departure or arrival.`var centerXY: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [displayServices](display-services.md) | Displays the services found in the area covered.`var displayServices: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [endDateTimeSlot](end-date-time-slot.md) | Ending date and time of time slot.`var endDateTimeSlot: LocalDateTime?` |
| [networkList](network-list.md) | Transport operators list.`var networkList: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [rollingStockList](rolling-stock-list.md) | Transport mode list.`var rollingStockList: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [serviceNumber](service-number.md) | Number of distinct transport services we want to reach in the time slot .`var serviceNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [srid](srid.md) | Spatial reference number projection. [see](https://en.wikipedia.org/wiki/SRID)`var srid: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
