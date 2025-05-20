import java.util.*;
class countoccurence {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=s.nextInt();
        int []arr=new int[size];
        int []arr1=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
            arr1[i]=s.nextInt();
        }
        Set<Integer> set=new LinkedHashSet<>();
        for(int num:arr)set.add(num);
        for(int num1:arr1)set.add(num1);
        System.out.println("merge the to arrays without usung duplicate "+set);
    s.close();
}
}
