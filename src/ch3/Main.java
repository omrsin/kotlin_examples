package ch3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        System.out.println(StringFunctions.badJoinToStringWithDefaults(a, "| "));
        System.out.println(StringFunctions.lastChar("abc"));
        System.out.println(StringFunctions.jointToString(a, ";"));
    }
}
