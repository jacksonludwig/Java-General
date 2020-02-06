package p1;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyJSONParser {
    File jsonFile;
    JSONParser jsonParser;

    public MyJSONParser(File jsonFile) {
        this.jsonFile = jsonFile;
        jsonParser = new JSONParser();
    }

    private String readJSONFile() throws FileNotFoundException {
        Scanner file = new Scanner(jsonFile);
        String JSONString = "";
        while (file.hasNextLine()) {
            JSONString += file.nextLine();
        }
        file.close();
        return JSONString;
    }

    public JSONObject parseJSON() throws FileNotFoundException, ParseException {
        String jsonString = readJSONFile();
        return (JSONObject) jsonParser.parse(jsonString);
    }
}
