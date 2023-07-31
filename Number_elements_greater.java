package Practice.Array.Array_2;

import java.util.Scanner;

public class Number_elements_greater {

    public static int countOFelemts(int a[],int x){
        int count=0;
        for (int i=0;i<a.length;i++){
            if (a[i]>x){
                count++;
            }
        }
        return count;
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Print elements ");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Output: "+countOFelemts(arr,1));
    }
}
