package fr.docjyJ.tisseoLib.model.stopSchedule

import fr.docjyJ.tisseoLib.model.line.Line
import fr.docjyJ.tisseoLib.model.stopPoint.StopPoint
import java.time.LocalDateTime

data class Departure (
        val dateTime: LocalDateTime,
        val destination: List<StopPoint>,
        val line: Line,
        val realTime: Boolean
)
