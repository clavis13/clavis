package 삼항연산자;

import java.util.Scanner;

public class Ex02삼항연산자예제2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		String result = (num%2 == 1) ? num +"는(은) 홀수입니다": num +"는(은) 짝수입니다";
		
		
		System.out.println(result);
		//System.out.println(num+"은(는)"+ result +"입니다");
		
		

	}

}
