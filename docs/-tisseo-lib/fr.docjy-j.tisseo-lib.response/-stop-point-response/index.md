[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.response](../index.md) / [StopPointResponse](./index.md)

# StopPointResponse

`data class StopPointResponse : ResponseTemplate` [(source)](https://github.com/docjyj/tisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/response/StopPointResponse.kt#L16)

The response class of a stop points request.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The response class of a stop points request.`StopPointResponse(expirationDate: LocalDateTime, physicalStops: `[`PhysicalStops`](../../fr.docjy-j.tisseo-lib.model.stop-point/-physical-stops/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [expirationDate](expiration-date.md) | The expiration date of the content.`val expirationDate: LocalDateTime` |
| [physicalStops](physical-stops.md) | Contains Stops.`val physicalStops: `[`PhysicalStops`](../../fr.docjy-j.tisseo-lib.model.stop-point/-physical-stops/index.md) |
