package greeting;


import java.util.Scanner;

/**
 * Created by abijah on 9/9/16.
 */
public class Greeting {





        public static void main(String[] args) {
            System.out.println("What is your name?");
            Scanner ask = new Scanner(System.in);
            String input = ask.nextLine();

            if (input.equalsIgnoreCase("Alice")|| input.equalsIgnoreCase("Bob")){
                System.out.println("Hello" + " " + input + " " + ",how are you?");
            }
            else {
                System.out.println("Hello!");
            }
        }

    }

