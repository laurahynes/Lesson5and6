package Lesson6;

import java.util.Scanner;

public class BooleanReview {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //ask for 2 test scores, decide their job
        //manager = both 90% or 90
        //supervisr = one at least 90, the other no less than 70
        //anything else clerk
        System.out.print("Enter score 1 result: ");
        int score1 = s.nextInt();
        System.out.print("Enter score 2 result: ");
        int score2 = s.nextInt();
        
        boolean bothHigh, atLeastOne, noLow;
        bothHigh = score1>=90 && score2>=90;
        atLeastOne= score1>=90 || score2>=90;
        noLow = score1 >=70 && score2 >=70;
        
        if(bothHigh) 
            System.out.println("You are a MANAGER!");
        else if(atLeastOne && noLow)
            System.out.println("You are a SUPERVISER!");
        else
            System.out.println("You are a CLERK!");
    }
    
}
