package classTest;

//	학생 클래스
//	학생이 국어점수, 영어점수, 수학점수를 입력하면
//	총점과 평균을 확인해서 출력
class Student {
	int korean;
	int english;
	int math;
	int total;
	int average;
//	기본 생성자
	public Student() {
		// TODO Auto-generated constructor stub
	}
//	초기화 생성자
	public Student(int korean, int english, int math) {
		super();
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	int returnTotal() {
		return total = this.korean + this.english + this.math;
	}

	int returnAverage() {
		return average = (this.korean + this.english + this.math) / 3;
	}
}

public class ClassTask1 {
	public static void main(String[] args) {
		Student st1 = new Student(100, 40, 20);
		System.out.printf("국어:%d점\n영어:%d점\n수학:%d점\n-------\n총점:%d점\n평균:%d점",
				st1.korean, st1.english, st1.math, st1.returnTotal(), st1.returnAverage());
	}
}
