package wrapper_package;

//Wrapper Class : 기본 자료형을 객체화 시킨 클래스


public class Wrapper_01 {
	public static void main(String[] args) {
		Boolean a = new Boolean(true); // boolean
		Boolean b = new Boolean("TRUE"); // String
		//new 가 있으면 data는 heap에 저장된더.
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		
		
		//위의 두개와 아래의 두개의 차이는?
		
		boolean c = true;
		boolean d = true;
		
		System.out.println("c = " +c);
		System.out.println("d = " +d);
		
		//객체는 비교대상이 주소이다.
		//값의 비교는 equal 로 하여야 한다.
		if(a == b){
			System.out.println("a와 b가 같다.");
		}else{
			System.out.println("a와 b는 다르다.");
		}
		
		//a.equals이므로 Boolean 객체 안에가진 부가 기능이다.
		if(a.equals(b)){
			System.out.println("a와 b가 같다.");
		}else{
			System.out.println("a와 b는 다르다.");
		}
		
		//기본자료
		if(c == d){
			System.out.println("c와 d가 같다");
		}else{
			System.out.println("c와 d는 다르다.");
		}
		
		//객체 <-> 기본자료형 데이터 간의 호환
		boolean e= a; // new Boolean(true)
		//auto - unboxing
		
		Boolean f = c; // true
		//auto - boxing
		
		//보관되는 형태가 Boolean 객체형이므로 f가 객체형이다.
		

		//미리 만들어진 상수 객체들도 존재한다.
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);

	}
}
