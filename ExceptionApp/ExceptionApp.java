public class ExceptionApp {

	public static void main(String[] args) {
		/*
		 * System.out.println(1); int[] scores = { 10, 20, 30 }; try {
		 * System.out.println(scores[3]); // 범위에 값 없음. } catch
		 * (ArrayIndexOutOfBoundsException e) { System.out.println("범위에 없는 값이네요!"); }
		 * try { System.out.println(2 / 0); // 계산 불가. } catch (ArithmeticException e) {
		 * System.out.println("없는 값이네요!"); }
		 * 
		 * System.out.println(3); }
		 */

		// 두개의 try,catch문을 합쳐보자!
		System.out.println(1);
		int[] scores = { 10, 20, 30 };
		try {
			System.out.println(2);
			// System.out.println(scores[3]); // 범위에 값 없음.
			System.out.println(3);
			System.out.println(2 / 0); // 계산 불가.
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println("계산이 잘못된 것 같아요." + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("뭔가 이상합니다. 오류가 발생했습니다.");
		}
		System.out.println(5);
	}

}
