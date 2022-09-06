package JavaRestart;

public class SwitchCase {

    public static void main(String[] args) {

        //      int day = 9;
        //        switch (day){
        //           case 1:
        //                System.out.println("Sunday");
//                 break;
        //            case 2:
        //                System.out.println("Monday");
        //                break;
//             case 3:
//                 System.out.println("Tuesday");
//                break;
        //            case 4:
        //                System.out.println("Wednesday");
//                 break;
//             case 5:
//                 System.out.println("Thursday");
//                 break;
//             case 6:
//                 System.out.println("Friday");
//                 break;
//             case 7:
//                 System.out.println("Saturday");

        //            default:
//                 System.out.println("Not a valid day number");


        String weather = "Sunny";

        switch (weather) {

            case "raining":
                System.out.println("Stay Home");
                break;

            case "snowing":
                System.out.println("Take the kids out to play");
                break;

            case "Sunny":
                System.out.println("Go Swimming");
                break;

            default:
            {
                System.out.println("Invalid Input");
            }
        }


    }
}










