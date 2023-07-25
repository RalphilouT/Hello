package com.training.session;

public class F_Arrays {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String[] thisClass = new String[] {"Deep", "Ravi", "Ahmad", "Corey", "Yang"}; //Initializing an Array with 10 fixed elements

		/*
		thisClass[0] = "Deep";       //Array starts with 0 index
		thisClass[1] = "Ravi";
		thisClass[2] = "Aquila";
		thisClass[3] = "Adeeko";
		thisClass[4] = "David";
		thisClass[5] = "Betab";
		thisClass[6] = "Destiny";
		*/
        System.out.println("******** String Array ********");
        System.out.println(thisClass[0]);
        System.out.println(thisClass[1]);
        System.out.println(thisClass[2]);
        System.out.println(thisClass[3]);
        System.out.println(thisClass[4]);


        System.out.println();
        System.out.println();

        int[] scores = new int[] {100, 200, 300};

        scores[0] = 100;       //Array starts with 0 index
        scores[2] = 90;

        System.out.println("******** Int Array ********");
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        System.out.println();
        System.out.println();

        //Out of bound array
        System.out.println(scores[4]);

        int[] newArray = new int[] {100, 200, 300, 400};   // What does this do??

        thisClass = new String[15];    // Creating new size of Array : Does this have the old data


    }
}
