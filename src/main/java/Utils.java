import com.google.gson.Gson;

import java.util.Map;

public class Utils {

    public static String mapToJsonString(Map<Integer, String> map) {
        Gson gson = new Gson();
        String jsonString = gson.toJson(map);

        return jsonString;
    }

}
