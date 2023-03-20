package programmers.lv0;

import java.util.Arrays;

public class ex3 {
	
	//중복된 숫자 개수
	//정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
	//array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해 보세요.
	
    public int solution1(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n){
                answer++;
            }
        }
    
        return answer;
    }
    
    
    //머쓱이보다 키 큰 사람
    //머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
    //머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
    //머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해 보세요.
    
    public int solution2(int[] array, int height) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] > height) {
                answer++;
            }
        }
        return answer;
    }
    
    
    //최댓값 만들기 (1)
    //정수 배열 numbers가 매개변수로 주어집니다.
    //numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해 주세요.
    
    public int solution3(int[] numbers) {
        //오름차순으로 정렬 후 뒤의 두 숫자를 곱함
        Arrays.sort(numbers);
        
        return numbers[numbers.length - 2] * numbers[numbers.length - 1];
    }
    
    
    //아이스 아메리카노
    //머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
    //머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
    //머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해 보세요.
    
    public int[] solution4(int money) {
        int[] answer = new int[2];
        
        //머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수
        answer[0] = money / 5500;
        
        //남는 돈
        answer[1] = money % 5500;
        
        return answer;
    }
    
    
    //배열의 유사도
    //두 배열이 얼마나 유사한지 확인해 보려고 합니다.
    //문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해 주세요.
    
    public int solution5(String[] s1, String[] s2) {
        int answer = 0;
        
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
    



}
