package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
    
    
    //캐릭터의 좌표
    //머쓱이는 RPG게임을 하고 있습니다.
    //게임에는 up, down, left, right 방향키가 있으며 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다.
    //예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 [0, 1], down을 누른다면 [0, -1],
    //left를 누른다면 [-1, 0], right를 누른다면 [1, 0]입니다.
    //머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다.
    //캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return하도록 solution 함수를 완성해 주세요.

    //[0, 0]은 board의 정 중앙에 위치합니다.
    //예를 들어 board의 가로 크기가 9라면 캐릭터는 왼쪽으로 최대 [-4, 0]까지 오른쪽으로 최대 [4, 0]까지 이동할 수 있습니다.
    
    public int[] solution2(String[] keyinput, int[] board) {
        int[] answer = {0, 0}; //좌표가 (0, 0)으로 시작
        
        for (int i = 0; i < keyinput.length; i++) {
            switch(keyinput[i]) {
                case "up": answer[1]++;
                    break;
                case "down": answer[1]--;
                    break;
                case "left": answer[0]--;
                    break;
                case "right": answer[0]++;
                    break;
            }
            
            if(Math.abs(answer[0]) > board[0] / 2) {
                answer[0] += (answer[0] > 0) ? -1 : 1;
            }
            if(Math.abs(answer[1]) > board[1] / 2) {
                answer[1] += (answer[1] > 0) ? -1 : 1;
            }
        }
        
        return answer;
    }
    
    
    //직사각형 넓이 구하기
    //2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
    //직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
    //직사각형의 넓이를 return 하도록 solution 함수를 완성해 보세요.
    
    public int solution3(int[][] dots) {
        int width = 0;
        int height = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        
        for (int i = 1; i < dots.length; i++) {
            if (x != dots[i][0]) width = Math.abs(x - dots[i][0]);
            if (y != dots[i][1]) height = Math.abs(y - dots[i][1]);
        }
        
        return width * height;
    }
    
    
    //로그인 성공
    //머쓱이는 프로그래머스에 로그인하려고 합니다.
    //머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때,
    //다음과 같이 로그인 성공, 실패에 따른 메시지를 return하도록 solution 함수를 완성해 주세요.

    //아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return 합니다.
    //로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 “fail”를,
    //아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 “wrong pw”를 return 합니다.
    
    public String solution4(String[] id_pw, String[][] db) {
        Map<String, String> memberTable = new HashMap<>();
        
        for (int i = 0; i < db.length; i++) {
            memberTable.put(db[i][0], db[i][1]);
        }
        try {
            if (memberTable.get(id_pw[0]).equals(id_pw[1])) {
                return "login";
            } else if (!memberTable.get(id_pw[0]).equals(id_pw[1])) {
                return "wrong pw";
            } else {
                return "fail";
            }
        } catch (Exception e) {
            return "fail";
        }
    }
    
    
    //치킨 쿠폰
    //프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다.
    //쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다.
    //시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때
    //받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해 주세요.
    
    public int solution5(int chicken) {
        
        int coupon = chicken; //받는 쿠폰
        int remainCoupon = 0; //쓰고 남은 쿠폰
        int answer = 0; //서비스 치킨
        
        while (coupon + remainCoupon >= 10) {
            int a = (coupon + remainCoupon) / 10; //몫
            int b = (coupon + remainCoupon) % 10; //나머지
            
            coupon = a;
            remainCoupon = b;
            
            answer += coupon;
        }
        
        return answer;
    }
    
    
    //등수 매기기
    //영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
    //영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때,
    //영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해 주세요.
    
    public int[] solution6(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        
        for(int[] t : score) {
            scoreList.add(t[0] + t[1]);
        }
        
        //Comparator : 정렬을 위해 사용하는 인터페이스
        //Comparator.reverseOrder() : 내림차순 정렬
        scoreList.sort(Comparator.reverseOrder());
        
        //indexOf() : 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환
        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++) {
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
        } //index가 0부터 시작하기 때문에 1을 더해 준다
        
        
        return answer;
    }
    
    
    //유한소수 판별하기
    //소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다. 
    //분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다.
    //유한소수가 되기 위한 분수의 조건은 다음과 같습니다.

    //기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
    
    //두 정수 a와 b가 매개변수로 주어질 때,
    //a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해 주세요.
    
    public int solution7(int a, int b) {
        int newB = b / gcd(a, b);
        
        while (newB != 1) {
            if (newB % 2 == 0) {
                newB /= 2;
            } else if (newB % 5 == 0) {
                newB /= 5;
            } else {
                return 2;
            }
        }
        
        return 1;

    }
    
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    
    //다른 사람 풀이
    public int solution7_1(int a, int b) {
    	
    	int answer = ((a * 1000) % b == 0) ? 1 : 2;
    	
    	return answer;
    }
    
    
    //a와 b 출력하기
    //정수 a와 b가 주어집니다.
    //각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
    
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
    
    //문자열 출력하기
    //문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.
    
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        System.out.println(a);
    }
    
    
    //저주의 숫자 3
    //3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다.
    //3x 마을 사람들의 숫자는 다음과 같습니다.
    
    //1 -> 1 / 2 -> 2 / 3 -> 4 / 4 -> 5 / 5 -> 7 / 6 -> 8 / 7 -> 10 / 8 -> 11 / 9 -> 14 / 10 -> 16
    
    ///정수 n이 매개변수로 주어질 때,
    //n을 3x 마을에서 사용하는 숫자로 바꿔 return하도록 solution 함수를 완성해 주세요.
    
    public int solution8(int n) {
        int answer = n;
        int i = 1;
        
        //contains() : 해당 문자열을 포함하는지
        while (i <= answer) {
            if ((i % 3 == 0) || String.valueOf(i).contains("3")) {
                answer++;
            }
            i++;
        }
        
        return answer;
    }
    
    
    //특이한 정렬
    //정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
    //이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
    //정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로
    //정렬한 배열을 return하도록 solution 함수를 완성해 주세요.
    
    //구글링
    //내일 다시 보기
	public int[] solution9(int[] numlist, int n) {
		List<Integer> nums = new ArrayList<>();
		Arrays.sort(numlist);
		for (int num : numlist) nums.add(num);
		nums.sort((s1, s2) -> Integer.compare(Math.abs(s2 - n), Math.abs(s1 - n)));
		Collection.reverse(nums);
		return nums.stream().mapToInt(num -> num).toArray();
	}

	public static void main(String[] args) {
		UniqueSort uniqueSort = new UniqueSort();
		String output1 = Arrays.toString(uniqueSort.solution(new int[]{1, 2, 3, 4, 5, 6}, 4));
		System.out.println(output1 + " " + output1.equals("[4, 5, 3, 6, 2, 1]"));

		String output2 = Arrays.toString(uniqueSort.solution(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30));
		System.out.println(output2 + " " + output2.equals("[36, 40, 20, 47, 10, 6, 7000, 10000]"));

		String output3 = Arrays.toString(uniqueSort.solution(new int[]{10,9,8,7,6,5,4,3,2,1,11}, 6));
		System.out.println(output3 + " " + output3.equals("[6, 7, 5, 8, 4, 9, 3, 10, 2, 11, 1]"));
	}

    
}