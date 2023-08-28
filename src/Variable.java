/**
 *  변수를 선언할 때 하나의 변수명은 하나의 자료형만 가능하다.
 *  변수명은 재사용이 가능하다.
 *  
 *  변수란 메모리(RAM)에 값을 기록하기 위한 공간
 *  - 변수의 선언 : 메모리 공간에 데이터를 저장할 수 있는 공간을 할당하는 것
 *  
 *  변수선언방법 :
 *  	1) 자료형 변수명;
 *  	2) 자료형 변수명 = 값;
 *  
 *  자료형 (논리 , 문자 , 숫자)
 *  논리 : boolean
 *  문자 : char , String
 *  숫자 : double, byte, int, long, float, short
 */

public class Variable {
	
	public static void main(String[] args) {
		
		int age = 31;
		
		System.out.println("나이 : " + age);
		
		int month = 8;
		int day = 28;
		
		System.out.println(month + "월 " + day + "일");

		String date = "월";
		
		System.out.println(month + date + day + "일");
		
		// 자신의 이름과 월 일을 담은 변수를 만들어 봅시다.
		// 1)
		String name = "전종환";
		int now_month = 8;
		int now_day = 28;
		
		System.out.println(now_month + date + now_day + "일" + name);
		
		// 2)
		name = "전종환";
		month = 8;
		day = 28;
		
		System.out.println(month + date + day + "일" + name);
		
		//1. 자료형 변수명;
		int number1;
		number1 = 100;
		System.out.println("number1 : " + number1);
		
		number1 = 200; // 변수명은 재사용이 가능하다.
		System.out.println("number1(재사용) : " + number1);
		
		//2. 자료형 변수명 = 변수값;
		int number2 = 300;
		System.out.println("number2 : " + number2);
			
		number2 = 500;
		System.out.println("number2(재사용) : " + number2);
		
		String name1 = "JAVA";
		System.out.println("name1 : " + name1);
		
		name1 = "Hi Java";
		System.out.println("name1(재사용) : " + name1);
		

		// 변수 더하기		
		int a = 10;
		int b = 20;
		// 더하기
		System.out.println("더하기 : " + (a + b));

		// 변수 연산(변수명 안에 숫자를 넣고 더하기 빼기 곱하기 나누기 넣기		
		int number5 = 8;
		int number6 = 9;
		// 더하기
		System.out.println("더하기 : " + (number5 + number6));
		// 곱하기
		System.out.println("곱하기 : " + (number5 * number6));
		// 빼기
		System.out.println("빼기 : " + (number5 - number6));
		// 나누기
		System.out.println("나누기 : " + (number6 / number5));
		// 나머지
		System.out.println("나머지 : " + (number6 % number5));
	}
}
