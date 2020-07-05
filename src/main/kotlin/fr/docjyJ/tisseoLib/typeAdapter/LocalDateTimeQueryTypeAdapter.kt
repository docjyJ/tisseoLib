package fr.docjyJ.tisseoLib.typeAdapter

import fr.docjyJ.apiClientBuilder.QuerySerializer
import java.lang.reflect.Type
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

internal class LocalDateTimeQueryTypeAdapter: QuerySerializer<LocalDateTime> {
    override fun serialize(src: LocalDateTime, typeOfSrc: Type): String {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(src)
    }
}
