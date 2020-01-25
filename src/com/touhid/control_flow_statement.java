package com.touhid;

public class control_flow_statement {
    public static void main(String[] args) {

        // Switch statement
        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("The value was 1");
                break;
            case 2:
                System.out.println("The value was 2");
            default:
                System.out.println("Not either 1 or 2");
                break;
        }

        char charValue = 'A';
        switch (charValue) {
            case 'A': case 'B': case 'C': case 'D':
                System.out.println(charValue + " Was found");
                break;
            default:
                System.out.println(charValue + " Not found!");
                break;
        }


    }
}
