package com.example;

public interface Hello {
    static void hello(String str) {
        System.out.println("Hello "+str);
    }

    default void hello(){
        System.out.println("Hello World!");
    }

    static boolean greater(int x){
        return x>3;
    }
}
