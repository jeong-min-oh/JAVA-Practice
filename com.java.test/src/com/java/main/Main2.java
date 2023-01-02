package com.java.main;

import com.java.score.FinalScore;
import com.java.score.MiddleScore;

public class Main2 {

	public static void main(String[] args) {
		
		MiddleScore m = new MiddleScore();
		m.setHakbun("123456");
		m.setKor(89);
		m.setEng(90);
		m.setMath(76);
		m.setScien(90);
		m.avg();
		
		System.out.println(MiddleScore.LABEL);
		System.out.println(m);

		
		MiddleScore f = new FinalScore();
		f.setHakbun("123456");
		f.setKor(80);
		f.setEng(90);
		f.setMath(80);
		f.setScien(80);
		FinalScore ff = (FinalScore)f;
		ff.setKoreaHistory(80);
		ff.setWorldHistory(80);
		f.avg();
		
		System.out.println(FinalScore.LABEL);
		System.out.println(f);
		
		
	}

}
