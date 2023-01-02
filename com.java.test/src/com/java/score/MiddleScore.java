package com.java.score;

public class MiddleScore {
	
	public final static String LABEL="소속\t\t\t학번\t국어\t영어\t수학\t과학\t총점\t평균\t석차";
	
	public static String sosok="SBS아카데미 I강의장";
	private static int sukcha = 0;
	
	private String hakbun="";
	
	private int kor=0;
	private int eng=0;
	private int math=0;
	private int scien=0;
	
	private int total=0;
	private float avg=0f;
	private int rank = 1;
	
	public MiddleScore() {}
	public MiddleScore(String hakbun, int kor, int eng, int math, int scien) {
		super();
		this.hakbun = hakbun;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.scien = scien;
		
	}



	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void total() {
		this.total = kor+eng+math+scien;
	}
	
	public void avg() {
		total();
		this.avg = (total*10/4)/10f; 
	}
	
		
	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScien() {
		return scien;
	}

	public void setScien(int scien) {
		this.scien = scien;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return sosok+"\t" 
				+ "\t"+this.hakbun 
				+ "\t"+this.kor
				+ "\t"+this.eng
				+ "\t"+this.math
				+ "\t"+this.scien
				+ "\t"+this.total
				+ "\t"+this.avg
				+ "\t"+this.rank;
	}
	
	
}





