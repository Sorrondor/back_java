package lambdaTest;

public class CalcResult {
    private int add;
    private int sub;
    private int mul;
    private double div;
    
    public int getAdd() {
		return add;
	}
	public void setAdd(int add) {
		this.add = add;
	}
	public int getSub() {
		return sub;
	}
	public void setSub(int sub) {
		this.sub = sub;
	}
	public int getMul() {
		return mul;
	}
	public void setMul(int mul) {
		this.mul = mul;
	}
	public double getDiv() {
		return div;
	}
	public void setDiv(double div) {
		this.div = div;
	}

	// 생성자
	public CalcResult() {;}
	public CalcResult(int num1, int num2) {
        this.add = num1 + num2;
        this.sub = num1 - num2;
        this.mul = num1 * num2;
        this.div = num2 != 0 ? (double) num1 / num2 : 0;
    }

    @Override
    public String toString() {
        return "덧셈=" + add + ", 뺄셈=" + sub + ", 곱셈=" + mul + ", 나눗셈=" + div;
    }
}