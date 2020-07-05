package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.JsonDeserializeRegisterTypeAdapter
import fr.docjyJ.apiClientBuilder.QuerySerializeRegisterTypeAdapter
import fr.docjyJ.apiClientBuilder.RequestGetBuilder
import fr.docjyJ.apiClientBuilder.ResponseTemplate
import fr.docjyJ.tisseoLib.typeAdapter.*
import java.awt.Color
import java.net.HttpURLConnection
import java.time.Duration
import java.time.LocalDateTime
import java.time.LocalTime

abstract class TisseoRequestGetBuilder<T: ResponseTemplate>(
        endpoint: String,
        classof:Class<T>
): RequestGetBuilder<T>(
        "https://api.tisseo.fr/v1/$endpoint.json",
        classof
) {

    override fun HttpURLConnection.connectionApply() = this

    init {
        gsonTypeAdapter = listOf(
                JsonDeserializeRegisterTypeAdapter(Boolean::class.java, BooleanJsonTypeAdapter()),
                JsonDeserializeRegisterTypeAdapter(LocalDateTime::class.java, LocalDateTimeJsonTypeAdapter()),
                JsonDeserializeRegisterTypeAdapter(LocalTime::class.java, LocalTimeJsonTypeAdapter()),
                JsonDeserializeRegisterTypeAdapter(Duration::class.java, DurationJsonTypeAdapter()),
                JsonDeserializeRegisterTypeAdapter(Color::class.java, ColorJsonTypeAdapter())
        )
        queryTypeAdapter = listOf(
                QuerySerializeRegisterTypeAdapter(Boolean::class.java, BooleanQueryTypeAdapter()),
                QuerySerializeRegisterTypeAdapter(LocalDateTime::class.java, LocalDateTimeQueryTypeAdapter())
        )
    }

}

