import java.util.Scanner;

class count {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] freq = new int[n];  // To store frequency counts
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            freq[i] = -1;  // Initialize frequency array with -1
        }
        
        for (int i = 0; i < n; i++) {
            if (freq[i] == -1) {  // If not already counted
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        freq[j] = 0;  // Mark as counted
                    }
                }
                freq[i] = count;
            }
        }
        
        System.out.println("Element - Frequency");
        for (int i = 0; i < n; i++) {
            if (freq[i] != 0) {
                System.out.println(arr[i] + " - " + freq[i]);
            }
        }
        
        s.close();
    }
}
