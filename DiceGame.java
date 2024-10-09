import java.util.Scanner;
public class DiceGame{

    public static boolean checkUserGuessNum(int guessNum1, int guessNum2, int die1, int die2, int sumDice){
        
        if (guessNum1 == die1 && guessNum2 == die2){
            
            System.out.println("Congradulations! You won! You guessed both numbers correctly.");
            return true;

        }else if (die1 == die2) {

            System.out.println("Congradulations! you won! You rolled both dice the same number.");
            return true;

        }else if (sumDice == 6){

            System.out.println("Congradulations! You won! Both dice sums up to 6");
            return true;

        }else{
            
            System.out.println("Better luck next time!");
            return false;
        }
    }

    public static void main (String[]args){
        
        Scanner input = new Scanner (System.in);

        int die1 = (int)(Math.random()*6 + 1);
        int die2 = (int)(Math.random()*6 + 1);
        int sumDice = die1 + die2;

        System.out.println("Enter your first number: ");
        int guessNum1 = input.nextInt();
        
        System.out.println("Enter your second number: ");
        int guessNum2 = input.nextInt();

        if(checkUserGuessNum(guessNum1, guessNum2, die1, die2, sumDice)){

            System.out.println("The first die number is " + die1);
            System.out.println("The second die number is " + die2);
            System.out.println("The sum of the dice is " + sumDice);

        }
    }
}