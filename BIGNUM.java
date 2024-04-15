import java.util.Scanner;

public class BigNum {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner inp = new Scanner(System.in);
        String a = inp.nextLine();
        String b = inp.nextLine();
        System.out.println(Sum(a, b));
        System.out.println(Minus(a, b));
        System.out.print(Time(a, b));
    }

    public static String Sum(String a, String b){
       while(a.length() != b.length()){
                if(a.length() < b.length())
                    a = '0' + a;
                else {
                    b = '0' + b;
                }
        }
        StringBuilder s = new StringBuilder();
        int x = 0;
        for(int i = a.length()-1; i >= 0; i --){
            if(i != 0){
                int A = a.charAt(i) - '0';
                int B = b.charAt(i) - '0';
                int sum = A + B + x;
                x = sum / 10;
                s.insert(0, sum % 10);
            } else {
                int A = a.charAt(i) - '0';
                int B = b.charAt(i) - '0';
                int sum = A + B + x;
                s.insert(0, sum);
            }
        }
        return s.toString();
    }

    public static String Minus(String a, String b){
        boolean check = false;
        if(a.length() < b.length()){
            check = true;
        } else if (a.length() == b.length()){
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) - '0' < b.charAt(i) - '0'){
                    check = true;
                    break;
                } else if (a.charAt(i) - '0' > b.charAt(i) - '0') {
                    break;
                }
            }
        }
        while(a.length() != b.length()){
            if(a.length() < b.length())
                a = '0' + a;
            else
                b = '0' + b;
        }
        int x = 0;
        StringBuilder s = new StringBuilder();
        for(int i = a.length()-1; i >= 0; i --){
            int A = a.charAt(i) - '0';
            int B = b.charAt(i) - '0';
            int val = 0;
            if(check){
                 val = B - A - x;
            }else val = A - B - x;
            if(i != 0) {
                if(val >= 0) {
                    s.insert(0, val);
                    x = 0;
                }
                else {
                    s.insert(0, val + 10);
                    x = 1;
                }
            }  else {
                    s.insert(0, val);
                }
        }
        while(s.charAt(0) == '0' && s.length()>1){
            s.delete(0, 1);
        }
        if(check)
            s.insert(0, '-');
        return s.toString();
    }

    public static String TimeOneDigit(String a, char b){
        StringBuilder s = new StringBuilder();
        int x = 0;
        int val = 0;
        for(int i = a.length()-1; i >= 0; i--){
            int A = a.charAt(i) - '0';
            int B = b - '0';
            val = A * B + x;
            if(i != 0) {
                s.insert(0, val % 10);
                x = val / 10;
            } else s.insert(0, val);
        }
        return s.toString();
    }

    public static String Time(String a, String b){
        String z = "";
        String A = "";
        String B = "";
        for(int i = b.length()-1; i >= 0; i--){
            A = TimeOneDigit(a, b.charAt(i)) + z;
            B = Sum(A, B);
            z += '0';
        }
        return B;
    }
}
