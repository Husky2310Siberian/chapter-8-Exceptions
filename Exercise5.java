package gr.aueb.cf.Exercises_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * reads a list of numbers from a file and throws an exception
 * if any of the numbers are positive
 */
public class Exercise5 {

    public static void main(String[] args) {

        try {
            readFile("test.txt");
        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Error : " +e.getMessage());
        }
    }

    private static void readFile(String fileName) throws FileNotFoundException {

        File file = new File(fileName);
        Scanner in = new Scanner(file);

        while(in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(line);
        }
        in.close();
    }
}
