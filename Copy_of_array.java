package Practice.Array.Array_2;

import Start.practice.Array;

import java.util.Arrays;

public class Copy_of_array {
    public static void main(String[] args) {
        int a[]={1,4,7,9};
        int n=a.length;
        int b[]= Arrays.copyOf(a,3);
        b[0]=5;
        System.out.println("Original Array");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nCopied Array");
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
