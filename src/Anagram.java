import  java.util.*;
public class Anagram {
    public static void main(String arg[]) {
        String word ="CAR";
        String anagram ="RAC";
        System.out.println("CAR and RAC are anagrams :"+ isAnagramUsingStringMethods(word,anagram));


    }
    public static boolean isAnagramUsingStringMethods(String word,String anagram){
        if(word.length() !=anagram.length())
            return false;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            int index =anagram.indexOf(c);
            if(index !=-1){
               anagram = anagram.substring(0,index)+anagram.substring(index +1,anagram.length());
            }else
                return false;
        }
        return  anagram.isEmpty();
    }
}