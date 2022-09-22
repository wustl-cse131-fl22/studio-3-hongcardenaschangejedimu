package studio3;

import java.util.Scanner;

public class SieveBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("What's your number?");
		int n = in.nextInt();
		
		boolean[] arr = new boolean[n];
		for (int i = 0; i < n; i++) {
			arr[i] = true;
//			System.out.println(arr[i]);
		}
		
		int nsqrt = (int) Math.sqrt(n);
		for (int i = 2; i < nsqrt+1; i++) {
			if (arr[i] == true) {
				for (int p = i*i; p < n; p += i) {
					arr[p] = false;
					System.out.println(p);
				}
			}
		}
		
		for (int i = 2; i < n; i++) {
			if (arr[i] == true) {
				System.out.print(i + " ");
			}
		}

	}

}
