/**
 *  ������ ������ �� �ϳ��� �������� �ϳ��� �ڷ����� �����ϴ�.
 *  �������� ������ �����ϴ�.
 *  
 *  ������ �޸�(RAM)�� ���� ����ϱ� ���� ����
 *  - ������ ���� : �޸� ������ �����͸� ������ �� �ִ� ������ �Ҵ��ϴ� ��
 *  
 *  ���������� :
 *  	1) �ڷ��� ������;
 *  	2) �ڷ��� ������ = ��;
 *  
 *  �ڷ��� (�� , ���� , ����)
 *  �� : boolean
 *  ���� : char , String
 *  ���� : double, byte, int, long, float, short
 */

public class Variable {
	
	public static void main(String[] args) {
		
		int age = 31;
		
		System.out.println("���� : " + age);
		
		int month = 8;
		int day = 28;
		
		System.out.println(month + "�� " + day + "��");

		String date = "��";
		
		System.out.println(month + date + day + "��");
		
		// �ڽ��� �̸��� �� ���� ���� ������ ����� ���ô�.
		// 1)
		String name = "����ȯ";
		int now_month = 8;
		int now_day = 28;
		
		System.out.println(now_month + date + now_day + "��" + name);
		
		// 2)
		name = "����ȯ";
		month = 8;
		day = 28;
		
		System.out.println(month + date + day + "��" + name);
		
		//1. �ڷ��� ������;
		int number1;
		number1 = 100;
		System.out.println("number1 : " + number1);
		
		number1 = 200; // �������� ������ �����ϴ�.
		System.out.println("number1(����) : " + number1);
		
		//2. �ڷ��� ������ = ������;
		int number2 = 300;
		System.out.println("number2 : " + number2);
			
		number2 = 500;
		System.out.println("number2(����) : " + number2);
		
		String name1 = "JAVA";
		System.out.println("name1 : " + name1);
		
		name1 = "Hi Java";
		System.out.println("name1(����) : " + name1);
		

		// ���� ���ϱ�		
		int a = 10;
		int b = 20;
		// ���ϱ�
		System.out.println("���ϱ� : " + (a + b));

		// ���� ����(������ �ȿ� ���ڸ� �ְ� ���ϱ� ���� ���ϱ� ������ �ֱ�		
		int number5 = 8;
		int number6 = 9;
		// ���ϱ�
		System.out.println("���ϱ� : " + (number5 + number6));
		// ���ϱ�
		System.out.println("���ϱ� : " + (number5 * number6));
		// ����
		System.out.println("���� : " + (number5 - number6));
		// ������
		System.out.println("������ : " + (number6 / number5));
		// ������
		System.out.println("������ : " + (number6 % number5));
	}
}
