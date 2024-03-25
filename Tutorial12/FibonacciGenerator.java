import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class FibonacciGenerator {
    public static void main(String[] args) {
        generateAndWriteSequence(1000, "fibonacci.txt");
    }

    public static void generateAndWriteSequence(int n, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(n + "\n");

            BigInteger[] sequence = new BigInteger[n];

            sequence[0] = BigInteger.ZERO;
            sequence[1] = BigInteger.ONE;

            for (int i = 2; i < n; i++) {
                sequence[i] = sequence[i - 1].add(sequence[i - 2]);
            }

            for (BigInteger num : sequence) {
                writer.write(num + "\n");
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}