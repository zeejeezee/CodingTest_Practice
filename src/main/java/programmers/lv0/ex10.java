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
    
        

    
}