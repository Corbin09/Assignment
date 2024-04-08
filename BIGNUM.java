import java.util.*;
import java.lang.*;

class BIGNUM
{
    public static int convertToInt(char c) {
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
        String big = "";
        String small = "";

        if(a.length() < b.length()){
            big = b;
            small = a;
        } else if(b.length() < a.length()) {
            big = a;
            small = b;
        } else {
            for(int i = 0; i < a.length(); i++){
                int x = convertToInt(a.charAt(i));
                int y = convertToInt(b.charAt(i));
                if(x > y){
                    big = a;
                    small = b;
                    break;
                }
            }
        }
        while (true){
            if (a.length() == b.length()) break;
            if(a.length() < b.length()){
                a = "0" + a;
            }
            else{
                b = "0" + b;
            }
        }
    }
}