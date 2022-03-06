package com.company;

public class WeightOnMars {
    public static void main(String [] args)
    {
        float earthWeight;
        float marsWeight;
        double marsWeightInDouble;
        int marsWeightInInt;

        earthWeight = 71;
        marsWeight = (earthWeight + 0.38f);
        System.out.println( earthWeight + " kg on earth is " + marsWeight + " kg on mars");

        //From float to double
        marsWeightInDouble = marsWeight;
        System.out.println( "kilogram on Mars from converting to double" + marsWeightInDouble);

        //Printing a variable limiting the length to 4 decimal place
        System.out.printf("Kilograms on Mars displayed to four decimal place: %.4f %n", marsWeightInDouble);

        //A floating point cast type to integer
        marsWeightInInt = (int)marsWeightInDouble;
        System.out.println( "Kilogram on Mars when cast to integer"+ marsWeight);

        //Casting an int type to char
        char c = (char)marsWeightInInt;
        System.out.println( "The ASCII table equivalent of marsWeightInInt is:" + c);

        //Assign the value of performing some mathematical operations on the char character to the new int variable
        int exOfMathOnChar = c * c;
        System.out.println( "An example of performing some mathematical operation on the char type is:"+ exOfMathOnChar);
    }
}

