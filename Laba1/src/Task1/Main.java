package Task1;

public class Main {
    static final double X = 0.8;
    static final double Y = 0.8;


    public static void main(String[] args){
        double result = CalculateExpression(X, Y);
        System.out.println(result);
    }

    public static double CalculateExpression(double x, double y){
        double result = 0;
        double numerator = 0;
        double denumerator = 0;
        numerator = 1 + Math.pow(Math.sin(x + y), 2);
        denumerator = 2 + Math.abs(x - (2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)));
        result = numerator / denumerator + x;
        return result;
    }
}


