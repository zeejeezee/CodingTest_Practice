package programmers.lv0;

public class ex15 {
	
	//문자열 곱하기
	//문자열 my_string과 정수 k가 주어질 때,
	//my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
	
    public String solution1(String my_string, int k) {
        String answer = "";
        
        for (int i = 1; i <= k; i++) {
            answer += my_string;
        }
        
        return answer;
    }
    
    
    //접두사인지 확인하기
    //어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다.
    //예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
    //문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을,
    //아니면 0을 return 하는 solution 함수를 작성해 주세요.
    
    public int solution2(String my_string, String is_prefix) {
        int answer = 0;
        if(my_string.startsWith(is_prefix)) {
            answer = 1;
        }
        return answer;
    }
    


    
}