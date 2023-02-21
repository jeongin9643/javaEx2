package ch06.score2;

public class Score {
	private ScoreVO[] list; // 학생정보 -- 배열은 참조변수. 초기값: null값. 프로그램 끝나면 메모리 사라짐.
	private int count; //등록된 인원수
	
	public Score() {// 생성자
		count = 0;
		allocation(5); // 초기에 5개의 배열 생성
	}
	
	// 배열의 메모리 할당
	private void allocation(int capacity) { //capacity==5, 배열이 찬 경우 allocation(list.length+5);실행 후 10개 + 5개씩 추가
		ScoreVO[]temp = new ScoreVO[capacity]; // temp는 allocation이 끝나면 메모리 사라짐.
		
		if(list !=null && count>0) {// list가 null이 아니고, count가 0보다 크다면 배열 복사
			System.arraycopy(list, 0, temp, 0, count);
		}
		list = temp;  // temp값 list로 넘겨줌
	}
	
	// 배열에 학생 정보 저장
	public int append(ScoreVO vo) {
		if(count >= list.length) { // 100개의 배열이 꽉찬 경우
			allocation(list.length+5); // 배열의 크기를 5개 늘림
		}
		list[count++] = vo; // 배열에 학생 정보(vo) 저장. list n번째 방에 vo를 넣은 후 count +1
		
		return count; // 저장된 인원수 반환
	}
	
	public ScoreVO[] getList() { //배열의 참조값
		return list;
	}
	
	public int getCount() { // 인원수
		return count;
	}
	
	public ScoreVO readScore(String hak) { //학번 검색
		ScoreVO vo = null; // 초기값
		
		for(int i = 0; i<count; i++) {
			if(list[i].getHak().equals(hak)) {
				// String의 equals() : 문자열을 서로 비교해서 같으면 true를 반환
				// 문자열은 어떠한 경우라도 == 으로 비교하면 안됨
				// ==는 문자열을 비교하는 것이 아니라 문자열이 저장된 주소를 비교.
				vo = list[i];
				break;
			}
		}
		
		return vo; // null이 아니면 해당되는 주소 반환
	}
	
	public double grade(int score) {
		double result = 0;
		
		if(score>=95)result = 4.5;
		else if(score >= 90) result = 4.0;
		else if(score >= 85) result = 3.5;
		else if(score >= 80) result = 3.0;
		else if(score >= 75) result = 2.5;
		else if(score >= 70) result = 2.0;
		else if(score >= 65) result = 1.5;
		else if(score >= 60) result = 1.0;
		else result = 0.0;
		
		return result;
	}
	
	public boolean deleteScore(ScoreVO vo) { //deleteScore -> 오버로딩. 메소드의 이름이 같음. 괄호 안의 인자의 개수나 형이 다른 경우. 
		if(count <=0 || vo == null) {
			return false;  // 데이터가 없을 경우.
		}
		
		for(int i=0; i<count; i++) {
			if(list[i] == vo) { //지우는 인덱스와 같으면. 
				deleteScore(i);
				return true;
			}
		}
		
		return false;
	}
	
	public void deleteScore(int index) { // list배열에서 index 위치의 자료를 삭제
		if(index <0 || index>= count) {
			return;
		}
		
		for(int i =index; i<count-1; i++) {  // i =2; i<4; i++ --> 2번 당김.
			list[i] = list[i+1]; // 3번째 값이 2번째 index로 당김.
		}
		
		count--; // 개수가 하나 빠짐
				
		list[count] = null;
		}
		
}

