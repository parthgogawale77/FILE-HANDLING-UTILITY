# FILE-HANDLING-UTILITY

COMPONY: CODETECH IT SOLUTIONS

NAME: PARTH NAMDEV GOGAWALE

INTERN ID: CTIS9713

DOMAIN: JAVA PROGRAMMING

DURATION: 4 WEEKS

MENTOR: NEELA SANTOSH

DESCRIPTION:

Description of the Java File Handling Utility
The provided Java code defines a program titled filehandlingutility, which serves as a robust, menu-driven command-line application designed to perform fundamental file operations. By utilizing the java.io package for file manipulation and the java.util.Scanner class for user interaction, the program demonstrates the core principles of Input/Output (I/O) streams in Java.
Program Structure and Flow
The utility is structured around a do-while loop within the main method, ensuring that the application remains active until the user explicitly chooses to exit (Option 7). Inside this loop, a menu is displayed, and the user’s choice is processed through a switch statement. This modular design delegating tasks to specific static methods makes the code organized, readable, and easy to maintain.
Key Functionalities
File Creation (createFile): This method prompts the user for a filename and uses the File.createNewFile() method. It includes logic to check whether the file already exists, providing immediate feedback to the user. This is an essential first step in ensuring the program does not accidentally overwrite existing data during the creation phase.
Writing to Files (writeFile): The utility allows users to write text to a file using the FileWriter class. In this implementation, the writer is initialized in its default mode, which overwrites any existing content in the file. This is useful for initializing a file with specific data.
Reading Files (readFile): To display content, the program utilizes the Scanner class aimed at a File object. It iterates through the document using a while loop and the hasNextLine() method, printing the content line-by-line to the console. This approach is memory-efficient for reading text files.
Modifying Content (modifyFile): While similar to the writing function, this method includes an explicit check to ensure the file exists before attempting to write. It demonstrates a "safe" way to handle file updates by verifying the target's presence first.
Appending Content (appendContent): This is a critical feature where the program demonstrates the use of the FileWriter constructor with a boolean flag (new FileWriter(fileName, true)). This allows users to add new data to the end of a file without deleting the original content, which is vital for logging or maintaining records.
Deleting Files (deleteFile): The utility provides a cleanup mechanism using the File.delete() method. It informs the user whether the deletion was successful or if the file could not be found/removed.
Error Handling and Robustness
A significant strength of this code is its implementation of Exception Handling. File operations are inherently risky because they depend on external factors like disk space, file permissions, or the existence of a file path. The program uses try-catch blocks to capture IOException and FileNotFoundException. This prevents the program from crashing if a user enters an invalid filename or if a system error occurs, instead providing a user-friendly error message.
Conclusion
Overall, this filehandlingutility is an excellent example of a CRUD (Create, Read, Update, Delete) application for the file system. It highlights the versatility of Java’s I/O classes and provides a practical template for developers looking to understand how to bridge the gap between user input and persistent storage on a hard drive.

OUTPUT: 
<img width="1470" height="956" alt="Image" src="https://github.com/user-attachments/assets/db07b1cb-86e5-4c64-9cd9-ba8913edc04b" />
