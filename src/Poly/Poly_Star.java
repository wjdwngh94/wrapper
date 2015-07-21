package Poly;

import java.util.Scanner;

//추상 클래스랑 클래스의 형태를 규정하는 상위 클래스이다.
abstract class Terran {
	// 추상 클래스 : 추상 메소드를 한개 이상 가진 클래스
	// 반드시 추상(abstract) 클래스임을 표기하여야 한
	public abstract void attack(); // 추상 메소드

	/*
	 * { System.out.println("공격 해라 ~~~~~"); System.out.println("이게 실행되면 망한거야~");
	 * }
	 */

	public abstract void move(); // 추상 메소드
	/*
	 * { System.out.println("이동 해라 ~~~~~"); System.out.println("이게 실행되면 망한거야~");
	 * }
	 */
}

class Marine extends Terran {
	public void attack() {
		System.out.println("마린 공격 해라 ~~~~~");
	}

	public void move() {
		System.out.println("마린 이동 해라 ~~~~~");
	}// 부모의 동일한내용을 오버라이징
}

class Tank extends Terran {
	public void attack() {
		System.out.println("탱크 공격 해라 ~~~~~");
	}

	public void move() {
		System.out.println("탱크 이동 해라 ~~~~~");
	}
}

public class Poly_Star {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. 마린 2. 탱크 : ");
		int sel1 = sc.nextInt();

		System.out.println("1. 공격 2. 이동 : ");
		int sel2 = sc.nextInt();

		// 다양성 사용시
		Terran unit = null; // 초기에 값이 정해지지 않았으므로 null
		if (sel1 == 1) {
			unit = new Marine();
		} else if (sel1 == 2) {
			unit = new Tank();
		}
		if (sel2 == 1) {
			unit.attack();
		} else if (sel2 == 2) {
			unit.move();
		}

		// 다양성 미사용시
		/*
		 * if(){ if(){ } else if(){ } } else if(){ if(){ } else if(){ } }
		 */
	}
}

//부모를 하나만 존재할 수 없는 이유