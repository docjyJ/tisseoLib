package fr.docjyJ.tisseoLib.model.journey

import fr.docjyJ.tisseoLib.model.line.Line

data class DestinationStop (
        val line: Line,
        val name: String
)
