import java.util.Scanner;   

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("You are about to guess a positive number randomly picked between 1 and.. well, how much??");
        System.out.print("Enter number: ");

        int numberRange = sc.nextInt();
        if(numberRange < 1){
            System.out.println("Please select a whole number greater than 1.");
            numberRange = sc.nextInt();
        }
        int numberPicked = (int)(Math.random()*numberRange)+1;

        int guess = 0;
        int guessCount = 0;
        while(guess != numberPicked){
            System.out.print("Pick a number between 1 and "+numberRange+": ");

            guess = sc.nextInt();
            guessCount++;

            if(guess == numberPicked){
                System.out.println("Well done! "+guess+" is the number!");
                System.out.println("You guess the number in "+guessCount+" guesses!");
                System.out.println("Thanks for playing!");
                System.out.print("Would you like to play again? (Y/N):");
                String sel = sc.next();
                if(sel.equals("Y")){
                    //play again

                }
            } else if(guess > numberPicked){
                System.out.println("Too high!");
            } else if(guess < numberPicked){
                System.out.println("Too low!");
            }
        }

        sc.close();
    }
    
}
