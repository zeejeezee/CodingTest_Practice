package programmers.lv0;

import java.util.Arrays;

public class ex2 {
	//배열의 평균값
	//정수 배열 numbers가 매개변수로 주어집니다. 
	//numbers의 원소의 평균값을 return하도록 solution 함수를 완성해 주세요.
	
    public double solution1(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        
        answer = sum / numbers.length;
        
        return answer;
    }
    
    
    //양꼬치
    //머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
    //양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
    //정수 n과 k가 매개변수로 주어졌을 때,
    //양꼬치 n인분과 음료수 k개를 먹었다면 총 얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해 보세요.
    
    public int solution2(int n, int k) {
        int answer = 0;
        
        answer = (n*12000) + ((k-(n/10))*2000);
        return answer;
    }
    
    //배열 자르기
    //정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
    //numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해 보세요.
    
    public int[] solution3(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, (num2 + 1));
    }
    

    //배열 뒤집기
    //정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
    //num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해 주세요.
    
    public int[] solution4(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i = 0; i < num_list.length; i++){
            answer[num_list.length - i - 1] = num_list[i];
        }
        
        return answer;
    }
    
    
    //문자열 뒤집기
    //문자열 my_string이 매개변수로 주어집니다.
    //my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해 주세요.
    
    public String solution5(String my_string) {
        String answer = "";
        for(int i = my_string.length() -1; i >= 0; i--){
            answer += my_string.substring(i, i+1);
        }
        return answer;
    }
    
    
    //피자 나눠 먹기(1)
    //머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
    //피자를 나눠먹을 사람의 수 n이 주어질 때,
    //모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해 보세요.
    
    public int solution6(int n) {
        int answer = 0;
        if(n % 7 == 0)
            answer = n / 7;
        else
            answer = n / 7 + 1;
        
        return answer;
    }
    
    
    //피자 나눠 먹기(3)
    //머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라 줍니다.
    //피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
    //n명의 사람이 최소 한 조각 이상 피자를 먹으려면
    //최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해 보세요.
    
    public int solution7(int slice, int n) {
        int answer = 0;
        
        if(n % slice == 0)
            answer = n / slice;
        else
            answer = n / slice + 1;
        
        return answer;
    }
    
    
    //점의 위치 구하기
    //사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.

    //x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
    //x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
    //x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
    //x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
    //x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다.
    //좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해 주세요.
    
    public int solution8(int[] dot) {
        return dot[0] > 0 && dot[1] > 0 ? 1 : dot[0] < 0 && dot[1] > 0 ? 2 : dot[0] < 0 && dot[1] < 0 ? 3 : dot[0] > 0 && dot[1] < 0 ? 4 : 0;
    }
    
    
    //짝수 홀수 개수
    //정수가 담긴 리스트 num_list가 주어질 때,
    //num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해 보세요.
    
    public int[] solution9(int[] num_list) {
    	int[] answer = new int[2];
    	
    	for (int i = 0; i < num_list.length; i++) {
    		if(num_list[i] % 2 == 0) {
    			answer[0]++;
    		}
    		else
    			answer[1]++;
    	}
    	
    	return answer;
    }
    		
    //다른 사람 풀이
    public int[] solution9_1(int[] num_list) {
    	int[] answer = new int[2];
    	
    	for(int i = 0; i < num_list.length; i++)
    		answer[num_list[i] % 2]++;
    	
    	return answer;
    }
    
    
    //중앙값 구하기
    //중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
    //예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 
    //정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해 보세요.
    
    public int solution10(int[] array) {        
        //Arrays.sort 오름차순
        Arrays.sort(array);
        
        return array[array.length/2];
    }
    
    
    
    

}
