package lecture_challenges;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class MultithreadC extends Thread {
	static Deque<Integer> deque = new ArrayDeque<Integer>();
	
	static void randomG() {
		Random rx = new Random();
		
		
		for (int i = 0; i<=4; i++) {
			int rand_int = rx.nextInt(10000);
			deque.add(rand_int);
			}
			System.out.println(deque);
	}
	static void primeDq() {
		if (isPrime(deque.peekLast()));
	}
	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} for(int i = 2; i <= n/2 ; i++) {
			if (n% i == 0) {
				return false;
			}
		}return true;
		
	}public static void main(String[] args) {
	}
}
