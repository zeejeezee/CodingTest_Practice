package programmers.lv0;

public class ex9 {
	
	//종이 자르기
	//머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다.
	//예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
	//정수 M, N이 매개변수로 주어질 때,
	//M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return 하도록 solution 함수를 완성해 보세요.
	
	//규칙을 알면 쉽게 해결할 수 있다!
	//예시를 보면 M = 2, N = 2일 때 결과가 3이고 M = 2, N = 5일 때 결과가 9이므로
	//두 수를 곱해서 1을 뺀 게 결과인 것을 알 수 있다.
	
    public int solution1(int M, int N) {
        return M * N - 1;
    }



    
}