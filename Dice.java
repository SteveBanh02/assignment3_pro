public class Dice {

    //int numFaces;
    //private int sumTotal;
    private int die1;
    private int die2;

    public Dice(){//default constructor --> takes no parameter
    }

    public void roll(){
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        //sumTotal = die1+die2;
    }

    //getters
    public int getDie1(){
        return die1;
    }
    public int getDie2(){
        return die2;
    }

    public int getSumTotal(){
        //return sumTotal;
        return die1+die2;
    }

    public String toString(){
        return "First die comes up to " + die1 + ", and second die comes up to " + die2;
    }

}