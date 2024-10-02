package gr.aueb.cf.Exercises_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * file reading method with exception handling
 */
public class Exercise4 {

    public static void main(String[] args) {
        try {
            readFile("test1.txt");
        } catch (FileNotFoundException e){
            System.out.println("file not found " + e.getMessage());
        }
    }

    private static void readFile(String fileName) throws FileNotFoundException {

        File file = new File(fileName);
        Scanner in = new Scanner(file);

        while (in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(line);
        }
        in.close();
    }
}
