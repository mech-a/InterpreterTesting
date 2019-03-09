package ReflectionTesting;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CompileBOJOToJSON {
    public static void main(String[] args) throws IOException {
        ExampleAuton exampleAuton = new ExampleAuton();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(exampleAuton);

        System.out.println(gson.toJson(exampleAuton));

        BufferedWriter writer = new BufferedWriter(new FileWriter("exampleAuton.json"));
        writer.write(json);
        writer.close();



    }
}
