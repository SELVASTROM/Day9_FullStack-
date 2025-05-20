import java.util.*;
class Countunique {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        int count=0;
        //int temp[]=new int[a];
        ArrayList<Integer>Unique=new ArrayList<>();
        for(int i=0;i<a;i++){
            if(!Unique.contains(arr[i])){
                Unique.add(arr[i]);
                count++;
            }else{

            }
        }
        System.out.println("The unique elemts in the array is "+count);
        s.close();
    }
    
}
