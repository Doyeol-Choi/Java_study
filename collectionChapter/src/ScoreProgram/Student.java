package ScoreProgram;

public class Student {
	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;
	private int totalScore;
	private double avgScore;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKorScore() {
		return korScore;
	}


	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}


	public int getEngScore() {
		return engScore;
	}


	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}


	public int getMathScore() {
		return mathScore;
	}


	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}


	public int getTotalScore() {
		return totalScore;
	}


	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}


	public double getAvgScore() {
		return avgScore;
	}


	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}


	public Student(String name, int korScore, int engScore, int mathScore) {
		super();
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.totalScore = korScore + engScore + mathScore;
		this.avgScore = totalScore / 3.0;
	}
	
	
}
