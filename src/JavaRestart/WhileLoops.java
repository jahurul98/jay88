package JavaRestart;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

 //       String sentence = "PS5 is Awesome!";
 //       Scanner scan = new Scanner(sentence);
 //      ArrayList<String> words = new ArrayList<String>();

 //       while (scan.hasNext()) {
//            words.add(scan.next());
//        }
//        System.out.println(words);


        int i =0;                         //create a while Loop that returns back the multiples of 3 and 5 till 100(use module)
        while (i<100){
            if(i%3==0 && i%5==0){
                System.out.println(i);}
            i++;
        }


    }
}