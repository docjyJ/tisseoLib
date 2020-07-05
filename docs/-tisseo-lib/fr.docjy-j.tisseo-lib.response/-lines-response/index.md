[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.response](../index.md) / [LinesResponse](./index.md)

# LinesResponse

`data class LinesResponse : ResponseTemplate` [(source)](https://github.com/docjyj/tisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/response/LinesResponse.kt#L16)

The response class of a lines request.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The response class of a lines request.`LinesResponse(expirationDate: LocalDateTime, lines: `[`Lines`](../../fr.docjy-j.tisseo-lib.model.line/-lines/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [expirationDate](expiration-date.md) | The expiration date of the content.`val expirationDate: LocalDateTime` |
| [lines](lines.md) | Contains Lines.`val lines: `[`Lines`](../../fr.docjy-j.tisseo-lib.model.line/-lines/index.md) |
