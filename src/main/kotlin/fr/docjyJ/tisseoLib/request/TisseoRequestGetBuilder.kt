package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.JsonDeserializeRegisterTypeAdapter
import fr.docjyJ.apiClientBuilder.QuerySerializeRegisterTypeAdapter
import fr.docjyJ.apiClientBuilder.RequestGetBuilder
import fr.docjyJ.apiClientBuilder.ResponseTemplate
import fr.docjyJ.tisseoLib.typeAdapter.*
import java.awt.Color
import java.time.Duration
import java.time.LocalDateTime
import java.time.LocalTime

/**
 * Superclass for all Request.
 *
 * ### Read before
 * For all requests can use the following method from [`RequestGetBuilder<T>`](https://github.com/docjyJ/ApiClientBuilder/blob/master/docs/api-client-builder/fr.docjy-j.api-client-builder/-request-get-builder/index.md):
 *
 * `fun execute(): T` - Execute the request and pares response to Object.
 *
 * `fun executeAsString(): String` - Execute the request and get the string of response.
 *
 * `fun getUrl(): String` - get Url Get the url that will be executed.
 *
 * @param T The response Object.
 */

abstract class TisseoRequestGetBuilder<T: ResponseTemplate> internal constructor(
        endpoint: String,
        classof:Class<T>
): RequestGetBuilder<T>(
        "https://api.tisseo.fr/v1/$endpoint.json",
        classof
) {
    init {
        gsonTypeAdapter = listOf(
                JsonDeserializeRegisterTypeAdapter(Boolean::class.java, BooleanJsonTypeAdapter()),
                JsonDeserializeRegisterTypeAdapter(LocalDateTime::class.java, LocalDateTimeJsonTypeAdapter()),
                JsonDeserializeRegisterTypeAdapter(LocalTime::class.java, LocalTimeJsonTypeAdapter()),
                JsonDeserializeRegisterTypeAdapter(Duration::class.java, DurationJsonTypeAdapter()),
                JsonDeserializeRegisterTypeAdapter(Color::class.java, ColorJsonTypeAdapter())
        )
        queryTypeAdapter = listOf(
                QuerySerializeRegisterTypeAdapter(Boolean::class.javaObjectType, BooleanQueryTypeAdapter()),
                QuerySerializeRegisterTypeAdapter(LocalDateTime::class.java, LocalDateTimeQueryTypeAdapter())
        )
    }
}

