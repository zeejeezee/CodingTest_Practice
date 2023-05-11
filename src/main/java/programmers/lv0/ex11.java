package programmers.lv0;

public class ex11 {
	
	//대문자로 바꾸기
	//알파벳으로 이루어진 문자열 myString이 주어집니다.
	//모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
	
    public String solution1(String myString) {
        return myString.toUpperCase();
    }
    
    
    //소문자로 바꾸기
    //알파벳으로 이루어진 문자열 myString이 주어집니다.
    //모든 알파벳을 소문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
    
    public String solution2(String myString) {
        return myString.toLowerCase();
    }
    
    
    //flag에 따라 다른 값 반환하기
    //두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때,
    //flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
    
    class Solution {
        public int solution3(int a, int b, boolean flag) {
            return flag ? a + b : a - b;
        }
    }
    
    
    //정수 부분
    //실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해 주세요.
    
    public int solution4(double flo) {
        return (int) flo;
    }
        

    
}