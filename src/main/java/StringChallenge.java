import java.util.Arrays;
import java.util.Scanner;

public class StringChallenge {

    // This function extracts information about a given string and returns an array with that information.
    public static String[] stringInfo(String string){

        // A new array is created with a size of 5.
        String[] stringInfo = new String[5];

        // The length is determined before being parsed into a string and added to the first index of the array.
        int length = string.length();
        String stringLength = String.valueOf(length);
        stringInfo[0] = stringLength;

        // As characters in Java are not strings, the string value of the first and last characters are determined and added to the array.
        stringInfo[1] = String.valueOf(string.charAt(0));
        stringInfo[2] = String.valueOf(string.charAt(length - 1));

        // If the length of the array is even, the middle two characters are added to the array.
        // If the length is odd, then the middle character is added.
        if(length % 2 == 0){

            // As Java rounds up when the length is divided by two, the first character needs to be at the index of the length divided by 2 minus 1.
            String halfMinusOne = String.valueOf(string.charAt((length/2) - 1));

            // The second character is at the index of length divided by 2.
            String halfPlusOne = String.valueOf(string.charAt(length/2));

            // The two characters are added together and added to the array.
            String middleTwo = halfMinusOne + halfPlusOne;
            stringInfo[3] = middleTwo;

        } else{

            // The middle character is determined by dividing the length by two, and this is added to the array.
            String middleChar = String.valueOf(string.charAt(length/2));
            stringInfo[3] = middleChar;

        }

        // The second character of the string is determined and then indexOf() is used to determine whether the character occurs again after index 1.
        char secondChar = string.charAt(1);

        int secondIndexOfChar = string.indexOf(secondChar, 2);

        // A string is initialised with 'not found'.
        String secondIndex = "not found";

        // If the character at the second index occurs again, then the above string is changed to "@ index " plus the first index of that repeat.
        if(secondIndexOfChar > -1){

            String parsedIndex = String.valueOf(secondIndexOfChar);

            secondIndex = "@ index " + parsedIndex;

        }

        // The string is added to the array and the array is returned.
        stringInfo[4] = secondIndex;

        return stringInfo;

    }

    public static void main(String[] args){

        // The user is asked to enter a string.
        System.out.println("Input a string: ");

        Scanner userInput = new Scanner(System.in);

        String string = userInput.nextLine();

        // An array is created using the stringInfo() function.
        String[] array = stringInfo(string);

        // The array is printed in a string format.
        System.out.println(Arrays.toString(array));

    }
}
