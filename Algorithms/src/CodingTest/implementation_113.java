package CodingTest;

import java.util.Scanner;

/*
 * �ս��� ����Ʈ
 * ���̵� �� / 20��
 * */

/*
public class implementation_113 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// ��ǥ���Է�
		String input = sc.next();
		int x = input.charAt(0)-'a'+1;
		int y = input.charAt(1)-'0';
		
		//����Ʈ�� �� �� �ִ� ����
		//(2,1),(2,-1),(-2,1),(-2,-1),(1,2),(1,-2),(-1,2),(-1,-2)
		int stepX[] = {2,2,-2,-2,1,1,-1,-1};
		int stepY[] = {1,-1,1,-1,2,-2,2,-2};
		
		int count = 0;
		
		//8���� ���� üũ
		for(int i=1; i<=8; i++) {
			int nextX = x + stepX[i];
			int nextY = y + stepY[i];
			
			if(nextX >=1 && nextX <= 8 && nextY >=1 && nextY <= 8) {
				count++;
			}
		}
	
		System.out.print(count);
	
	
	}
}
*/
