package programmers.lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

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
    
    //배열 두 배 만들기
    //정수 배열 numbers가 매개변수로 주어집니다.
    //numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해 주세요.
    
    public int[] solution6(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }    
    
    
    //순서쌍의 개수
    //순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
    //자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해 주세요.
    
    public int solution7(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){ //매개변수 n을 i로 나눴을 때 나머지가 0이라면
                answer++;
            }
            
        }
        return answer;
    }
    
    //다른 사람 풀이
    //InsStream이 뭔지 공부하기
    public int solution7_1(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
    
    
    //옷가게 할인 받기
    //머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해 줍니다.
    //구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해 보세요.
    public int solution8(int price) {
        int answer = 0;
        
        if(price >= 100000 && price < 300000) {
            answer = (int)(price * 0.95);
        }
        else if(price >= 300000 && price < 500000) {
            answer = (int)(price * 0.9);
        }
        else if(price >= 500000) {
            answer = (int)(price * 0.8);
        }
        else {
            answer = price;
        }
        
        return answer;
    }
    
    
    //삼각형의 완성 조건(1)
    //선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
    //가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
    //삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
    //세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해 주세요.
    
    public int solution9(int[] sides) {
        
        //Arrays.sort() : 배열 오름차순 정렬
        Arrays.sort(sides);    
        
        //sides[0]과 sides[1]의 합이 sides[2]보다 크다면 1, 작다면 2
        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }
    
    
    //배열 원소의 길이
    //문자열 배열 strlist가 매개변수로 주어집니다.
    //strlist 각 원소의 길이를 담은 배열을 return하도록 solution 함수를 완성해 주세요.

    public int[] solution10(String[] strlist) {
        
        int[] answer = new int[strlist.length];
        
        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        
        return answer;
    }
}
