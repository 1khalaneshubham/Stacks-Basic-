import java.util.*;

public class NextGreatorElement {

    public static void main(String[] args) {

        int arr[] = { 6,8,0,1,3 };
        Stack<Integer> s = new Stack<>();
        int NxtGreator[] = new int[arr.length];

        for(int i = arr.length-1; i>=0; i--){
            // 1st while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // 2nd if-else
            if(s.isEmpty()){
                NxtGreator[i] = -1;
            }else{
                NxtGreator[i] = arr[s.peek()];
            }

            // 3rd push in stack
            s.push(i);
        }

        for(int i=0;  i<NxtGreator.length; i++){
            System.out.print(NxtGreator[i]+" ");
        }
        System.out.println();
    }
}
