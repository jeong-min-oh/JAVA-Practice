package com.java.input;

import java.util.Scanner;

import com.java.score.FinalScore;
import com.java.score.MiddleScore;

public class InputScore {
	
	public static void inputData(Scanner sc, int select,MiddleScore[] scores) {

		System.out.println("1. 중간고사 2. 기말고사");
		System.out.print("선택하세요.");
		select = Integer.parseInt(sc.nextLine());
		if (select == 1) {
			System.out.print("중간고사 학생수 : ");
		} else if (select == 2) {
			System.out.print("기말고사 학생수 : ");
		}

		int studentNum = Integer.parseInt(sc.nextLine());
		// 몇명
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

		// Data 입력
		for (int i = 0; i < scores.length; i++) {
			System.out.print("학번을 입력하시오.(6자리)");
			scores[i].setHakbun(sc.nextLine());

			System.out.print("국어 점수 : ");
			scores[i].setKor(Integer.parseInt(sc.nextLine()));
			System.out.print("영어 점수 : ");
			scores[i].setEng(Integer.parseInt(sc.nextLine()));
			System.out.print("수학 점수 : ");
			scores[i].setMath(Integer.parseInt(sc.nextLine()));
			System.out.print("과학 점수 : ");
			scores[i].setScien(Integer.parseInt(sc.nextLine()));

			if (select == 2) {
				FinalScore ff = (FinalScore) scores[i];
				System.out.print("한국사 점수 : ");
				ff.setKoreaHistory(Integer.parseInt(sc.nextLine()));
				System.out.print("세계사 점수 : ");
				ff.setWorldHistory(Integer.parseInt(sc.nextLine()));
			}
			System.out.println();
			scores[i].avg();

		}

	}
}
