package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
         return Arrays.asList(array).contains(value);

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] tempArray = new String[array.length];
        for (int i = 0; i < array.length; i++){
            tempArray[i] = array[(array.length - 1) - i];
        }
        return tempArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean value = true;
        for (int i = 0; i < (array.length / 2); i++){
            if (array[i] == array[(array.length - 1) - i]) {
                value = true;
                continue;
            } else value = false;
        }
        return value;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        Boolean isPan = true;
        String arrayString = "";


        for (int i = 0; i < array.length; i++){
            arrayString += array[i];
        }

        arrayString = arrayString.toLowerCase();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabet.length(); i++){
            if (arrayString.indexOf(alphabet.charAt(i)) == -1){
                isPan = false;
                break;
            }
        }

        return isPan;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int totalValue = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                totalValue++;
            }
        }
        return totalValue;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int totalValue = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] == valueToRemove){
                totalValue++;
            }
        }

        String[] newArray = new String[array.length - totalValue];
        int arrLength = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] == valueToRemove){
                continue;
            }
            else {
                newArray[arrLength] = array[i];
                arrLength++;
            }
        }

        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newList = new ArrayList<>();

        for (int i = 0; i < array.length; i++){
            if (i == 0){
                newList.add(array[i]);
            }
            else if (array[i] == array[i-1]){
                continue;
            }
            else {
                newList.add(array[i]);
            }
        }
        String[] newArray = new String[newList.size()];

        for (int i = 0; i < newList.size(); i++){
            newArray[i] = newList.get(i);
        }

        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> newList = new ArrayList<>();
        int j = 1;

        for (int i = 0; i < (array.length - 1); i++){
            String tempString = "";

            if (array[i] != array[j]){
                newList.add(array[i]);
                continue;
            }

            // Skips duplicates while for loop iterates
            if ((j-i) > 1){
                continue;
            }

            while (array[i] == array[j]){
                tempString += array[i];
                j++;
            }

            newList.add(tempString);
        }

        String[] newArray = new String[newList.size()];

        for (int i = 0; i < newList.size(); i++){
            newArray[i] = newList.get(i);
        }

        return newArray;


    }


}
