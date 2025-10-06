package experiment1;

public class Fibonacci {
    public static void main(String[] args){
        int n = 20;
        int[] Fib = new int[n];
        Fib[0] = 1;
        Fib[1] = 1;
        for(int i = 2; i < n ; i ++){
            Fib[i] = Fib[i - 1] + Fib[i - 2];
        }
        for (int i = 0; i < n; i ++){
            System.out.print(Fib[i]);
            if(i < n - 1){
                System.out.print(",");
            }
        }
    }
}
