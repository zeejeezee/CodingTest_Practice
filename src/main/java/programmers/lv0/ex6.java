package programmers.lv0;

public class ex6 {
	
	//배열 회전시키기
	//정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
	//배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해 주세요.

    public int[] solution1(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if (direction.equals("right")) {
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i - 1];
            }
            
            answer[0] = numbers[numbers.length - 1];

        } else {
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            
            answer[numbers.length - 1] = numbers[0];

        }
        
        return answer;
    }
    
    
    //가장 큰 수 찾기
    //정수 배열 array가 매개변수로 주어질 때,
    //가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해 보세요.
    
    public int[] solution2(int[] array) {
        int[] answer = new int[2];
        
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        
        answer[0] = max;
        answer[1] = index;
        
        return answer;
    }
    
    
    //외계 행성의 나이
    //우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
    //입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
    //a는 0, b는 1, c는 2, ..., j는 9입니다.
    //예를 들어 23살은 cd, 51살은 fb로 표현합니다.
    //나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해 주세요.
    
    //구글링해서 풀었음
    
    public String solution3(int age) {
        String answer = "";
        
        //매개변수 int -> String으로 변환
        String ageStr = Integer.toString(age);
        
        for (int i = 0; i < ageStr.length(); i++) {
            answer += (char) ((char)ageStr.charAt(i) + 49);
        }
               
        return answer;
    }
    
    
    //피자 나눠 먹기 (2)
    //머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
    //피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
    //n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면
    //최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해 보세요.
    
    public int solution4(int n) {
        int answer = 0;
        
        for (int i = 1; i <= 6 * n; i++) {
            if ((6 * i) % n == 0) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    
    
    //369게임
    //머쓱이는 친구들과 369게임을 하고 있습니다.
    //369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
    //머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때,
    //머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
    
    
    
    
}