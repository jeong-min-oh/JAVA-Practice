package com.java.process;

import com.java.score.MiddleScore;

public class ProcessScore {
	

	public static void processData(MiddleScore[] scores) {
		// Ã³¸®
		MiddleScore temp;
		for (int i = 0; i < scores.length; i++) {
			for (int j = i + 1; j < scores.length; j++) {
				if (scores[i].getTotal() < scores[j].getTotal()) {
					temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;

				}

			}
		}
		for (int i = 0; i < scores.length; i++) {
			scores[i].setRank(i + 1);
		}

	}

}
