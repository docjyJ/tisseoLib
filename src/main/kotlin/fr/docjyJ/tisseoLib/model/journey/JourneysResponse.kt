package fr.docjyJ.tisseoLib.model.journey

import java.time.LocalDateTime

data class JourneysResponse(
        val expirationDate: LocalDateTime,
        val routePlannerResult: RoutePlannerResult
)
