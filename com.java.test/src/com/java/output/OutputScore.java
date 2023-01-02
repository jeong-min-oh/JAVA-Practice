package com.java.output;

import com.java.score.FinalScore;
import com.java.score.MiddleScore;

public class OutputScore {

	public static void outputData(int select,MiddleScore[] scores) {
		// Ãâ·Â
		if (select == 1) {
			System.out.println(MiddleScore.LABEL);
		}
		if (select == 2) {
			System.out.println(FinalScore.LABEL);
		}

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		System.out.println();
	}
}
