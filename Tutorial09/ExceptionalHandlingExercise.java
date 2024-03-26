import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionalHandlingExercise {

    public static void main(String[] args) {
        // Exercise 1: Handle File Operations
        // Call the readFile method with the appropriate file name
        readFile("example.txt");

        // Exercise 2: Handle Arithmetic Exception
        // Call the divide method with suitable values
        System.out.println("Result of division: " + divide(10, 0));

        // Exercise 3: Handle Input Mismatch Exception
        // Call the readIntegerFromUser method
        System.out.println("Enter an integer: ");
        System.out.println("Integer entered: " + readIntegerFromUser());

        // Exercise 4: Handle Array Index Out of Bounds Exception
        // Call the accessArrayElement method with suitable values
        int[] array = {1, 2, 3, 4, 5};
        accessArrayElement(array, 10);

        // Additional Exercise: Handle Null Pointer Exception
        // Call the printLength method with a null string
        printLength(null);
    }

    // Exercise 1: Implement a method to read from a file and handle potential exceptions
    private static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    // Exercise 2: Implement a method to perform division and handle potential exceptions
    private static int divide(int numerator, int denominator) {
        try {
            return numerator / denominator;
        } catch (ArithmeticException e) {
            System.err.println("Division by zero is not allowed.");
            return 0;
        }
    }

    // Exercise 3: Example - Method to read an integer from user input and handle input mismatch exception
    private static int readIntegerFromUser() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Input is not an integer.");
            return 0;
        }
    }

    // Exercise 4: Example - Method to access an array element and handle index out of bounds exception
    private static void accessArrayElement(int[] array, int index) {
        try {
            System.out.println("Element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Index out of bounds: " + e.getMessage());
        }
    }

    // Additional Exercise: Handle Null Pointer Exception
    private static void printLength(String str) {
        try {
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.err.println("String is null.");
        }
    }
}
