package Task3;

public class Main {

    static final double A=1;
    static final double B=4;
    static final double H=1;

    public static void main(String[] args){
        functionTg(A,B,H);
    }

    public static void functionTg(double x,double y,double h){
        System.out.printf("X:\t\t\t\t F: \n");
        for(double i=x;i<=y;i=i+h){
            System.out.printf("%f\t\t\t\t %f \n",i,Math.tan(i));
        }

    }

}
