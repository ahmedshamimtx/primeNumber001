package com.shamim;
import java.util.*;// import scanner and math classes for user imput and figuring out square root of an a number

public class userInputNumber {
    public static void main(String[] args) {

        //block for user input
        Scanner sc = new Scanner(System.in);// define scanner class, put the new object in the variable sc.
        System.out.println("Enter a number to check if it is truly prime number or not: ");//print the prompt
        int number = sc.nextInt();//put the object with the user input to a int variable

        //block for declaring some variables
        boolean isPrime = true;//declare a boolean variable called isPrime and set the initial value true

        //block for running a loop with if statement that checks if the number is a prime number
        for (int i = 2; i <= Math.sqrt(number); i++) {// initial value is 2, and it increments my 1 till it is equal or greater than the square root of the number
            System.out.println("checking "+ i);
            if (number % i == 0) { // if number is fully divisible by i, then number is not prime
                isPrime = false;
                break;
            }
        }
        if (isPrime) {//if isPrime is true
            System.out.println(number + " is a Prime Number");
        }else{
            System.out.println(number + " is not a Prime Number");
            }

    }
}
