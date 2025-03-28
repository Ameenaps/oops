import java.util.Scanner;
import java.util.Arrays;
class BinarySearch {
 void define(int arr[], int n, int item) {
        int low = 0, high = n - 1, mid;
        boolean found = false;
        Arrays.sort(arr);
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == item) {
                System.out.println("Item found at position: " + (mid + 1));
                found = true;
                break;
            }
            else if (arr[mid] < item) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Item cannot be found");
        }
    }

    public static void main(String args[]) {
        int n, item, i;
        Scanner sc = new Scanner(System.in);
        BinarySearch bin = new BinarySearch();

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

