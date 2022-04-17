package com.company;

public class App {
    /**
     * This method takes in two int parameters to add.
     *
     */
    private static int sum2(int num1, int num2){
        return num1 + num2;
    }

    /**
     * This method takes in 3 int parameters to add.
     *
     */
    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * Overloading methods
     */

    /**
     * Compute sum of two numbers (int)
     */
    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }

    /**
     * Compute sum of three numbers (int)
     */
    private static int computeSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    /**
     *
     * Method that returns the greater integer value
     */
    public static int greaterValue(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }

    /**
     *
     * Method that returns the greater double value
     */
    public static double greaterValue(double num1, double num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static void main(String[] args){
        System.out.println("Hello, World!");
        /**
         * Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */
        System.out.println("The sum of 21 and 18 is " + App.computeSum(21, 18));
        System.out.println("The sum of 61 and 27 and 11 is " + App.computeSum(61, 27, 11));
        System.out.println("========================================");


        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 61 and 21 is " + greaterValue(61,21));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 7.18 and 12.8 is " + greaterValue(7.18,12.8));

    }
}
