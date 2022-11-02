import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> colours = new HashMap<>();
        colours.put(1, "blue");
        colours.put(2, "yellow");
        colours.put(3, "green");


        System.out.println(Utils.mapToJsonString(colours));
    }
}
