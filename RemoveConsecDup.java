package STACK;
import java.util.*;
public class RemoveConsecDup {
    public static String removeConsecutiveDuplicates(String str)
    {
        // Your code here
        Stack<Character> s = new Stack<>();

        String res = "";

        res += str.charAt(0);

        s.push(str.charAt(0));

        for(int i = 1;i<str.length();i++){

            if(s.peek()!=str.charAt(i)){

                s.push(str.charAt(i));

                res += str.charAt(i);

            }

        }

        return res;
    }
    public static void main(String[] args) {
        String str="aabbbbccd";
        System.out.println(removeConsecutiveDuplicates(str));

    }
}
