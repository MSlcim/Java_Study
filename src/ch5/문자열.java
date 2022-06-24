package ch5;

import java.util.Scanner;

public class 문자열 {
    public static void main(String[] args) {
        String a = "안녕하세요";
        Scanner sc = new Scanner(System.in);
        System.out.println("문자입력");
        String b = a.substring(0,4);
        System.out.println(b);
    }
}
