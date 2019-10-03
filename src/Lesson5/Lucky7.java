package Lesson5;
import java.util.Scanner;

public class Lucky7 {

    
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        int money;
        int maxmon;
        int bestroll=1;        
        int rolls=0;
        Scanner s = new Scanner(System.in);
        
        System.out.print("How many dollars do you have? > ");
        money = s.nextInt();
        maxmon = money;
        while(money < 0){
            System.out.println("Error. You must enter more than 0 dollars.");
            System.out.print("How many dollars do you have? > ");
            money = s.nextInt();
            maxmon = money;
            if(money > 0) break;
        }
        
        
        while (true) {
            d1.roll();
            d2.roll();
            rolls++;
            int total = d2.getValue() + d1.getValue();
            if(total == 7){
                money +=4;                
            }
            else money--;
            
            if(money > maxmon){
                maxmon = money;
                bestroll = rolls;
            }
            
            if (money == 0) {
                break;
            }            
        }      
        System.out.format("You are broke after %d rolls.\n",rolls);
        System.out.format("You should have quit after %d rolls when you had $%d.\n",bestroll,maxmon);
        
    }    

}
