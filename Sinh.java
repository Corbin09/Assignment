import java.util.Scanner;
//Sinh nhi phan

public class Sinh {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        String[] a = new String[10000];
        a[0] = "0";
        a[1] = "1";
        int i = 1;
        int index = 0;
        while(a[index].length() < n){
            i++;
            a[i] = a[index] + "0";
            i++;
            a[i] = a[index] + "1";
            index++;
        }
        for(int j = index; j <= i; j++)
            System.out.println(a[j]);
    }
}
