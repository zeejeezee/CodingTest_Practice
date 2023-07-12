package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
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
    
    
    //배열의 원소 삭제하기
    //정수 배열 arr과 delete_list가 있습니다.
    //arr의 원소 중 delete_list의 원소를 모두 삭제하고
    //남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
    
    public List solution3(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    answer.remove(Integer.valueOf(arr[i]));
                }
            }
        }
        
        return answer;
    }
    
    
    //접미사 배열
    //어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
    //예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
    //문자열 my_string이 매개변수로 주어질 때,
    //my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
    
    public String[] solution4(String my_string) {
        String[] answer = new String[my_string.length()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = my_string.substring(i, my_string.length());
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
    
    
    //간단한 식 계산하기
    //문자열 binomial이 매개변수로 주어집니다.
    //binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다.
    //주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
    
    public int solution5(String binomial) {
        int answer = 0;
        
        String[] answerArr = binomial.split(" ");
        
        int a = Integer.parseInt(answerArr[0]);
        int b = Integer.parseInt(answerArr[2]);
        String op = answerArr[1];
        
        if (op.equals("+")) {
            answer = a + b;
        } else if (op.equals("-")) {
            answer = a - b;
        } else {
            answer = a * b;
        }
        
        return answer;
    }
    
    
}