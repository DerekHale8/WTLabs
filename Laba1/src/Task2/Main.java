package Task2;

public class Main {

    static final double X = 0.8;
    static final double Y = 0.8;

    public static void main(String[] args){
        boolean result = isBelongToArea(X,Y);
        System.out.println(result);
    }


    public static boolean checkTopArea(double x, double y){
        int topY = 5, bottomY = 0, leftX = -4, rightX = 4;
        return (x >= leftX && x <= rightX) && (y >= bottomY && y <= topY);
    }

    public static boolean checkBottomArea(double x, double y){
        int topY = 0, bottomY = -3, leftX = -6, rightX = 6;
        return (x >= leftX && x <= rightX) && (y >= bottomY && y <= topY);
    }

    public static boolean isBelongToArea(double x, double y)
    {
        return checkTopArea(x, y) || checkBottomArea(x, y);
    }

}
