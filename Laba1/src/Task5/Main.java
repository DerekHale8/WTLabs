package Task5;

public class Main {
    static final int N=40;

    public static void main(String[] args){
        int[] randomArray=arrayInitilization(N);
        int countToDiscard = minCountOfElementsToDiscard(randomArray);
        System.out.println(countToDiscard);
    }

    public static int[] arrayInitilization(int n){
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=0+(int)(Math.random()*100);
            //4int b=0+(int)Math.random()*10;
        }
        return array;
    }

    public static int minCountOfElementsToDiscard(int[] array){
        int count = 0;
        int currentMaxElement = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > currentMaxElement){
                currentMaxElement = array[i];
            }
            else{
                count++;
            }
        }
        return count;
    }
}
