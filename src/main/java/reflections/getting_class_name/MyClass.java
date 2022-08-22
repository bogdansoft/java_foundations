package reflections.getting_class_name;

import java.util.Arrays;

class MyClass {
    public static void main(String[] args) throws ClassNotFoundException {
        var class1 = Class.forName("java.lang.String");
        var class2 = Class.forName("java.lang.String");
        System.out.println(class1 == class2);//true;

        System.out.println(int.class);

        //class name
        System.out.println(Integer.class.getSimpleName());

        //super class
        System.out.println(Integer.class.getSuperclass().getSimpleName());

        //interfaces
        System.out.println(Arrays.toString(Integer.class.getSuperclass().getInterfaces()));
    }
}
