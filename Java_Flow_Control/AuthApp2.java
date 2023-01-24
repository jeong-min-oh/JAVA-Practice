
public class AuthApp2 {

	public static void main(String[] args) {

		String id = "mini";
		String inputId = args[0];

		String pwd = "1111";
		String pwd2 = "2222";
		String inputPwd = args[1];

		System.out.println("Hi!!");

		// if(id == inputId) {

		/*
		 * if (inputId.equals(id)) { if (inputPwd.contentEquals(pwd)) {
		 * System.out.println("Good Morning!!"); } else {
		 * System.out.println("Wrong Password!!"); } } else {
		 * System.out.println("Who are you??"); }
		 */

		if (inputId.equals(id) && inputPwd.equals(pwd) || inputPwd.equals(pwd2)) {
			System.out.println("Good Morning!!");
		} else {
			System.out.println("Who are you??");
		}
	}

}
 