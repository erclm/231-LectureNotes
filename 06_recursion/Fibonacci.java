public class Fibonacci {
    public static int recFib(int n){
        if(n == 0){
            //BASE CASE
            //Fib(0) is always 0
            return 0;
        } else if(n==1){
            //BASE CASE
            //Fib(1) is always 1
            return 1;
        }else {
            //ITERATIVE CASE
            //Definition of Fib(n) = Fib(n-1) + Fib(n-2)
            return recFib(n-1) + recFib(n-2);
        }
    }

    public static int itrFib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        int a = 0; //save previous fib
        int b = 1; //save current fib
        int c; //temp variable for math

        for (int i = 2; i <=n; i++){
            c = a + b; //temp = calculate current [new fib]
            a = b; //current fib becomes previous fib for next iteration
            b = c; //save [new fib] into current fib
        }
        return b;
    }

    //MY MAIN METHOD
    public static void main(String[] args) {


        System.out.println(itrFib(5));
        System.out.println(recFib(5));

        System.out.println(itrFib(9));
        System.out.println(recFib(9));
    }
}
