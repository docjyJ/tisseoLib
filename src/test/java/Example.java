import fr.docjyJ.tisseoLib.model.*;
import fr.docjyJ.tisseoLib.request.*;
import fr.docjyJ.tisseoLib.utils.TisseoException;

public class Example {
    private static final String API_KEY = "null-api-key"; // Insert your api key

    public StopAreaResponse stopArea() throws TisseoException {
        //Create request Object
        StopAreaRequest request = new StopAreaRequest(API_KEY);

        //set parameters
        request.setLineId("11821949021892003");
        request.setDisplayCoordXY(true);

        //Execute request
        return request.execute();
    }

    public StopPointResponce stoppoint() throws TisseoException {
        //Create request Object
        StopPointRequest request = new StopPointRequest(API_KEY);

        //set parameters
        request.setLineId("11821949021892003");
        request.setDisplayCoordXY(true);
        request.setDisplayDestinations(true);
        request.setDisplayLines(true);

        //Execute request
        return request.execute();
    }

    //TODO PLACES

    public NetworksResponse networks() throws TisseoException {
        //Create request Object
        NetworksRequest request = new NetworksRequest(API_KEY);

        //Execute request
        return request.execute();
    }

    public LinesResponse lines() throws TisseoException {
        //Create request Object
        LinesRequest request = new LinesRequest(API_KEY);

        //set parameters
        request.setLineId("11821949021892003");
        request.setDisplayTerminus(true);

        //Execute request
        return request.execute();
    }

    //TODO STOPS_SCHEDULES

    //TODO ROLLING_STOCKS

    //TODO JOURNEYS

    public MessagesResponse messages() throws TisseoException {
        //Create request Object
        MessagesRequest request = new MessagesRequest(API_KEY);

        //Execute request
        return request.execute();
    }

    //TODO SERVICE_DENSITY
}
