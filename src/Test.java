public class Test {
    public static int d(int num) {
        int sum = num;
        while(num!=0){
            sum = sum +(num%10);
            num = num /10;
        }
        return sum;

    }

    public static void main(String[] args){

        boolean[] arr = new boolean[10001];
        for(int i = 1; i<10001;i++){
            int n = d(i);
            if(n <=10000){
                arr[n]=true;
            }
        }
        for(int i =1; i<10001;i++){
            if(!arr[i])
            System.out.println(i);
        }

    }
}
