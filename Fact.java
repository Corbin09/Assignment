import java.util.Scanner;
//giai thua
public class Fact {
    public static Long fact(Long n){
        if(n == 1)
            return n;
        return n * fact(n-1);
    }

    public static void main(String[] args) throws java.lang.Exception{
        Scanner inp = new Scanner(System.in);
        while (true){
            Long a = inp.nextLong();
            if(a == 0){
                break;
            }
            System.out.println(fact(a));
        }
    }
}
