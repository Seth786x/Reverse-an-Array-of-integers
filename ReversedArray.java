import java.util.*;

public class ReversedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array");
        int x = input.nextInt();

        int[] array = new int[x];

        System.out.println("Enter the elements to insert in the array");
        for(int i =0; i<x; i++){
            array[i] = input.nextInt();
        }

        System.out.println("This is the given array");

        for(int i = 0; i<x; i++){
            System.out.println(array[i]);
        }

        int[] arrayy = new int[x];

        for(int i=0; i<array.length; i++){
            arrayy[i] = array[array.length -1 -i];
        }

        System.out.println("The Reversed Array is as Follows");
        for(int i=0; i<arrayy.length; i++){
            System.out.println(arrayy[i]);
        }

        input.close();

    }
}
