package ReflectionTesting;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class CompilePOJOToJSON {
    public static void main(String[] args) throws IOException {
        ExampleAuton exampleAuton = new ExampleAuton();


        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        Date date = new Date();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(exampleAuton);

        System.out.println(gson.toJson(exampleAuton));

        BufferedWriter writer = new BufferedWriter(new FileWriter("exampleAuton.json"));
        writer.write("//    " + dateFormat.format(date) + "\n");
        writer.write(json);
        writer.close();

    }


    private static String getComputerName()
    {
        Map<String, String> env = System.getenv();
        if (env.containsKey("COMPUTERNAME"))
            return env.get("COMPUTERNAME");
        else if (env.containsKey("HOSTNAME"))
            return env.get("HOSTNAME");
        else
            return "Unknown Computer";
    }

}
