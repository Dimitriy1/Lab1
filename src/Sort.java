import java.util.Arrays;
import java.util.Random;

public class Sort {

    public static void quickSort(int[]arr,int left,int right){
        if (left >= right){
            return;
        }

        int ind = (right + left) / 2;
        int i = left;
        int j = right;
        int mid = arr[ind];
        while (i <= j) {
            while (arr[i] < mid) {
                i++;
            }
            while (arr[j] > mid) {
                j--;
            }
            if (i > j) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }

        quickSort(arr,left,j);
        quickSort(arr,i,right);
    }



    public static void main(String[] args) {
        int[]arr = new int[1000000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(arr.length) - arr.length / 2;
        }
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
