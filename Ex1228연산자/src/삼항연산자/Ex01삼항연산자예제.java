package 삼항연산자;

import java.util.Scanner;

public class Ex01삼항연산자예제 {

	public static void main(String[] args) {
		
		// 삼항연산자
		// 조건문 ? 실행문 1 : 실행문 2
		// ---> 조건문이 참이라면 실행문 1을 실행
		// ---> 조건문이 참이라면 실행문 2을 실행
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 4;
		int num2 = 7;
		
		String result = num1<num2 ? "num2가 더 크다" : "num1이 더 크다";
		
		System.out.println(result);
		
		
		
		
		
		

	}

}
