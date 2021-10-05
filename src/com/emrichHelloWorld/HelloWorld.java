package com.emrichHelloWorld;

public class HelloWorld {


    public static void main(String[] args) {
        Weather weather = new Weather();
        Seasson s = new Weather();

        Seasson s1 = new Seasson();
	// write your code here
//        weather.printSeason(3);
        s.printSeason();
        weather.printS();
        s1.printS();
        weather.printSeason(1);
        change(weather);
        System.out.println("Hello Class! W" + weather.w );
    }

    public static void change(Weather w){
        w.w = 10;

    }

}
