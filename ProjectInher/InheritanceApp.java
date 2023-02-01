class Cal  {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	
	//Overloding : 상속과는 별개, 자식이 가질 수도 있음 .
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2)+ v3; // 자기자신을 가르킴.
	}
	
}
//Cal: 부모 클래스, Cal3: 자식 클래스
class Cal3 extends Cal {
	public int minus(int v1, int v2) {
		return v1 - v2;
	}
	//Override(Overriding): 부모가 가진 것을 재정의
	public int sum(int v1, int v2) {
		System.out.println("Cal3!!");
		return super.sum(v1, v2); // 부모클래스의 sum을 가르킴.
	}
}

public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1));

		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(2, 1));
		System.out.println(c3.minus(2, 1));
		System.out.println(c3.sum(2, 1));

	}

}
