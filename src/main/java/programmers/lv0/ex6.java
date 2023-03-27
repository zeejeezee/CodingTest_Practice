package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex6 {
	
	//배열 회전시키기
	//정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
	//배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해 주세요.

    public int[] solution1(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if (direction.equals("right")) {
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i - 1];
            }
            
            answer[0] = numbers[numbers.length - 1];

        } else {
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            
            answer[numbers.length - 1] = numbers[0];

        }
        
        return answer;
    }
    
    
    //가장 큰 수 찾기
    //정수 배열 array가 매개변수로 주어질 때,
    //가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해 보세요.
    
    public int[] solution2(int[] array) {
        int[] answer = new int[2];
        
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        
        answer[0] = max;
        answer[1] = index;
        
        return answer;
    }
    
    
    //외계 행성의 나이
    //우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
    //입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
    //a는 0, b는 1, c는 2, ..., j는 9입니다.
    //예를 들어 23살은 cd, 51살은 fb로 표현합니다.
    //나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해 주세요.
    
    //구글링해서 풀었음
    
    public String solution3(int age) {
        String answer = "";
        
        //매개변수 int -> String으로 변환
        String ageStr = Integer.toString(age);
        
        for (int i = 0; i < ageStr.length(); i++) {
            answer += (char) ((char)ageStr.charAt(i) + 49);
        }
               
        return answer;
    }
    
    
    //피자 나눠 먹기 (2)
    //머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
    //피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
    //n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면
    //최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해 보세요.
    
    public int solution4(int n) {
        int answer = 0;
        
        for (int i = 1; i <= 6 * n; i++) {
            if ((6 * i) % n == 0) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    
    //약수 구하기
    //정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록
    //solution 함수를 완성해 주세요.
    
    public int[] solution5(int n) {
        int[] arr = new int[10000];
        int index = 0;
        
        for (int i = 1; i <= n; i++) {
            if(n % i ==0) {
                arr[index] = i;
                index++;
            }
        }
        
        int[] answer = new int[index];
        for (int i = 0; i < index; i++) {
            if(arr[i] != 0) {
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
    
    //다른 사람 풀이
    public int[] solution5_1(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        list.add(n);

        return list.stream().mapToInt(e -> e).toArray();
    }
    
    
    //숫자 찾기
    //정수 num과 k가 매개변수로 주어질 때,
    //num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
    //없으면 -1을 return 하도록 solution 함수를 완성해 보세요.
    
    public int solution6(int num, int k) {
        int answer = 0;
        String[] str = String.valueOf(num).split("");
        //num을 문자열로 형변환
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(String.valueOf(k))) {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }
    
    
    //문자열 정렬하기 (2)
    //영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
    //my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해 보세요.
    
    public String solution7(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase(); //소문자 변환
        char[] strChar = my_string.toCharArray(); //String을 char형 배열로 변환
        Arrays.sort(strChar);
        
        answer = new String(strChar);
        
        return answer;
    }
    
    
    //합성수 찾기
    //약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
    //자연수 n이 매개변수로 주어질 때
    //n 이하의 합성수의 개수를 return하도록 solution 함수를 완성해 주세요.
    
    //합성수란
    //1보다 큰 자연수 중에서 소수가 아닌 수로,
    //약수의 개수가 3개 이상이고 둘 이상의 소수를 곱한 자연수
    
    //약수가 3개 이상인 수를 구하면 됨
    
    public int solution8(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if (i % j == 0) 
                    count = count + 1;
            }
            
            answer += (count >= 3) ? 1 : 0;
        }
        
        return answer;
    }
    
    
    //중복된 문자 제거
    //문자열 my_string이 매개변수로 주어집니다.
    //my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해 주세요.
    
    //구글링 참고
    //indexOf(), charAt()
    
    public String solution9(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.indexOf(my_string.charAt(i)) == i)
                answer += my_string.charAt(i);
        }

        return answer;
    }
    
    
    //모스부호 (1)
    //머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
    //그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
    //문자열 letter가 매개변수로 주어질 때,
    //letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
    //모스부호는 다음과 같습니다.

    /* morse = { 
        '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
        '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
        '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
        '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
        '-.--':'y','--..':'z'
    }; */
    
    public String solution10(String letter) {
        String answer = "";
        String[] morseList = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        
        String[] morse;
        morse = letter.split(" ");
        
        for(String str : morse) {
            for(int i = 0; i < morseList.length; i++) {
                if(str.equals(morseList[i])) {
                    answer += Character.toString(i + 'a');
                }
            }
        }
        
        return answer;
    }
    
    
    
    
    
}