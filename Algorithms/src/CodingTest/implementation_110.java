package CodingTest;

import java.util.Scanner;

/*
public class implementation_110 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt() ; //������ũ��
		sc.nextLine();
		
		//����
		//int map[][] = new int[N][N];
		
		//�̵���ȹ�Է�
		String move = sc.nextLine();
		String[] plan = move.split("");
		
		//��ǥ �ʱ�ȭ
		int x=1;
		int y=1;
		
		for(int i=0; i<plan.length; i++) {
			if("L".equals(plan[i])) {
				y -= 1;
				if(y==0) y+=1;
			}else if("R".equals(plan[i])){
				y += 1;
				if(y==N+1) y-=1;
			}else if("U".equals(plan[i])){
				x -= 1;
				if(x==0) x+=1;
			}else if("D".equals(plan[i])){
				x += 1;
				if(x==N+1) x-=1;
			}
		}
				
		System.out.printf("%d,%d", x,y);
		 
	}

}
*/