package interface_test;

//interface : 클래스의 한 형태, 다중 상속 전용
//마린->지상,공격,테란
//드라군->지상,공격,프로토스


interface A01 { // 일종의 클래스
	// 변수 : 상수만 가능 (public static final) - 자동완성(JavaVertualMachine)
	public static final int A = 10;
	public static int B = 20;
	public final int C = 30;
	public int D = 20;
	int E = 50;

	// private int F = 60;
	// protected int G = 100;

	// 메소드 : 추상 메소드만 가능(public abstract)
	public abstract void info();

	public void info2();

	/*
	 * void info3{
	 * 
	 * }//몸통을 쓰게 되는 순간 에러난다. -> 추상 메소드만 가능
	 */

	// 클래스 : static 클래스만 가능
	class Test {

	}
}

//인터페이스는 어떻게 상속을 받는가
//같은 것들끼리는 extends
//다른 것들끼리는 implements

//인터페이스가 인터페이스를 상속받는 경우
interface B01 extends A01{
	
}

//클래스가 인터페이스를 상속받는 경우
class C01 implements A01, B01{
	public void info() {}
	public void info2() {}
}

//인터페이스가 클래스를 상속받는 경우 ------- 안된다
//상속 : 자식이 부모를 골라 내용을 받아오는 것
//하지만 인터페이스는 변하는 값을 가져서는 안되므로
//변하는 값을 가지는 클래스를 부모로 가질 수 없다.


public class Interface_01 {
	// E는 public static final 인가?
	public static void main(String[] args) {
		System.out.println(A01.E); // static

		// A01.E=100;//final

		// A01 인터페이스는 객체 생성이 불가능(생성자가 없다)
		// Test의 객체 생성

		A01.Test test = new A01.Test(); // static
	}
}