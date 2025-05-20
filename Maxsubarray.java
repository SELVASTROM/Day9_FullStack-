import java.util.*;
class Maxsubarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size ");
        int a=s.nextInt();
        int arr[]=new int[a];
        System.out.println("Enetr the array elements");
         for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
         }
         int max=arr[0];
         int maxEnd=arr[0];
         for(int i=1;i<a;i++){
            maxEnd=Math.max(arr[i],maxEnd+arr[i]);
            max=Math.max(max,maxEnd);
         }
         System.out.println("Max subarray is "+max);
         s.close();
    }
    
}
