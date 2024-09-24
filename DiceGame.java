import java.util.Scanner;
public class DiceGame{

    int num1, num2, num3;

    public DiceGame(int tempNum1, int tempNum2, int tempNum3){
        num1 = tempNum1;
        num2 = tempNum2;
        num3 = tempNum3;
    }
    
    // public void randomNumbers(){
    //     int randomNum1 = (int)(Math.random()*6 + 1);
    //     int randomNum2 = (int)(Math.random()*6 + 1);

    //     System.out.println(randomNum1);
    //     System.out.println(randomNum2);
    // }

    public void guessNumRight(int number){

        int randomNum = (int)(Math.random()*6 + 1);
        
        if (number == randomNum){
            System.out.println("congrads you got the right number");
        }else {
            System.out.println("better luck next time");
        }

        System.out.println("the random number is " + randomNum);

    }

    public static void main (String[]args){
        
        Scanner input = new Scanner (System.in);

        DiceGame myNum = new DiceGame(0,0,0);

        System.out.println("Enter your first number guess: ");
        int numOne = input.nextInt();

        myNum.guessNumRight(numOne);
        
        System.out.println("enter your second number guess: ");
        int numTwo = input.nextInt();

        myNum.guessNumRight(numTwo);
        //System.out.println(myNum);

        
        


    }
}