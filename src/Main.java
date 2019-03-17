public class Main {
    public static void main(String[] args) {
        System.out.println(Fibonacci(3));
    }
    public static int Fibonacci(int param){
        if(param <= 2)
            return 1;
        else{
           return Fibonacci(param -1 )+Fibonacci(param -2);
        }
    }
}
