/**
 * A comprehensive example for Day 1 Java fundamentals.
 * This class showcases variable declaration, different data types,
 * operators, and control flow structures like if-else and for loops.
 */
public class DayOneFundamentals {

    public static void main(String[] args) {

        // 1. VARIABLES and DATA TYPES
        // ---------------------------------
        // We declare variables to store data. Each variable has a specific type.

        int studentScore = 85;          // 'int' for whole numbers (integers).
        double itemPrice = 19.99;       // 'double' for decimal numbers.
        char grade = 'A';               // 'char' for a single character.
        boolean isPassing = true;       // 'boolean' for true or false values.
        String studentName = "Anshul";  // 'String' for sequences of characters (text).

        System.out.println("Student: " + studentName + " has started the test.");
        System.out.println("----------------------------------------");


        // 2. OPERATORS
        // ---------------------------------
        // Operators perform actions on variables and values.

        // Arithmetic operators
        int num1 = 100;
        int num2 = 25;
        int sum = num1 + num2;      // Addition
        int difference = num1 - num2; // Subtraction
        int product = num1 * num2;    // Multiplication
        int quotient = num1 / num2;   // Division

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("Quotient of " + num1 + " / " + num2 + " is: " + quotient);
        System.out.println("----------------------------------------");


        // 3. CONTROL FLOW: if-else statement
        // ---------------------------------
        // This structure makes decisions based on conditions.

        System.out.println("Evaluating student's score: " + studentScore);
        if (studentScore >= 60) {
            // This block runs if the condition (studentScore >= 60) is true.
            isPassing = true;
            System.out.println("Result: Pass");
        } else {
            // This block runs if the condition is false.
            isPassing = false;
            System.out.println("Result: Fail");
        }
        System.out.println("----------------------------------------");


        // 4. CONTROL FLOW: for loop
        // ---------------------------------
        // Loops are used to execute a block of code repeatedly.

        System.out.println("Starting a countdown...");
        // This loop initializes a counter 'i' at 5.
        // It runs as long as 'i' is greater than 0.
        // After each run, 'i' is decremented by 1 (i--).
        for (int i = 5; i > 0; i--) {
            System.out.println("T-minus " + i);
        }
        System.out.println("Liftoff!");
    }
}