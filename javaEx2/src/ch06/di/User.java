package ch06.di;

public class User {
	private UserVO[]list;
	private int count;
	
	public User() {
		allocation(10);
	}
	
	private void allocation(int capacity) { //방이 부족할 시 메모리 할당
		UserVO[]temp = new UserVO[capacity];
		if(list != null && count >0) {
			System.arraycopy(list, 0, temp, 0, count);
		}
		list = temp;
	}
	
	public int append(UserVO vo) {
		if(count>= list.length) {
			allocation(list.length +10);
		}
		list[count++] =vo; // 입력한 데이터를 list에 저장
		
		return count;
	}
	
	// list 개수와 정보를 반환
	public int getCount() {
		return count;
	}
	
	public UserVO[] getList() {
		return list;
	}
}
