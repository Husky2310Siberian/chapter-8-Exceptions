package gr.aueb.cf.Exercises_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * read a file and throws exception if is empty
 */
public class Exercise6 {

    public static void main(String[] args) {
        try {
            checkFileNotEmpty("test.txt");
            System.out.println("file is not empty");
        } catch (FileNotFoundException e) {
            System.out.println("Error: the is not " + e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkFileNotEmpty (String fileName) throws FileNotFoundException, EmptyFileException{
        File file = new File(fileName);
        Scanner in = new Scanner(file);

        if (!in.hasNextLine()){
            in.close();
            throw new EmptyFileException ("file is empty");
        }
        in.close();
    }
}

class EmptyFileException extends Exception{
    public EmptyFileException (String message){
        super(message);
    }
}
