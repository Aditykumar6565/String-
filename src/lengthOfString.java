// find length of string in java without using length() method
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class lengthOfString {
    public static void main(String args[]){

        String helloWorld="This is hello world";
        System.out.println("length of helloWorld string :"+getLengthOfString(helloWorld));

    }

    public static int getLengthOfString(String str)
    {
        int i=0;
        try{
            for(i=0;;i++)
            {
                str.charAt(i);
            }

        }
        catch(Exception e)
        {

        }
        return i;
    }
}