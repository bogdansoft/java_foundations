package reflections.introduction;

import java.lang.reflect.Constructor;

class MyClass {
    private MyClass() {
        System.out.println("MyClass object is created");
    }
}

class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        //MyClass o = new MyClass();
        Class<?> clss = Class.forName("reflections.introduction.MyClass");
        Constructor<?> constructor = clss.getDeclaredConstructor();
        constructor.setAccessible(true);
        MyClass myClass = (MyClass) constructor.newInstance();

    }
}