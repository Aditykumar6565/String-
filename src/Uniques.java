import java.util.HashSet;
import java .util.*;
public class Uniques {
    public static void main(String[] args) {
        String str = "asdfg";
        System.out.println("The string str has all unique charater : " + uniquechar(str));
    }


    public static boolean uniquechar(String str) {
        HashSet alphaset = new HashSet();
        for (int i=0;i<str.length(); i++){
            char c = str.charAt(i);

            HashSet alphaSet = new HashSet<>();
            if (!alphaSet.add(c))
                return false;
        }
        return true;
    }
}
