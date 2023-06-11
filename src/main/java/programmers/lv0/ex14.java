package programmers.lv0;

import java.util.Scanner;

public class ex14 {
	
	//마지막 두 원소
	//정수 리스트 num_list가 주어질 때,
	//마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을,
	//마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해 주세요.
	
    public int[] solution1(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int i = 0;
        
        for (i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        if (answer[i - 1] > answer[i - 2]) {
            answer[i] = answer[i - 1] - answer[i - 2];
        } else {
            answer[i] = answer[i - 1] * 2;
        }
        
        return answer;
    }
    
    
    //수 조작하기 1
    //정수 n과 문자열 control이 주어집니다.
    //control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.
    //"w" : n이 1 커집니다.
    //"s" : n이 1 작아집니다.
    //"d" : n이 10 커집니다.
    //"a" : n이 10 작아집니다.
    //위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.
    
    public int solution2(int n, String control) {
        int answer = n;
        String[] arr = control.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("w")) {
                answer += 1;   
            } else if (arr[i].equals("s")) {
                answer -= 1;
            } else if (arr[i].equals("d")) {
                answer += 10;
            } else if (arr[i].equals("a")) {
                answer -= 10;
            }
        }
        
        return answer;
    }
    
    
    //문자열 붙여서 출력하기
    //두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
    //입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        System.out.print(a + b);
    }
    
}