package programmers.lv0;

public class ex13 {
	
	//공백으로 구분하기 1
	//단어가 공백 한 개로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
	//my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
	
    public String[] solution1(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }
    
    
    //배열에서 문자열 대소문자 변환하기
    //문자열 배열 strArr가 주어집니다. 모든 원소가 알파벳으로만 이루어져 있을 때,
    //배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로, 짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는 solution 함수를 완성해 주세요.
    
    public String[] solution2(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            } else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        
        return strArr;
    }
    
    
    //문자열의 뒤의 n글자
    //문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
    
    public String solution3(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
    
}