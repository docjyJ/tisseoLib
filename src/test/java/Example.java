import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.docjyJ.tisseoLib.Tisseo;
import fr.docjyJ.tisseoLib.data.StopAreaResponce;
import fr.docjyJ.tisseoLib.utils.TisseoException;

import java.io.FileWriter;
import java.io.IOException;

public class Example {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final String API_KEY = "null-api-key"; // Insert your api key

    public static void main(String[] args) throws IOException {
        //Build Object with API Key
        Tisseo tisseo = new Tisseo(API_KEY);

        //stop_area Example
        try {
            StopAreaResponce test = tisseo.stopAreas()
                    .setLineId("11821949021892003")     //T1
                    .setDisplayCoordXY(true)
                    .execute();
            GSON.toJson(test, new FileWriter("stop_area.json"));
        } catch (TisseoException e) {
            e.printStackTrace();
        }
    }
}
