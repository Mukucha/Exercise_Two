package com.company;

public class EvenOrOdd {
    public static void main(String[] args){



//generating a random number between 1 and 100
        int randomNumber = (int) (Math.random() * (100 - 1));



//checking if it is even or not
        if (randomNumber%2 == 0){
            System.out.println(randomNumber + " is an even number");
        } else{
            System.out.println(randomNumber + " is an odd number");
        }






    }


}
