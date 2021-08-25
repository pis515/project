package CodingTest;

import java.util.Scanner;

/*
 * ���Ӱ���
 * ���̵� �� / 40��
 * ���� git: https://github.com/ndb796/python-for-coding-test/blob/master/4/4.java
 * */

public class implementation_118 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // �� ����
		int M = sc.nextInt(); // �� ����
		int count = 1;
		int turn_time = 0; //���� �� Ƚ��
		
		sc.nextLine();
		int A = sc.nextInt(); // ĳ���Ͱ� �ִ� ��ǥ x
		int B = sc.nextInt(); // ĳ���Ͱ� �ִ� ��ǥ y
		int d = sc.nextInt(); // ĳ���Ͱ� �ٶ󺸴� ����
		
		int map[][] = new int[N][M];
		
		// �� ���� �Է¹ޱ�
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		// �̵��� ���� ��(-1,0),��(0,1),��(1,0),��(0,-1)
		int dx[] = {-1,0,1,0};
		int dy[] = {0,1,0,-1};
		
		
		/* �ùķ��̼� ���� */
		while(true) {			
				
			int nextA = A + dx[d];
			int nextB = B + dy[d];
			
			//�ٴٰ� �ƴϰ�, ������ ���� ��ǥ�� �̵�
			if(map[nextA][nextB] == 0) {
				map[A][B] = 2; // ������ǥ 2�� ǥ���ϰ� �̵�
				count++;
				
				A = nextA;
				B = nextB;
				
				turn_time = 0;
				
				continue;
			}else {
				d--; //���ʹ������� ȸ��
				if(d==-1) d=3;
				turn_time++;
			}
			
			// �� ���� ��� �� �� ���� ���
			if(turn_time==4) {
				nextA = A - dx[d];
				nextB = B - dy[d];
				
				//�ڷ� �� �� �ִٸ� �̵��ϱ�
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
