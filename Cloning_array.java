package Practice.Array.Array_2;

public class Cloning_array {
    public static void main(String[] args) {

  // Cloning of an array is a method to create another array with the same element values as the source array.

        int a[]={1,4,7,9};
        int n=a.length;
        int b[]=a.clone();
        b[0]=5;
        System.out.println("Original Array");

        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println("\nCloned Array");
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }

    }
}
