/*
(Radix sort) Write a program that randomly generates 1,200,000 integers and
sorts them using radix sort
*/
import java.util.Random;
import java.util.Arrays;
public class Exercise23_12{
    static int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
    static void countSort(int arr[], int n, int exp) {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
    static void radixsort(int arr[], int n) {
        int m = getMax(arr, n);
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
    static void print(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ");
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[]arr = new int[12000000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(1000000);
        }
        int n = arr.length;
        radixsort(arr, n);
        print(arr, n);
    }
}