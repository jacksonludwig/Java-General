// https://stackoverflow.com/questions/36362619/parsing-a-json-file-in-java-using-json-simple
package p1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File jsonFile = new File("src/p1/example.json");

        JSONObject data = (JSONObject) MyJSONParser.parseJSON(jsonFile).get("response");

        JSONArray jsonArray = (JSONArray) data.get("items");
        JSONObject firstElement = (JSONObject) jsonArray.get(0);
        String idString = String.valueOf(firstElement.get("id"));

        System.out.println(idString);
    }
}
