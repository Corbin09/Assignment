import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner inp = new Scanner(System.in);
        String s = "";
        Stack<String> st = new Stack<>();
        String num = "";
        while(!s.equals("end")){
            s = inp.nextLine();
            if(s.contains("push")){
                String[] parts = s.split(" ");
                s = parts[0];
                num = parts[1];
            }
            switch (s){
                case "init":
                    st.clear();
                    break;
                case "empty":
                    if(st.isEmpty()){
                        System.out.println(1);
                    }
                    else System.out.println(0);
                    break;
                case "push":
                    st.push(num);
                    break;
                case "top":
                    if(!st.isEmpty()){
                        System.out.println(st.peek());
                    }
                    else System.out.println(-1);
                    break;
                case "size":
                    System.out.println(st.size());
                    break;
                case "pop":
                    if(!st.isEmpty()){
                        st.pop();
                    }
            }
        }
    }
}
