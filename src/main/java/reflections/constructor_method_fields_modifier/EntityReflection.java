package reflections.constructor_method_fields_modifier;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class EntityReflection {
    public static void main(String[] args) throws Exception {
        Entity entity = new Entity(10, "id");
        Class<? extends Entity> cls = entity.getClass();

        //public fields
        Field[] fields = cls.getFields();
        System.out.println(Arrays.toString(fields));//type

        //all fields
        Field[] fields1 = cls.getDeclaredFields();
        System.out.println(Arrays.toString(fields1));//val,type

        //methods
        //public
        Entity entity1 = new Entity(1, "id");
        var clss = entity1.getClass();
        Method[] methods = clss.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        System.out.println("-----------------------");

        //all
        Method[] methodsAll = clss.getDeclaredMethods();
        for (Method m : methodsAll) {
            System.out.println(m.getName());
        }
        System.out.println("-----------------------");

        //get method
        var method = clss.getMethod("setType", String.class);
        method.invoke(entity1, "name");
        var method1 = clss.getMethod("getType", null);
        System.out.println(method1.invoke(entity1, null));
        System.out.println("-----------------------");

        //constructor
        var constructors = clss.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }
        System.out.println("-----------------------");

        //modifiers
        int res = clss.getModifiers() & Modifier.PUBLIC;
        System.out.println(res);

        System.out.println(Modifier.isPublic(clss.getModifiers()));
        System.out.println(Modifier.isAbstract(clss.getModifiers()));
        System.out.println(Modifier.isFinal(clss.getModifiers()));
        System.out.println(Modifier.isInterface(clss.getModifiers()));
    }
}
