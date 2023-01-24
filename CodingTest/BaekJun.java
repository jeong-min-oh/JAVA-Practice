import java.util.Scanner;

public class BaekJun {
	public static void main(String[] args) {
		//1번 문제 System.out.println("Hello World!");
 
		//int A, B;
		
		// sc = new Scanner(System.in);
		
		//A = sc.nextInt();
		//B = sc.nextInt();
		
		//System.out.println(A+B);
		//System.out.println(A-B);
		//System.out.println(A*B);
		//System.out.println(A/B);
		//System.out.println(A%B);
		
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println(sc.next() +"??!");
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("강한친구  대한육군");
		//System.out.println("강한친구  대한육군");
		
		//System.out.println("\\   /\\");
		//System.out.println(" ) ( ')");
		//System.out.println("( /  )");
		//System.out.println(" \\(__)|");
		
		//System.out.println("|\\_//|");
		//System.out.println("|q  p|   /}");
		//System.out.println("( 0  )\"\"\"\\");
		//System.out.println("|\"^\"'     | ");
		//System.out.println("||_//=\\\\__|");
		
		
		//Scanner sc = new Scanner(System.in);
		
		//int A,B,C;
		//A = sc.nextInt();
		//B = sc.nextInt();
		//C = sc.nextInt();
		
		//System.out.println((A+B)%C);
		//System.out.println(((A%C) + (B%C))%C);
		//System.out.println((A*B)%C);
		//System.out.println(((A%C)*(B%C))%C);
		
		
		//Scanner sc = new Scanner(System.in);
		
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		
		//System.out.println(a * (b%10));
		//System.out.println(a * (b%100) /10);
		//System.out.println(a * (b/100));
		//System.out.println(a*b);
		
		
		/*Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {
			System.out.println(">");
			
		}else if(A<B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		*/
		
		/*Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num>=90) {
			System.out.println("A");
			
		}else if(num>=80) {
			System.out.println("B");
		}else if(num>=70) {
			System.out.println("C");
		}else if(num>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		*/
		
		/*Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		//4의 배수 이면서 100의 배수가 아닐때 or 400의 배수일때 - 1
		
		if((num%4==0) && (num%100 !=0)||(num%400==0)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		*/
		
		
		//1사분면 x,y>0 2사분면 x<0 y>0 3사분면 x>0 y<0 4사분면 둘다음수
		
		/*Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("1");
		}else if(x<0 && y>0) {
			System.out.println("2");
		}else if(x>0 && y<0) {
			System.out.println("4");
		}else {
			System.out.println("3");
		}
		
		*/
		
		
		/*Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M<45) {
			M = M+60;
			H--;
			if(H<0) H=23;
				
			}
		System.out.println(H);
		System.out.println(M-45);
		*/
		
		
		
		/*Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N>=1 && N<=9) {
			for(int i =1; i<=9; i++) {
				System.out.println(N+"*"+i+"="+(N*i));
			}
			*/
		
		
		/*Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			System.out.println(A+B);
		}
		*/
		
		
		/*Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0; i<=n; i++) {
			sum = sum+i;
			System.out.println(sum);
		}
		*/
		
		
		/*Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<=N; i++) {
			System.out.println(N-i);
		}
		*/
		
		
		/*Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = sc.nextInt();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N-(i+1); j++) {
				System.out.print("");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		 */
		
		
		
		}
	}
