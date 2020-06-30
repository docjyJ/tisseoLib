package fr.docjyJ.tisseoLib.model.stopSchedule

import fr.docjyJ.tisseoLib.model.line.Line
import fr.docjyJ.tisseoLib.model.stopPoint.StopPoint

data class Schedule(
        val destination: StopPoint,
        val journeys: List<JourneysShudle>,
        val line: Line,
        val stop: StopPoint

)
