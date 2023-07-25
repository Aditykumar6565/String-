//Java program to find all substrings of a String.
//For example: If input is "abb"  then output should be "a", "b","b", "ab", "bb", "abb"
//We will use String class’s subString method to find all subString.

import java.util.*;
public class Substring {
    public static void main(String[] args) {
        String str = "abbc";
        System.out.println("The substring in the given str : -");
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }


}
