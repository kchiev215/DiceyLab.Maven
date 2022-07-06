public class Dice {
    private int numOfDie;

    public Dice(int numOfDie){
        this.numOfDie = numOfDie;
    }

    public int tossAndSum(){
        int sum = 0;
        for(int i = 1; i<=numOfDie; i++){
            sum += Math.floor(Math.random()*6+1);
        } return sum;
    }








}
