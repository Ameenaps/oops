import java.util.Scanner;
import java.util.Arrays;
class Binaryarry {
    void define(int arr[], int n, int item) {
        Arrays.sort(arr);
        int result = Arrays.binarySearch(arr, item);
        if (result >= 0) {
            System.out.println("Item found at position: " + (result + 1));
        } else {
            System.out.println("Item cannot be found");
        }
    }

    public static void main(String args[]) {
        int n, item, i;
        Scanner sc = new Scanner(System.in);
        Binaryarry bin = new Binaryarry();
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       System.out.println("Enter the number to be searched: ");
        item = sc.nextInt();
        bin.define(arr, n, item);
    }
}

