public class ExceptionApp {

	public static void main(String[] args) {
		/*
		 * System.out.println(1); int[] scores = { 10, 20, 30 }; try {
		 * System.out.println(scores[3]); // ������ �� ����. } catch
		 * (ArrayIndexOutOfBoundsException e) { System.out.println("������ ���� ���̳׿�!"); }
		 * try { System.out.println(2 / 0); // ��� �Ұ�. } catch (ArithmeticException e) {
		 * System.out.println("���� ���̳׿�!"); }
		 * 
		 * System.out.println(3); }
		 */

		// �ΰ��� try,catch���� ���ĺ���!
		System.out.println(1);
		int[] scores = { 10, 20, 30 };
		try {
			System.out.println(2);
			// System.out.println(scores[3]); // ������ �� ����.
			System.out.println(3);
			System.out.println(2 / 0); // ��� �Ұ�.
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println("����� �߸��� �� ���ƿ�." + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("���� �̻��մϴ�. ������ �߻��߽��ϴ�.");
		}
		System.out.println(5);
	}

}
