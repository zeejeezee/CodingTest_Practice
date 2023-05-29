package programmers.lv0;

import java.util.ArrayList;
import java.util.List;

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
    
    
    //원소들의 곱과 합
    //정수가 담긴 리스트 num_list가 주어질 때,
    //모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해 주세요.
    
    public int solution3(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        
        for (int i = 0; i < num_list.length; i++){
            sum += num_list[i];
            mul *= num_list[i];
        }
        
        if (sum * sum > mul) answer = 1;
        
        return answer;
    }
    
    
    //특정한 문자를 대문자로 바꾸기
    //영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때,
    //my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
    
    public String solution4(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }
    
    
    //조건에 맞게 수열 변환하기 3
    //정수 배열 arr와 자연수 k가 주어집니다.
    //만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고, k가 짝수라면 arr의 모든 원소에 k를 더합니다.
    //이러한 변환을 마친 후의 arr를 return 하는 solution 함수를 완성해 주세요.

    public int[] solution5(int[] arr, int k) {
        int[] answer = {};
        
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 1) {
                arr[i] *= k;
            } else {
                arr[i] += k;
            }
            
            answer = arr;
        }
        
        return answer;
    }
    
    
    //n 번째 원소까지
    //정수 리스트 num_list와 정수 n이 주어질 때,
    //num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해 주세요.
    
    public int[] solution6(int[] num_list, int n) {
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        
        return answer;
    }
    
    
    //카운트 업
    //정수 start와 end가 주어질 때, start부터 end까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해 주세요.
    
    public List solution7(int start, int end) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = start; i <= end; i++) {
            answer.add(i);
        }
        
        return answer;
    }
    
    
    //첫 번째로 나오는 음수
    //정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해 주세요.
    //음수가 없다면 -1을 return 합니다.
    
    public int solution8(int[] num_list) {
        int answer = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }
    
    
    //n보다 커질 때까지 구하기
    //정수 배열 numbers와 정수 n이 매개변수로 주어집니다.
    //numbers의 원소를 앞에서부터 하나씩 더하다가 그 합이 n보다 커지는 순간
    //이때까지 더했던 원소들의 합을 return 하는 solution 함수를 작성해 주세요.
    
    public int solution9(int[] numbers, int n) {
        int answer = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if(answer > n) break;
        }
        
        return answer;
    }
    
    
    //글자 이어 붙여 문자열 만들기
    //문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다.
    //my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
    
    public String solution10(String my_string, int[] index_list) {
        String answer = "";
        String[] my_strings = my_string.split("");
        
        for(int i = 0; i < index_list.length; i++) {
            answer += my_strings[index_list[i]];
        }
        
        return answer;
    }
}