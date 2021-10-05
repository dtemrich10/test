package com.emrichHelloWorld;

public class Weather extends Seasson {
    int y = 3;

    public int w = 5;

     public void printSeason(int x) {
        System.out.println("Hello world ");
        //printSeason();

         change(y);
         System.out.println("Hello world " + y);

    }

    private void change(int y)
    {
        y = 5;
    }

}
