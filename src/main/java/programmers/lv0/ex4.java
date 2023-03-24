package programmers.lv0;

import java.util.Arrays;
import java.util.stream.Stream;

public class ex4 {
	
	//개미군단
	//개미군단이 사냥을 나가려고 합니다.
	//개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
	//장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
	//예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만, 
	//장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다. 
	//사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면
	//몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해 주세요.
	
    public int solution1(int hp) {
        int answer = 0;
        
        //장군개미 수
        answer += (hp / 5); 
        //answer = answer + (hp / 5);
        
        //남은 hp
        hp %= 5;
        //hp = hp % 5;

        //남은 hp에서 쓸 수 있는 병정개미 수
        answer += (hp / 3);
        //answer = answer + (hp / 3);
        
        //남은 hp
        hp %= 3;
        //hp = hp % 3;
        
        //남은 hp에서 쓸 수 있는 일개미 수
        answer += (hp / 1);
        //answer = answer + (hp / 1);
        
        return answer;
    }	

    public int solution1_1(int hp) {    
    
    	//hp를 5로 나눈 값 
    	//+ hp를 5로 나눴을 때의 나머지을 3으로 나눈 값
    	//+ hp를 5로 나눴을 때의 나머지을 3으로 나눴을 때의 나머지
    	
    	return (hp / 5) + ((hp % 5) / 3) + ((hp % 5) % 3);

    }
    
    
    //제곱수 판별하기
    //어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
    //정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을
    //아니라면 2를 return하도록 solution 함수를 완성해 주세요.
    
    //Math.Sqrt() 다시 공부하기
    public int solution2(int n) {
        if(Math.sqrt(n) % 1 == 0) {
            return 1;
        } else {
            return 2;
        }
        
        //int answer = 0;
        //return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
    
    
    //문자열 안에 문자열
    //문자열 str1, str2가 매개변수로 주어집니다.
    //str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해 주세요.

    public int solution3(String str1, String str2) {
        boolean answer = str1.contains(str2);
        
        return answer ? 1 : 2;
    }
    
    
    //모음 제거
    //영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
    //문자열 my_string이 매개변수로 주어질 때
    //모음을 제거한 문자열을 return하도록 solution 함수를 완성해 주세요.
    
    public String solution4(String my_string) {
        String answer = "";
        String[] vowel = {"a", "e", "i", "o", "u"};
        
        for(int i = 0; i < vowel.length; i++) {
            if(my_string.contains(vowel[i])) {
                answer = my_string.replaceAll(vowel[i], "");
                my_string = answer;
            } else {
                answer = my_string;
            }
        }
        
        return answer;
    }
    
    
    //자릿수 더하기
    //정수 n이 매개변수로 주어질 때
    //n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해 주세요.
    
    public int solution5(int n) {
        int answer = 0;
        String[] arr = String.valueOf(n).split("");
        
        for(String a : arr) {
            answer += Integer.parseInt(a);
        }
        
        return answer;
    }
    
    
    //세균 증식
    //어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
    //처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때
    //t시간 후 세균의 수를 return하도록 solution 함수를 완성해 주세요.
    
    public int solution6(int n, int t) {
        
        for (int i = 1; i <= t; i++) {
            n = n * 2;
        }
        
        return n;
    }    
    
    
    //문자열 정렬하기 (1)
    //문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 
    //오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해 보세요.
    
    //모르겠어서 구글링 후 푼 문제! 다시 공부하기
    
    public int[] solution7(String my_string) {
        
        String arr = my_string.replaceAll("[^0-9]", "");
        
        int[] answer = Stream.of(arr.split("")).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(answer);
        return answer;
    }
    
    
    //가위 바위 보
    //가위는 2 바위는 0 보는 5로 표현합니다.
    //가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때, rsp에 저장된 가위 바위 보를
    //모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해 보세요.
    
    public String solution8(String rsp) {
        String answer = "";
        
        for (int i = 0; i < rsp.length(); i++) {
            answer += (rsp.split("")[i].equals("0") ? "5" : rsp.split("")[i].equals("2") ? "0" : rsp.split("")[i].equals("5") ? "2" : "1"); 
        }
        return answer;
    }
	
    
    //암호 해독(다른 풀이 많이 보기)
    //군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
    //암호화된 문자열 cipher를 주고받습니다.
    //그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
    //문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해 주세요.
    
    public String solution9(String cipher, int code) {
        String answer = "";
        String[] arr = cipher.split(""); //문자열 chpher를 쪼개서 배열에 넣음
        
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % code == 0) {
                answer += arr[i];
            }
        }
        
        return answer;
    }
    
    //다른 사람 풀이
    public String solution9_1(String cipher, int code) {
        String answer = "";

        for (int i = code; i <= cipher.length(); i = i + code) {
            answer += cipher.substring(i - 1, i);
        }

        return answer;
    }
    
    
    //대문자와 소문자
    //문자열 my_string이 매개변수로 주어질 때,
    //대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해 주세요.
    
    //대문자 -> 소문자, 소문자 -> 대문자
    
    public String solution10(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            if (Character.isUpperCase(my_string.charAt(i))){
                answer += Character.toLowerCase(my_string.charAt(i));
            } else {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }

        return answer;
    }
    
    
    
}
