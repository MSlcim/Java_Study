package ch4;

import java.util.Scanner;

public class 별모양출력 {
    public static void main(String[] args) {
        /*5x10 별모양
        for(int i = 1; i<=5;i++){
            for(int j =1;j<=10;j++){
                System.out.print("*");
            }
            System.out.println();
        }

         */
        /* 별모양 삼각형 출력
        for(int i = 1; i<=5; i++){
            for(int j =1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 단?");
        int num = sc.nextInt();

        for(int i =1;i<=9 ; i++){
            System.out.printf("%d x %d = %d \n",num,i,num*i);
        }

    }
}
