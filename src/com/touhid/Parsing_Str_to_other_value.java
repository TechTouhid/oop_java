package com.touhid;

public class Parsing_Str_to_other_value {
    public static void main(String[] args) {
        String numberAsString = "2020";
        System.out.println("Number as string = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("Number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("Number as string = " + numberAsString);
        System.out.println("Number = " + number);

    }
}
