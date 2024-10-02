package gr.aueb.cf.Exercises_Exceptions;

/**
 * takes a string as an input ant throws an exception
 * if the string does not contain vowels
 */
public class Exercise7 {

    public static void main(String[] args)  {

        try {
            String text = "jdsww";
            checkForNowels(text);
            System.out.println("string has vowels");
        } catch (NoVowelsException e) {
            e.printStackTrace();
            System.out.println("no vowels in string " + e.getMessage());
        }
    }

    private static void checkForNowels(String text) throws NoVowelsException {

        String vowels = "aeiouAEIOU";
        boolean hasVowels = false;

        for (int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(vowels.contains(String.valueOf(ch))) {
                hasVowels = true;
                break;
            }
        }
        if(!hasVowels) {
            throw new NoVowelsException (" , Error");
        }
    }
}

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}