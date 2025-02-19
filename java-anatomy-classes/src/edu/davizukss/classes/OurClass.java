package edu.davizukss.classes;

public class OurClass {

    public static void main(String[] args) {
        
        System.out.println("HELLO WORLD");

        String firstName = "Davi";
        String secondName = "George";

        String fullName = fullName(firstName, secondName);
            System.out.println(fullName);
    }

    public static String fullName(String firstName, String secondName) {
        return "(METHOD) Your name is " + firstName.concat(" ").concat(secondName);
    }
}
