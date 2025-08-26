package castingTest3;

//넷플릭스
//애니메이션, 영화, 드라마 클래스 선언
//사용자가 선택한 영상이
//애니메이션이라면 "자막 지원" 기능 사용
//영화라면 "4D" 기능 사용
//드라마라면 "굿즈" 기능 사용
public class CastingTest3 {
	public static void main(String[] args) {
		Netflix nf = new Netflix();
		Animation am = new Animation();
		Movie mv = new Movie();
		Drama dm = new Drama();
		
		am.support();
		am.sSubtitle();
		mv.support();
		mv.s4D();
		dm.support();
		dm.sGoods();
	}
}
