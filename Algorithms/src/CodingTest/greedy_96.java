package CodingTest;

import java.util.Scanner;

public class greedy_96 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 행의 개수
		int M = sc.nextInt();// 열의 개수
		
		int cards[][] = new int[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				cards[i][j] = sc.nextInt();
			}
		}
		
		
		int N_smallest = 0; //각 행 중 가장 작은 숫자
		int largest = 0; //각 행 중 가장 큰 숫자
		
		// 각 행 중 가장 작은 숫자 찾고
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(j ==0) {
					N_smallest  = cards[i][j]; // N_smallest의 초기값 작업
				}
				if(N_smallest > cards[i][j]) {
					N_smallest  = cards[i][j];
				}	
			}
			
			// 그 중 가장 큰 수 출력	
			if(largest < N_smallest) {
				largest = N_smallest;
			}
		}
		
		System.out.print(largest);
				
	}

}
