import java.util.Scanner;
import java.util.Arrays;

class Search {
    void recursiveSearch(int arr[], int low, int high, int item) {
        if (low > high) {
            System.out.println("Item cannot be found");
            return;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == item) {
            System.out.println("Item found at position: " + (mid + 1));
            return;
        }
        else if (arr[mid] < item) {
            recursiveSearch(arr, mid + 1, high, item);  
        }
        else {
            recursiveSearch(arr, low, mid - 1, item);  
        }
    }

    public static void main(String args[]) {
        int n, item, i;
        Scanner sc = new Scanner(System.in);
        Search search = new Search();  

        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be searched: ");
        item = sc.nextInt();

        Arrays.sort(arr);  
        search.recursiveSearch(arr, 0, n - 1, item);  
    }
}

