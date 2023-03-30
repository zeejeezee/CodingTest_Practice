package programmers.lv0;

import java.util.Arrays;

public class ex7 {
	//k의 개수
	//1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
	//정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지
	//return 하도록 solution 함수를 완성해 주세요.
	
	//구글링
	//반복문을 사용해서 int -> String -> equals로 문자열 비교
	
    public int solution1(int i, int j, int k) {
        int answer = 0;

        for (int a = i; a <= j; a++) {
            String strNum = Integer.toString(a);
            
            for(int b = 0; b < strNum.length(); b++) {
                if(Integer.toString(k).equals(strNum.substring(b, b+1))) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    public int solution1_1(int i, int j, int k) {
        String str = "";
        for(int a = i; a <= j; a++) {
            str += a+"";
        }

        return str.length() - str.replace(k+"", "").length();
    }
    
    
    //A로 B 만들기
    //문자열 before와 after가 매개변수로 주어질 때,
    //before의 순서를 바꾸어 after를 만들 수 있으면 1을,
    //만들 수 없으면 0을 return 하도록 solution 함수를 완성해 보세요.
    
    public int solution2(String before, String after) {

        //before와 after를 문자열 배열로 바꿈
        char[] beforeC = before.toCharArray();
        char[] afterC = after.toCharArray();
        
        //오름차순 정렬
        Arrays.sort(beforeC);
        Arrays.sort(afterC);
        
        //String으로 바꾸기
        String beforeStr = new String(beforeC);
        String afterStr = new String(afterC);
        
        if(beforeStr.equals(afterStr)) {
            return 1;
        } else {
            return 0;
        }
    }
    
    
    //2차원으로 만들기
    //정수 배열 num_list와 정수 n이 매개변수로 주어집니다. num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해 주세요.
    //num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다.
    //2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
    
    //2차원 배열 다시 공부하기
    
    public int[][] solution3(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int count = 0;
        
        for(int i = 0; i < num_list.length/n; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = num_list[count++];
            }
        }
        
        return answer;
    }
    
    
    //팩토리얼
    //i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
    //예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
    //정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해 주세요.

    //조건: i! ≤ n
    
    //구글링 참고
    public int solution4(int n) {
        int answer = 0;
        for(int i = 1; i <= 10; i++){
            if (n >= factorial(i)) {
                answer = i;
            } else {
                break;
            }
        }
        return answer;
    }
    
    public static int factorial(int number) {
        if (number > 1)
            return number * factorial(number - 1);
        return number;
    }    
    
    
    //가까운 수
    //정수 배열 array와 정수 n이 매개변수로 주어질 때,
    //array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
    
    public int solution5(int[] array, int n) {
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= n) {
                int left = n - array[(i-1)];
                int right = array[i] - n;
                return left <= right ? array[(i-1)] : array[i];
            }
        }

        return array[array.length - 1];
    }
    
    
    //진료 순서 정하기
    //외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
    //정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로
    //진료 순서를 정한 배열을 return하도록 solution 함수를 완성해 주세요.
    
    public int[] solution6(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sortEmergency = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(sortEmergency); //오름차순 정렬
        
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < sortEmergency.length; j++) {
                if (emergency[i] == sortEmergency[j]) {
                    answer[j] = emergency.length - i;
                }
            }
        }
        
        return answer;
    }
    
    
    //한 번만 등장한 문자
    //문자열 s가 매개변수로 주어집니다. 
    //s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해 보세요.
    //한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
        
    public String solution7(String s) {
        String answer = "";
        //abcdefghijklmnopqrstuvwxyz
        int[] arr = new int[26];
        
        for(int i = 0; i < 26; i++) {
            arr[i] = 0;
        }
        
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 97] += 1;
        }
        
        for(int i = 0; i < 26; i++) {
            if (arr[i] == 1) {
                answer += (char)(i + 97);
            }
        }
        
        return answer;
    }
    
    public String solution7_1(String s) {
        int[] alpha = new int[26];
        for(char c : s.toCharArray()){
            alpha[c - 'a']++;
        }

        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(alpha[i] == 1){
                answer.append((char)(i + 'a'));
            }
        }
        return answer.toString();
    }
    
    
    //숨어있는 숫자의 덧셈 (2)
    //문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어 있습니다.
    //my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해 주세요.
    
    public int solution8(String my_string) {
        String[] num = my_string.replaceAll("[^0-9]", " ").split(" ");
        
        int answer = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i].equals("")) {
                continue;
            } else {
                answer += Integer.parseInt(num[i].trim());
            }
        }
        
        return answer;
    }
    
    
    //이진수 더하기
    //이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
    //두 이진수의 합을 return하도록 solution 함수를 완성해 주세요.
    
    public String solution9(String bin1, String bin2) {
        //parseInt(String s, int radix)
        //parseInt(String 문자열, int 진수)
        String answer = "";
        
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int sum = num1 + num2;
        answer = Integer.toBinaryString(sum);
        
        return answer;
    }
    
    
    //7의 개수
    //머쓱이는 행운의 숫자 7을 가장 좋아합니다.
    //정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해 보세요.
    
    public int solution10(int[] array) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
            String num = Integer.toString(array[i]); //array[i]를 문자열로 변환
            String[] arr = num.split(""); //num을 쪼개서 배열로 만듦
            
            for (int j = 0; j < arr.length; j++) {
                if(arr[j].equals("7")) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    
    
}