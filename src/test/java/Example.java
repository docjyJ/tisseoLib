import fr.docjyJ.tisseoLib.model.*;
import fr.docjyJ.tisseoLib.request.*;
import fr.docjyJ.tisseoLib.utils.TisseoException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Example {
    private static final String API_KEY = "null-api-key"; // Insert your api key

    public StopAreaResponse stopArea() throws TisseoException {
        //Create request object
        StopAreaRequest request = new StopAreaRequest(API_KEY);

        //Set parameters
        request.setLineId("11821949021892003");
        request.setDisplayCoordXY(true);

        //Execute request
        return request.execute();
    }

    public StopPointResponce stopPoint() throws TisseoException {
        //Create request object
        StopPointRequest request = new StopPointRequest(API_KEY);

        //Set parameters
        request.setLineId("11821949021892003");
        request.setDisplayCoordXY(true);
        request.setDisplayDestinations(true);
        request.setDisplayLines(true);

        //Execute request
        return request.execute();
    }

    //TODO PLACES

    public NetworksResponse networks() throws TisseoException {
        //Create request object
        NetworksRequest request = new NetworksRequest(API_KEY);

        //Execute request
        return request.execute();
    }

    public LinesResponse lines() throws TisseoException {
        //Create request object
        LinesRequest request = new LinesRequest(API_KEY);

        //Set parameters
        request.setLineId("11821949021892003");
        request.setDisplayTerminus(true);

        //Execute request
        return request.execute();
    }

    public StopSchedulesResponse stopSchedules() throws ParseException, TisseoException {
        //Create request object
        StopSchedulesRequest request = new StopSchedulesRequest(API_KEY);

        //Set parameters
        request.setStopsList("1970324837184892,3377699720882831");
        request.setDatetime(new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2020"));

        //Execute request
        return request.execute();
    }

    //TODO ROLLING_STOCKS

    //TODO JOURNEYS

    public MessagesResponse messages() throws TisseoException {
        //Create request object
        MessagesRequest request = new MessagesRequest(API_KEY);

        //Execute request
        return request.execute();
    }

    //TODO SERVICE_DENSITY
}
