class Cal  {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	
	//Overloding : ��Ӱ��� ����, �ڽ��� ���� ���� ���� .
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2)+ v3; // �ڱ��ڽ��� ����Ŵ.
	}
	
}
//Cal: �θ� Ŭ����, Cal3: �ڽ� Ŭ����
class Cal3 extends Cal {
	public int minus(int v1, int v2) {
		return v1 - v2;
	}
	//Override(Overriding): �θ� ���� ���� ������
	public int sum(int v1, int v2) {
		System.out.println("Cal3!!");
		return super.sum(v1, v2); // �θ�Ŭ������ sum�� ����Ŵ.
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
