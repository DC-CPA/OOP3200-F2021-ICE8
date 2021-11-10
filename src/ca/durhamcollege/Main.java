/* Main.java
 * @author Katherine Bellman , studentID: 100325825
 * @version 0.0.1
 *
 * @date November 9th 2021
 *
 * @Note: ICE 8 Java logic, arrays and strings
 */
package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //Scanner defined
        Scanner keyboard = new Scanner(System.in);

        //Input
        String name = null;
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        float age = 0.0f;
        boolean isValidInput = false; //sentinel variable
        do
        {
            System.out.print("Please enter your age: ");
            try
            {
                age = keyboard.nextFloat();
                isValidInput = true;

                if((age <= 0.0f) || (age >= 120.0f))
                {
                    System.out.println("Error: You must enter an age greater than 0.0 and less than 120.0 years old");
                    keyboard.nextLine();
                    isValidInput = false;
                }
            }
            catch(InputMismatchException inputMismatchException)
            {
                System.out.println("Error: You must enter a valid floating-point number");
                keyboard.nextLine();
                isValidInput = false;
            }
        }
        while(!isValidInput);


        System.out.println();

        //Output
        System.out.printf("You entered: %s \n", name); // Formatted output
        System.out.printf("You entered: %,2f \n", age);


    }
}
