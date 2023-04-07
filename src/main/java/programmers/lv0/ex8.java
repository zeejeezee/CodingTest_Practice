package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
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
    
    public int solution4(String s) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(s.split(" ")));
        int answer = 0;
        
        while (arr.contains("Z")) { //Z가 있으면
            arr.remove(arr.indexOf("Z") - 1); //Z 하나 전에 있는 숫자 제거
            arr.remove(arr.indexOf("Z")); //Z 제거
        }
        
        for (int i = 0; i < arr.size(); i++) {
            answer += Integer.parseInt(arr.get(i));
        }
        
        return answer;
    }
    
    
    //영어가 싫어요
    //영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
    //문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
    
    public long solution5(String numbers) {
        long answer = 0;
        
        numbers = numbers.replace("zero", "0");
        numbers = numbers.replace("one", "1");
        numbers = numbers.replace("two", "2");
        numbers = numbers.replace("three", "3");
        numbers = numbers.replace("four", "4");
        numbers = numbers.replace("five", "5");
        numbers = numbers.replace("six", "6");
        numbers = numbers.replace("seven", "7");
        numbers = numbers.replace("eight", "8");
        numbers = numbers.replace("nine", "9");
        
        answer = Long.parseLong(numbers);

        return answer;
    }
    
    public long solution5_1(String numbers) {

        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers_arr.length; i++) {
            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
        }

        long answer = Long.parseLong(numbers);
        return answer;
    }
    
    
    //잘라서 배열로 저장하기
    //문자열 my_str과 n이 매개변수로 주어질 때,
    //my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해 주세요.
    
    public String[] solution6(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < (my_str.length() / n); i++) {
            answer.add(my_str.substring((n * i), (n * (i + 1))));
        }
        if (my_str.length() % n != 0) {
             answer.add(my_str.substring( (my_str.length() / n) * n));
        }
        return answer.toArray(new String[0]);
    }
    
    
    //문자열 계산하기
    //my_string은 "3 + 5"처럼 문자열로 된 수식입니다.
    //문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해 주세요.

    public int solution7(String my_string) {
        
        String[] strArr = my_string.split(" ");
        int answer = Integer.parseInt(strArr[0]);
        
        for (int i = 1; i < strArr.length; i+=2) {
            if (strArr[i].equals("+")) {
                answer += Integer.parseInt(strArr[i + 1]);
            }
            if (strArr[i].equals("-")) {
                answer -= Integer.parseInt(strArr[i + 1]);
            }
        }
        
        return answer;
    }
    
    //구슬을 나누는 경우의 수
    //머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
    //머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
    //balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해 주세요.
    
    //구글링 참고
    
    public int combination(int n, int r) {
        if (r == 0 || n == r) {
            return 1; 
        } else {
            return combination(n-1, r-1) + combination(n-1, r);
        }
    }
    
    public int solution8(int balls, int share) {
        return combination(balls, share);
    }
    
    //다른 사람 풀이
    
    public long solution8_1(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution8_1(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }

    
}