[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.request](../index.md) / [LinesRequest](./index.md)

# LinesRequest

`class LinesRequest` [(source)](https://github.com/docjyJ/TisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/request/LinesRequest.kt#L23)

The class builder to do a Line request.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Create new request builder with no parameters.`LinesRequest(apiKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [contentFormat](content-format.md) | Format of message content.`var contentFormat: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [displayGeometry](display-geometry.md) | Return geometries in WKT. [see](http://fr.wikipedia.org/wiki/Well-known_text)`var displayGeometry: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayMessages](display-messages.md) | Geographic coordinates Returns in extra messages of line disturbance. (for the lines which are disturbed)`var displayMessages: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayOnlyDisrupted](display-only-disrupted.md) | Only returns lines with disturbance. (for the lines which are disturbed)`var displayOnlyDisrupted: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [displayTerminus](display-terminus.md) | Returns in extra logical stops terminus of each line.`var displayTerminus: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [lineId](line-id.md) | Filter on a single line by its ID.`var lineId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [network](network.md) | Transport operator.`var network: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [shortName](short-name.md) | Filter on a single line by line number.`var shortName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |

### Functions

| Name | Summary |
|---|---|
| [execute](execute.md) | Execute the request.`fun execute(): `[`LinesResponse`](../../fr.docjy-j.tisseo-lib.model.line/-lines-response/index.md) |
| [executeAsString](execute-as-string.md) | Execute the request.`fun executeAsString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
