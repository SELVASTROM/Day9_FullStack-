import java.util.*;
class rotate {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the steps to rotate");
        int k=s.nextInt();
        k=k%n;
        int rotated[]=new int[n];
        for(int i=0;i<n;i++){
            rotated[(i+k)%n]=arr[i];
        }
        for(int num:rotated){
            System.out.print(num+" ");
        }
s.close();
    }
    
}
