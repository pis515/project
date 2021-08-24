import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
public class bak10845 {
	public static void main(String args[]) throws IOException {
		
		Queue<Integer> queue = new LinkedList();
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int back = -1;
		
		for(int i = 0 ; i < number ; i ++) {
			String command = scanner.next();
			switch(command){
			case "push":
				int X = scanner.nextInt();
				queue.add(X);
			case "pop":
				if(queue.isEmpty()) {
					System.out.println(-1);
				}else {
					queue.poll();
				}
			case "size":
				System.out.println(queue.size());
			case "empty":
				if(queue.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			case "front":
				if(queue.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(queue.peek());
				}
			case "back":
				if(queue.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(back);	
				}		
		} // switch문 종료
			
		} //for문 종료
	}

}
*/


/*
 import java.util.*;
import java.io.*;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<Integer>();
		int back = -1;
		for(int i = 0 ; i < N ; i ++) {
			st = new StringTokenizer(br.readLine());
			String type = st.nextToken();
			switch(type) {
			case "push":
				back = Integer.parseInt(st.nextToken());
				queue.offer(back);	
				break;
			case "pop":
				if(queue.isEmpty()) {
					sb.append("-1").append("\n");
					break;
				}
				sb.append(queue.poll()).append("\n");
				break;
			case "size":
				sb.append(queue.size()).append("\n");
				break;
			case "empty":
				sb.append(queue.isEmpty()? 1: 0).append("\n");
				break;
			case "front":
				sb.append(queue.isEmpty()? -1: queue.peek()).append("\n");
				break;
			case "back":
				sb.append(queue.isEmpty()? -1: back).append("\n");
				break;
				
			}
		}
		System.out.print(sb);
	}
}
 * /
 */

/*
 public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		LinkedList<Integer> queue = new LinkedList<>();
		for(int i = 0; i <number; i++) {
			String command = scanner.next();
			switch(command) {
				case "push":
					int x = scanner.nextInt();
					queue.add(x);
					break;
				case "pop":
					if (queue.isEmpty())
						System.out.println(-1);
					else
						System.out.println(queue.removeFirst());
					break;
				case "empty":
					if (queue.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				case "front":
					if (queue.isEmpty())
						System.out.println(-1);
					else
						System.out.println(queue.getFirst());
					break;
				case "back":
					if (queue.isEmpty())
						System.out.println(-1);
					else
						System.out.println(queue.getLast());
					break;
				case "size":
					System.out.println(queue.size());
					break;
			}
		}
	}
}
 * */
