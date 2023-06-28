package org.example;

public class EmptyCatchBlock {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        } catch(ArithmeticException ae) {
            // An empty catch block
            System.err.println("ArithmeticException: " + ae.getMessage());
        }
    }
}
