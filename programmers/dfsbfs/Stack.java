package programmers.dfsbfs;

public class Stack {
    //먼저 들어 온 데이터가 나중에 나가는 형식(선입후출)의 자료 구조이다.
    //입구와 출구가 동일한 형태로 스택을 시각화할 수 있다.

    public static void main(String[] args) {
        java.util.Stack<Integer> s = new java.util.Stack<>();

        s.push(5);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        s.push(1);
        s.push(4);
        s.pop();
        //스택의 최상단 원소부터 출력
        while(!s.empty()){
            System.out.println(s.peek() + "");
            s.pop();
        }
    }
}
