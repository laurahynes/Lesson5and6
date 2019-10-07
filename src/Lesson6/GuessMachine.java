package Lesson6;

public class GuessMachine {
    private int number;
    private int numGuessess;
    private int guess;
    
    public GuessMachine(){
        int num = (int)(Math.random() * 100 + 1);
        number = num;
        numGuessess = 0;
        guess = 0;
    }
    
    public String giveHint(){
        if(guess > number) return "You Guessed " + guess +". Too high: guess LOWER";
        else if(guess < number) return "You Guessed " + guess +". Too low: guess HIGHER";
        else return "You Guessed " + guess +". You got it!";
    }
    
    public boolean setGuess(int number){
        guess = number;
        if(number >=1 && number<=100){
            guess = number;
            numGuessess++;
            return true;
        } 
        else return false;
    }
    
    public int getnumGuessess(){
        return numGuessess;
    }
}
