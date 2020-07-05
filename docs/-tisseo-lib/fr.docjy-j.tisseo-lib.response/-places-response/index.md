[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.response](../index.md) / [PlacesResponse](./index.md)

# PlacesResponse

`data class PlacesResponse : ResponseTemplate` [(source)](https://github.com/docjyj/tisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/response/PlacesResponse.kt#L16)

The response class of a places request.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The response class of a places request.`PlacesResponse(expirationDate: LocalDateTime, placesList: `[`PlacesList`](../../fr.docjy-j.tisseo-lib.model.place/-places-list/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [expirationDate](expiration-date.md) | The expiration date of the content.`val expirationDate: LocalDateTime` |
| [placesList](places-list.md) | Contains Places.`val placesList: `[`PlacesList`](../../fr.docjy-j.tisseo-lib.model.place/-places-list/index.md) |
