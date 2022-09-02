package programmers;

public class Solution46 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_v = 0;
        int max_h = 0;
        //[[60, 50], [30, 70], [60, 30], [80, 40]]
        //Math.max, min을 사용해서 최대 최소값을 알아내고 곱해서 answer를 return

        for (int i = 0; i < sizes.length; i++) {
            int v = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            max_v =Math.max(max_v, v);
            max_h =Math.max(max_h, h);
        }
        return answer = max_v*max_h;
    }
}

