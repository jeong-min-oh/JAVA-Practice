package com.java.score;

public class FinalScore extends MiddleScore {
	public final static String LABEL=
				"�Ҽ�\t\t\t�й�\t����\t����\t����\t����\t����\t�����\t����\t���\t����";
	
	private int koreaHistory=0;
	private int worldHistory=0;	
		
	@Override
	public void total() {
		super.total(); // 4���� �ջ�
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
