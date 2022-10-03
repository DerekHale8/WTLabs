package Task8;

public class Main {
    public static void main(String[] args){
        double[] sequenceA = new double[] {0.1, 0.2, 0.3, 0.4};
        double[] sequenceB = new double[] {0.24, 0.32, 1.4, 1.8};
        int[] results = insertIndexes(sequenceA,sequenceB);
        printArray(results);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("%d\t", array[i]);
        }
        System.out.println();
    }

    public static int[] insertIndexes(double[] a, double[] b){
        int[] resultArray = new int[b.length];
        double[] mergedArray = new double[a.length + b.length];
        int i = 0, j = 0;
        while (i < a.length && j < b.length){
            if (a[i] < b[j]){
                mergedArray[i + j] = a[i++];
            }
            else{
                resultArray[j] = i + j;
                mergedArray[i + j] = b[j++];
            }
        }
        while (i < a.length){
            mergedArray[i + j] = a[i++];
        }
        while (j < b.length){
            resultArray[j] = i + j;
            mergedArray[i + j] = b[j++];
        }
        return resultArray;
    }




}
