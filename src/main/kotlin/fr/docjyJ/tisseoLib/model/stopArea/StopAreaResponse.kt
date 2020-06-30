package fr.docjyJ.tisseoLib.model.stopArea

import java.util.Date

data class StopAreaResponse (
        val expirationDate: Date,
        val stopAreas: StopAreas
)
