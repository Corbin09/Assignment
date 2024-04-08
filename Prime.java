import java.util.Scanner;
// check nguyen to

public class Prime {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        boolean check = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        if (n <= 1)
            check = false;
        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
