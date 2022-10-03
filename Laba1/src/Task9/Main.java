package Task9;

public class Main {
    public static void main(String[] args){
        Basket basket = new Basket();
        basket.addBall(BallColor.black, 1.8);
        basket.addBall(BallColor.white, 1.8);
        basket.addBall(BallColor.yellow, 1.8);
        basket.addBall(BallColor.blue, 1.8);

        basket.addBall(BallColor.yellow, 5.1);
        BasketInfo info = new BasketInfo(basket);
        int countOfBlueBalls = info.getNumberOfBallsWithColor(BallColor.blue);
        double totalWeight = info.getWeight();
        System.out.println("Number Blue Balls:\t" + countOfBlueBalls);
        System.out.println("Basket Weight:\t" + totalWeight);
    }
}
