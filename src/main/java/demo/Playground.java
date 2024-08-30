//Treasure Davis
//Java Homework

package demo;

import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
        //while vs for loop
        //write a method that keeps scanning or asking a user a question such as are we there yet?
        //when the use says yes..then quit the program
        System.out.println("Are we there yet?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();  // Read user input

        while(answer.equals("no")){

                //if answer is no ask the question again
                System.out.println("Answer is : " + answer);  // Output user input
                System.out.println("Are we there yet?");
                scanner = new Scanner(System.in);
                answer = scanner.nextLine();  // Read user input

                if(answer.equals("yes")){
                    //what i want to do if the answer is yes
                    System.out.println("Finally!");
                }

        }

    }
}
