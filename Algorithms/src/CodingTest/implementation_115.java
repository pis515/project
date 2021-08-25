package CodingTest;

import java.util.Scanner;

public class implementation_115 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt(); //시간입력
		int count = 0;

		for(int h=0; h<hour+1; h++) {
			for(int m=0; m<60; m++) {
				for(int s=0; s<60; s++) {
					if( (Integer.toString(h) + Integer.toString(m)+ Integer.toString(s)).contains("3") ) {
						count++;
					}
				}
			}
		}
		
		System.out.print(count);	
	}
}
