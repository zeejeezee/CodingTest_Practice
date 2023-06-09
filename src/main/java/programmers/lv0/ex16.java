package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
    
    
    //l로 만들기
    //알파벳 소문자로 이루어진 문자열 myString이 주어집니다.
    //알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
    
    public String solution3(String myString) {
        char[] arr = myString.toCharArray(); //char형 배열
        String answer = "";
        
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (char j = 'l'; j <= 'z'; j++) {
                if (arr[i] == j) {
                    cnt++;
                }
            }
            
            if (cnt == 0) { //j인 게 없다면
              arr[i] = 'l';
            }
            
            answer += arr[i];
        }

        return answer;
    }
    
    //다른 사람 풀이
    
    public String solution3_1(String myString) {
        return myString.replaceAll("[^l-z]", "l");
    }
    
    public String solution3_2(String myString) {
        return myString.replaceAll("[a-l]", "l");
    }
    
    
    //뒤에서 5등까지
    //정수로 이루어진 리스트 num_list가 주어집니다.
    //num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해 주세요.
    
    public int[] solution4(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOf(num_list, 5);
    }
    
    
    //0 떼기
    //정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해 주세요.
    
    public String solution5(String n_str) {
        return "" + Integer.parseInt(n_str);
    }
    
    
    //5명씩
    //최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때,
    //앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 완성해 주세요.
    //마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.
    
    public String[] solution6(String[] names) {
        String[] answer = new String[(names.length - 1) / 5 + 1];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = names[i * 5];
        }
        
        return answer;
    }

    public String[] solution6_1(String[] names) {
    	
    	List<String> al = new ArrayList<>();
    	
    	for(int i = 0; i < names.length; i++) {
    		if(i % 5 == 0) { //i가 5의 배수라면
    			al.add(names[i]);
    		}
    	}
    	
    	String[] answer = new String[al.size()];
    	
    	for(int i = 0; i < al.size(); i++) {
    		answer[i] = al.get(i);
    	}
    	
    	return answer;
    }
    
    
    //덧셈식 출력하기
    //두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
    //a + b = c
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
    }
    
    
    //부분 문자열 이어 붙여 문자열 만들기
    //길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어집니다.
    //parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다.
    //각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
    
    public String solution8(String[] my_strings, int[][] parts) {
    	String answer = "";

        for(int i = 0; i < parts.length; i++) {
            answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
        }
        
        return answer;
    }
    
    
    //홀짝에 따라 다른 값 반환하기
    //양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
    //n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
    
    public int solution9(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % 2 != 0) {
                if (i % 2 != 0) { //홀수일 때
                    answer += i;
                }
            } else {
                if (i % 2 == 0) { //짝수일 때
                    answer += i * i;
                }
            }
        }
        
        return answer;
    }
    
    
    //순서 바꾸기
    //정수 리스트 num_list와 정수 n이 주어질 때, num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠
    //n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해 주세요.
    
    public int[] solution10(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        
        for (int i = n; i < num_list.length; i++) {
            answer[idx++] = num_list[i];
        }
        
        for (int i = 0; i < n; i++) {
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}