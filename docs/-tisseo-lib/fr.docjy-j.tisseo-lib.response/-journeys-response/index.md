[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.response](../index.md) / [JourneysResponse](./index.md)

# JourneysResponse

`data class JourneysResponse : ResponseTemplate` [(source)](https://github.com/docjyj/tisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/response/JourneysResponse.kt#L16)

The response class of a journeys request.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The response class of a journeys request.`JourneysResponse(expirationDate: LocalDateTime, routePlannerResult: `[`RoutePlannerResult`](../../fr.docjy-j.tisseo-lib.model.journey/-route-planner-result/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [expirationDate](expiration-date.md) | The expiration date of the content.`val expirationDate: LocalDateTime` |
| [routePlannerResult](route-planner-result.md) | Contains Route.`val routePlannerResult: `[`RoutePlannerResult`](../../fr.docjy-j.tisseo-lib.model.journey/-route-planner-result/index.md) |
