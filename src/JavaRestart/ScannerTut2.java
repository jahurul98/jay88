package JavaRestart;

import java.util.Scanner;

public class ScannerTut2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("what Is your Name:");
            String name = scan.next();
            System.out.println(name);

        System.out.println("what is your street Address:");
         String StreetAddress = scan.next();
        System.out.println(StreetAddress);

        System.out.println("what is your building number:");
        int buildingNum = scan.nextInt();
        System.out.println(buildingNum);

        System.out.println("what county are you from?");
        String county = scan.next();
        System.out.println(county);

        System.out.println("what is your zipCode:");
        int zipcode = scan.nextInt();
        System.out.println(zipcode);

        System.out.println(name+" "+zipcode+" "+StreetAddress+" "+county+" "+buildingNum);

        }
    }
