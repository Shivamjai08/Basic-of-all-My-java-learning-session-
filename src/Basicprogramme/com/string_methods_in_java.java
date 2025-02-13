package Basicprogramme.com;

public class string_methods_in_java {
    public static void main(String[] args) {
        String name = "Harry";
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        String nonTrimmedString = "   Harry       ";
        System.out.println(nonTrimmedString);
        String TrimmedString = nonTrimmedString.trim();
        System.out.println(TrimmedString);
        System.out.println(name.substring(3));
        System.out.println(name.substring(1, 5));
        System.out.println(name.charAt(0));
        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("harry"));
        System.out.println(" This Is  escaped charcter sequence \"double quote");
    }
}
