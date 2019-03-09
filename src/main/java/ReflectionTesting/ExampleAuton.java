package ReflectionTesting;

import ReflectionTesting.MethodData;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExampleAuton {
    //MethodData m = new MethodData("translate", 800, 0.2);
    MethodData[] methods = new MethodData[]{
            new MethodData("translate", Enums.Direction.BACK, 800, 0.3),
            new MethodData("getGoldPosition", null),
            new MethodData("don'tshowup")
    };
}
