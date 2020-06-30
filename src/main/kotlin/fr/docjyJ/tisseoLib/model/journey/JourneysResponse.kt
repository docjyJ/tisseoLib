package fr.docjyJ.tisseoLib.model.journey

import java.util.Date

data class JourneysResponse(
    val expirationDate: Date,
    val routePlannerResult: RoutePlannerResult
)
