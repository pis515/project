package CodingTest;

import java.util.Scanner;

public class greedy_96 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // ���� ����
		int M = sc.nextInt();// ���� ����
		
		int cards[][] = new int[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				cards[i][j] = sc.nextInt();
			}
		}
		
		
		int N_smallest = 0; //�� �� �� ���� ���� ����
		int largest = 0; //�� �� �� ���� ū ����
		
		// �� �� �� ���� ���� ���� ã��
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(j ==0) {
					N_smallest  = cards[i][j]; // N_smallest�� �ʱⰪ �۾�
				}
				if(N_smallest > cards[i][j]) {
					N_smallest  = cards[i][j];
				}	
			}
			
			// �� �� ���� ū �� ���	
			if(largest < N_smallest) {
				largest = N_smallest;
			}
		}
		
		System.out.print(largest);
				
	}

}
