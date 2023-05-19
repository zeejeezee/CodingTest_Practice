package programmers.lv0;

public class ex11 {
	
	//문자열의 앞의 n글자
	//문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
	
    public String solution1(String my_string, int n) {
        return my_string.substring(0, n);
    }
    
    
    //문자 리스트를 문자열로 변환하기
    
    //문자들이 담겨있는 배열 arr가 주어집니다. 
    //arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
    
    public String solution2(String[] arr) {
        String answer = "";
        
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        
        return answer;
    }

    
}