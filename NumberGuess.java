import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("You are about to guess a positive number randomly picked between 1 and.. well, how much??");
        System.out.print("Enter number: ");

        int numberRange = sc.nextInt();
        int numberPicked = (int)(Math.random()*numberRange)+1;

         int guess = 0;
        while(guess != numberPicked){
            System.out.print("Pick a number between 1 and "+numberRange+": ");

            guess = sc.nextInt();

            if(guess == numberPicked){
                System.out.println("Well done! "+guess+" is the number!");
                System.out.println("Thanks for playing!");
            } else if(guess > numberPicked){
                System.out.println("Too high!");
            } else if(guess < numberPicked){
                System.out.println("Too low!");
            } else {
                System.out.println("Something seems to have gone wrong, please try again.");
            }
        }

        sc.close();
    }
    
}
