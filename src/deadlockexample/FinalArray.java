package deadlockexample;

import java.util.Arrays;

public class FinalArray {
    public static void main(String[] args) {
        final int arr[]={1,2,3,4,5};
        System.out.println(arr.length);
        arr[2]=100;
        System.out.println(Arrays.toString(arr));
    }
}
