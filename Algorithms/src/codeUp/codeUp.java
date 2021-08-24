package codeUp;
import java.util.Scanner;

public class codeUp{
	/*
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[11][11];
		
		//미로 입력
		for(int i=1; i<11; i++) {
			for(int j=1; j<11; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//개미의 출발위치
		int x=2;
		int y=2;
		
		//반복
		for(int i=x; i<arr.length; i++) {
			for(int j=y; j<arr.length; j++) {
				if(arr[i][j] == 0) { //갈 수 있는 곳
					arr[i][j] = 9;
				}else if(arr[i][j] == 1) { //장애물
					// 아래쪽으로 이동
					x++; y=j-1;
					break;
				}else if(arr[i][j] == 2) { // 먹이
					arr[i][j] = 9;
					break;
				}
			}
		}		
		
		// 경로 출력
		for(int i=1; i<arr.length; i++) {
			for(int j=1; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); 
		}
	}
	*/
}

