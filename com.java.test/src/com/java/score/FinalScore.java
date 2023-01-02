package com.java.score;

public class FinalScore extends MiddleScore {
	public final static String LABEL=
				"소속\t\t\t학번\t국어\t영어\t수학\t과학\t국사\t세계사\t총점\t평균\t석차";
	
	private int koreaHistory=0;
	private int worldHistory=0;	
		
	@Override
	public void total() {
		super.total(); // 4과목 합산
		super.setTotal(super.getTotal()+koreaHistory+worldHistory);
	}
	
	@Override
	public void avg() {
		this.total();
		super.setAvg((super.getTotal()*10/6)/10f);
	}
	
	
	public int getKoreaHistory() {
		return koreaHistory;
	}

	public void setKoreaHistory(int koreaHistory) {
		this.koreaHistory = koreaHistory;
	}

	public int getWorldHistory() {
		return worldHistory;
	}

	public void setWorldHistory(int worldHistory) {
		this.worldHistory = worldHistory;
	}

	@Override
	public String toString() {
		return sosok+"\t" 
				+ "\t"+this.getHakbun() 
				+ "\t"+this.getKor()
				+ "\t"+this.getEng()
				+ "\t"+this.getMath()
				+ "\t"+this.getScien()
				+ "\t"+this.koreaHistory
				+ "\t"+this.worldHistory
				+ "\t"+this.getTotal()
				+ "\t"+this.getAvg()
				+ "\t"+this.getRank();
				
	}
}
