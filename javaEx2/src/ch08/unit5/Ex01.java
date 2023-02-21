package ch08.unit5;

public class Ex01 {
	public static void main(String[] args) {
		// SortInt si = new SortInt(); // 컴오류. 추상클래스는 객체 생성이 불가
		// 추상 클래스는 반드시 하위클래스가 있고, 하위 클래스를 이용하여 객체를 생성.
		
		int[] data = new int[] {40, 50, 30, 35, 25};
		SortInt si = new BubbleSort();  // up-casting
		// SortInt si = new SelectionSort();  // up-casting
		
		disp("source data : ", data);
		
		si.sort(data);
		
		disp("sort data : ", data);
		
	}
	
	public static void disp(String title, int[] value) {
		System.out.print(title);
		for(int n : value) {
			System.out.print(n + "  ");
		}
		System.out.println();
	}
}

abstract class SortInt{ // 추상 클래스: 아직 클래스가 만들어지지 않음. 자식 없는 추상클래스 없음.
	private int[] value;
	
	protected abstract void sorting();
	
	public void sort(int[] value) { 
		this.value = value;
		sorting(); // 자식의 sorting();
	}
	protected int length() {
		int n = -1; 
		if(value != null) {
			n = value.length;
		}
		return n;
	}
	
	protected final int compare(int i, int j) {  // 양수, 음수 판별
		return value[i] - value[j];
		
	}
	
	protected final void swap(int i, int j) { // 
		int t = value[i];
		value[i] = value[j];
		value[j] = t;
	}
}

class SelectionSort extends SortInt{
	@Override
	protected void sorting() {
		for(int i=0; i<length()-1; i++) {
			for(int j=i+1; j<length(); j++) {
				if(compare(i, j)>0) {
					swap(i,j);
				}
				
			}
		}
		
	}
}

class BubbleSort extends SortInt{
	@Override
	protected void sorting() {
		boolean flag = true;
		
		for(int i=1; flag; i++) {
			flag = false;
			for(int j=0; j<length()-i; j++) {
				if(compare(j,j+1)>0) {
					swap(j,j+1);
					flag =true;
				}
			}
		}
	}
	
}