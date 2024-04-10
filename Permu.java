import java.util.Scanner;

public class Permu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        Permutations(a, 0, n);
    }
    public static void Permutations(int[] a, int x, int n) {
        if (x == n) {
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (check(a, i, x)) {
                a[x + 1] = i;
                Permutations(a, x + 1, n);
            }
        }
    }

    public static boolean check(int[] a, int var, int x) {
        for (int i = 1; i <= x; i++) {
            if (var == a[i]) return false;
        }
        return true;
    }
}
