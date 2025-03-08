package com.example;
public class BrokenMath {
    private int result;

    // Constructor with syntax error (missing parameter type)
    public BrokenMath(value) {
        this.result = value;
    }

    // Incorrect addition method (logical mistake: using subtraction instead of addition)
    public int add(int a, int b) {
        return a - b;
    }

    // Inefficient factorial calculation (inefficient recursion without memoization)
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Missing return statement in method
    public int divide(int a, int b){
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        }
        return a / b;
    
    }
}