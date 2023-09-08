package org.example;

public class Main {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 99;
        int num3 = 19;

        boolean hasTeenNumber = HasTeen.hasTeen(num1,num2,num3);
        System.out.println("Does the list of numbers contain a teen number? " + hasTeenNumber);

        int num4 = 15;
        boolean isTeenNumber = IsTeen.isTeen(num4);
        System.out.println("Is " + num4 + " a teen number? " + isTeenNumber);

    }
}