import fr.docjyJ.tisseoLib.request.*

private const val API_KEY = "null-api-key" // Insert your api key

fun stopArea() = StopAreaRequest(API_KEY)
    .apply { //set parameters
        lineId = "11821949021892003"
        displayCoordXY = true
    }
    .execute() //Execute request

fun stopPoint() = StopPointRequest(API_KEY)
    .apply { //set parameters
        lineId = "11821949021892003"
        displayCoordXY = true
        displayDestinations = true
        displayLines = true
    }
    .execute() //Execute request

//TODO PLACES

fun networks() = NetworksRequest(API_KEY)
    .execute() //Execute request

fun lines() = LinesRequest(API_KEY)
    .apply { //set parameters
        lineId = "11821949021892003"
        displayTerminus = true
    }
    .execute() //Execute request

//TODO STOPS_SCHEDULES

//TODO ROLLING_STOCKS

//TODO JOURNEYS

fun messages() = MessagesRequest(API_KEY)
    .execute() //Execute request

//TODO SERVICE_DENSITY
