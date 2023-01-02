package com.java.input;

import java.util.Scanner;

import com.java.score.FinalScore;
import com.java.score.MiddleScore;

public class InputScore {
	
	public static void inputData(Scanner sc, int select,MiddleScore[] scores) {

		System.out.println("1. �߰���� 2. �⸻���");
		System.out.print("�����ϼ���.");
		select = Integer.parseInt(sc.nextLine());
		if (select == 1) {
			System.out.print("�߰���� �л��� : ");
		} else if (select == 2) {
			System.out.print("�⸻��� �л��� : ");
		}

		int studentNum = Integer.parseInt(sc.nextLine());
		// ���
		scores = new MiddleScore[studentNum];

		if (select == 1) {
			for (int i = 0; i < scores.length; i++) {
				scores[i] = new MiddleScore();
			}

		} else if (select == 2) {
			for (int i = 0; i < scores.length; i++) {
				scores[i] = new FinalScore();
			}
		}

		// Data �Է�
		for (int i = 0; i < scores.length; i++) {
			System.out.print("�й��� �Է��Ͻÿ�.(6�ڸ�)");
			scores[i].setHakbun(sc.nextLine());

			System.out.print("���� ���� : ");
			scores[i].setKor(Integer.parseInt(sc.nextLine()));
			System.out.print("���� ���� : ");
			scores[i].setEng(Integer.parseInt(sc.nextLine()));
			System.out.print("���� ���� : ");
			scores[i].setMath(Integer.parseInt(sc.nextLine()));
			System.out.print("���� ���� : ");
			scores[i].setScien(Integer.parseInt(sc.nextLine()));

			if (select == 2) {
				FinalScore ff = (FinalScore) scores[i];
				System.out.print("�ѱ��� ���� : ");
				ff.setKoreaHistory(Integer.parseInt(sc.nextLine()));
				System.out.print("����� ���� : ");
				ff.setWorldHistory(Integer.parseInt(sc.nextLine()));
			}
			System.out.println();
			scores[i].avg();

		}

	}
}
