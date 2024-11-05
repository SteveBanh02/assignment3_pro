import java.util.Scanner;
public class DiceGame3{
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Dice myDice = new Dice();

        boolean win = false;

        System.out.println(
            """
            Welcome to my dice game!

            In order to win, the player must satisfy one of the following conditions.
            Here are the rules:
                1. The player must correctly guess both dice rolls.
                2. The player rolls the same number in both die.
                3. The player's two dice number adds up to 6.
            The player gets 3 chances to win.
                    
            """
        );

        for(int i = 1; i <= 3; i++){
            
            myDice.roll();
            System.out.println("Please guess your first number: ");
            int guessNum1 = input.nextInt();
                
            System.out.println("Please your second number: ");
            int guessNum2 = input.nextInt();

            System.out.println(myDice.toString());
            System.out.println("Your total is " + myDice.getSumTotal());

            if(guessNum1 == myDice.getDie1() && guessNum2 == myDice.getDie2()){
                System.out.println("You won! You guessed both dice correctly.");
                win = true;
                break;

            }else if(myDice.getDie1() == myDice.getDie2()){
                System.out.println("You won! You rolled the same number");
                win = true;
                break;

            }else if(myDice.getSumTotal() == 6){
                System.out.println("You won! You dice numbers add up to 6.");
                win = true;
                break;

            }else{
                if(i < 3){
                    System.out.println("try again");
                }
            }
        }

        if(!win){
            System.out.println("You lost the dice game.");
        }
    }
}