import java.util.*;
class Arrays{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=s.nextInt();
        int []arr=new int[size];
        int count=0;
        
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
            count+=arr[i];
        }
        // int max=arr[0];
        // int min=arr[0];
        int evencount=0;
        for( int n: arr){
            if(n%2==0){
                evencount++;
            }
        //     if(n>max)
        //         max=n;
        //     if(n<min)
        //         min=n;
        //     System.out.println("The array elements are "+n);
         }
         for(int i=size-1;i>=0;i--){
            System.out.println("the reversed array is "+arr[i]+" ");
         }
        //System.out.println("\nthe maximum value is"+max+"\n the minimum value is"+min);
        System.out.println("The sum of the array elements is " + count+"\n the count of even number in a array is "+evencount);

        s.close();
    }
}