package JavaRestart;

import java.util.Scanner;

public class ScannerTut {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);

        System.out.println("what is your first Name?");
         String name = fetch.next();                    //   asking the user to provide their name(userinput) in the system

         System.out.println(name);

        System.out.println("What Is your Age?");
       int age = fetch.nextInt();
        System.out.println(age);

        System.out.println("whats your Senior Quote?");
        String Quote = fetch.next();

        System.out.println("Thank you "+ name + " you are " + age + " years Old");
        System.out.println("and your senior quote is " +  Quote);

    }
}
