[TisseoLib](../../index.md) / [fr.docjyJ.tisseoLib.exception](../index.md) / [TisseoServerException](./index.md)

# TisseoServerException

`class TisseoServerException : `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html) [(source)](https://github.com/docjyJ/TisseoLib/tree/master/src/main/kotlin/fr/docjyJ/tisseoLib/exception/TisseoServerException.kt#L17)

Signals that an error was reached during the request to the server.

### Properties

| Name | Summary |
|---|---|
| [responseCode](response-code.md) | code of the request.`val responseCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [responseMessage](response-message.md) | message of the request.`val responseMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [url](url.md) | URL used for the request.`val url: `[`URL`](https://docs.oracle.com/javase/6/docs/api/java/net/URL.html)`?` |
