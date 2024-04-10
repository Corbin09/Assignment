import java.util.Scanner;

public class Sort {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = inp.nextInt();
        }
        quickSort(a, 0, n-1);
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }
}
