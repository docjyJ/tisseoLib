package fr.docjyJ.tisseoLib.model.stopSchedule

import fr.docjyJ.tisseoLib.model.stopArea.StopArea
import fr.docjyJ.tisseoLib.model.stopPoint.StopPoint

data class Departures (
        val stopAreas: List<StopArea>?,
        val departure: List<Departure>?,
        val stop: StopPoint?,
        val stopArea: StopArea?
)
