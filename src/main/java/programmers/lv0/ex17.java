package programmers.lv0;

import java.util.ArrayList;
import java.util.List;

public class ex17 {
	
    //할 일 목록
    //오늘 해야 할 일이 담긴 문자열 배열 todo_list와 각각의 일을 지금 마쳤는지를 나타내는 boolean 배열 finished가 매개변수로 주어질 때,
    //todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
    
    public List solution1(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        
        for(int i = 0; i < todo_list.length; i++) {
            if(finished[i] == false) {
                answer.add(todo_list[i]);
            }
        }
        
        return answer;
    }
    
    
    //특별한 이차원 배열 2
    //n × n 크기의 이차원 배열 arr이 매개변수로 주어질 때,
    //arr이 다음을 만족하면 1을 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
    //0 ≤ i, j < n인 정수 i, j에 대하여 arr[i][j] = arr[j][i]
    
    public int solution2(int[][] arr) {
        int answer = 1;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != arr[j][i]) {
                    answer = 0;
                }
            }
        }
        
        return answer;
    }
    
}