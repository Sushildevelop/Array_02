package Practice.Array.Array_2;

import java.util.Scanner;

public class Input_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
