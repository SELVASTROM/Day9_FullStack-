import java.util.*;
class Second {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        ArrayList<Integer>Unique=new ArrayList<>();
        int j;
        for( j=0;j<a;j++){
            if(!Unique.contains(arr[j]))Unique.add(arr[j]);
        }
        Collections.sort(Unique,Collections.reverseOrder());
        if(Unique.size()<2){
            System.out.println("the second unique element is not present");
        }else{

         System.out.println("The second  largest number  is "+Unique.get(1));
        }
        s.close();
    
    
}
}
