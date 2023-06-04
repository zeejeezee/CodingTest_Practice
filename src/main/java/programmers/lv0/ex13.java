package programmers.lv0;

import java.util.Arrays;

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
    
    
    //부분 문자열
    //어떤 문자열 A가 다른 문자열 B안에 속하면 A를 B의 부분 문자열이라고 합니다. 예를 들어 문자열 "abc"는 문자열 "aabcc"의 부분 문자열입니다.
    //문자열 str1과 str2가 주어질 때, str1이 str2의 부분 문자열이라면 1을 부분 문자열이 아니라면 0을 return하도록 solution 함수를 완성해 주세요.
    
    public int solution4(String str1, String str2) {
        int answer = 0;
        
        if(str2.contains(str1)) {
            answer = 1;
        }
        
        return answer;
    }
    
    
    //조건에 맞게 수열 변환하기 1
    //정수 배열 arr가 주어집니다.
    //arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다.
    //그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
    
    public int[] solution5(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] = arr[i] * 2;
            }
        }
        
        return arr;
        
    }
    
    
    //n 번째 원소부터
    //정수 리스트 num_list와 정수 n이 주어질 때,
    //n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해 주세요.
    
    public int[] solution6(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        
        answer = Arrays.copyOfRange(num_list, n - 1, num_list.length);
        
        return answer;
    }
    
    
}