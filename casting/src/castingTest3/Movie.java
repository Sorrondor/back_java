package castingTest3;

public class Movie extends Netflix {
//	private 변수 선언
	private String str1;
	
//	초기화 블록
	{
		str1 = "4D 기능";
	}
	
//	생성자
	public Movie() {;}
	public Movie(String str1) {
		this.str1 = str1;
	}

//	getter, setter
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	
	@Override
	public void support() {
		super.support();
	}
	public void s4D() {
		System.out.printf("[%s]을 지원합니다.\n", str1);
	}
}
