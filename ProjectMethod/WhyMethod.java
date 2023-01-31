import java.io.FileWriter;

public class WhyMethod {

	public static void main(String[] args) {
		
		System.out.println(twoTimes("a","-"));
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a","-"));
		fw.close();
		printT
	
	}
											//매개변수, parameter
	public static void printTwoTimes(String text, String delimeter) {
		System.out.println(delimeter);
		System.out.println(text);
		System.out.println(text);
	}
	
	
