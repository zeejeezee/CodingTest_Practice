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
}