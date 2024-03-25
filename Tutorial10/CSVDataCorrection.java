import java.io.File;
import java.io.*;
import java.util.Scanner;

public class CSVDataCorrection {
    public static void main(String[] args) {
        try {
            File file = new File("bank_data.csv");
            Scanner scanner = new Scanner(file);

            // Skip the first line which contains the column headers
            if (scanner.hasNextLine()) {
                scanner.nextLine();

                // Process the rest of the file
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(",");

                    String accountNumber = parts[0]; // Extract account number from the first column

                    accountNumber = accountNumber.replace("'", "");

                    // Declare and initialize the FileWriter object
                    FileWriter fileWriter = new FileWriter("bank_data.csv", true);

                    // Update the new account number to the csv file
                    fileWriter.write(accountNumber + ",");

                    // Close the FileWriter object
                    fileWriter.close();
                    // Write the rest of the columns from the 'parts' array to the csv file
                    for (int i = 1; i < parts.length; i++) {
                        fileWriter.write(parts[i]);
                        if (i < parts.length - 1) {
                            fileWriter.write(",");
                        }
                    }
                   

                    // If accountNumber is null or empty, we couldn't extract it properly
                    if (accountNumber == null || accountNumber.isEmpty()) {
                        System.err.println("Unable to extract account number from line: " + line);
                        continue; // Skip this line and proceed to the next line
                    }

                    // System.out.println("Account Number: " + accountNumber);

                    // // Now you can perform your corrections or other operations as needed

                    // System.out.println();
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
                    
                    


