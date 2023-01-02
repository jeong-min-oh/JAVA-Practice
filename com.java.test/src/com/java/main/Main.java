package com.java.main;

import java.util.Scanner;

import com.java.input.InputScore;
import com.java.output.OutputScore;
import com.java.process.ProcessScore;
import com.java.source.DataSource;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	} // main()

	public void start() {
		// 학생수 만큼 MiddleScore 인스턴스를 생성
		DataSource source = new DataSource();		
		
		boolean flag = true;
		boolean flag2 = true;
		while (flag) {

			InputScore.inputData(source.getSc(), source.getSelect(),source.getScores());
			ProcessScore.processData(source.getScores());
			OutputScore.outputData(source.getSelect(), source.getScores());
			
			Scanner sc=source.getSc();
			
			do { // 입력받는 와일문.
				System.out.println("종료하시겠습니까? (y/n)");
				char game = sc.nextLine().charAt(0);
				if (game == 'y' || game == 'Y') {
					flag = false;
					flag2 = false;
					System.out.println("종료되었습니다.");
				} else if (game == 'n' || game == 'N') {
					flag2 = false;
				} else
					System.out.println("다시입력해주세요.");
			} while (flag2);
			// flag - 전체 와일문 통제하기
			// flag2 - 입력받는 와일문을 통제하기

		}

	}

	


}
