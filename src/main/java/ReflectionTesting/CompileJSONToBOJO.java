package ReflectionTesting;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class CompileJSONToBOJO {
    public static void main(String[] args) throws IOException {
        String file = FileUtils.readFileToString(new File("exampleAuton.json"), Charset.defaultCharset());
        Gson gson = new Gson();

        ExampleAuton autonLines = gson.fromJson(file, ExampleAuton.class);

        for(MethodData method : autonLines.methods) {
            System.out.println(method.toString());
        }


    }
}
