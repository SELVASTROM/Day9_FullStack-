import java.util.*;

class reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // Reverse in-place
        int start = 0, end = n - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.print("Reversed array: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        s.close();
    }
}
