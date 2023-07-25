package com.training.session;

public class H_Methods {
    public String exampleVar = "Deep";

    public static void main(String[] args) {

        //System.out.println("Print Method");  // pre-defined Java method

        //myMethod();

        myStringMethod("Michelle", 21, "Li");
        myStringMethod("John", 21, "Smith");
        myStringMethod("Deep", 21, "Singh");

        myIntMethod(123);

        addMethod(5,6);

        int result = addMethodReturn(1,1);
        System.out.println("Sum of two numbers is - " + result);

        int Total = addMethodReturn(4,5);
        System.out.println("Total is  - $" + (Total + 2));

        String strResults = addStringReturnMethod ("My Name ","Deep");
        System.out.println(strResults);
    }

    public void myMethod() {
        System.out.println("Hello!!");
        System.out.println();
    }

    public static void myStringMethod (String name, int age, String lastName) {
        System.out.println("My Name is " + name + " " + lastName);
        System.out.println("My age is " + age);

        System.out.println();
    }


    public static void myIntMethod (int num) {
        System.out.println("Number is " + (num + 8));
        System.out.println();
    }

    public static void addMethod (int num, int num2) {
        System.out.println("Addition is " + (num + num2));
        System.out.println();
    }

    //***************  Return Methods  *****************
    public static int addMethodReturn (int num, int num2) {
        int result = num + num2;
        return result;
    }

    public static String addStringReturnMethod (String str1, String str2) {
        return str1 + str2;
    }

    //***************  Static and Non Static Methods  *****************
    //For static methods we don't need to create instance of the class
    //Non-Static method can only be accesses through the instance of the class

    public int subReturnMethod (int num, int num2) {
        return num - num2;
    }

    public int divReturnMethod (int num, int num2) {
        return num / num2;
    }
}
