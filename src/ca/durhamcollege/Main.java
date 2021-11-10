/* Main.java
 * @author Katherine Bellman , studentID: 100325825
 * @version 0.0.1
 *
 * @date November 9th 2021
 *
 * @Note: ICE 8 Java logic, arrays and strings
 */
package ca.durhamcollege;

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
        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();
        System.out.println();

        //Output
        System.out.printf("You entered: %s \n", name); // Formatted output
        System.out.printf("You entered: %,2f \n", age);

    }
}
