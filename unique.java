import java.util.*;
class unique {
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
        boolean flag=false;
        for(int i=0;i<a;i++){
            if(arr[i]==key) flag=true;
    }
    if(flag){
        System.out.println("The elemet is found");
    }else{
        System.out.println("the elemant is not found");
    }
    s.close();
}
}
