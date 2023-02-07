package org.modularity;

import org.another.Bye;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello world! from " + Hello.class);
        System.out.println("Bye from another module " + Bye.class);
        System.out.println("Static value from another module " + Bye.val);
    }
}