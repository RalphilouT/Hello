package com.training.session;

public class H_StaticMethods {
    public static void main(String[] args) {

        //Static Methods
        H_Methods deep = new H_Methods();
        H_Methods john = new H_Methods();



        //Non-Static Method   --> Only visible when instance is created
        H_Methods newMethodsInstance = new H_Methods();
        newMethodsInstance.divReturnMethod(1, 1);
        newMethodsInstance.exampleVar= "abcdeffhrydlslfkjlksfg;kdhfgk;jdhg;kjhgk;jdhgkshdfkjshdgkjhgfkjhdsg;kjhsg";

        int result = newMethodsInstance.subReturnMethod(5, 3);
        System.out.println("Result of Subtraction " + result);

        newMethodsInstance.addMethod(2, 2);   // warning because we are calling static
        // static method from the instance created
    }
}
