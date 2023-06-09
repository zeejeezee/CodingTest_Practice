package programmers.lv0;

import java.util.Arrays;

public class ex10 {
	
	//다항식 더하기
	//한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
	//다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
	//덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
	//동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해 보세요.
	//같은 식이라면 가장 짧은 수식을 return 합니다.
	
	//제한사항
    //0 < polynomial에 있는 수 < 100
	//polynomial에 변수는 'x'만 존재합니다.
	//polynomial은 0부터 9까지의 정수, 공백, ‘x’, ‘+'로 이루어져 있습니다.
	//항과 연산기호 사이에는 항상 공백이 존재합니다.
	//공백은 연속되지 않으며 시작이나 끝에는 공백이 없습니다.
	//하나의 항에서 변수가 숫자 앞에 오는 경우는 없습니다.
	//" + 3xx + + x7 + "와 같은 잘못된 입력은 주어지지 않습니다.
	//"012x + 001"처럼 0을 제외하고는 0으로 시작하는 수는 없습니다.
	//문자와 숫자 사이의 곱하기는 생략합니다.
	//polynomial에는 일차 항과 상수항만 존재합니다.
	//계수 1은 생략합니다.
	//결괏값에 상수항은 마지막에 둡니다.
	//0 < polynomial의 길이 < 50
	
    public String solution1(String polynomial) {
        int xNum = 0;
        int num = 0;
        
        for (String s : polynomial.split(" ")) {
            if (s.contains("x"))
                xNum += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            else if (!s.equals("+"))
                num += Integer.parseInt(s);
        }
        
        return (xNum != 0 ? xNum > 1 ? xNum + "x" : "x" : "") + (num != 0 ? (xNum != 0 ? " + " : "") + num : xNum == 0 ? "0" : "");
        
    }
    
    
    //분수의 덧셈
    //첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
    //두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해 보세요.
    
