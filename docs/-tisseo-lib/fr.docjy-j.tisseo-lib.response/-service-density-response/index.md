[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.response](../index.md) / [ServiceDensityResponse](./index.md)

# ServiceDensityResponse

`data class ServiceDensityResponse : ResponseTemplate` [(source)](https://github.com/docjyj/tisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/response/ServiceDensityResponse.kt#L19)

The response class of a service density request.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The response class of a service density request.`ServiceDensityResponse(distance: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, expirationDate: LocalDateTime, isServiceNumberReached: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, serviceNumberReached: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, stops: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Stop`](../../fr.docjy-j.tisseo-lib.model.service-density/-stop/index.md)`>)` |

### Properties

| Name | Summary |
|---|---|
| [distance](distance.md) | The distance with the point.`val distance: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [expirationDate](expiration-date.md) | The expiration date of the content.`val expirationDate: LocalDateTime` |
| [isServiceNumberReached](is-service-number-reached.md) | If is number reached.`val isServiceNumberReached: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [serviceNumberReached](service-number-reached.md) | Number reached.`val serviceNumberReached: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [stops](stops.md) | List of Stop.`val stops: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Stop`](../../fr.docjy-j.tisseo-lib.model.service-density/-stop/index.md)`>` |
