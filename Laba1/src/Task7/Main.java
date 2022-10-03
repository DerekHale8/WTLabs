package Task7;

public class Main {
    static final int N=8;

    public static void main(String[] args){
        double[] randomArray=arrayInitilization(N);
        System.out.printf("Random:");
        printArray(randomArray);
        shellSort(randomArray);
        System.out.printf("Sorted:");
        printArray(randomArray);

    }

    public static double[] arrayInitilization(int n){
        double[] array=new double[n];
        for(int i=0;i<n;i++){
            array[i]=0+(int)(Math.random()*100)+Math.random();
        }
        return array;
    }

    public static void shellSort(double[] array){
        int i = 0;
        while (i < array.length - 1){
            if (i < 0)
                i = 0;
            if (array[i] <= array[i + 1]){
                i++;
            }
            else{
                double tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                i--;
            }
        }
    }

    public static void printArray(double[] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("%f\t ", array[i]);
        }
        System.out.println();
    }


}
