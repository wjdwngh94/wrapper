package wrapper_package;

/*
 * Integer 클래스 문제
 * 2가지 생성자를 모두 이용하여 객체 생성 후 출력
 * 
 * int 의 최대값, 최소값 출력
 * 
 * "1521"이라는 문장을 int 형 값으로 변환 후 + 100 
 * 계산한 뒤의 값 화면에 출력
 */

public class Wrapper_02 {
	public static void main(String[] args) {
		Integer a = new Integer("1521");
		a += 100;
		System.out.println(a);

		Integer b = new Integer(100);
		Integer c = new Integer(100);

		if (b.equals(c)) {
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}
	}

}
