import java.util.Stack;

public class ReverseStringUsingStacks {
    
    public static void pushAtBottom(Stack<Integer> s, int data){
        
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int pop = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }

    public static String ReverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }
  
     public static void main(String[] args){

        String str = "HelloWorld";
        String result = ReverseString(str);
        System.out.println(result);
     }
}
