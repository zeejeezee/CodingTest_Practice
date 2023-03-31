package programmers.lv0;

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
    
    
    //컨트롤 제트
    //숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다.
    //문자열에 있는 숫자를 차례대로 더하려고 합니다.
    //이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
    //숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해 보세요.
    
    
    
}