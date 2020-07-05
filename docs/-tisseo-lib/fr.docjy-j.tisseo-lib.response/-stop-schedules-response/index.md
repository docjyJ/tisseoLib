[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.response](../index.md) / [StopSchedulesResponse](./index.md)

# StopSchedulesResponse

`data class StopSchedulesResponse : ResponseTemplate` [(source)](https://github.com/docjyj/tisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/response/StopSchedulesResponse.kt#L16)

The response class of a stop schedules request.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The response class of a stop schedules request.`StopSchedulesResponse(departures: `[`Departures`](../../fr.docjy-j.tisseo-lib.model.stop-schedule/-departures/index.md)`, expirationDate: LocalDateTime)` |

### Properties

| Name | Summary |
|---|---|
| [departures](departures.md) | Contains Departures.`val departures: `[`Departures`](../../fr.docjy-j.tisseo-lib.model.stop-schedule/-departures/index.md) |
| [expirationDate](expiration-date.md) | The expiration date of the content.`val expirationDate: LocalDateTime` |
