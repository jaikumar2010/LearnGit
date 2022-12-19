class Factorial{

    public int factorialNum(int n){
        if(n == 0){
            return 1;
        } else 
        return factorialNum(n -1) * n;
    }

    public static void main(String[] a){
        Factorial factorial = new Factorial();
        int facNum = factorial.factorialNum(5);
        System.out.println("factorial of 5: " +facNum);
    }
}