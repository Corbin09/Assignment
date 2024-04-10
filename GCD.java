import java.util.Scanner;
// UCLN & BCNN
public class GCD {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner inp = new Scanner(System.in);
        long a = 0;
        long b = 0;
        while (true) {
            a = inp.nextLong();
            b = inp.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            long GCD = GCD(a,b);
            long LCM = LCM(a,b, GCD);
            System.out.println(GCD + " " + LCM);
        }
    }

    public static long GCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long LCM(long a, long b, long GCD) {
        return (a * b) / GCD;
    }
}
