package 변수및자료형;

public class Ex04자료형 {

	public static void main(String[] args) {
		
		// 자바의 기본 자료형
		
		// 1. 논리 자료형 : boolean(1byte) (참/거짓을 저장하는 자료형)
		// 참이라는 데이터를 저장하는 bool 변수 선언
		boolean bool = true;
		bool = false;
		System.out.println(bool);
		
		// 2. 문자 자료형 : char(2byte)
		// '' 사용, 한 글자만 들어갈 수 있다.
		char name = '박';
		
		// 문자열 자료형(기본 자료형x)
		// String : "" 사용, 여러 글자 사용 가능.
		String name2 = "박준범";
		
		System.out.println(name);
		System.out.println(name2);
		
		// 3. 정수 자료형 : byte(1byte),short(2byte),int(4byte),long(8byte)
		// 데이터의 크기는 표현할 수 있는 범위를 뜻함 (정수 입력 시 Java는 기본적으로 int로 인식)
		
		// 강제 형변환(명시적 형변환) : 큰 크기의 자료형에서 더 작을 자료형으로 변환할 때 사용,
		//       단 데이터의 손실이 발생할 수 있기에 정확하게 ()를 사용하여 손실이 일어나도 괜찮다고 명시
		
		byte num1 = (byte) 128;
		
		// 자동 형변환(묵시적 형변환) : 작은 크기의 자료형이 자동으로 큰 크기의 자료형으로 형 변환
		
		long num2 = 1000;
		
		System.out.println(num1);
		System.out.println(num2);
		
		// 4. 실수형
		// float(4byte), 기본값 : double(8byte)
		double num3 = 3.14;
		float num4 = (float) 3.14;
		float num5 = 3.14f;
		
		System.out.println(num5);
		
		
		
		
		
		
	}
}
