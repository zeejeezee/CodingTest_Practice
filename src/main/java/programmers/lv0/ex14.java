package programmers.lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class ex14 {
	
	//마지막 두 원소
	//정수 리스트 num_list가 주어질 때,
	//마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을,
	//마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해 주세요.
	
    public int[] solution1(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int i = 0;
        
        for (i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        if (answer[i - 1] > answer[i - 2]) {
            answer[i] = answer[i - 1] - answer[i - 2];
        } else {
            answer[i] = answer[i - 1] * 2;
        }
        
        return answer;
    }
    
    
    //수 조작하기 1
    //정수 n과 문자열 control이 주어집니다.
    //control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.
    //"w" : n이 1 커집니다.
    //"s" : n이 1 작아집니다.
    //"d" : n이 10 커집니다.
    //"a" : n이 10 작아집니다.
    //위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.
    
    public int solution2(int n, String control) {
        int answer = n;
        String[] arr = control.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("w")) {
                answer += 1;   
            } else if (arr[i].equals("s")) {
                answer -= 1;
            } else if (arr[i].equals("d")) {
                answer += 10;
            } else if (arr[i].equals("a")) {
                answer -= 10;
            }
        }
        
        return answer;
    }
    
    
    //문자열 붙여서 출력하기
    //두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
    //입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        System.out.print(a + b);
    }
    
    
    //rny_string
    //'m'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다.
    //문자열 rny_string이 주어질 때, rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
    
    public String solution4(String rny_string) {
        String answer = rny_string.replace("m", "rn");
        return answer;
    }
    
    
    //홀짝 구분하기
    //자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
    
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.print(n + " is even");
        } else {
            System.out.print(n + " is odd");
        }
    }
    
    
    //배열의 원소만큼 추가하기
    //아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 양의 정수 배열 arr가 매개변수로 주어질 때,
    //arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.
    
    public int[] solution6(int[] arr) {
        ArrayList<Integer> array = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                array.add(arr[i]);
            }
        }
        
        int[] answer = new int[array.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = array.get(i);
        }
        
        return answer;
    }
    
    
    //A 강조하기
    //문자열 myString이 주어집니다. myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고,
    //"A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.
    
    public String solution7(String myString) {
        String answer = "";
        
        answer = myString.toLowerCase();
        answer = answer.replaceAll("a", "A");
        
        return answer;
    }
    
    
    //원하는 문자열 찾기
    //알파벳으로 이루어진 문자열 myString과 pat이 주어집니다.
    //myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.
    //단, 알파벳 대문자와 소문자는 구분하지 않습니다.
    
    public int solution8(String myString, String pat) {
        int answer = 0;

        if (myString.toLowerCase().contains(pat.toLowerCase())) {
            answer = 1;
        }
        
        return answer;
    }
    
    
    //배열의 길이에 따라 다른 연산하기
    //정수 배열 arr과 정수 n이 매개변수로 주어집니다.
    //arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을,
    //arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.
    
    public int[] solution9(int[] arr, int n) {
        int[] answer = arr;
        
        for(int i = 0; i < arr.length; i++) {
            if (arr.length % 2 != 0) {
                if (i % 2 == 0) {
                    answer[i] = arr[i] + n;
                }
            } else {
                if (i % 2 != 0) {
                    answer[i] = arr[i] + n;
                }
            }
        }
        
        return answer;
    }
    
    
    //카운트 다운
    //정수 start와 end가 주어질 때,
    //start에서 end까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해 주세요.
    
    public int[] solution10(int start, int end) {
        int[] answer = new int[start - end + 1];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start--;
        }

        return answer;
    }
    


    
}