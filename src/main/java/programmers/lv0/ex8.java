package programmers.lv0;

import java.util.ArrayList;
import java.util.List;

public class ex8 {
	
	//공 던지기
	//머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
	//공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
	//친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때,
	//k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해 보세요.
    
    public int solution1(int[] numbers, int k) {
        int answer = 0;
        int index = 0;
        
        for(int i = 1; i < k; i++) {
            index += 2;
        }
        
        index %= numbers.length;
        answer = numbers[index];
        
        return answer;
    }
    
    
    //369게임
    //머쓱이는 친구들과 369게임을 하고 있습니다.
    //369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
    //머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때,
    //머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해 보세요.
    
    public int solution2(int order) {
        int answer = 0;
        String strOrder = "" + order;
        
        for (int i = 0; i < strOrder.length(); i++) {
            char tempChar = strOrder.charAt(i);
            
            if (tempChar == '3' || tempChar == '6' || tempChar == '9') {
                answer++;
            }
        }

        return answer;
    }
    
    
    //소인수분해
    //소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
    //예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
    //따라서 12의 소인수는 2와 3입니다.
    //자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해 주세요.
    
    public int[] solution3(int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n = n / i;
                }
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    
    //컨트롤 제트
    //숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다.
    //문자열에 있는 숫자를 차례대로 더하려고 합니다.
    //이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
    //숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해 보세요.
    
    
    
}