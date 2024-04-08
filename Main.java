import java.util.Scanner;

class Main {
    public static Long fact(long n){
        if(n == 1)
            return n;
        return n * fact(n-1);
    }

    public static void main(String[] args) throws java.lang.Exception{
        Scanner inp = new Scanner(System.in);
        while (true){
            long a = inp.nextLong();
            if(a == 0){
                break;
            }
            System.out.println(fact(a));
        }
    }
}
