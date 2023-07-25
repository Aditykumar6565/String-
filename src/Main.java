import java.util.*;
public class Main {
    public static void main(String[] args) {
        String name = "RAM";
        String rev = "";
        for (int i=name.length()-1;i>=0;i--){
            rev = rev +name.charAt(i);
        }
        System.out.println("Reverse of the String name:-"+name);
        System.out.println(rev);
    }

}