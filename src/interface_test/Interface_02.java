package interface_test;
//스타크래프트

class Zergunit{/*종족 공통 특성*/}
class Terranunit{/*종족 공통 특성*/}
class Protossunit{/*종족 공통 특성*/}

interface FlyingUnit{
	//비행 유닛
	void fly();
}
interface GroundUnit{
	//지상 유닛
	void walk();
}
interface Worker{
	void gether();
	//일 꾼
}


//질 럿 : 프로토스 , 지상유닛

class Zealot extends Protossunit implements GroundUnit{
//질럿은 프로토스와 지상 유닛의 특성을 가진다.	
	public void walk(){ // 자식이라면 무조건 가져야 한다.
		System.out.println("질럿이 빠르게 걷는다.");
	}
}

class Dragoon extends Protossunit implements GroundUnit{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("드라군이 느리게 걷는다.");
	}
	
}


class Probe extends Protossunit implements Worker{
	public void gether(){
		System.out.println("프로브가 돈을 캐와요");
	}
}


public class Interface_02 {
	public static void main(String[] args) {
		//지상 유닛 12마리 저장할 배열 생성
		GroundUnit[] arr = new GroundUnit[12];
		
		//랜덤 부대지정
		for(int i=0; i<arr.length; ++i){
			int su = (int)(Math.random()*2)+1; // 1~2
			
			if(su==1){
				arr[i] = new Zealot();
			}else{
				arr[i]= new Dragoon();
			}
		}
		
		//단체로 이동
		for (int i = 0; i < arr.length; ++i) {
			arr[i].walk();
		}
	}
}
