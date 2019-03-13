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

        //Fragment of when MethodData didn't use class
        ExampleRobot r = new ExampleRobot();


        //TODO make this be able to run LinearOpMode functions as well, not just robot. Could be achieved by implementing robot functionality into DejaVuLinearOpMode or robot.sleep point to caller.sleep
        for(MethodData data : auton.methods) {
            try{
                if(data.functionParams != null) {
                    Method method = data.getClassObj().getMethod(data.functionName, data.getParamTypes());
                    //Method method = ExampleRobot.class.getMethod(data.functionName, data.getParamTypes());
                    method.invoke(r, data.functionParams);
                }
                else {
                    Method method = data.getClassObj().getMethod(data.functionName);
                    //Method method = ExampleRobot.class.getMethod(data.functionName);
                    method.invoke(r);
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
