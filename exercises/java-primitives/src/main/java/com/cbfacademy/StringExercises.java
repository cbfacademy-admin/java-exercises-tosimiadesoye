package com.cbfacademy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        return new String(characters);

    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are
        // contained in the input ${text}

        long count = 0L;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                count++;
            }

        }
        return count;

    }

    public static boolean istPalindrom(char[] word) {
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        int i = 0;
        int l = word.length() - 1;
        while (l > i) {
            if (word.charAt(i) != word.charAt(l)) {
                return false;
            }
            ++i;
            --l;
        }
        return true;
    }

    public String getName() {
        return "String Exercises";
    }
}
