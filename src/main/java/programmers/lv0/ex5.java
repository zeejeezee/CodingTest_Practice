package programmers.lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex5 {
	
	//숨어 있는 숫자의 덧셈 (1)
	//문자열 my_string이 매개변수로 주어집니다.
	//my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해 주세요.
	
    public int solution1(String my_string) {

        return Arrays.stream(my_string.replaceAll("[a-z|A-Z]", "").split("")).mapToInt(Integer::parseInt).sum();
    }

    
    //편지
    //머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다.
    //할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며, 편지를 가로로만 적을 때,
    //축하 문구 message를 적기 위해 필요한 편지지의 최소 가로길이를 return 하도록 solution 함수를 완성해 주세요.

    public int solution2(String message) {
        int answer = message.length() * 2;
        
        return answer;
    }
    
	  
    //짝수는 싫어요
    //정수 n이 매개변수로 주어질 때, 
    //n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해 주세요.
    
    public int[] solution3(int n) {
        int[] answer;
        int j = 0;
        
        if (n % 2 ==0) {
            answer = new int[n / 2];
        } else {
            answer = new int[n / 2 + 1];
        }
        
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                answer[j] = i;
                j++;
            }
        }
        
        return answer;
    }
    
    
    //문자 반복 출력하기
    //문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어 있는 각 문자를
    //n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해 보세요.
    
    public String solution4(String my_string, int n) {
    	
        String answer = "";
        String[] arr = my_string.split("");
        
        for(int i=0; i < my_string.length(); i++){
            answer += arr[i].repeat(n);
        }
        
        return answer;
    }
    
	
    //특정 문자 제거하기
    //문자열 my_string과 문자 letter이 매개변수로 주어집니다.
    //my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해 주세요.
    


    public String solution5(String my_string, String letter) {
        String answer = "";

        answer = my_string.replace(letter, "");

        return answer;
    }
    
    public String solution5_1(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }
    
    
    //인덱스 바꾸기
    //문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
    //my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을
    //return 하도록 solution 함수를 완성해 보세요.
    
    public String solution6(String my_string, int num1, int num2) {
        String answer = "";
        String[] arr = my_string.split("");
        
        for (int i = 0; i < arr.length; i++) {
            if (i == num1) {
                answer += arr[num2];
            }
            
            else if (i == num2) {
                answer += arr[num1];
            }
            
            else {
                answer += arr[i];
            }
        }
        
        return answer;
    }
    
    
    //직각삼각형 출력하기
    //"*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고 합니다.
    //정수 n이 주어지면 높이와 너비가 n인 직각 이등변 삼각형을 출력하도록 코드를 작성해 보세요.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String star = "*";
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(star);
            }
            
            System.out.println();
        }
    }
    
    
    //최댓값 만들기 (2)
    //정수 배열 numbers가 매개변수로 주어집니다.
    //numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해 주세요.

    public int solution8(int[] numbers) {
        
        //오름차순으로 정렬시켜서 뒤에서 2개 곱하면 됨
        //그런데 마이너스랑 마이너스 곱하면 플러스인데..
        //앞에서 2개 곱한 거랑 뒤에서 곱한 거 2개 비교
        
        int answer = 0;
        
        Arrays.sort(numbers); //오름차순 정렬
        
        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        if (num1 > num2) {
            answer = num1;
        } else {
            answer = num2;
        }
        
        return answer;
    }
    
    
    //n의 배수 고르기
    //정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
    //numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해 주세요.
    
    public int[] solution9(int n, int[] numlist) {
        int[] arr = new int[numlist.length];
        int count = 0;
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                arr[count] = numlist[i];
                count++;
            }
        }
        
        int[] answer = new int[count];
        
        for(int i = 0; i < count; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
    
    //stream 사용하면 코드가 엄청 깔끔해짐
    public int[] solution9_1(int n, int[] numList) {
        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
    }
    
    
    //주사위의 개수
    //머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다.
    //상자의 가로, 세로, 높이가 저장되어 있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때,
    //상자에 들어갈 수 있는 주사위의 최대 개수를 return 하도록 solution 함수를 완성해 주세요.
    
    public int solution10(int[] box, int n) {
        int answer = 0;
        
        int x = box[0] / n;
        int y = box[1] / n;
        int z = box[2] / n;
        
        answer = x * y * z;
        
        return answer;
    }


}