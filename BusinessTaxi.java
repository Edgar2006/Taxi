package com.company;

public class BusinessTaxi extends Transport{
    void sum(int km){
        int s=km*900;
        System.out.println("A silver Mercedes Benz E class will come for you");
        System.out.println("The price for the trip will cost "+s);
    }
}
