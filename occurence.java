import java.util.Scanner;

public class occurence {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("enter the number you have to find");
        int key=s.nextInt();
        for(int i=0;i<a;i++){
            if(arr[i]==key){
                System.out.println("The given number is find in the array index of "+i+" the number you serched is "+arr[i]);
            }
        }
        System.out.println("");
        s.close();
}    
}
