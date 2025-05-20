import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        int flag = 0;
           for (int i = 0; i <= a / 2 && a != 0; i++) {
                     if (arr[i] != arr[a - i - 1]) {
                    flag = 1;
                        break;
}
}
if (flag == 1)
System.out.println("Not Palindrome");
else
System.out.println("Palindrome");
}
        }
