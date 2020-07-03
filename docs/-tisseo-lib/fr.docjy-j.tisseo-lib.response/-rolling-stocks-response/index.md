[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.response](../index.md) / [RollingStocksResponse](./index.md)

# RollingStocksResponse

`data class RollingStocksResponse : `[`TisseoResponse`](../-tisseo-response/index.md) [(source)](https://github.com/docjyJ/TisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/response/RollingStocksResponse.kt#L14)

The response class of a rolling stocks request.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The response class of a rolling stocks request.`RollingStocksResponse(expirationDate: LocalDateTime, rollingStocks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`RollingStock`](../../fr.docjy-j.tisseo-lib.model.rolling-stock/-rolling-stock/index.md)`>)` |

### Properties

| Name | Summary |
|---|---|
| [expirationDate](expiration-date.md) | The expiration date of the content.`val expirationDate: LocalDateTime` |
| [rollingStocks](rolling-stocks.md) | `val rollingStocks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`RollingStock`](../../fr.docjy-j.tisseo-lib.model.rolling-stock/-rolling-stock/index.md)`>` |
