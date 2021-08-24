package CodingTest;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 이것이 코딩테스트다 p92
 * 그리디 - 큰 수의 법칙
 * */

/*
public class Test {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //배열의크기
		int M = sc.nextInt(); //숫자가 더해지는 횟수
		int K = sc.nextInt(); //연속 가능 수
		int sum = 0;
		
		int arr[] = new int[N] ;
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 오름차순으로 정렬
		Arrays.sort(arr);
		
		while(true) {
			for(int j=1; j<=K; j++) {
				if(M==0) break;
				sum += arr[N-1];
				M -= 1; //더할 때마다 1씩 빼기
			}
			
			if(M==0) break;
			sum += arr[N-2]; //두번째로 큰 수 한번 더하기
			M -= 1; //더할 때마다 1씩 빼기
		}		
		
		System.out.print(sum);
	}
}
*/
