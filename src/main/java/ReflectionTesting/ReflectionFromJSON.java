package ReflectionTesting;

import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

public class ReflectionFromJSON {
    public static void main(String[] args) throws IOException {
        String file = FileUtils.readFileToString(new File("exampleAuton.json"), Charset.defaultCharset());
        Gson gson = new Gson();

        ExampleAuton auton = gson.fromJson(file, ExampleAuton.class);

        ExampleRobot r = new ExampleRobot();
        
        for(MethodData data : auton.methods) {
            try{
                if(data.functionParams != null) {
                    Method method = ExampleRobot.class.getMethod(data.functionName, data.getParamTypes());
                    method.invoke(r, data.functionParams);
                }
                else {
                    Method method = ExampleRobot.class.getMethod(data.functionName);
                    method.invoke(r);
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
