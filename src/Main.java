import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     int div = sc.nextInt();
     double sum = 0;
     double max = 0;
     double[] arr= new double[div];

     for(int i = 0; i<arr.length; i++){
         arr[i]=sc.nextDouble();
     }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]/max*100;
            sum+=arr[i];
        }
        System.out.println(sum/div);
        }
    }
