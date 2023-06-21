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
    
    
    //문자열 바꿔서 찾기
    //문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다.
    //myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중
    //pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
    
    public int solution3(String myString, String pat) {
        int answer = 0;
        String str = "";
        
        for(int i = 0; i < myString.length(); i++) {
            if("A".equals(myString.substring(i, i+1))) {
                str += "B";
            } else {
                str += "A";
            }
        }
        
        if(str.contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }


    
}