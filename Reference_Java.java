package Practice.Array.Array_2;

public class Reference_Java {
    public static void main(String[] args) {
          int a[]={1,4,7,9};
          int n=a.length;
          int b[]=new int[n];
          b=a;
          b[0]=5;
        System.out.println("Original Array");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");

        }
        System.out.println("New array");
        for (int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }

    }
}
