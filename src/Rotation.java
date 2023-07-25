import java .util.*;

public class Rotation {
    public static void main(String[] args) {
        System.out.println("java2bliog and blogjava2 are rotation of each other : " + isRotation("java2blog","blogjava2"));
        System.out.println("java2blog and avablog2j are rotation of each other : " + isRotation("java2blog","avablog2j"));

    }
    public static  boolean isRotation(String str,String rotation) {
        String str2 = str + str ;
        if (str2.contains(rotation)){
            return true;
        }
        return  false;
    }

}
