package p1;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public final class MyJSONParser {
    private MyJsonParser() {
        throw new IllegalStateException("Don't instantiate"); 
    }
        
    private static String readJSONFile(File jsonFile) throws FileNotFoundException {
        Scanner file = new Scanner(jsonFile);
        StringBuilder JSONString = new StringBuilder();
        while (file.hasNextLine()) {
            JSONString.append(file.nextLine());
        }
        file.close();
        return JSONString.toString();
    }

    public static JSONObject parseJSON(File jsonFile) throws FileNotFoundException, ParseException {
        String jsonString = readJSONFile(jsonFile);
        return (JSONObject) new JSONParser().parse(jsonString);
    }
}
