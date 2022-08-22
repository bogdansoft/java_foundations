package annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReadingInAnnotationClass {
    public static void main(String[] args) throws Exception {
        var clss = Class.forName("annotations.Utility");
        Constructor<?> constructor = clss.getConstructor();
        Utility utility = (Utility) constructor.newInstance();

        Method[] methods = clss.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(MostUsed.class)) {
                m.invoke(utility, "Scala");
            }
        }
    }
}
