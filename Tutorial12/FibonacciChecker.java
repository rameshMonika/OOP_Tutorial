import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class FibonacciChecker {
    public static void main(String[] args) {
        BigInteger[] sequence = readFromFile("fibonacci.txt");
        if (sequence != null && verifySequence(sequence)) {
            System.out.println("Fibonacci sequence is correct.");
        } else {
            System.out.println("Fibonacci sequence is incorrect.");
        }
    }

    public static BigInteger[] readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int totalNumbers = Integer.parseInt(reader.readLine());
            BigInteger[] sequence = new BigInteger[totalNumbers];
            for (int i = 0; i < totalNumbers; i++) {
                sequence[i] = new BigInteger(reader.readLine());
            }
            return sequence;
        } catch (IOException e) {
            handleIOException(e);
        } catch (NumberFormatException e) {
            handleNumberFormatException(e);
        }
        return null;
    }

    public static boolean verifySequence(BigInteger[] sequence) {
        for (int i = 2; i < sequence.length; i++) {
            if (!sequence[i].equals(sequence[i - 1].add(sequence[i - 2]))) {
                return false;
            }
        }
        return true;
    }

    private static void handleIOException(IOException e) {
        System.out.println("An error occurred while reading the file.");
        e.printStackTrace();
    }

    private static void handleNumberFormatException(NumberFormatException e) {
        System.out.println("Invalid data format in the file.");
        e.printStackTrace();
    }
}