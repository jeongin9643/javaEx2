package ch06.score;
/*
- 성적처리 프로그램 작성.
: 1. 등록 2.학번검색 3.전체리스트 4.평점출력 5.수정 6.삭제 7.종료 =>
 -----------------------------
 학번 이름 국어 영어 수학 총점 평균
 ----------------------------- 
- 한 사람의 자료
	학번, 이름, 국어, 영어, 수학
	
>> 클래스
1) App
- main
2) ScoreVo
- 데이터 : 학번, 이름, 국어, 영어, 수학
3) Score
- 데이터 : 학생정보(학번, 이름, 국어, 영어, 수학)--배열로 저장, 인원수 ---> private
- 기 능 : 학생정보 저장, 학번검색, 전체리스트, 삭제, 평점
4) ScoreUI
- 데이터:  Score객체, Scanner 객체
- 기 능 : 메뉴, 입력, 학번검색, 전체리스트, 평점출력, 수정, 삭제 
*/

// ScoreVo 객체 하나가 한 사람의 자료
public class ScoreVO { // value object
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	

}
