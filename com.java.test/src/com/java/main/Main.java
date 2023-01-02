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
		// �л��� ��ŭ MiddleScore �ν��Ͻ��� ����
		DataSource source = new DataSource();		
		
		boolean flag = true;
		boolean flag2 = true;
		while (flag) {

			InputScore.inputData(source.getSc(), source.getSelect(),source.getScores());
			ProcessScore.processData(source.getScores());
			OutputScore.outputData(source.getSelect(), source.getScores());
			
			Scanner sc=source.getSc();
			
			do { // �Է¹޴� ���Ϲ�.
				System.out.println("�����Ͻðڽ��ϱ�? (y/n)");
				char game = sc.nextLine().charAt(0);
				if (game == 'y' || game == 'Y') {
					flag = false;
					flag2 = false;
					System.out.println("����Ǿ����ϴ�.");
				} else if (game == 'n' || game == 'N') {
					flag2 = false;
				} else
					System.out.println("�ٽ��Է����ּ���.");
			} while (flag2);
			// flag - ��ü ���Ϲ� �����ϱ�
			// flag2 - �Է¹޴� ���Ϲ��� �����ϱ�

		}

	}

	


}
