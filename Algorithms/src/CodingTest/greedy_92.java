package CodingTest;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �̰��� �ڵ��׽�Ʈ�� p92
 * �׸��� - ū ���� ��Ģ
 * */

/*
public class Test {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //�迭��ũ��
		int M = sc.nextInt(); //���ڰ� �������� Ƚ��
		int K = sc.nextInt(); //���� ���� ��
		int sum = 0;
		
		int arr[] = new int[N] ;
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// ������������ ����
		Arrays.sort(arr);
		
		while(true) {
			for(int j=1; j<=K; j++) {
				if(M==0) break;
				sum += arr[N-1];
				M -= 1; //���� ������ 1�� ����
			}
			
			if(M==0) break;
			sum += arr[N-2]; //�ι�°�� ū �� �ѹ� ���ϱ�
			M -= 1; //���� ������ 1�� ����
		}		
		
		System.out.print(sum);
	}
}
*/
