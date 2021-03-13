package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertAll;
        import static org.junit.jupiter.api.Assertions.assertEquals;
        import static org.junit.jupiter.api.Assertions.assertNotNull;
        import static org.junit.jupiter.api.Assertions.assertThrows;
        import static org.junit.jupiter.api.Assertions.assertTimeout;
        import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
        import static org.junit.jupiter.api.Assertions.assertTrue;


public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci t = new Fibonacci();
        t.fibonacci(1, 0,Integer.valueOf(args[0]));
    }

    @Test
    @ValueSource(ints = {4, 10, 5, -10})
    private void testFibonacci(int n) {
        System.out.println(n);
        assertEquals(10, n, "Invalid number expected:"+n);
    }
    private void fibonacci(int p, int c, int n){
        if (n > 0) {
            System.out.println(p+c);
            fibonacci(c, p+c, --n);
        }
    }
}
