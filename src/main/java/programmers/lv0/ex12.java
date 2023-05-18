package programmers.lv0;

public class ex12 {
	
	//대문자로 바꾸기
	//알파벳으로 이루어진 문자열 myString이 주어집니다.
	//모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
	
    public String solution1(String myString) {
        return myString.toUpperCase();
    }
    
    
    //소문자로 바꾸기
    //알파벳으로 이루어진 문자열 myString이 주어집니다.
    //모든 알파벳을 소문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
    
    public String solution2(String myString) {
        return myString.toLowerCase();
    }
    
    
    //flag에 따라 다른 값 반환하기
    //두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때,
    //flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
    

    public int solution3(int a, int b, boolean flag) {
    	return flag ? a + b : a - b;
    }
    
    
    //정수 부분
    //실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해 주세요.
    
    public int solution4(double flo) {
        return (int) flo;
    }
    
    
    //공배수
    //정수 number와 n, m이 주어집니다.
    //number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해 주세요.
    
    public int solution5(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
    
    
    //문자열을 정수로 변환
    //숫자로만 이루어진 문자열 n_str이 주어질 때, n_str을 정수로 변환하여 return하도록 solution 함수를 완성해 주세요.
    
    public int solution6(String n_str) {
        return Integer.parseInt(n_str);
    }
    
    
    //문자열로 변환
    //정수 n이 주어질 때, n을 문자열로 변환하여 return하도록 solution 함수를 완성해 주세요.
    
    public String solution7(int n) {
        return Integer.toString(n);
    }
    
    
    //n의 배수
    //정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해 주세요.
    
    public int solution8(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
    
    
    //길이에 따른 연산
    //정수가 담긴 리스트 num_list가 주어질 때,
    //리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을
    //10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해 주세요.
    
    public int solution9(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1; //0으로 곱하면 0이 되기 때문에 1로 해야 함
        
        if (num_list.length >= 11) {
            for (int i = 0; i < num_list.length; i++) {
                sum += num_list[i];
            }
            answer = sum;
        } else {
            for (int i = 0; i < num_list.length; i++) {
                mul *= num_list[i];
            }
            answer = mul;
        }
        
        return answer;
    }
    
    //조금 더 깔끔하게 바꾸면
    
    public int solution9_1(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length >= 11) {
                sum += num_list[i];
                answer = sum;
            } else {
                mul *= num_list[i];
                answer = mul;
            }
        }
        
        return answer;
    }
    
    
    //정수 찾기
    //정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해 주세요.
    
    public int solution10(int[] num_list, int n) {
        int answer = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n) {
                answer = 1;
                break;
            } else {
                answer = 0;
            }
        }
        return answer;
    }

    
}