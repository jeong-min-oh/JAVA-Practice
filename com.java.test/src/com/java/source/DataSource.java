package com.java.source;

import java.util.Scanner;

import com.java.score.MiddleScore;

public class DataSource {
	

	private MiddleScore[] scores;
	private int select;
	private Scanner sc = new Scanner(System.in);
	
	public MiddleScore[] getScores() {
		return scores;
	}
	public void setScores(MiddleScore[] scores) {
		this.scores = scores;
	}
	public int getSelect() {
		return select;
	}
	public void setSelect(int select) {
		this.select = select;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	
}
