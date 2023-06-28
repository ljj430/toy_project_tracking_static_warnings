package org.example;

public class EmptyCatchBlock {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        } catch(Exception ee) {
            // An empty catch block
            if (ee instanceof ArithmeticException){
                System.err.println("ArithmeticException:" + ee.getMessage());
            }
        }
    }
}
