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
        String name = null;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.printf("You entered: %s", name);


    }
}
