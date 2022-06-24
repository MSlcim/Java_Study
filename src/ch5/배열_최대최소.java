package ch5;

import java.util.Scanner;

public class 배열_최대최소 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 크기?");
        int size = sc.nextInt();
        int max;
        int min;
        int[] Arr = new int[size];
        System.out.println("값 입력");
        for(int i = 0; i<Arr.length;i++){
            Arr[i] = sc.nextInt();
        }
        max = Arr[0];
        min = Arr[0];

        for(int i=1 ; i<Arr.length; i++){
            if(Arr[i]>max){
                max=Arr[i];
            }
            else if(Arr[i]<min){
                min=Arr[i];
            }
        }
        System.out.println("최대값: "+max + "최소값 : "+ min);


    }
}
