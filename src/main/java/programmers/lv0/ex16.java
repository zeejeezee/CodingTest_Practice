package programmers.lv0;

import java.util.ArrayList;
import java.util.List;

public class ex16 {
	
	//공백으로 구분하기
	//단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
	//my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
	
    public List<String> solution(String my_string) {
        List<String> answer = new ArrayList<>();
        
        //공백으로 자르기
        String[] my_string_list = my_string.split(" ");
        
        for(int i = 0; i < my_string_list.length; i++) {
            if(!my_string_list[i].equals("")) { //값이 공백이 아니라면
                answer.add(my_string_list[i]); //리스트에 추가
            }
         }
        
        return answer;
    }
    
    
    //더 크게 합치기
    //연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

	//12 ⊕ 3 = 123
	//3 ⊕ 12 = 312
	//양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
	
	//단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
    
    public int solution2(int a, int b) {
        String stringA = String.valueOf(a);
        String stringB = String.valueOf(b);
        
        String strSum1 = stringA + stringB;
        String strSum2 = stringB + stringA;
        
        return Math.max(Integer.valueOf(strSum1), Integer.valueOf(strSum2));
    }
    
    
    
    
}