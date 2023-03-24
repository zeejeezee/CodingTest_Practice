package programmers.lv0;

import java.util.Arrays;

public class ex5 {
	
	//숨어 있는 숫자의 덧셈 (1)
	//문자열 my_string이 매개변수로 주어집니다.
	//my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해 주세요.
	
    public int solution1(String my_string) {

        return Arrays.stream(my_string.replaceAll("[a-z|A-Z]", "").split("")).mapToInt(Integer::parseInt).sum();
    }

    
    //편지
    //머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다.
    //할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며, 편지를 가로로만 적을 때,
    //축하 문구 message를 적기 위해 필요한 편지지의 최소 가로길이를 return 하도록 solution 함수를 완성해 주세요.

    public int solution2(String message) {
        int answer = message.length() * 2;
        
        return answer;
    }
    
	  
    //짝수는 싫어요
    //정수 n이 매개변수로 주어질 때, 
    //n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해 주세요.
    
    public int[] solution3(int n) {
        int[] answer;
        int j = 0;
        
        if (n % 2 ==0) {
            answer = new int[n / 2];
        } else {
            answer = new int[n / 2 + 1];
        }
        
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                answer[j] = i;
                j++;
            }
        }
        
        return answer;
    }
    
    
    //문자 반복 출력하기
    //문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어 있는 각 문자를
    //n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해 보세요.
    
    public String solution4(String my_string, int n) {
    	
        String answer = "";
        String[] arr = my_string.split("");
        
        for(int i=0; i < my_string.length(); i++){
            answer += arr[i].repeat(n);
        }
        
        return answer;
    }
    
	
    //특정 문자 제거하기
    //문자열 my_string과 문자 letter이 매개변수로 주어집니다.
    //my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해 주세요.
    


    public String solution5(String my_string, String letter) {
        String answer = "";

        answer = my_string.replace(letter, "");

        return answer;
    }
    
    public String solution5_1(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }
}