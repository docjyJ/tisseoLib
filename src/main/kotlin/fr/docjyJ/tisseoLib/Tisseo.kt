package fr.docjyJ.tisseoLib

import fr.docjyJ.tisseoLib.request.StopAreaRequest

class Tisseo(private val apiKey : String) {
    fun stopAreas(): StopAreaRequest {
        return StopAreaRequest(apiKey)
    }
}
