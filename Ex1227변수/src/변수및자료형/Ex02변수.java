package 변수및자료형;

import java.util.Scanner;

public class Ex02변수 {
	// main을 못 만들었다면, main ctrl space - > 자동완성
	public static void main(String[] args) {

		// 변수 선언
		// 정수 데이터 4를 담을 수 있는 num 변수 선언
		// 자료형 변수명 = 값;
		int num = 4;
		// 변수를 사용하는 이유는 재사용하기 위해서이다.
		System.out.println(num);
		
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> ");
		// 2. 정수형 숫자 입력 받기
		
		int input = sc.nextInt();
		// 3. 입력받는 숫자 출력하기
		System.out.println(input);
		
		// 상수 선언 = final 키워드 사용
		final int num2 = 3;
		System.out.println(num2);
		
		//변수에 들어가는 값 변경
		num = 14;
		System.out.println(num);
				
		// 변수명은 중복 설정 불가능
		// 변수명 짓기 사이트 참고
		
		
		
		
		
		
	}

}
