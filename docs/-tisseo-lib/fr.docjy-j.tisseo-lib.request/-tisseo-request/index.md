[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.request](../index.md) / [TisseoRequest](./index.md)

# TisseoRequest

`interface TisseoRequest` [(source)](https://github.com/docjyj/tisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/request/TisseoRequest.kt#L11)

Interface of the class builder to do a request.

### Functions

| Name | Summary |
|---|---|
| [execute](execute.md) | Execute the request.`abstract fun execute(): `[`TisseoResponse`](../../fr.docjy-j.tisseo-lib.response/-tisseo-response/index.md) |
| [executeAsString](execute-as-string.md) | Execute the request.`abstract fun executeAsString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getUrl](get-url.md) | Show the URL.`abstract fun getUrl(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [JourneysRequest](../-journeys-request/index.md) | The class builder to do a Journeys request.`class JourneysRequest : `[`TisseoRequest`](./index.md) |
| [LinesRequest](../-lines-request/index.md) | The class builder to do a Line request.`class LinesRequest : `[`TisseoRequest`](./index.md) |
| [MessagesRequest](../-messages-request/index.md) | The class builder to do a Message request.`class MessagesRequest : `[`TisseoRequest`](./index.md) |
| [NetworksRequest](../-networks-request/index.md) | The class builder to do a Network request.`class NetworksRequest : `[`TisseoRequest`](./index.md) |
| [PlacesRequest](../-places-request/index.md) | The class builder to do a Line request.`class PlacesRequest : `[`TisseoRequest`](./index.md) |
| [RollingStocksRequest](../-rolling-stocks-request/index.md) | The class builder to do a Rolling Stocks request.`class RollingStocksRequest : `[`TisseoRequest`](./index.md) |
| [ServiceDensityRequest](../-service-density-request/index.md) | The class builder to do a Service Density request.`class ServiceDensityRequest : `[`TisseoRequest`](./index.md) |
| [StopAreaRequest](../-stop-area-request/index.md) | The class builder to do a Stop Area request.`class StopAreaRequest : `[`TisseoRequest`](./index.md) |
| [StopPointRequest](../-stop-point-request/index.md) | The class builder to do a Stop Point request.`class StopPointRequest : `[`TisseoRequest`](./index.md) |
| [StopSchedulesRequest](../-stop-schedules-request/index.md) | The class builder to do a Stop Schedules request.`class StopSchedulesRequest : `[`TisseoRequest`](./index.md) |
