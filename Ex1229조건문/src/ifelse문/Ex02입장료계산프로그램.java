package ifelse문;

import java.util.Scanner;

public class Ex02입장료계산프로그램 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===에버랜드에 오신 걸 환영합니다!===");
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("인원수를 입력하세요 : ");
		int people = sc.nextInt();
		
		// 지역변수(local variable)
		// : {}영역(scope) 안에서 생성된 변수는 중괄호 안에서만 적용되기에
		//  전체에 적용하기 위하여 사용
		
		
		if(age>20) {
			System.out.println("총"+ people * 5000 +"원입니다.");
		}else{
			System.out.println("총"+ people * 2500 +"원입니다.");
		}
		
		
		
		
		
		
		

	}

}
