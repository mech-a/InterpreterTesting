package ReflectionTesting;

import java.util.Arrays;

public class MethodData {
    public String functionName;
    public Object[] functionParams;

    public MethodData(String funcName, Object... args) {
        functionName = funcName;
        functionParams = args;
    }

    public String toString() {
        return "name of function: " + functionName + " || params: " + Arrays.toString(functionParams);
    }

    public Class<?>[] getParamTypes() {
        Class<?>[] paramTypes = new Class[functionParams.length];
        for(int i = 0; i<functionParams.length; i++) {
            paramTypes[i] = functionParams[i].getClass();
        }
        return paramTypes;
    }

    //TODO find a good way to do this that isn't memory destroying and hopefully O(n)
    public void convertObjectsToPrimitives() {
        double x = Double.parseDouble()
    }
}
