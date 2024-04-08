import java.util.Scanner;
// so doi xung


public class Palin {
    public static int convert(int a){
        int clone2 = 0;
        while(a != 0){
            clone2 = clone2 * 10 + a % 10;
            a /= 10;
        }
        return clone2;
    }

    public static void main(String[] args) throws java.lang.Exception{
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = 1; i <= n; i++){
            int num = inp.nextInt();

            if(convert(num) == num){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
