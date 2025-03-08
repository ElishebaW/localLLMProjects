
package com.example;

import java.util.Map;
import java.util.HashMap;

public class BrokenMathLLama {

    private int result;

    // Constructor with corrected syntax
    public BrokenMathLLama(int value) {
        this.result = value;
    }

    // Corrected addition method
    public int add(int a, int b) {
        return a + b;
    }

    // Improved factorial calculation with memoization
    private Map<Integer, Integer> cache = new HashMap<>();

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!cache.containsKey(n)) {
            cache.put(n, n * factorial(n - 1));
        }
        return cache.get(n);
    }

    // Corrected division method with return statement
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        }
        return a / b;
    }
}