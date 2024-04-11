import java.util.*;
import java.lang.*;

class BigNum
{
    public static int Int(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else {
            throw new IllegalArgumentException("Input character is not a digit.");
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner inp = new Scanner(System.in);
        String a = inp.nextLine();
        String b = inp.nextLine();

        while (true){
            if (a.length() == b.length()) break;
            if(a.length() < b.length()){
                a = "0" + a;
            }
            else{
                b = "0" + b;
            }
        }
        System.out.println(a);
        System.out.println(b);
//        System.out.println(Sum(a,b));
        System.out.println(Minus(a,b));
    }

    public static String Sum(String a, String b){
        int point = 0;
        int val = 0;
        String result = "";
        for(int i = a.length()-1; i >= 0; i--){
            val = Int(a.charAt(i)) + Int(b.charAt(i)) + point;
            if(point != 0)
                point = 0;
            if(val >= 10){
                point = 1;
                val %= 10;
                result = String.valueOf(val) + result;
                continue;
            }
            result = String.valueOf(val) + result;
        }
        if(point != 0)
            result = "1" + result;
        return result;
    }

    public static String Minus(String a, String b){
        int point = 0;
        String result = "";
        int val = 0;
        int check = 0;
        for(int i = 0; i <= a.length()-1; i++){
            if(Int(a.charAt(i)) < Int(b.charAt(i))){
                check = -1;
                break;
            }
            if(Int(a.charAt(i)) > Int(b.charAt(i))){
                check = 1;
                break;
            }
        }
        String c = "";
        if(check == -1){
            c = a;
            a = b;
            b = c;
        }
        for(int i = a.length()-1; i >= 0; i--){
            val = Int(a.charAt(i)) + 10 - Int(b.charAt(i)) - point;
            if(point != 0)
                point = 0;
            if(val < 10)
                point++;
            if(i == 0 && val % 10 == 0)
                break;
            result = String.valueOf(val % 10) + result;
        }
        if(check == -1)
            return '-' + result;
        return result;
    }

    public static String Time(String a, String b){
        return "";
    }
}
