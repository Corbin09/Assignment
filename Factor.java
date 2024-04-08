import java.util.Scanner;
// phan tich thua so nguyen to

public class Factor {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        double limit = Math.sqrt(n);
        for(int i = 2; i <= limit; i++){
            int count = 0;
            boolean check = false;
            while(n % i == 0){
                count ++;
                n = n / i;
                check = true;
            }
            if(check){
                System.out.println(i + " " + count);
            }
            if(n <= 1) {
                break;
            }
        }
        if(n != 1){
            System.out.println(n + " " + 1);
        }
    }
}
