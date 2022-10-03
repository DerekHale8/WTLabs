package Task9;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;

    public Basket(){
        balls = new ArrayList<Ball>();
    }

    public void addBall(BallColor color, double weight){
        Ball ball = new Ball(color, weight);
        balls.add(ball);
    }

    public ArrayList<Ball> getBalls(){
        return  balls;
    }
}
