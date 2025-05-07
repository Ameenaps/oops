import java.util.*;

class Bubblesort {
    public static <T> T[] Bsort(T arr[], int limit) {
        for (int i = 0; i < limit - 1; i++) {
            for (int j = 0; j < limit - 1 - i; j++) {
                String str = arr[j].toString();
                String str2 = arr[j + 1].toString();
                if (str.compareTo(str2) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

class Bsort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        String[] s = new String[n];
        System.out.println("\nEnter elements:");
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        s = Bubblesort.Bsort(s, n);

        System.out.println("\nElements after Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }

        sc.close();
    }
}

