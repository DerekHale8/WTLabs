package Task4;

public class Main {
    static final int N=40;

    public static void main(String[] args){
        int[] randomArray=arrayInitilization(N);
        printPrimeNumbersIndexes(randomArray);

    }

    public static int[] arrayInitilization(int n){
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=0+(int)(Math.random()*100);
            //4int b=0+(int)Math.random()*10;
        }
        return array;
    }

    public static boolean isPrime(int n){
        if (n == 2)
            return true;
        if (n <= 1 || (n & 1) == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2){
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimeNumbersIndexes(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])){
                System.out.printf(i + " ");
            }
        }
    }

}
