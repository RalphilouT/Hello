package com.training.session;

public class D_Condition_Control_Flow {
    public static void main(String[] args) {

        int value = 8;

        // ***************  If statement  ***************
        if(value == 9)
            System.out.println("Value is equal to 9 - printing if statement");
        System.out.println("My name is John");
        // ***************  If - else  ***************
        if(value == 2)
        {
            System.out.println("Value is equal to 2");
        }
        else
        {
            System.out.println("Value is not equal to 2");
        }

        // ***************  Else If  ***************
        value = 4;
        if(value == 1)
            System.out.println("Value is equal to 1");
        else if (value == 2)
            System.out.println("Value is equal to 2");
        else if (value == 4 || value == 3)
            System.out.println("Value is equal to 3");
        else
            System.out.println("Value is not equal to 1, 2 or 3");

        System.out.println();
        System.out.println();

        // Demonstrate not true ! flag

        boolean flag = false;

        if(flag)
            System.out.println("Value of this flag is True");
        else
            System.out.println("Value of this flag is False");


        System.out.println();
        System.out.println();

        // ***************  Case Switch Statement  ***************

        int month = 3;

        switch(month) {
            case 1 : System.out.println("January");
                break;
            case 2 : System.out.println("February");
                break;
            case 3 : System.out.println("March");
                break;
            case 4 : System.out.println("April");
                break;
            case 5 : System.out.println("May");
                break;
            case 6 : System.out.println("June");
                break;
            case 7 : System.out.println("July");
                break;
            case 8 : System.out.println("August");
                break;
            case 9 : System.out.println("September");
                break;
            case 10 : System.out.println("October");
                break;
            case 11 : System.out.println("November");
                break;
            case 12 : System.out.println("December");
                break;
            default: System.out.println("Not a Valid month");
                break;
        }

    }
}
