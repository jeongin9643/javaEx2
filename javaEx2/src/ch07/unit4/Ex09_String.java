package ch07.unit4;

public class Ex09_String {

	public static void main(String[] args) {
		String[]ss = new String[] {"서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종"};
		
		System.out.print("정렬 전 : ");
		print(ss);
		
		//Arrays.sort(ss);
		bubbleSort(ss);
		
		System.out.print("정렬 후 : ");
		print(ss);
		
		
	}
	public static void print(String[] ss) {
		for(String s : ss) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	public static void bubbleSort(String[]ss) {
		boolean flag = true;
		String temp;
		
		for(int i=1; flag; i++) {
			flag = false;
			for(int j=0; j<ss.length-i; j++) {
				if(ss[j].compareTo(ss[j+1])>0){
					temp = ss[j];
					ss[j] = ss[j+1];
					ss[j+1] = temp;
					flag = true;
				}
			}
		}
	}
}
