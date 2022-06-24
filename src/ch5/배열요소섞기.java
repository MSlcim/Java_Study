package ch5;

import java.util.Arrays;

public class 배열요소섞기 {
    public static void main(String[] args) {
        int[] Arr= {0,1,2,3,4,5,6,7,8,9};
        for(int i = 0 ; i<100 ; i ++){
            int n = (int)(Math.random()*10);
            int temp = Arr[0];
            Arr[0] = Arr[n];
            Arr[n] = temp;

        }
        System.out.println(Arrays.toString(Arr));

        for(int i = 0; i <10; i++){
            System.out.println(Math.random());
        }

    }
}
