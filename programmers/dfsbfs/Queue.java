package programmers.dfsbfs;

import java.util.LinkedList;

public class Queue {
    //먼저 들어 온 데이터가 먼저 나가는 형식의 자료구조이다.
    //큐는 입구와 출구가 모두 뚫려있는 터널과 같은 형태로 시각화 할 수 있다.

    public static void main(String[] args) {
        java.util.Queue<Integer> q = new LinkedList<>();

        q.offer(5);
        q.offer(2);
        q.offer(3);
        q.offer(7);
        q.poll();
        q.offer(1);
        q.offer(4);
        while(!q.isEmpty()){
            System.out.print(q.poll()+ "");
        }
    }
}
