package fr.docjyJ.tisseoLib.model.stopArea

import java.time.LocalDateTime

data class StopAreaResponse (
        val expirationDate: LocalDateTime,
        val stopAreas: StopAreas
)
