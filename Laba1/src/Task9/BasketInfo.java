package Task9;

public class BasketInfo {
    private Basket basket;
    public BasketInfo(Basket basket){this.basket=basket;}

    public int getNumberOfBallsWithColor(BallColor color){
        int count = 0;
        for(Ball ball: basket.getBalls()){
            if (ball.ballColor == color)
                count++;
        }
        return count;
    }

    public double getWeight(){
        double totalWeight = 0;
        for(Ball ball: basket.getBalls()){
            totalWeight += ball.weight;
        }
        return totalWeight;
    }


}
