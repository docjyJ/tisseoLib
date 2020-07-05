package fr.docjyJ.tisseoLib.typeAdapter

import fr.docjyJ.apiClientBuilder.QuerySerializer
import java.lang.reflect.Type

internal class BooleanQueryTypeAdapter: QuerySerializer<Boolean> {
    override fun serialize(src: Boolean, typeOfSrc: Type): String {
        return if(src) "1" else "0"
    }
}
