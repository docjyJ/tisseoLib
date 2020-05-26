import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.docjyJ.tisseoLib.Tisseo;
import fr.docjyJ.tisseoLib.data.NetworksResponse;
import fr.docjyJ.tisseoLib.data.StopAreaResponse;
import fr.docjyJ.tisseoLib.data.StopPointResponce;
import fr.docjyJ.tisseoLib.utils.TisseoException;

import java.io.FileWriter;
import java.io.IOException;

public class Example {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final String API_KEY = "null-api-key"; // Insert your api key

    public static void main(String[] args) throws IOException {
        //Build Object with API Key
        Tisseo tisseo = new Tisseo(API_KEY);

        //stop_area
        try {
            StopAreaResponse response = tisseo.stopArea()
                    .setLineId("11821949021892003")
                    .setDisplayCoordXY(true)
                    .execute();
            GSON.toJson(response, new FileWriter("stop_area.json"));
        } catch (TisseoException e) { e.printStackTrace(); }

        //stop_points
        try {
            StopPointResponce response = tisseo.stopPoint()
                    .setLineId("11821949021892003")
                    .setDisplayCoordXY(true)
                    .setDisplayDestinations(true)
                    .setDisplayLines(true)
                    .execute();
            GSON.toJson(response, new FileWriter("stop_points.json"));
        } catch (TisseoException e) { e.printStackTrace(); }

        //TODO PLACES

        //networks
        try {
            NetworksResponse response = tisseo.networks()
                    .execute();
            GSON.toJson(response, new FileWriter("networks.json"));
        } catch (TisseoException e) { e.printStackTrace(); }

        //TODO LINES

        //TODO STOPS_SCHEDULES

        //TODO ROLLING_STOCKS

        //TODO JOURNEYS

        //TODO MESSAGES

        //TODO SERVICE_DENSITY
    }
}
