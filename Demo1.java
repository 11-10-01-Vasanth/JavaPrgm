package proj;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 3 };
        int[] result = new int[arr.length];
        int index = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        
        for(int i =0;i<result.length;i++) {
        	System.out.println(result[i]);
        }
        
        // Zeros will be automatically placed at the end due to the initial zero-filled array
        System.out.println("Output Array: " + Arrays.toString(result));
    }
}
