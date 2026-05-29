import java.io.*;
import java.util.Scanner;

public class filehandlingutility {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n========== FILE HANDLING UTILITY ==========");
            System.out.println("1. Create File");
            System.out.println("2. Write to File");
            System.out.println("3. Read File");
            System.out.println("4. Modify File Content");
            System.out.println("5. Append Content");
            System.out.println("6. Delete File");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    createFile();
                    break;

                case 2:
                    writeFile();
                    break;

                case 3:
                    readFile();
                    break;

                case 4:
                    modifyFile();
                    break;

                case 5:
                    appendContent();
                    break;

                case 6:
                    deleteFile();
                    break;

                case 7:
                    System.out.println("Program Exited.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);
    }

    // CREATE FILE
    static void createFile() {

        try {

            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();

            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // WRITE FILE
    static void writeFile() {

        try {

            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();

            FileWriter writer = new FileWriter(fileName);

            System.out.println("Enter text to write:");
            String data = sc.nextLine();

            writer.write(data);
            writer.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // READ FILE
    static void readFile() {

        try {

            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();

            File file = new File(fileName);

            Scanner reader = new Scanner(file);

            System.out.println("\n----- FILE CONTENT -----");

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    // MODIFY FILE
    static void modifyFile() {

        try {

            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();

            File file = new File(fileName);

            if (!file.exists()) {
                System.out.println("File does not exist.");
                return;
            }

            System.out.println("Enter new content:");
            String newContent = sc.nextLine();

            FileWriter writer = new FileWriter(fileName, false);

            writer.write(newContent);
            writer.close();

            System.out.println("File modified successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // APPEND CONTENT
    static void appendContent() {

        try {

            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();

            FileWriter writer = new FileWriter(fileName, true);

            System.out.println("Enter content to append:");
            String data = sc.nextLine();

            writer.write("\n" + data);
            writer.close();

            System.out.println("Content appended successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // DELETE FILE
    static void deleteFile() {

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Unable to delete file.");
        }
    }
}
