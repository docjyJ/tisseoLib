[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.response](../index.md) / [MessagesResponse](./index.md)

# MessagesResponse

`data class MessagesResponse : ResponseTemplate` [(source)](https://github.com/docjyj/tisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/response/MessagesResponse.kt#L16)

The response class of a messages request.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The response class of a messages request.`MessagesResponse(expirationDate: LocalDateTime, messages: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Message`](../../fr.docjy-j.tisseo-lib.model.message/-message/index.md)`>)` |

### Properties

| Name | Summary |
|---|---|
| [expirationDate](expiration-date.md) | The expiration date of the content.`val expirationDate: LocalDateTime` |
| [messages](messages.md) | `val messages: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Message`](../../fr.docjy-j.tisseo-lib.model.message/-message/index.md)`>` |
