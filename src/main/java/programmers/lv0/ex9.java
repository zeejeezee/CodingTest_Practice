package programmers.lv0;

import java.util.HashMap;
import java.util.Map;

public class ex9 {
	
	//종이 자르기
	//머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다.
	//예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
	//정수 M, N이 매개변수로 주어질 때,
	//M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return 하도록 solution 함수를 완성해 보세요.
	
	//규칙을 알면 쉽게 해결할 수 있다!
	//예시를 보면 M = 2, N = 2일 때 결과가 3이고 M = 2, N = 5일 때 결과가 9이므로
	//두 수를 곱해서 1을 뺀 게 결과인 것을 알 수 있다.
	
    public int solution1(int M, int N) {
        return M * N - 1;
    }
    
    
    //캐릭터의 좌표
    //머쓱이는 RPG게임을 하고 있습니다.
    //게임에는 up, down, left, right 방향키가 있으며 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다.
    //예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 [0, 1], down을 누른다면 [0, -1],
    //left를 누른다면 [-1, 0], right를 누른다면 [1, 0]입니다.
    //머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다.
    //캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return하도록 solution 함수를 완성해 주세요.

    //[0, 0]은 board의 정 중앙에 위치합니다.
    //예를 들어 board의 가로 크기가 9라면 캐릭터는 왼쪽으로 최대 [-4, 0]까지 오른쪽으로 최대 [4, 0]까지 이동할 수 있습니다.
    
    public int[] solution2(String[] keyinput, int[] board) {
        int[] answer = {0, 0}; //좌표가 (0, 0)으로 시작
        
        for (int i = 0; i < keyinput.length; i++) {
            switch(keyinput[i]) {
                case "up": answer[1]++;
                    break;
                case "down": answer[1]--;
                    break;
                case "left": answer[0]--;
                    break;
                case "right": answer[0]++;
                    break;
            }
            
            if(Math.abs(answer[0]) > board[0] / 2) {
                answer[0] += (answer[0] > 0) ? -1 : 1;
            }
            if(Math.abs(answer[1]) > board[1] / 2) {
                answer[1] += (answer[1] > 0) ? -1 : 1;
            }
        }
        
        return answer;
    }
    
    
    //직사각형 넓이 구하기
    //2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
    //직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
    //직사각형의 넓이를 return 하도록 solution 함수를 완성해 보세요.
    
    public int solution3(int[][] dots) {
        int width = 0;
        int height = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        
        for (int i = 1; i < dots.length; i++) {
            if (x != dots[i][0]) width = Math.abs(x - dots[i][0]);
            if (y != dots[i][1]) height = Math.abs(y - dots[i][1]);
        }
        
        return width * height;
    }
    
    
    //로그인 성공
    //머쓱이는 프로그래머스에 로그인하려고 합니다.
    //머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때,
    //다음과 같이 로그인 성공, 실패에 따른 메시지를 return하도록 solution 함수를 완성해 주세요.

    //아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return 합니다.
    //로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 “fail”를,
    //아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 “wrong pw”를 return 합니다.
    
    public String solution4(String[] id_pw, String[][] db) {
        Map<String, String> memberTable = new HashMap<>();
        
        for (int i = 0; i < db.length; i++) {
            memberTable.put(db[i][0], db[i][1]);
        }
        try {
            if (memberTable.get(id_pw[0]).equals(id_pw[1])) {
                return "login";
            } else if (!memberTable.get(id_pw[0]).equals(id_pw[1])) {
                return "wrong pw";
            } else {
                return "fail";
            }
        } catch (Exception e) {
            return "fail";
        }
    }



    
}