package programmers.lv0;

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
    
    
	
}