    public int[] solution2(int numer1, int denom1, int numer2, int denom2) {
        
        //최소공배수 : (a * b) / 최대공약수
        
        int numerator = (numer1 * denom2) + (numer2 * denom1);
        int denominator = denom1 * denom2;
        
        for(int i = numerator - 1; i > 1; i--) {
            if(numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
        }
        
        int[] answer = {numerator, denominator};
        
        return answer;
    }
    
    
    //OX 퀴즈
    //덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
    //수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해 주세요.
    
    //제한 사항
    //연산 기호와 숫자 사이는 항상 하나의 공백이 존재합니다.
    //단 음수를 표시하는 마이너스 기호와 숫자 사이에는 공백이 존재하지 않습니다.
    //1 ≤ quiz의 길이 ≤ 10
    //X, Y, Z는 각각 0부터 9까지 숫자로 이루어진 정수를 의미하며,
    //각 숫자의 맨 앞에 마이너스 기호가 하나 있을 수 있고 이는 음수를 의미합니다.
    //X, Y, Z는 0을 제외하고는 0으로 시작하지 않습니다.
    //-10,000 ≤ X, Y ≤ 10,000
    //-20,000 ≤ Z ≤ 20,000
    //[연산자]는 + 와 - 중 하나입니다.
    
    public String[] solution3(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] s = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            s = quiz[i].split(" ");
            
            if(s[1].equals("-")) {
                if (Integer.parseInt(s[0]) - Integer.parseInt(s[2]) == Integer.parseInt(s[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
            
            if(s[1].equals("+")) {
                if (Integer.parseInt(s[0]) + Integer.parseInt(s[2]) == Integer.parseInt(s[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
    
    
    //최빈값 구하기
    //최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
    //정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해 보세요.
    //최빈값이 여러 개면 -1을 return 합니다.
    
    public int solution4(int[] array) {
        int answer = 0;
        int max = 0;
        
        Arrays.sort(array);
        max = array[array.length - 1];
        //오름차순 정렬 후 제일 큰 수를 max로 설정
        
        int count[] = new int[max + 1];
        for(int i = 0; i < array.length; i++) {
            count[array[i]]++; //각 수의 index에 count
        }
        
        max = count[0];
        
        //가장 큰 count 값을 max로 설정
        for(int i = 1; i < count.length; i++) {
            if(max < count[i]) {
                max = count[i];
                answer = i; //max 값이 바뀔 때 최빈값
            } else if(max == count[i]) { //최빈값이 2개 이상인 경우
                answer = -1;
            }
        }
        
        return answer;
    }
    
    
    //다음에 올 숫자
    //등차수열 혹은 등비수열 common이 매개변수로 주어질 때,
    //마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해 보세요.
    
    public int solution5(int[] common) {
        int answer = 0;
        
        if((common[1] - common[0]) == (common[2] - common[1])) {
            answer = common[common.length-1] + (common[1] - common[0]);
        } else {
            answer = common[common.length-1] * (common[1] / common[0]);
        }
        
        return answer;
    }
    
    
    //옹알이
    //머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
    //조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
    //문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해 주세요.
    
    public int solution6(String[] babbling) {
        int answer = 0;
        
        String[] yesList = {"aya", "ye", "woo", "ma"};
        String[] noList = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for (String bab : babbling) {
            for (String str : noList) {
                bab = bab.replace(str, "X");
            }
            
            for (String str : yesList) {
                bab = bab.replace(str, "O");
            }
            
            int sign = 0;
            
            for(int i = 0; i < bab.length(); i++) {
                if(!bab.subSequence(i, i + 1).equals("O")) {
                    sign = 1;
                    break;
                }
            }
            
            if(sign == 0) {
                answer++;
            }
        }
        
        return answer;
    }
    
    
    //연속된 수의 합
    //연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다.
    //연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해 보세요.
    
    public int[] solution7(int num, int total) {
        int[] answer = new int[num];
        int number = (total / num) - ((num - 1) / 2);
        
        for (int i = 0; i < num; i++) {
            answer[i] = number;
            number++;
        }
        
        return answer;
    }
    
    
    
    //안전지대
    //다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
    //지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
    //지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해 주세요.
    
    //구글링 참고
    public int solution8(int[][] board) {
        int[][] newBoard = new int [board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) checkExplosion(i, j, newBoard);
            }
        }
        
        int count = 0;
        for(int[] array : newBoard) {
            for(int value : array) {
                if(value == 0) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    static void checkExplosion(int x, int y, int[][] newBoard) {
    	int explosionX;
    	int explosionY;
    	int[] aroundX = {0, -1, -1, -1, 0, 0, 1, 1, 1};
    	int[] aroundY = {0, -1, 0, 1, -1, 1, -1, 0, 1};
    	
    	for(int i = 0; i < 9; i++) {
    		explosionX = x + aroundX[i];
    		explosionY = y + aroundY[i];
    		if(explosionX < newBoard.length && explosionY < newBoard.length)
    			if(explosionX >= 0 && explosionY >= 0) newBoard[explosionX][explosionY] = 1;
    	}
    	
    }
    
    
    
    public int solution8_1(int[][] param) {
        int safeZone = 0;
        
        //위험지역 Set
        for (int i = 0; i < param.length; i++) {
            for (int j = 0; j < param.length; j++) {
                if (param[i][j] == 1)
                    setArea(param, i, j);
            }
        }
        //안전지역 Count
        for (int i = 0; i < param.length; i++) {
            for (int j = 0; j < param.length; j++) {
                if (param[i][j] == 0)
                    safeZone++;
            }
        }

        return safeZone;
    }

    void setArea(int[][] param, int x, int y) {
        for (int i = -1; i < 2; i++) { //i: -1, 0, 1
            for (int j = -1; j < 2; j++) { //j: -1, 0, 1
                try {
                    if (param[x + i][y + j] == 0)
                        param[x + i][y + j] = 2;
                } catch (Exception e) {
                }
            }
        }
    }
    
    
    
    //평행
    //점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
    //[[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
    //주어진 네 개의 점을 두 개씩 이었을 때,
    //두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해 보세요.

    //기울기 구하는 공식 : (y2 - y1) / (x2 - x1) 
    
    public double findSlope(int[] dot1, int[] dot2) {
        return (double) (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
    }
    
    public int solution9(int[][] dots) {
        int answer = 0;
        
        if (findSlope(dots[0], dots[1]) == findSlope(dots[2], dots[3])) {
            return 1;
        }
        
        if (findSlope(dots[0], dots[2]) == findSlope(dots[1], dots[3])) {
            return 1;
        }
        
        if (findSlope(dots[0], dots[3]) == findSlope(dots[1], dots[2])) {
            return 1;
        }
        
        return answer;
    }
    
    
    //겹치는 선분의 길이
    //선분 3개가 평행하게 놓여 있습니다.
    //세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때,
    //두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해 보세요.

    //lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다.
    
    public int solution10(int[][] lines) {
        int[] arr = new int[200];
        int answer = 0;
        
        for (int i = 0; i < lines.length; i++)
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++)
                arr[j]++;
        
        for (int i = 0; i < 200; i++)
            if(arr[i] > 1)
                answer++;
        
        return answer;
    }
        

    
}