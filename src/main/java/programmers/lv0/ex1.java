package programmers.lv0;

public class ex1 {

	// 두 수의 곱
	// 정수 num1, num2가 매개변수 주어집니다.
	// num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.

	public int solution1(int num1, int num2) {
		int answer = 0;
		if (0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100) {
			answer = num1 * num2;
		}

		return answer;
	}

	// 두 수의 나눗셈
	// 정수 num1과 num2가 매개변수로 주어질 때,
	// num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해 주세요.

	public int solution2(int num1, int num2) {

		double answer = (double) num1 / num2 * 1000;

		return (int) answer;
	}

	// 두 수의 합
	// 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 solution 함수를 완성해 주세요.

	public int solution3(int num1, int num2) {

		int answer = -1;

		if (-50000 <= num1 && num1 <= 50000 && -50000 <= num2 && num2 <= 50000) {
			answer = num1 + num2;
		}

		return answer;
	}

	// 두 수의 차
	// 정수 num1과 num2가 매개변수로 주어집니다.
	// 두 수가 같으면 1 다르면 -1을 return 하도록 solution 함수를 완성해 주세요.

	public int solution4(int num1, int num2) {
		int answer = 0;

		answer = num1 - num2;

		return answer;
	}

	// 나머지 구하기
	// 정수 num1, num2가 매개변수로 주어질 때,
	// num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.

	public int solution5(int num1, int num2) {
		int answer = -1;

		answer = num1 % num2;

		return answer;
	}

	// 몫 구하기
	// 정수 num1, num2가 매개변수로 주어질 때,
	// num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해 주세요.

	public int solution6(int num1, int num2) {
		int answer = 0;

		answer = num1 / num2;

		return answer;
	}

	// 숫자 비교하기
	// 정수 num1, num2가 매개변수로 주어집니다.
	// 두 수가 같으면 1 다르면 -1을 return 하도록 solution 함수를 완성해 주세요.

	public int solution7(int num1, int num2) {
		int answer = 0;

		if (num1 == num2)
			answer = 1;
		else
			answer = -1;

		return answer;
	}

	// 나이 출력
	// 머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
	// 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해 주세요.

	public int solution8(int num1, int num2) {
		int answer = 0;

		answer = num1 - num2;

		return answer;
	}

	// 짝수의 합
	// 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

	public int solution9(int n) {
		int answer = 0;

		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0)
				answer = answer + i;
		}
		return answer;
	}

	// 각도기
	// 각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
	// 각 angle이 매개변수로 주어질 때
	// 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해 주세요.
	public int solution10(int angle) {

		// int answer = 0;

		// if (angle > 0 && angle < 90)
		// answer = 1;
		// else if (angle == 90)
		// answer = 2;
		// else if (angle > 90 && angle < 180)
		// answer = 3;
		// else if (angle == 180)
		// answer = 4;

		return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
	}
}
