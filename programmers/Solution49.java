package programmers;

import java.util.Stack;

public class Solution49 {
    public int solution(int[][] board, int[] moves) {
        //바구니 역할인 stack을 선언한 뒤 0을 넣어준다. ->
        // 처음 값과 비교할 대상이 필요하므로 0을 넣어준다

        //moves 길이와 board 길이만큼 이중 반복문을 통해 board[j][moves[i]-1]을 검사한다.
        //board[j][moves[i]-1]이 0이 아닌 경우,
        //stack의 top요소와 board[j][moves[i]-1]값이 같다면 stack에서 pop을 하여 요소를 반환하고
//        answer값에 2를 더한다.
//        stack의 top요소와 board[j][moves[i]-1] 값이 다르다면 stack에서 해당 값을 push한다.
//        또한 인형을 뽑았으므로 해당 자리의 값은 0으로 바꿔준다. -> board[j][moves[i]-1]=0;
//        board[j][moves[i]-1]이 0인 경우, 인형이 없기 때문에 pass한다.

        //1.연속된 인형들이 제거된 횟수.
        int answer = 0;
        //2. 인형을 담을 stack 바구니.
        Stack<Integer>stack = new Stack<>();

        //3.moves의 크기는 크레인의 총 이동횟수
        for (int i = 0; i < moves.length; i++) {
            //3-1. j인덱스를 이용해 보드의 행을 탐색. 열은 moves의 원소를 이용해 탐색.
            for (int j = 0; j < board.length; j++) {
                //3-2. j행의 moves의 크레인위치 열에 해당하는 값에 인형이 존재한다면.
                if(board[j][moves[i]-1] != 0){
                    //3-3. stack이 비어있지 않고, 현재 스택의 최상단에 있는 인형과 크레인으로 뽑은 인형이 같다면
                    if(!stack.empty() && stack.peek() == board[j][moves[i]-1]){
                        //인형들을 제거하는 횟수 증가.
                        answer++;
                        //바구니에 있는 인형을 제거.
                        stack.pop();
                        //크레인으로 뽑은 인형을 0으로 만들어 없애준다.
                        board[j][moves[i]-1] = 0;
                        break;
                    //3-4.그 외의 경우는 인형을 바구니에 담은 후 0으로 없애준다.
                    }else{
                        stack.push(board[j][moves[i]-1]);
                        board[j][moves[i]-1] = 0;
                        break;
                    }
                }


            }
        }
        //4. 없앤 인형의 수 = 인형을 없앤 수*2
        return answer*2;
    }
}
