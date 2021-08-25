package CodingTest;

import java.util.Scanner;

/*
 * 게임개발
 * 난이도 중 / 40분
 * 저자 git: https://github.com/ndb796/python-for-coding-test/blob/master/4/4.java
 * */

public class implementation_118 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 맵 세로
		int M = sc.nextInt(); // 맵 가로
		int count = 1;
		int turn_time = 0; //방향 턴 횟수
		
		sc.nextLine();
		int A = sc.nextInt(); // 캐릭터가 있는 좌표 x
		int B = sc.nextInt(); // 캐릭터가 있는 좌표 y
		int d = sc.nextInt(); // 캐릭터가 바라보는 방향
		
		int map[][] = new int[N][M];
		
		// 맵 정보 입력받기
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		// 이동할 방향 북(-1,0),동(0,1),남(1,0),서(0,-1)
		int dx[] = {-1,0,1,0};
		int dy[] = {0,1,0,-1};
		
		
		/* 시뮬레이션 시작 */
		while(true) {			
				
			int nextA = A + dx[d];
			int nextB = B + dy[d];
			
			//바다가 아니고, 가보지 않은 좌표면 이동
			if(map[nextA][nextB] == 0) {
				map[A][B] = 2; // 기존좌표 2로 표기하고 이동
				count++;
				
				A = nextA;
				B = nextB;
				
				turn_time = 0;
				
				continue;
			}else {
				d--; //왼쪽방향으로 회전
				if(d==-1) d=3;
				turn_time++;
			}
			
			// 네 방향 모두 갈 수 없는 경우
			if(turn_time==4) {
				nextA = A - dx[d];
				nextB = B - dy[d];
				
				//뒤로 갈 수 있다면 이동하기
				if(map[nextA][nextB] == 0) {
					A = nextA;
					B = nextB;
				}else {
					turn_time = 0;
					break;
				}
			}			
							
		}
		
		System.out.print(count);	
	}
}
