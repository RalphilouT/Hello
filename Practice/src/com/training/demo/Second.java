package com.training.demo;

interface template{
     void hello();
     public int get();
}
public class Second {
    int x;
    String name = "Ralphilou";
    public Second(int x) {
        this.x = x;
    }

    public int getX(){

        return x;
    }
    static int getY(){
        return 15;
    }
    void display()
    {
        System.out.println("Hello World!");
    }

}

