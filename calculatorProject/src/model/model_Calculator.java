package model;

public class model_Calculator {
	private long ketqua;
	private long currentNumbers;
	private String calculate;
	public model_Calculator() {
		this.ketqua=0;
		this.currentNumbers=0;
		this.calculate="";
	}
	public long getCurrent() {
		return this.currentNumbers;
	}

	public void setCurrent(int current) {
		this.currentNumbers = current;
	}

	public String getCalculate() {
		return calculate;
	}

	public void setCalculate(String calculate) {
		this.calculate = calculate;
	}

	public long getKetqua() {
		return this.ketqua;
	}

	public void setKetqua(long currentNumbers2) {
		this.ketqua = currentNumbers2;
	}

	public long getCurrentNumbers() {
		return currentNumbers;
	}

	public void setCurrentNumbers(long parse_long) {
		this.currentNumbers = parse_long;
	}
	public void pushNumber() {
		this.setKetqua(currentNumbers);
		this.setCurrentNumbers(0);
	}
	public void plus() {
		this.ketqua+=this.currentNumbers;
		this.setCalculate("");
	}
	public void subtract() {
		this.ketqua-=this.currentNumbers;
		this.setCalculate("");
	}
//	public void mutiply() {
//		this.ketqua=Double.valueOf(this.ketqua*this.currentNumbers);
//	}
//	public void divide() {
//		this.ketqua=Double.valueOf(this.ketqua/this.currentNumbers);
//	}
//	
}
