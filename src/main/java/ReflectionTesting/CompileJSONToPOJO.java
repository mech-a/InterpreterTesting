package ReflectionTesting;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * JSON to POJO converter
 * Utilizes {@link FileUtils} and {@link File} to get a String from a file, in this case, a JSON file.
 * {@link Gson} deserialization is then performed to transform the JSON into a POJO of type {@link ExampleAuton}.
 */


public class CompileJSONToPOJO {
    public static void main(String[] args) throws IOException {
        //Turn file into string
        String file = FileUtils.readFileToString(new File("exampleAuton.json"), Charset.defaultCharset());

        //Create ExampleAuton object
        Gson gson = new Gson();
        ExampleAuton autonLines = gson.fromJson(file, ExampleAuton.class);

        for(MethodData method : autonLines.methods)
            System.out.println(method.toString());
    }
}
