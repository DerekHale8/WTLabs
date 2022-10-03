package Task6;

public class Main {
    static final int N=8;

    public static void main(String[] args){
        double[] randomArray=arrayInitilization(N);
        double[][] matrix=arrayToMatrix(randomArray);
        printMatrix(matrix);

    }

    public static double[] arrayInitilization(int n){
        double[] array=new double[n];
        for(int i=0;i<n;i++){
            array[i]=0+(int)(Math.random()*100)+Math.random();
        }
        return array;
    }

    public static double[][] arrayToMatrix(double[] array){
        int n = array.length;
        double[][] result = new double[n][n];
        for (int j = 0; j < n; j++){
            for (int i = 0; i < n - j; i++)
                result[i][j] = array[i + j];
        }
        for (int j = n - 1; j >= 1; j--){
            for (int i = n - j; i < n; i++)
                result[i][j] = array[i + j - n];
        }
        return result;
    }

    public static void printMatrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++)
                System.out.printf("%f\t", matrix[i][j]);
            System.out.println();
        }
    }
}
